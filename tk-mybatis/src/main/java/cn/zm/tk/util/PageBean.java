package cn.zm.tk.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 页面返回
 *
 * @param <T>
 * @author yeehaw
 */
@Data
public class PageBean<T> implements Serializable {


    private static final long serialVersionUID = 3496837282957001918L;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 结果集
     */
    private List<T> rows;


    /**
     * 包装Page对象，因为直接返回Page对象，在JSON处理以及其他情况下会被当成List来处理，
     * 而出现一些问题。
     *
     * @param list page结果
     */
    public PageBean(List<T> list) {
        if (list instanceof com.github.pagehelper.Page) {
            com.github.pagehelper.Page<T> page = (com.github.pagehelper.Page<T>) list;
            this.total = page.getTotal();
            this.rows = page;
        }
    }
}
