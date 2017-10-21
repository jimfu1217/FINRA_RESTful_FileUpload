package com.jim.net.dao;

import com.jim.net.entity.UploadFile;

import java.util.List;

public interface FileDao {
    public UploadFile save(UploadFile f);
    public UploadFile getFile(Integer Id);
    public List<UploadFile> getAllFile();
}
