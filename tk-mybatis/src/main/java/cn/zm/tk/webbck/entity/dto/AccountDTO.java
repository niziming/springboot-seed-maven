package cn.zm.tk.webbck.entity.dto;

import cn.zm.tk.utils.ObjectConvert;
import cn.zm.tk.webbck.entity.Account;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Table(name = "account")
@ApiModel(value="AccountDTO对象", description="用户表")
public class AccountDTO extends ObjectConvert<Account> {
    @Id
    @ApiModelProperty(value = "用户标识")
    private Integer id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "余额")
    private Double money;
}

