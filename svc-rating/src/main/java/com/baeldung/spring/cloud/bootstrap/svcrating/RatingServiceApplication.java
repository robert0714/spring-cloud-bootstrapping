package com.baeldung.spring.cloud.bootstrap.svcrating;
  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.sleuth.Sampler; 
import org.springframework.cloud.sleuth.sampler.AlwaysSampler; 
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.EnableTransactionManagement; 
 
import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
 

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableTransactionManagement(order=Ordered.LOWEST_PRECEDENCE, mode=AdviceMode.ASPECTJ)
public class RatingServiceApplication { 
    

    public static void main(String[] args) {
        SpringApplication.run(RatingServiceApplication.class, args);
    }
     
    
    @Bean
    public Sampler defaultSampler() {
    	return new AlwaysSampler();
    }
    
    @Bean
    @Primary
    @Order(value=Ordered.HIGHEST_PRECEDENCE)
    public HystrixCommandAspect hystrixAspect() {
      return new HystrixCommandAspect();
    }
}