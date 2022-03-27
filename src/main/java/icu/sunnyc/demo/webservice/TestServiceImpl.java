package icu.sunnyc.demo.webservice;

import com.alibaba.fastjson.JSONArray;
import icu.sunnyc.demo.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: houcheng
 * @date: 2022/3/23 17:36:25
 * @version: V1.0
 */
@Component
@Slf4j
public class TestServiceImpl implements TestService{
    @Override
    public String insertPersonInfo(String person) {
        log.info("接收到的参数：{}", person);
        List<Person> list = JSONArray.parseArray(person, Person.class);
        return "收到消息了: " + list.get(0);
    }
}
