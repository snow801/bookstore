package com.lpq.service.impl;

import com.lpq.dao.BookImageDAO;
import com.lpq.pojo.BookImage;
import com.lpq.service.BookImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookImageServiceImpl implements BookImageService{

    @Autowired
    private BookImageDAO bookImageDAO;

    @Override
    public BookImage getByBookId(int bid) {
        return bookImageDAO.getByBookId(bid);
    }

    @Override
    public void add(BookImage bookImage) {
        bookImageDAO.add(bookImage);
    }

    @Override
    public void update(BookImage bookImage) {
        bookImageDAO.update(bookImage);
    }

    @Override
    public void deleteByBookId(int bid) {
        bookImageDAO.deleteByBookId(bid);
    }
}
