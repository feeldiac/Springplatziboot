package com.fundamentos.sprinboot.fundamentos.config;

import com.fundamentos.sprinboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanTwoImplement();
    }

    @Bean
    public MyOperation MyOperationOperation(){
        return new MyOperationImplement()   ;
    }

    @Bean
    public MyBeanWithDependency MyBeanWithDependencyOperation(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
