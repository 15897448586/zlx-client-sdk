package com.zlx.zlxclientsdk;

import com.zlx.zlxclientsdk.client.ZLXApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("zlxapi.client")
@Data
@ComponentScan
public class ZLXApiClientConfig {
    private String accessKey;
    private String secretKey;
    @Bean
    public ZLXApiClient ZLXApiClient(){
        return new ZLXApiClient(accessKey,secretKey);
    }
}
