package com.mehmetanilcorapci.examplemultipleservice.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class FileStorageManagerImpl implements FileStorageManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileStorageManagerImpl.class);
    private final List<FileStorageService> fileStorageServiceList;

    public FileStorageManagerImpl(List<FileStorageService> fileStorageServiceList) {
        this.fileStorageServiceList = fileStorageServiceList
                .stream()
                .filter(FileStorageService::isBeanAlive)
                .collect(Collectors.toList());
    }

    @Override
    public void uploadFile(File file) {
        this.fileStorageServiceList.stream()
                .forEach(service -> service.uploadFile(file));
    }

    @Override
    public File downloadFile(String path) {
        for (var service: this.fileStorageServiceList) {
            try {
                return service.downloadFile(path);
            } catch (Exception exception) {
                LOGGER.error("Error is", exception);
            }
        }

        throw new RuntimeException("File can't downloaded");
    }
}
