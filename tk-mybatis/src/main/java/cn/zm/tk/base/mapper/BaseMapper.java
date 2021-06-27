package cn.zm.tk.base.mapper;

import cn.zm.tk.func.Tao;
import org.apache.ibatis.annotations.Delete;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * 通用mapper
 *
 * @param <T>
 * @author yeehaw
 */
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>, SelectByIdsMapper<T> {
    default List<T> selectByLambda(Tao... taos) {
        return selectByExample(make(taos));
    }

    default int selectCountByLambda(Tao... taos) {
        return selectCountByExample(make(taos));
    }

    default int deleteByLambda(Tao... taos) {
        return deleteByExample(make(taos));
    }

    default int seletCountByLambda(Tao... taos) {
        return deleteByExample(make(taos));
    }

    default int updateByLambda(T t, Tao... taos) {
        return updateByExample(t, make(taos));
    }

    default int updateSelectiveByLambda(T t, Tao... taos) {
        return updateByExampleSelective(t, make(taos));
    }

    default Example make(Tao... taos) {
        Example example = new Example(entityClass());
        for (Tao tao : taos)
            tao.accept(example.or());
        return example;
    }

    // 实际调用接口必须用default方法实现
    Class<?> entityClass();
}
