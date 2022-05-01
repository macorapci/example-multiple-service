package com.mehmetanilcorapci.examplemultipleservice.client;

import java.io.File;

public class MockGoogleClient {
    public void uploadFile(File file) {
        System.out.println("File uploaded with Google Client!");
    }

    public File downloadFile(String path) {
        System.out.println("File downloaded with Google Client!");
        return null;
    }
}
