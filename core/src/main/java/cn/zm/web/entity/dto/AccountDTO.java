package cn.zm.web.entity.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import cn.zm.common.ObjectConvert;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import cn.zm.web.entity.Account;

@Data
@Accessors(chain = true)
@TableName("account")
@ApiModel(value="AccountDTO对象", description="")
public class AccountDTO extends ObjectConvert<Account>{
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Float money;
}

