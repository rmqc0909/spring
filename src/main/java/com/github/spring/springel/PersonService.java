package com.github.spring.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by xiedan11 on 2016/12/27.
 */
@Service
public class PersonService {
    @Value("Linda")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
