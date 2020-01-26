package app.Entity;

import java.util.ArrayList;

import app.Interfaces.Data;

public class Median implements Data {

    public float getData(ArrayList<Integer> numbers){
        float middle;
       
        if (numbers.size()%2 == 1) {
            middle = numbers.get(numbers.size()/2);
        } else {
            int a = numbers.get(numbers.size() / 2);
            int b = numbers.get((numbers.size() / 2) - 1);
            

            middle = (a+b)/(float)2;
        }


        

       
       

      return middle;
        
    }

    
}