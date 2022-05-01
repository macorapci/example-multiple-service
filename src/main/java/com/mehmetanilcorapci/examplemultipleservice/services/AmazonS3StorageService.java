package com.mehmetanilcorapci.examplemultipleservice.services;

import com.mehmetanilcorapci.examplemultipleservice.client.MockAmazonClient;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Optional;

@Service
public class AmazonS3StorageService implements FileStorageService {
    private final MockAmazonClient client;

    public AmazonS3StorageService(Optional<MockAmazonClient> client) {
        this.client = client.orElse(null);
    }

    @Override
    public boolean isBeanAlive() {
        return client != null;
    }

    @Override
    public void uploadFile(File file) {
        client.uploadFile(file);
    }

    @Override
    public File downloadFile(String path) {
        return client.downloadFile(path);
    }
}
