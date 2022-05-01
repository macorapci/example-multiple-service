package com.mehmetanilcorapci.examplemultipleservice.config;

import com.mehmetanilcorapci.examplemultipleservice.client.MockAmazonClient;
import com.mehmetanilcorapci.examplemultipleservice.client.MockGoogleClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class FileStorageConfiguration {
    @Bean
    public MockGoogleClient getGoogleClient() {
        return new MockGoogleClient();
    }

    @Bean
    public Optional<MockAmazonClient> getAmazonClient() {
        return null;
    }
}
