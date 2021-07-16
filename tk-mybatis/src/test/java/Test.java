import cn.zm.tk.web.entity.Account;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test<T> {
    public List<T> like(T recards) throws IllegalAccessException {
        HashMap<String, Object> map = new HashMap<>();
        Class<?> aClass = recards.getClass();
        Field[] fields = aClass.getDeclaredFields();
        Example example = new Example(aClass);
        Example.Criteria criteria = example.createCriteria();
        for (Field field : fields) {
            field.setAccessible(true);
            if (ObjectUtils.isNotEmpty(field.get(recards))) {
                System.out.println("field = " + field.getName() + " " + field.get(recards));
            }
            criteria.andLike(field.getName(), (String) "%"+field.get(recards)+"%");
        }
        // return mapper.selectByExample(example);
        return null;
    }

    public static void main (String[] args) throws IllegalAccessException {
        Test<Object> test = new Test<>();
        Account account = Account.builder().money(10.10).name("").build();
        test.like(account);

    }

}
