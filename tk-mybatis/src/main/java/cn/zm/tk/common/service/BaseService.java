package cn.zm.tk.common.service;

import cn.zm.tk.common.func.ListFunc;
import cn.zm.tk.common.util.PageBean;

import java.util.List;

/**
 * 通用service
 *
 * @author yeehaw
 */
public interface BaseService<T> {
    /**
     * 查询所有
     *
     * @return
     */
    List<T> selectAll();

    /**
     * 条件查询
     *
     * @param record
     * @return
     */
    List<T> selectByProperty(T record);

    /**
     * 条件查询单个 若存在多个则异常
     *
     * @param record
     * @return
     */
    T selectOneByProperty(T record);

    /**
     * 通过主键 id 查询
     *
     * @param id
     * @return
     */
    T selectById(Object id);

    /**
     * 通过主键 ids 查询
     *
     * @param ids
     * @return
     */
    List<T> selectByIds(List<Long> ids);

    /**
     * 保存
     *
     * @param record
     * @return
     */
    int save(T record);

    /**
     * 存在字段保存
     *
     * @param record
     * @return
     */
    int saveSelective(T record);

    /**
     * 保存多个
     *
     * @param records
     * @return
     */
    int saveBatch(List<T> records);

    /**
     * 根据主键更新
     *
     * @param record
     * @return
     */
    int updateById(T record);

    /**
     * 根据主键更新不为空的字段
     *
     * @param record
     * @return
     */
    int updateSelectiveById(T record);

    /**
     * 分页条件查询
     *
     * @param record
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageBean<T> selectPageByProperty(T record, Integer pageSize, Integer pageNum);

    /**
     * 通过 lambda 分页查询
     *
     * @param func
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageBean<T> selectPageByFunc(ListFunc<T> func, Integer pageSize, Integer pageNum);
}
