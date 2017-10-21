package com.jim.net.utility;

import java.io.File;

import com.jim.net.entity.UploadFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class Content {
    public static void fileContent(MultipartFile multiFile, UploadFile f) throws IllegalStateException, IOException {
        multiFile.transferTo(new File(f.getFilePath()));
    }
}
