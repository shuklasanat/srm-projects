package com.hello.company;

import java.security.PublicKey;
import java.util.Scanner;

public  class register {
    public Scanner i = new Scanner(System.in);
    public Scanner d = new Scanner(System.in);
    public String name;
    public  String email;


    public register()
    {
        execute();

    }

        public void execute()
        {

            System.out.println("press 1 to enter the name \n press 2 to enter the email addresss \n press 3 to return to previous menu");
            boolean n= false ;

            while ( n != true) {

                System.out.println("enter the choise");

            int c = i.nextInt();

            switch (c) {
                case 1:
                    System.out.println("enter the name");
                    name = d.nextLine();
                    setName(name);

                    break;
                case 2:
                    System.out.println("enter the email address");
                    email = d.nextLine();
                    setEmail(email);
                    System.out.println("successful");
                    break;
                case 3:
                    n = true;
                    break;


            }
        }





    }

    public void message()
    {
        System.out.println("you have been successfully  registered");
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;

    }
}
