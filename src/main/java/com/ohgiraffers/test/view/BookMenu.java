package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    BookManager bm = new BookManager();
    Scanner sc = new Scanner(System.in);
    BookDTO bookDTO = new BookDTO();

    // 기본생성자
    public BookMenu() {

    }

    // 도서관리 프로그램에 해당하는 메인 메뉴 출력, 각 메뉴에 해당하는 BookManager 클래스의 메소드 실행(반복출력)
    public void menu() {



        while (true) {

            System.out.println("========== 도서관리프로그램 ==========");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 제목으로 검색");
            System.out.println("4. 전달받은 인덱스에 있는 도서 정보 출력"); // 전달받은 인덱스??
            System.out.println("5. 도서목록 보기");
            System.out.println("6. 카테고리순으로 정렬");
            System.out.println("7. ????????????"); // 도서 전체목록 출력과 뭐가 다른가?
            System.out.println("0. 프로그램 종료"); // 도서 전체목록 출력과 뭐가 다른가?
            System.out.print("번호를 선택해주세요 : "); // 도서 전체목록 출력과 뭐가 다른가?

            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 번호입니다.");
                    break;
            }
            if (menuNum == 0) {
                break;
            }

        }

    }

    public BookDTO inputBook() {

        System.out.print("도서 번호를 입력하세요. : ");
        int bNo = sc.nextInt();
        bookDTO.setbNo(bNo);

        System.out.print("카테고리를 입력하세요. : ");
        int category = sc.nextInt();
        bookDTO.setCategory(category);

        System.out.print("도서 제목을 입력하세요. : ");
        String title = sc.next();
        bookDTO.setTitle(title);

        System.out.print("저자를 입력하세요. : ");
        String author = sc.next();
        bookDTO.setAuthor(author);

        return bookDTO;
    }

    public String inputBookTitle() {

        System.out.print("검색할 도서 제목을 입력하세요 : ");
        String title = sc.nextLine();
        return title;

    }

}
