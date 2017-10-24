package com.jim.net.dao;
/**
 * Created by jim fu on 17/10/23.
 */
import com.jim.net.entity.UploadFile;

import java.util.List;

public interface FileDao {
    public UploadFile save(UploadFile f);
    public UploadFile getFile(Integer Id);
    public List<UploadFile> getAllFile();
}
