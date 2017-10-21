package com.jim.net;


import com.jim.net.Exception.invalidInputException;
import com.jim.net.controller.Controller;
import com.jim.net.dao.FileDao;
import com.jim.net.entity.UploadFile;
import com.jim.net.service.FileService;
import com.jim.net.service.FileServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UploadTest {

    @Mock
    FileDao fileDao;

    @InjectMocks
    FileServiceImpl fileService;

    @Mock
    FileService fileServiceMock;


    @InjectMocks
    Controller ControllerMock;

    private UploadFile file = new UploadFile();
    private Integer fileId = 12;
    private String fileName = "test.txt";
    private String filePath = "testPath";
    private Date uploadTime = new Date();

    private List<UploadFile> testList = new ArrayList<>();

    @Before
    public void initTest() {

        file.setFileId(fileId);
        file.setFilePath(filePath);
        file.setFileName(fileName);
        file.setUploadTime(uploadTime);

        testList.add(file);
    }

    @Test
    public void testGetFile() {
        when(fileDao.getFile(fileId)).thenReturn(file);
        assertEquals(fileService.getFile(fileId).toString(), file.toString());
    }

    @Test
    public void testGetAll(){
        when(fileDao.getAllFile()).thenReturn(testList);
        assertTrue(fileService.getAllFile().size() == 1 &&
            fileService.getAllFile().get(0).toString().equals(testList.get(0).toString()));
    }

    @Test(expected = invalidInputException.class)
    public void testGetFileInforController() throws invalidInputException {
        when(fileServiceMock.getFile(fileId)).thenReturn(null);
        ControllerMock.getFileInfo(fileId);
    }

}
