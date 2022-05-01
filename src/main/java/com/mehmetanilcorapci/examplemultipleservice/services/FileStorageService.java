package com.mehmetanilcorapci.examplemultipleservice.services;

import java.io.File;

public interface FileStorageService {
    boolean isBeanAlive();
    void uploadFile(File file);
    File downloadFile(String path);
}
