package app.Entity;


public class Mode {


    public static float mode(int a[],int n) {
        int maxValue = 0, maxCount = 0, i, j;
  
        for (i = 0; i < n; ++i) {
           int count = 0;
           for (j = 0; j < n; ++j) {
              if (a[j] == a[i])
              ++count;
           }
  
           if (count > maxCount) {
              maxCount = count;
              maxValue = a[i];
           }
        }
        return (float)maxValue;
     }
    
}