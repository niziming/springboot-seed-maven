package cn.zm.tk.web.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Account implements Serializable {
    /**
     * 用户标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 余额
     */
    private Double money;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户标识
     *
     * @return id - 用户标识
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户标识
     *
     * @param id 用户标识
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取余额
     *
     * @return money - 余额
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置余额
     *
     * @param money 余额
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", money=").append(money);
        sb.append("]");
        return sb.toString();
    }
}