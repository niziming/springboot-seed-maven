package cn.zm.modules.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import cn.zm.common.ObjectConvert;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import cn.zm.modules.entity.vo.AccountVO;

@Data
@Accessors(chain = true)
@TableName("account")
@ApiModel(value="Account对象", description="")
public class Account extends ObjectConvert<AccountVO>{
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Float money;
}

