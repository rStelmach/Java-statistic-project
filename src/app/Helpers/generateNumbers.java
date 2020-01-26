package app.Helpers;

import java.util.ArrayList;
import java.util.Random;

public class generateNumbers {

    public static ArrayList<Integer> generate(int value){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for(int i = 1; i <= value; i++){
            Random generator = new Random();
            int number = generator.nextInt(10);
            numbers.add(number);
        }
        return numbers;
    }
}
