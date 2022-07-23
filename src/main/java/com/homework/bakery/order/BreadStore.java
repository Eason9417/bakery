package com.homework.bakery.order;

import com.homework.bakery.bread.Bread;

public class BreadStore {
    private double sum = 0;
    public double orderByBread(Bread bread){
        if (bread == null){
            return sum += 0;
        }
        return  sum += bread.getPrice();
    }

    public double getSum() {
        return sum;
    }

}
