package cn.zm.config;

import cn.zm.enums.ResultEnum;
import cn.zm.common.ResponseResult;
import cn.zm.common.ServiceException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MultipartException;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/**
 * @author Mr_W
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(value = Exception.class)
	public ResponseResult internalErrorHandler(Exception e) {
		ResponseResult r;
		if (e instanceof ServiceException) {
			LOGGER.error("happened serviceException, Caused by " + getMessage(e), e);
			r = ResponseResult.fail(StringUtils.isBlank(((ServiceException) e).getAlertMessage()) ? e.getMessage() : ((ServiceException) e).getAlertMessage());
		} else {
			LOGGER.error("happened systemException, Caused by " + getMessage(e), e);
			r = ResponseResult.fail(null);
		}
		e.printStackTrace();
		return r;
	}
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseResult paramErrorHandler(MethodArgumentNotValidException e) {
		BindingResult exceptions = e.getBindingResult();
        // 判断异常中是否有错误信息，如果存在就使用异常中的消息，否则使用默认消息
        if (exceptions.hasErrors()) {
            List<ObjectError> errors = exceptions.getAllErrors();
            if (!errors.isEmpty()) {
                // 这里列出了全部错误参数，按正常逻辑，只需要第一条错误即可
                FieldError fieldError = (FieldError) errors.get(0);
                LOGGER.error("invalid parameter, Caused by " + fieldError.getDefaultMessage(), e);
                return ResponseResult.fail(fieldError.getDefaultMessage());
            }
        }
		return ResponseResult.fail(ResultEnum.INVALID_PARAMS.getMsg());
	}
	
	private String getMessage(Exception e) {
		StringWriter sw = new StringWriter();
		try (PrintWriter pw = new PrintWriter(sw)) {
			e.printStackTrace(pw);
			pw.flush();
			sw.flush();
		}
		return sw.toString();
	}

	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ResponseResult handlerMissingServletRequestParameterException(MissingServletRequestParameterException e) {
		LOGGER.debug(e.getParameterName() + "不能为空", e);
		return ResponseResult.fail(e.getParameterName() + "不能为空");
	}

	@ExceptionHandler(BindException.class)
	public ResponseResult handlerBindException(BindException e) {
		LOGGER.debug(e.getAllErrors().get(0).getDefaultMessage(), e);
		return ResponseResult.fail(e.getAllErrors().get(0).getDefaultMessage());
	}

	@ExceptionHandler(MultipartException.class)
	public ResponseResult handleError1(MultipartException e) {
		LOGGER.error("文件解析失败", e);
		return ResponseResult.fail("文件解析失败");
	}

}