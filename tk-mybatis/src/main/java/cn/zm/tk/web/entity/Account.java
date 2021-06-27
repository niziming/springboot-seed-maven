package cn.zm.tk.web.entity;

import cn.zm.tk.utils.ObjectConvert;
import cn.zm.tk.web.entity.vo.AccountVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Accessors(chain = true)
@Table(name = "account")
@ApiModel(value="AccountDTO对象", description="用户表")
public class Account extends ObjectConvert<AccountVO> {
    @Id
    @ApiModelProperty(value = "用户标识")
    private Integer id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "余额")
    private Double money;
}

