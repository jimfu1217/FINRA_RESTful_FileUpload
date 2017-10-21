package com.jim.net.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "FILE")
public class UploadFile implements Serializable{
    private static final long serialVersionUID = 242347598567683510L;

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = IDENTITY)
    private Integer fileId;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    @Column(name = "Name")
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Column(name = "Path")
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Column(name = "UploadTime")
    private Date uploadTime;

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Override
    public String toString() {
        return "File: \n [ID]: "+fileId
                +"\n [Name]: " + fileName
                +"\n [Path]: " + filePath
                +"\n [Upload time]: " + uploadTime;
    }
}
