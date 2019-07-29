package cn.springboot.demo.service;

import cn.springboot.demo.mapper.YhMapper;
import cn.springboot.demo.model.Yh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YhService {
    @Autowired
    YhMapper yhMapper;

    public List<Yh> selectAll(){
        List<Yh> yhs = yhMapper.selectAll();
        return yhs;
    }
}
