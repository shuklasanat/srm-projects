package com.hello.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Government {
    public Scanner i =new Scanner(System.in);



   public  ArrayList a = new ArrayList();
   public ArrayList d = new ArrayList();

   public Government()
   {
       newentry();
       System.out.println(a);
   }

   public void newentry()
   {

      String c = "Y";
       while(c!="N")
       {
           System.out.println("if you want to make a new entry press Y \n else press N to exit");
           c = i.nextLine();
           switch(c){

               case "Y":
                   System.out.println("enter the name of the job");
                   a.add(i.nextLine());
                   System.out.print("enter the date of the job");
                   d.add(i.nextLine());
                   break;
               case "N":
                   System.out.println("enties are complete");
                   System.out.println(a);
                   c ="N";
                   break;


           }
       }



   }

    public ArrayList getA() {
        return a;
    }
}