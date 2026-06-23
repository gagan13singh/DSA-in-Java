package oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_CAPACITY = 10;
    private int size=0;

    public CustomArrayList() {
        data = new int[DEFAULT_CAPACITY];
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int[] newData = new int[data.length*2];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        data=newData;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public int set(int index,int value){
        return data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList {"+"data= "+ Arrays.toString(data)+" size= "+ size+"}";
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list2 = new CustomArrayList();
        list2.add(26);
        list2.add(27);
        list2.add(28);
        System.out.println(list2);
    }
}
