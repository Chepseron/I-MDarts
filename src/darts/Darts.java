package darts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

class Darts {

    private double result;

    int score(double x, double y) {
        //check the square of the x and y cordinates
        result = (x * x) + (y * y);
        if (result <= 1) {
            return 10;
        } else if (result <= 25) {
            return 5;
        } else if (result <= 100) {
            return 1;
        }
        return 0;
    }

    public static void main() {
        try {

            Darts dart = new Darts();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("X cordinate of the target:");
            String x = br.readLine();
            System.out.println("Y cordinate of the target:");
            String y = br.readLine();
            System.out.println("Your score:");
            dart.score(Double.parseDouble(x), Double.parseDouble(y));

        } catch (IOException ex) {
            Logger.getLogger(Darts.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("We could not find your score, please play again");
        }

    }
}
