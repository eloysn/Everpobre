package com.fratelliapps.everpobre.model;

import java.util.List;

/**
 * Created by eloysanznavarro on 18/4/16.
 */
public class Notebooks  {

     List<Notebook> notebooks;


    public  static Notebooks createNotebooks(List<Notebook> notebooks) {


        Notebooks myNotebooks = new Notebooks();


        for (Notebook n: notebooks) {
            myNotebooks.add(n);
        }

        return  myNotebooks;
    }


    private Notebooks() {

    }

    public void add(Notebook notebook) {


    }
    
    public  List<Notebook> getNotebooks() {


        return this.notebooks;
    }

}
