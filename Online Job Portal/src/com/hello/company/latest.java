package com.hello.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class latest extends Government {

    public latest(){
        System.out.println("here you will get latest jobs ");
    }


    public latest(int l)
    {
        ArrayList k = pri(4);
        System.out.println(k);
    }


    public ArrayList pri(int n) {
        Iterator f = a.iterator();

        do {
            System.out.println(f.next());
        }
        while (f.hasNext());
        a.trimToSize();

        return a;

    }

}
