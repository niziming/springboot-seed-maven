package cn.zm.tk.common.func;

import java.util.List;

/**
 * @param <T> 返回
 * @author yeehaw
 */
@FunctionalInterface
public interface ListFunc<T> {

    /**
     * 获取list参数
     *
     * @return
     */
    List<T> list();

}
