package com.test.service.client;

import com.test.entity.Book;
import org.springframework.stereotype.Component;

@Component   //注意，需要将其注册为Bean，Feign才能自动注入
public class BookFallbackClient implements BookClient {
    @Override
    public Book getBookById(int bid) {
        Book book = new Book();
        book.setTitle("我是book的补救措施");
        return book;
    }
}
