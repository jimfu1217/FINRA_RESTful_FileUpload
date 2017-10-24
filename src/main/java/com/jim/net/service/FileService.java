package com.jim.net.service;
/**
 * Created by jim fu on 17/10/23.
 */
import com.jim.net.entity.UploadFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    public UploadFile saveFile(MultipartFile multFile, UploadFile file) throws IllegalStateException, IOException;
    public UploadFile getFile(Integer id);
    public List<UploadFile> getAllFile();
}
