package com.lpq.dao;

import com.lpq.pojo.BookImage;

public interface BookImageDAO {

    /*BookImage getByBookId(@Param("start") int start, @Param("count") int count, @Param("cid") int cid);*/
    BookImage getByBookId(int bid);
    void add(BookImage bookImage);
    void update(BookImage bookImage);
    void deleteByBookId(int bid);
}
