package ${package.Entity};

import javax.persistence.*;
<#if swagger2>
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModelProperty;
</#if>
<#if entityLombokModel>
import com.xr.inspect.data.base.ObjectConvert;
import lombok.Data;
import lombok.experimental.Accessors;
</#if>
<#if entity?ends_with("DTO")>
import ${package.Entity?substring(0, package.Entity? index_of("dto"))}<#if entity?ends_with("DTO")>${entity? cap_first? substring(0, entity? index_of("DTO"))}<#else>${entity? cap_first}</#if>;
<#elseif !entity?ends_with("DTO")&&!entity?ends_with("VO")>
import ${package.Entity}.vo.<#if entity?ends_with("DTO")>${entity? cap_first? substring(0, entity? index_of("DTO"))}<#else>${entity? cap_first}</#if>VO;
</#if>
<#--<#if entity?ends_with("DTO")>-->
<#--    import ${package.Entity}.<#if entity?ends_with("DTO")>${entity? cap_first? substring(0, entity? index_of("DTO"))}<#else>${entity? cap_first}</#if>;-->
<#--<#elseif !entity?ends_with("DTO")&&!entity?ends_with("VO")>-->
<#--    import ${package.Entity}.vo.<#if entity?ends_with("DTO")>${entity? cap_first? substring(0, entity? index_of("DTO"))}<#else>${entity? cap_first}</#if>VO;-->
<#--</#if>-->

<#if entityLombokModel>
@Data
<#if superEntityClass??>
</#if>
@Accessors(chain = true)
</#if>
<#if table.convert>
@Table(name = "${table.name}")
</#if>
<#if swagger2>
@ApiModel(value="${entity}对象", description="${table.comment!}")
</#if>
<#if superEntityClass??>
public class ${entity} <#if !entity?ends_with("VO")>extends ${superEntityClass}<#if entity?ends_with("DTO")><${entity? cap_first? substring(0, entity? index_of("DTO"))}><#else><${entity? cap_first}VO></#if></#if>{
<#elseif activeRecord>
public class ${entity} extends Model<${entity}> {
<#else>
public class ${entity} implements Serializable {
</#if>
<#-- ----------  BEGIN 字段循环遍历  ---------->
<#list table.fields as field>
    <#if field.keyFlag>
    <#assign keyPropertyName="${field.propertyName}"/>
    </#if>
    <#if field.comment!?length gt 0>
    <#if swagger2>
    @ApiModelProperty(value = "${field.comment}")
    <#else>
    </#if>
    </#if>
    <#if field.keyFlag>
    <#-- 主键 -->
    <#if field.keyIdentityFlag>
    @Id
    @GeneratedValue(generator = "JDBC")
    <#elseif idType??>
    @Id
    @GeneratedValue(generator = "JDBC")
    <#elseif field.convert>
    @Id
    @GeneratedValue(generator = "JDBC")
    </#if>
    <#-- 普通字段 -->
    <#elseif field.fill??>
    <#-- -----   存在字段填充设置   ----->
    <#--<#if field.convert>-->
    <#--@TableColumn(value = "${field.name}", fill = FieldFill.${field.fill})-->
    <#--<#else>-->
    <#--@TableColumn(fill = FieldFill.${field.fill})-->
    <#--</#if>-->
    <#--<#elseif field.convert>-->
    <#--@TableColumn("${field.name}")-->
    </#if>
    <#-- 乐观锁注解 -->
    <#if (versionFieldName!"") == field.name>
    @Version
    </#if>
    <#-- 逻辑删除注解 -->
    <#if (logicDeleteFieldName!"") == field.name>
    @TableLogic
    </#if>
    private ${field.propertyType} ${field.propertyName};
</#list>
<#------------  END 字段循环遍历  ---------->
}
<#------------  BEGIN lombok  ---------->
<#if !entityLombokModel>
<#list table.fields as field>
    <#if field.propertyType == "boolean">
        <#assign getprefix="is"/>
    <#else>
        <#assign getprefix="get"/>
    </#if>
    public ${field.propertyType} ${getprefix}${field.capitalName}() {
    return ${field.propertyName};
    }

    <#if entityBuilderModel>
        public ${entity} set${field.capitalName}(${field.propertyType} ${field.propertyName}) {
    <#else>
        public void set${field.capitalName}(${field.propertyType} ${field.propertyName}) {
    </#if>
    this.${field.propertyName} = ${field.propertyName};
    <#if entityBuilderModel>
        return this;
    </#if>
    }
</#list>
</#if>
<#------------  END lombok  ---------->

<#if entityColumnConstant>
    <#list table.fields as field>
        public static final String ${field.name?upper_case} = "${field.name}";
    </#list>
</#if>
<#if activeRecord>
    @Override
    protected Serializable pkVal() {
    <#if keyPropertyName??>
        return this.${keyPropertyName};
    <#else>
        return null;
    </#if>
    }
</#if>
<#if !entityLombokModel>
    @Override
    public String toString() {
    return "${entity}{" +
    <#list table.fields as field>
        <#if field_index==0>
            "${field.propertyName}=" + ${field.propertyName} +
        <#else>
            ", ${field.propertyName}=" + ${field.propertyName} +
        </#if>
    </#list>
    "}";
    }
</#if>
