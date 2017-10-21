package com.jim.net.service;

import com.jim.net.dao.FileDao;
import com.jim.net.entity.UploadFile;
import com.jim.net.utility.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;


@Service
public class FileServiceImpl implements FileService{

    @Autowired
    FileDao fileDAO;

    @Override
    @Transactional
    public UploadFile saveFile(MultipartFile multFile, UploadFile file) throws IllegalStateException, IOException {
        Content.fileContent(multFile, file);
        return fileDAO.save(file);
    }

    @Override
    @Transactional
    public UploadFile getFile(Integer id) {
        return fileDAO.getFile(id);
    }

    @Override
    public List<UploadFile> getAllFile() {
        return fileDAO.getAllFile();
    }
}
