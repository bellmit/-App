/*
 * 类文件名:  PayGatewayApplication.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2017年7月22日
 * 功能版本:  V001Z0001
 */
package com.alycloud.pay.starter;

import javax.sql.DataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2017年7月22日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@SpringBootApplication(scanBasePackages={"com.alycloud.modules","com.alycloud.pay","com.alycloud.core","com.alycloud.channel"})
@EnableTransactionManagement
@MapperScan({"com.alycloud.pay.mapper", "com.alycloud.core.log.mapper"})
@EnableAspectJAutoProxy
@EnableEurekaClient
@EnableFeignClients(basePackages = ("com.alycloud.pay"))
@EnableCircuitBreaker
@EnableSwagger2
public class PayApplication  extends SpringBootServletInitializer
{
    static Logger logger = LoggerFactory.getLogger(PayApplication.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(PayApplication.class, args);
    }
    
    @Bean
    @ConditionalOnMissingBean
    public PlatformTransactionManager txManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PayApplication.class);
    }
    
    @Bean
    public Module jacksonAfterBurnerModule() {
        return new AfterburnerModule();
    }

//    @Bean
//    public HttpMessageConverter httpSmileJackson2MessageConverter() {
//        return new AbstractJackson2HttpMessageConverter(
//                new ObjectMapper(new SmileFactory()).registerModule(new AfterburnerModule()),
//                new MediaType("application", "x-jackson-smile")) {
//        };
//    }
}
