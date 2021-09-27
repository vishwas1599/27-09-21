package com.thbs.mainpack;
import java.util.LinkedHashSet;
import java.util.Set;
        import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code her
        Set s1=new HashSet();
        //method to insert or add elements in any collection is add()
        s1.add(1);
        s1.add(12.5);
        s1.add("Java");
        s1.add(null);
        s1.add(45.657F);
        s1.add(12.5);
        //s1 is considering all the objects added as objects of Object class
        //it removes duplicates
        System.out.println(s1);//the order enetred and the output are different bcz of hashcode

        Set<String> s2=new HashSet<String>();
        s2.add("vish");
        s2.add("was");
        s2.add("gowda");
        System.out.println(s2);//It will not follow the order of insertion

        //Linked HAshset
        //unsorted but ordered set
        //It follows the order of insertion
        Set<String> s3=new HashSet<String>();
        s3.add("vish");
        s3.add("was");
        s3.add("gowda");
        s3.add("torry");
        s3.add("vish");//latest entered duplicate will be considered

        System.out.println(s3);


        //TreeSet
        //Sorted Set according to natural order i.e a b c d
        Set<String> s4 =new TreeSet<String>();
        s4.add("vish");
        s4.add("arvind");
        s4.add("sanvi");
        s4.add("viv");
        s4.add("sanvi");
        System.out.println(s4);

    }
}
