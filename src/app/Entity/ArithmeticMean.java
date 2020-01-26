package app.Entity;

import java.util.ArrayList;


import app.Interfaces.Data;

public class ArithmeticMean implements Data {

    public float getData(ArrayList<Integer> numbers){
        float result;
        int sum = 0;
        for(Integer element : numbers) sum += element;

        result = sum / (float)numbers.size();

        return result;
        
    }

   
    
}