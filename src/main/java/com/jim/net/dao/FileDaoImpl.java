package com.jim.net.dao;

import com.jim.net.entity.UploadFile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class FileDaoImpl implements FileDao{

    @PersistenceContext
    EntityManager em;

    @Override
    public UploadFile save(UploadFile f) {
        em.persist(f);
        return f;
    }

    @Override
    public UploadFile getFile(Integer Id) {
        return em.find(UploadFile.class, Id);
    }

    @Override
    public List<UploadFile> getAllFile() {
        Query q = em.createQuery("SELECT file FROM FILE file");
        return q.getResultList();
    }
}
