package com.mycom.word;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner s;
    /*
     * => 난이도(1,2,3) & 새 단어 입력 :1 driveway
     * 뜻 입력 :차고 진입로
     * 새 단어가 단어장에 추가되었습니다.
     */

    WordCRUD(Scanner s){
        list = new ArrayList<>();
        this.s = s;
    }

    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        // next 만 사용하면 /n가 버퍼에 남아서 다음에 nextLine()함수를 호출할 때 문제가 생긴다

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();
        return new Word(0, level, word, meaning);
    }

    public void addWord() {
        Word one = (Word)add();
        list.add(one);
        System.out.println("\n새 단어가 단어장에 추가되었습니다 !!!\n");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    /*
     => 원하는 메뉴는? 1
     --------------------------------
      1 ***      superintendent    관리자, 감독관
      2 **             electric    전기의, 전기를 생산하는

     */
    public void listAll() {
        System.out.println("--------------------------------");
        for(int i=0; i<list.size(); i++){
            System.out.print(" " + (i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("--------------------------------\n");
    }
}
