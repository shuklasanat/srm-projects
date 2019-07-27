package com.hello.company;

import java.util.*;

public class jobs {

   // public Government g = new Government();
   // public Private k;
   // public Qualification q;
   // public latest l;
   // public register r;
   // public admit a;

    public  Scanner i = new Scanner(System.in);


    public jobs( register r,Private k,Government g )
    {

        System.out.println("to get government jobs press 1 \n to get private jobs press 2 \nto jobs according to qualification press 3 \n" +
                "to get latest  jobs press 4 \nto get admit card press 5 \nto get registered press 6 \n");

        int c = i.nextInt();

        switch(c){
            case 1:
                System.out.println("you have selected government jobs");
               System.out.print( g.getA());
                break;
            case 2:
                System.out.println("you have selected private jobs");
               System.out.println( k.getA());
                break;
            case 3:
                System.out.println("you have selected  jobs according to qualification");
                break;
            case 4:
                System.out.println("you have selected latest jobs");
                break;
            case 5:
                System.out.println("you have selected admit card");
                break;
            case 6:
                System.out.println("register your self");
                r.message();
                break;



        }



    }









}
