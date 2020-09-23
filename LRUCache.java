package com.rajesh.org.test;
import java.util.*;

public class LRUCache {

    List<String> list= new ArrayList<>();


    public static void main(String[] args) {

        LRUCache cache= new LRUCache();
        cache.put("A");
        cache.put("B");
        cache.put("C");

        System.out.println(cache.get("B"));
        System.out.println(cache.get("C"));
        cache.put("D");

        cache.get("D");
        cache.get("B");

        cache.put("E");
        
        System.out.println(cache.getList());


    }

    public void put(String item){
        if(list.size()==3){
            list.remove(list.size()-1);
            list.add(0,item);
        }
        else{
            list.add(0,item);
        }
    }

    public String get(String item){
       boolean tmp= list.remove(item);
       if(tmp) {
           list.add(0, item);
       }
       return list.get(0);
    }

    public List<String> getList() {
        return list;
    }
}
