# SpringBoot WebService
在 SpringBoot 项目中开发 WebService 接口

- 接口描述地址：`http://localhost:9090/ws/testService?wsdl`
- 接口请求地址：`http://localhost:9090/ws/testService`
- 请求方式：`POST`
- 请求头：`Content-Type text/xml`
- 请求参数：如下所示
    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    　　<soap:Body>
    　　　　<insertPersonInfo xmlns="http://webservice.demo.sunnyc.icu/">
    　　　　　　<PERSON>[{"name":"小王"},{"name":"小张"}]</PERSON>
    　　　　</insertPersonInfo>
    　　</soap:Body>
    </soap:Envelope>
    ```
- 响应结果：
    ```xml
    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
        <soap:Body>
            <ns2:insertPersonInfoResponse xmlns:ns2="http://webservice.demo.sunnyc.icu/">
                <return>收到消息了: Person(id=null, name=小王, niceName=null, age=null, height=null)</return>
            </ns2:insertPersonInfoResponse>
        </soap:Body>
    </soap:Envelope>  
    ```
