package com.jim.net.controller;

import com.jim.net.Exception.invalidInputException;
import com.jim.net.entity.UploadFile;
import com.jim.net.service.FileService;
import com.jim.net.utility.Content;
import com.jim.net.utility.MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    FileService fileService;

    @RequestMapping(value = "/files", method = RequestMethod.POST)
    public UploadFile uploadFile(MultipartFile file) throws IllegalStateException, IOException {
        UploadFile f = MetaData.parseToMetaData(file);
        return fileService.saveFile(file, f);
    }

    @RequestMapping(value = "/files/{id}", method = RequestMethod.GET)
    public UploadFile getFileInfo(@PathVariable Integer id) throws invalidInputException{
        if(fileService.getFile(id) == null) throw new invalidInputException("File not exist");
        else return fileService.getFile(id);
    }

    @RequestMapping(value = "/fileInfo", method = RequestMethod.GET)
    public List<UploadFile> getAllFiles() {
        return fileService.getAllFile();
    }

    @ExceptionHandler(value = invalidInputException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String showError(invalidInputException e) {
        return e.getMessage();
    }
}
