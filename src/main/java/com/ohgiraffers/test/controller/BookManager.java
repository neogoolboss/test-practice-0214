package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;
import com.ohgiraffers.test.view.BookMenu;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private ArrayList<BookDTO> bookList;      // iv로 만들어서 this를 통해 다른 메서드에서 사용 가능하게 함.

    public BookManager() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
        System.out.println(book + " 추가 완료");
    }

    public void deleteBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
        } else {
            System.out.println("해당 index에 정보가 없습니다.");
        }
    }

//    public int searchBook(String title) {
//        return ;
//    }

}
