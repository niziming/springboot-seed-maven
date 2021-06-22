package cn.zm.plus.web.entity.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import cn.zm.common.common.ObjectConvert;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;
import cn.zm.plus.web.entity.Bd;

@Data
@Accessors(chain = true)
@TableName("bd")
@ApiModel(value="BdDTO对象", description="")
public class BdDTO extends ObjectConvert<Bd>{
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long sjc;
    private String rwly;
    private String bsfl1;
    private String bsfl2;
    private String bcydwmc;
    private String cydd2;
    private String sszzq;
    private String dqsz;
    private String xsq;
    private String qylx;
    private String dwdz;
    private String ypmc;
    private String cybh;
    private String spdl;
    private String spyl;
    private String spcyl;
    private String spxl;
    private String bzqymc;
    private String bzqysf;
    private String sfjk;
    private String ycg;
    private String cysj;
    private String jymd;
    private String jyxm;
    private String jgpd;
    private String cydd1;
    private String bzfl;
}

