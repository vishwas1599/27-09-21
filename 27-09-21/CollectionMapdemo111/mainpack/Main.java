package com.thbs.mainpack;

import com.thbs.custpack.Customer;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
//problem is to get the stock value in furniture shop
       /* Map<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Sofa",5000);
        hm.put("Lamp",2000);
        hm.put("table",6000);
        hm.put("chairs",19000);

        //we can get access key separetely
        System.out.println(hm.keySet());

        //to get only values
        System.out.println(hm.values());

        //to get both
        System.out.println(hm.entrySet());

        //to add values we need to iterate
        //through key we can access values
        int sum=0;
        for(String i:hm.keySet())
        {
            System.out.println(i+" "+hm.get(i));

        }
        for(String i:hm.keySet())
        {

            sum+=hm.get(i);
        }
        System.out.println("Total stock value is  "+sum);*/


        //problem-2
       // To find sales by creating class
        /*HashMap<Customer,Integer> custmap=new HashMap<Customer,Integer>();
                custmap.put(new Customer(200,"Ram"),10000);
        custmap.put(new Customer(120,"adi"),2000);
        custmap.put(new Customer(101,"vivek"),2500);


        for(Customer c:custmap.keySet())
        {
            System.out.println(c+"  "+custmap.get(c));
        }


        int total_sales_amt=0;
        for(Customer c:custmap.keySet())
        {
            total_sales_amt+=custmap.get(c);
        }
        System.out.println("Total sales amount   "+total_sales_amt);*/

        //Problem-3
        //to print states and its capital
        Map<String,String> s1=new HashMap<String,String>();
        s1.put("Karnataka","Benagluru");
        s1.put("TN","Chennai");
        s1.put("Kerala","Kochi");


        for(String state:s1.keySet())
        {
            System.out.println(state+"  "+s1.get(state));
        }

    }
}
