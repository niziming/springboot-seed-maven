package cn.zm.tk.common.mapper;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper
 *
 * @param <T>
 * @author yeehaw
 */
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>, SelectByIdsMapper<T> {

}
