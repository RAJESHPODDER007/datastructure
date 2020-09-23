package com.rajesh.org.test;


public class ArrayListEX<T> {

    private int initial_size = 10;
    private int pointer = 0;

    private Object[] elementData = new Object[initial_size];

    public boolean add(T item) {
        while (pointer < initial_size) {
            if (elementData[pointer] == null) {
                elementData[pointer] = item;
                break;
            } else {
                pointer++;
            }
        }
        return true;
    }

    public T get(int index) {
        if(null== (T) elementData[index]){
            throw new IndexOutOfBoundsException("Index out of bound exception : Index : " + index +" Size: "+ pointer );
        }else
            return (T)elementData[index];
    }

    public T get(T item) {
        T tmp = null;
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == item) {
                tmp = (T) elementData[i];
            }
        }
        if(null== (T) tmp){
            throw new ItemNotFoundException("Item not found exception : item : " + item );
        }else
            return (T)tmp;
    }

    public boolean remove(int index){
        boolean flag=false;
        Object[] tempData = new Object[initial_size];
        for (int i = 0, k=0; i < elementData.length; i++) {
            if(i==index) {
                flag=true;
                continue;
            }

            tempData[k++]=elementData[i];
        }
        this.elementData=tempData;
        return flag;
    }

    public boolean remove(T item){
        boolean flag=false;
        Object[] tempData = new Object[initial_size];
        for (int i = 0, k=0; i < elementData.length; i++) {
            if(elementData[i]==item) {
                flag=true;
                continue;
            }

            tempData[k++]=elementData[i];
        }
        this.elementData=tempData;
        return flag;
    }

    public static void main(String[] args) {
       ArrayListEX<String> list = new ArrayListEX<>();
        System.out.println( list.add("Rajesh"));
        System.out.println( list.add("Podder"));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("*********************");
        System.out.println(list.remove("Rajesh"));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println( list.add("Rajesh"));
        System.out.println(list.remove(0));
        System.out.println(list.get(0));
        System.out.println(list.get(1));


    }
}
class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(String message){
        super(message);
    }
}
