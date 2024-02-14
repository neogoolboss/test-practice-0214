package com.ohgiraffers.test.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {

    }

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }
    public int getbNo() {
        return bNo;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String categoryNum = "";

        switch (category) {
            case 1 :
                categoryNum = "인문";
                break;
            case 2 :
                categoryNum = "자연과학";
                break;
            case 3 :
                categoryNum = "의료";
                break;
            case 4 :
                categoryNum = "기타";
                break;
            default:
                System.out.println("카테고리를 다시 선택해 주세요.");
                break;
        }

        return "BookDTO{" +
                "bNo = " + bNo +
                ", category = " + categoryNum +
                ", title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                '}';
    }
}
