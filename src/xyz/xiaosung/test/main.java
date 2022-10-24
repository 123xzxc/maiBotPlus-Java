package xyz.xiaosung.test;

import xyz.xiaosung.aList.impl.AllList;

public class main {
    public static void main(String[] args) {
        AllList alllist = AllList.getAllList();
        //String nickName, String name, String address, Date openDate, Date closeDate, Integer quantity
        alllist.add("ss","三盛","三盛国际广场",10,23,0);
        System.out.println(alllist.readByNickName("ss").getName());
        System.out.println(alllist.delByNickName("ss"));
    }
}
