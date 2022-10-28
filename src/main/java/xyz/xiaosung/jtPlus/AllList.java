package xyz.xiaosung.jtPlus;

import xyz.xiaosung.jtPlus.ali.aListInterface;
import xyz.xiaosung.jtPlus.ali.aList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 柊韵
 */
public class AllList implements aListInterface {
    static AllList allList;
    private AllList(){
    }

    public static AllList getAllList(){
        if(allList == null){
            allList = new AllList();
        }return allList;
    }

    List<aList> allaList = new ArrayList<>();
    @Override
    public Object add(String nickName, String name, String address, Integer openDate, Integer closeDate, Integer quantity) {
        for (aList temp : allaList) {
            if (nickName.equals(temp.getNickName()) || name.equals(temp.getName())) {
                return false;
            }
        }
        aList alist = new aList(nickName, name, address, openDate, closeDate, quantity);
        allaList.add(alist);
        return true;
    }

    @Override
    public Object delByNickName(String nickName) {
        for(int i = 0; i < allaList.size(); i++){
            aList temp = allaList.get(i);
            if(nickName.equals(temp.getNickName())){
                allaList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object delByName(String name) {
        for(int i = 0; i < allaList.size(); i++){
            aList temp = allaList.get(i);
            if(name.equals(temp.getName())){
                allaList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public aList readByNickName(String nickname) {
        for (aList temp : allaList) {
            if (nickname.equals(temp.getNickName())) {
                return temp;
            }
        }
        return null;
    }

    @Override
    public aList readByName(String name) {
        for (aList temp : allaList) {
            if (name.equals(temp.getName())) {
                return temp;
            }
        }
        return null;
    }
}
