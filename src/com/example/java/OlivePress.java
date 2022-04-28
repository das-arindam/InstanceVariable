package com.example.java;

import model.Olive;
import java.util.List;

public class OlivePress {

    public int getOil(List<Olive> olive){

        for (Olive o : olive) {
            extracted(o);
        }

        return 0;
    }

    private void extracted(Olive o) {
        System.out.println(o.name);
        System.out.println(o.color);
        System.out.println(o.oil);
    }

}
