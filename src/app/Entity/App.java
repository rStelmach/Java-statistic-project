package app.Entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import app.Helpers.Log;
import app.Helpers.generateNumbers;;

public class App {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    float dataDescription[] = new float[4];

    public App() {
        startProgram();
    }

    public void startProgram() {
        Log.info("Wpisz, ile chcesz wygenerować liczb: ");

        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        
        
        
        

        this.numbers = generateNumbers.generate(value);
        Collections.sort(this.numbers);

        ArithmeticMean arithmeticMean = new ArithmeticMean();
        Median median = new Median();

        dataDescription[0] = arithmeticMean.getData(this.numbers);
        dataDescription[1] = median.getData(this.numbers);

        int[] mode = numbers.stream().mapToInt(i -> i).toArray();
        dataDescription[2] = Mode.mode(mode, this.numbers.size());

        double[] standardDeviation = numbers.stream().mapToDouble(i -> i).toArray();
        dataDescription[3] = StandardDeviation.calculateSD(standardDeviation);


         

        Log.info();
        for (Integer element : numbers) {
            System.out.print(element + " ");
        }
        Log.info();
        

        File file = new File("wynik.txt");
        try {
            PrintWriter zapis = new PrintWriter("wynik.txt");
            zapis.println("Średnia arytmetyczna: " + dataDescription[0]);
            zapis.println("Mediana: " + dataDescription[1]);
            zapis.println("Dominanta: " + dataDescription[2]);
            zapis.println("Odchylenie standardowe: " + dataDescription[3]);
            zapis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        

        



        

      
        
    }
}