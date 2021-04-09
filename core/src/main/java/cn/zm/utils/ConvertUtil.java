package cn.zm.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.zm.common.ObjectConvert;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertUtil {
    /**
     * 获取 vo 分页数据
     *
     * @param page do 分页数据
     * @return vo 分页数据
     */
    //public static <T> IPage<T> buildPage(IPage<T> page) {
        //IPage<T> pageViews = new Page<T>();
        //BeanUtil.copyProperties(page, pageViews);
        //pageViews.setRecords(page.getRecords()
        //        .stream()
        //        .map(ObjectConvert::convert)
        //        .collect(Collectors.toList()));
        //return pageViews;
    //}
}
