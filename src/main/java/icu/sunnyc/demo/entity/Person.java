package icu.sunnyc.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: houcheng
 * @date: 2022/3/23 17:34:49
 * @version: V1.0
 */
@Getter
@Setter
@ToString
public class Person {
    private Integer id;
    private String name;
    private String niceName;
    private Integer age;
    private Double height;
}
