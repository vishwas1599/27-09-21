package com.thbs.mainpack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector<String> v1=new Vector<String>();
        v1.add("ram");
        v1.add("Hanuman");
        v1.add("gita");

        Enumeration<String> e = v1.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement()+" ");
        }

        System.out.println("-------------------------------------");
        System.out.println("USing iterator");

        Iterator<String> i = v1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
