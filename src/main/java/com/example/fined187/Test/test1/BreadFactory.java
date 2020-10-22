package com.example.fined187.Test.test1;

import com.example.fined187.Test.test1.bread.Bread;
import com.example.fined187.Test.test1.bread.ButterBread;
import com.example.fined187.Test.test1.bread.CreamBread;
import com.example.fined187.Test.test1.bread.SugarBread;

public class BreadFactory {
    public static Bread create(String breadType, int flour, int water, int cream) {

        Bread bread;
        if(breadType.equals("butter")) {
            bread = new ButterBread(flour, water, cream);
        } else if (breadType.equals("cream")) {
            bread = new CreamBread(flour, water, cream);
        } else {
            bread =  new SugarBread(flour, water, cream);
        }

        return bread;
    }
}
