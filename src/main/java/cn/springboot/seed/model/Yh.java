package cn.springboot.seed.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "yh")
public class Yh {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "YH_ID")
    private Integer yhId;

    /**
     * 用户名
     */
    @Column(name = "YH_MC")
    private String yhMc;

    /**
     * 密码
     */
    @Column(name = "YH_MM")
    private String yhMm;

    /**
     * 用户状态
     */
    @Column(name = "YH_ZT")
    private Integer yhZt;

    /**
     * 用户角色
     */
    @Column(name = "YH_JS")
    private String yhJs;

    /**
     * 用户性别
     */
    @Column(name = "YH_XB")
    private String yhXb;

    /**
     * 用户年龄
     */
    @Column(name = "YH_NL")
    private Integer yhNl;

    /**
     * 部门字典
     */
    @Column(name = "YH_ZD")
    private String yhZd;

    /**
     * jwt的token
     */
    @Column(name = "TOKEN")
    private String token;

    /**
     * 获取用户ID
     *
     * @return YH_ID - 用户ID
     */
    public Integer getYhId() {
        return yhId;
    }

    /**
     * 设置用户ID
     *
     * @param yhId 用户ID
     */
    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    /**
     * 获取用户名
     *
     * @return YH_MC - 用户名
     */
    public String getYhMc() {
        return yhMc;
    }

    /**
     * 设置用户名
     *
     * @param yhMc 用户名
     */
    public void setYhMc(String yhMc) {
        this.yhMc = yhMc == null ? null : yhMc.trim();
    }

    /**
     * 获取密码
     *
     * @return YH_MM - 密码
     */
    public String getYhMm() {
        return yhMm;
    }

    /**
     * 设置密码
     *
     * @param yhMm 密码
     */
    public void setYhMm(String yhMm) {
        this.yhMm = yhMm == null ? null : yhMm.trim();
    }

    /**
     * 获取用户状态
     *
     * @return YH_ZT - 用户状态
     */
    public Integer getYhZt() {
        return yhZt;
    }

    /**
     * 设置用户状态
     *
     * @param yhZt 用户状态
     */
    public void setYhZt(Integer yhZt) {
        this.yhZt = yhZt;
    }

    /**
     * 获取用户角色
     *
     * @return YH_JS - 用户角色
     */
    public String getYhJs() {
        return yhJs;
    }

    /**
     * 设置用户角色
     *
     * @param yhJs 用户角色
     */
    public void setYhJs(String yhJs) {
        this.yhJs = yhJs == null ? null : yhJs.trim();
    }

    /**
     * 获取用户性别
     *
     * @return YH_XB - 用户性别
     */
    public String getYhXb() {
        return yhXb;
    }

    /**
     * 设置用户性别
     *
     * @param yhXb 用户性别
     */
    public void setYhXb(String yhXb) {
        this.yhXb = yhXb == null ? null : yhXb.trim();
    }

    /**
     * 获取用户年龄
     *
     * @return YH_NL - 用户年龄
     */
    public Integer getYhNl() {
        return yhNl;
    }

    /**
     * 设置用户年龄
     *
     * @param yhNl 用户年龄
     */
    public void setYhNl(Integer yhNl) {
        this.yhNl = yhNl;
    }

    /**
     * 获取部门字典
     *
     * @return YH_ZD - 部门字典
     */
    public String getYhZd() {
        return yhZd;
    }

    /**
     * 设置部门字典
     *
     * @param yhZd 部门字典
     */
    public void setYhZd(String yhZd) {
        this.yhZd = yhZd == null ? null : yhZd.trim();
    }

    /**
     * 获取jwt的token
     *
     * @return TOKEN - jwt的token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置jwt的token
     *
     * @param token jwt的token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}