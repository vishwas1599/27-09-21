package com.thbs.mainpack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Map<Integer,String> m=new HashMap<Integer,String>();*/
        //method used to insert objects in map
        /*m.put(100,"Books");
        m.put(500,"plants");
        m.put(200,"pen");
        m.put(250,"cycle");
        m.put(null,null);//only one key value null is allowed,but any num of null in values
        m.put(300,"car");
        m.put(350,null);
        m.put(200,"motor");//latest value will overide the duplicate key
        //no order of insertion
        System.out.println(m);*/


        //Linked Hashmap
       /* Map<Integer,String> n=new LinkedHashMap<Integer,String>();
        n.put(100,"Books");
        n.put(500,"plants");
        n.put(200,"pen");
        n.put(250,"cycle");
        n.put(null,null);//only one key value null is allowed,but any num of null in values
        n.put(300,"car");
        n.put(350,null);
        n.put(200,"motor");
      //follows  order of insertion
        System.out.println(n);*/

        //TRee MAP
        //sorts based on key values
        /*Map<Integer,String> n=new TreeMap<Integer,String>();
        n.put(100,"Books");
        n.put(500,"plants");
        n.put(200,"pen");
        n.put(50,"cycle");
        //n.put(null,null);//null key is not allowed in key map
        n.put(300,"car");
        n.put(150,null);
        n.put(200,"motor");
        System.out.println(n);*/

        //HashTable-doesnt allow null as key value at all
        //All its methods are thread safe
        //ALmost same as Hashmap except null key and null values also
        Map<Integer,String> m=new Hashtable<Integer,String>();
        m.put(700,"Books");
        m.put(500,"plants");
        m.put(200,"pen");
        m.put(250,"cycle");
      //  m.put(null,null);//null key is not allowed
        m.put(300,"car");
       // m.put(350,null);
        m.put(200,"motor");//latest value will overide the duplicate key
        // no order of insertion
        System.out.println(m);
    }
}
