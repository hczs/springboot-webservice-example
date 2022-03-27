package icu.sunnyc.demo.config;

import icu.sunnyc.demo.webservice.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author: houcheng
 * @date: 2022/3/23 17:12:42
 * @version: V1.0
 */
@Configuration
public class CxfConfig {

    @Autowired
    private TestService testService;

    @Autowired
    @Qualifier(Bus.DEFAULT_BUS_ID)
    private SpringBus bus;

    @Bean
    public ServletRegistrationBean<CXFServlet> wsServlet(){
        return new ServletRegistrationBean<>(new CXFServlet(), "/ws/*");
    }

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, testService);
        endpoint.publish("/testService");
        return endpoint;
    }
}
