package _2finalyear;

/**
 * Created by amey on 13/10/16.
 */
public class AverageMain {
    public static void main(String[] args) {
        double[] temps = {30.2, 40.2, 35.4, 36.5, 37};
        double sum = 0;
        for (int j = 0; j < temps.length; j++) {
            sum = sum + temps[j];
        }
        System.out.println("Average is " + sum / temps.length);
    }
}
