package com.mehmetanilcorapci.examplemultipleservice.services;

import com.mehmetanilcorapci.examplemultipleservice.client.MockGoogleClient;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Optional;

@Service
public class GoogleDriveStorageService implements FileStorageService{
    private final MockGoogleClient client;

    public GoogleDriveStorageService(Optional<MockGoogleClient> client) {
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
