package com.mehmetanilcorapci.examplemultipleservice.client;

import java.io.File;

public class MockAmazonClient {
    public void uploadFile(File file) {
        System.out.println("File uploaded with Amazon Client!");
    }

    public File downloadFile(String path) {
        System.out.println("File downloaded with Amazon Client!");
        return null;
    }
}
