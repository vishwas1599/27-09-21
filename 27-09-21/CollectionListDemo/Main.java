package com.thbs.mainpack;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*List<String> s =new ArrayList<String>();
        s.add("arun");
        s.add("kumar");
        s.add("vishnu");
        s.add("anu");
        s.add("kumar");
        System.out.println(s);

        //to insert elements in particular index value
        //to insert at index at 3
        s.add(3,"vivek");
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
        s.remove("vishnu");
        System.out.println(s);

        //to merge two arrays
        ArrayList<String> s2=new ArrayList<String>();
        s2.add("one");
        s2.add("two");
        s2.add("three");

        s.addAll(2,s2);
        System.out.println(s);

        s.addAll(s2);
        System.out.println(s);

        //traditional for loop for displaying
        for(int i=0;i<s.size();i++)
        {
            System.out.println(s.get(i));
        }

        //enhanced for loop
        System.out.println("enhanced for loop-----------------------------");
        for(String x:s2)
        {
            System.out.println(x+" ");
        }

        //we can use iterator class object for iterating any collection
        //Iterator also for displaying
        System.out.println("Iterator ------------------------------------");
       Iterator i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        Iterator<String> t=s.iterator();
        while(t.hasNext())
        {
            System.out.println(t.next().toUpperCase());
            System.out.println(t.next().toLowerCase());
        }
        */
        //Array list to add integer
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ilist=new ArrayList<Integer>();
        System.out.println("Number of elemets in array");
        int n=sc.nextInt();

        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {

            int ele=sc.nextInt();
            ilist.add(ele);

        }
        int sum=0;
        Iterator<Integer> it1=ilist.iterator();

        while(it1.hasNext())
        { int ele1= it1.next();
            System.out.println(ele1);
            sum+= ele1;
        }
        System.out.println("Sum of elemets "+sum);
    }
}
