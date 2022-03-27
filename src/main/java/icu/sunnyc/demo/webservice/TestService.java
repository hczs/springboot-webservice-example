package icu.sunnyc.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author: houcheng
 * @date: 2022/3/23 17:10:03
 * @version: V1.0
 */
@WebService(targetNamespace = "http://webservice.demo.sunnyc.icu/")
public interface TestService {


    /**
     * 测试方法，无具体意义
     * @param person Person 实体类 JSON 字符串
     * @return String
     */
    @WebMethod
    String insertPersonInfo(@WebParam(name = "PERSON",
            targetNamespace = "http://webservice.demo.sunnyc.icu/") String person);
}
