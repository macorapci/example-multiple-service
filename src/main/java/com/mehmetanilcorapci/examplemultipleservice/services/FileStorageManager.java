package com.mehmetanilcorapci.examplemultipleservice.services;

import java.io.File;

public interface FileStorageManager {
    void uploadFile(File file);
    File downloadFile(String path);
}
