package com.mehmetanilcorapci.examplemultipleservice.api;

import com.mehmetanilcorapci.examplemultipleservice.services.FileStorageManager;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
public class Controller {
    private final FileStorageManager fileStorageManager;

    public Controller(FileStorageManager fileStorageManager) {
        this.fileStorageManager = fileStorageManager;
    }

    @GetMapping("/api/{path}")
    public File downloadFile(@PathVariable("path") String path) {
        return this.fileStorageManager.downloadFile(path);
    }

    @PostMapping("/api/{path}")
    public void uploadFile(@PathVariable("path") String path,
                           @RequestBody File file) {
        this.fileStorageManager.uploadFile(file);
    }
}
