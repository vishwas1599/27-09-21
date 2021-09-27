package com.thbs.mainpack;

import mydatepack.mydate;


public class Main {

    public static void main(String[] args) {
	// write your code here

       /* mydate m1=new mydate(27,9,2021);
        mydate m2=new mydate(27,9,2021);

       *//* System.out.println(m1.equals(m2));
        System.out.println(m1==m2);
        //on default it compares the references not the content

        mydate m3=m1;//making both the references as same
        System.out.println(m1.equals(m3));*/

        //After overriding
        mydate m1=new mydate(27,9,21);
        mydate m2=new mydate(27,9,21);
        mydate m3=m1;
        System.out.println(m1.equals(m2));


        System.out.println("Using == operator");
        System.out.println(m1==m2);
        System.out.println(m1==m3);

        //After overriding hashcodes
     /*   mydate m1=new mydate(27,9,21);
        mydate m2=new mydate(27,9,21);
        mydate m3=m1;
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println("after setting the hashcode");
        System.out.println(m1.equals(m2));*/
        //
    }
}
