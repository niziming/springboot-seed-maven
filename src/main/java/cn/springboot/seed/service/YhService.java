package cn.springboot.seed.service;

import cn.springboot.seed.mapper.YhMapper;
import cn.springboot.seed.model.Yh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YhService {
    @Autowired
    private YhMapper yhMapper;

    public List<Yh> selectAll(){
        List<Yh> yhs = yhMapper.selectAll();
        return yhs;
    }
}
