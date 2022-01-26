package com.tosan.example8;

import com.tosan.example1.MyThread;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example8 {
    // wildcard
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List<String> list1 = new ArrayList<>();
//        list1.add("ss");
//        String str = list1.get(1);
//        print("majid");
//        print(10);
//        print('c');

        List<String> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        List<Thread> list2 = new ArrayList<>();
        List<MyThread> list3 = new ArrayList<>();
//        list = list1;
//        list1 = list;
//        print(list);
    }

    public static <T extends Thread & Runnable & Serializable, U extends Thread, R> void print(List<T> list){

    }

//    public static <T, U> void print(T object, U object2){
//        System.out.println(object.getClass().getName());
//    }
//
//    public static <T> void print(T object){
//        System.out.println(object.getClass().getName());
//    }

//    // lower bounded
//    public static void print(List<? super Thread> list){
//
//    }

//    // upper bounded
//    public static void print(List<? extends Thread> list){
//
//    }
//
//    // unbounded
//    public static void print(List<?> list){
//
//    }
//
//    public static <T> void print(List<? super T> list){
//
//    }
}
