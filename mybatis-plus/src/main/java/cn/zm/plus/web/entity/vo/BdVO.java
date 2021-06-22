package cn.zm.plus.web.entity.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("bd")
@ApiModel(value="BdVO对象", description="")
public class BdVO {
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

