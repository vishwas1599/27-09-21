package com.thbs.mainpack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //LIFO
        Stack<String> s1=new Stack<String>();
        s1.push("kkk");
        s1.push("aaa");
        s1.push("lll");
        s1.push("vish");
        s1.push("naa");
        s1.push("stl");

        System.out.println(s1.pop());//removes last element
        System.out.println(s1);

        System.out.println(s1.peek());//peek doesn't remove but return top element
        System.out.println(s1);

        System.out.println(s1.search("xxx"));
        System.out.println(s1.search("lll"));// it shows position of that string[naa will be 1,vish-2,lll-3]

        System.out.println(s1.contains("vish"));
    }
}
