package com.thbs.mainpack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<String> q1=new LinkedList<String>() ;
        q1.add("Java");
        q1.add("c++");
        q1.add("c");
        q1.add("HTML");
        System.out.println(q1);
        //FIFO
        System.out.println(q1.poll());//remove the element
        System.out.println(q1);
        System.out.println(q1.peek());//not removes but tells which element will be removed in FIFO order



         }
}
