package cn.zm.tk.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Accessors(chain = true)
@Table(name = "account")
@ApiModel(value="Account对象", description="用户表")
public class Account{
    @ApiModelProperty(value = "用户ID")
    @Id
    private Integer id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "余额")
    private Double money;
}

