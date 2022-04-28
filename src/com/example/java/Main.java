package com.example.java;

import model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olive = new ArrayList<>();

        Olive o1 = new Olive();
        olive.add(o1);

        Olive o2 = new Olive();
        olive.add(o2);

        Olive o3 = new Olive();
        olive.add(o3);

        OlivePress op = new OlivePress();
        op.getOil(olive);
    }
}
