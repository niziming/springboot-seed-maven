import cn.zm.tk.anno.Like;
import cn.zm.tk.web.entity.Account;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test<T> {
    public List<T> likeByProperty(T record) {
        Class<?> aClass = record.getClass();
        Field[] fields = aClass.getDeclaredFields();
        Example example = new Example(aClass);
        Example.Criteria criteria = example.createCriteria();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                Like like = field.getDeclaredAnnotation(Like.class);
                // if (ObjectUtils.isNotEmpty(field.get(record)) && field.get(record) instanceof String) {
                if (ObjectUtils.isNotEmpty(field.get(record))) {
                    if (ObjectUtils.isNotEmpty(like)) {
                        criteria.andLike(field.getName(),  "%"+field.get(record)+"%");
                    } else {
                        criteria.andEqualTo(field.getName(),  field.get(record));
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // return mapper.selectByExample(example);
        return null;
    }
    public static void main (String[] args) throws IllegalAccessException {
        Test<Object> test = new Test<>();
        Account account = Account.builder().money(10.10).name("").build();
        test.likeByProperty(account);
    }

}
