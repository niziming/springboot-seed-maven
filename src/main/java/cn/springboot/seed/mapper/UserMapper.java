package cn.springboot.seed.mapper;

import cn.springboot.seed.common.IMapper;
import cn.springboot.seed.model.User;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper extends IMapper<User> {

}