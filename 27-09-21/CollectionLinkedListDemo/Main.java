package com.thbs.mainpack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> s1=new LinkedList<String>();
        s1.add("tiger");
        s1.add("lion");
        s1.add("monkey");

        System.out.println(s1.isEmpty());
        System.out.println("contains lion?"+s1.contains("lion"));

        //ListIterator can move in both directions
        ListIterator<String> it =s1.listIterator();
        System.out.println(" ");
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");

        }
        //Now .it is in last position so now can reverse
        System.out.println("printing in backward direction");
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }

        //To permanentley reverse it
        Collections.reverse(s1);
        System.out.println(s1);
        //to sort
        Collections.sort(s1);
        System.out.println(s1);
        //to shuffle
        Collections.shuffle(s1);
        System.out.println(s1);
    }
}
