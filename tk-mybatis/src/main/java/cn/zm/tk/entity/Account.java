package cn.zm.tk.entity;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

@Data
public class Account implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double money;
    private static final long serialVersionUID = 1L;
}