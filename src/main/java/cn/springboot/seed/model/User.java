package cn.springboot.seed.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "ID")
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    private String nickname;

    /**
     * 用户状态
     */
    @Column(name = "USERSTATUS")
    private Integer userstatus;

    /**
     * 用户角色
     */
    @Column(name = "ROLE")
    private String role;

    /**
     * 用户性别
     */
    @Column(name = "GENDER")
    private String gender;

    /**
     * 用户年龄
     */
    @Column(name = "AGE")
    private Integer age;

    /**
     * 部门字典
     */
    @Column(name = "DEPARTMENT")
    private String department;

    /**
     * jwt的token
     */
    @Column(name = "TOKEN")
    private String token;

    /**
     * 获取用户ID
     *
     * @return ID - 用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return USERNAME - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取用户状态
     *
     * @return USERSTATUS - 用户状态
     */
    public Integer getUserstatus() {
        return userstatus;
    }

    /**
     * 设置用户状态
     *
     * @param userstatus 用户状态
     */
    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    /**
     * 获取用户角色
     *
     * @return ROLE - 用户角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置用户角色
     *
     * @param role 用户角色
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * 获取用户性别
     *
     * @return GENDER - 用户性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置用户性别
     *
     * @param gender 用户性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取用户年龄
     *
     * @return AGE - 用户年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置用户年龄
     *
     * @param age 用户年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取部门字典
     *
     * @return DEPARTMENT - 部门字典
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门字典
     *
     * @param department 部门字典
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userstatus=" + userstatus +
                ", role='" + role + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}