package com.jim.net.utility;

import com.jim.net.entity.UploadFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

public class MetaData {
    static final String PATH = "files/";
    public static UploadFile parseToMetaData(MultipartFile f) {
        UploadFile file = new UploadFile();
        file.setFileName(f.getOriginalFilename());
        file.setFilePath((new File(PATH)).getAbsolutePath() + "/" + f.getOriginalFilename());
        file.setUploadTime(new Date());
        return file;
    }
}
