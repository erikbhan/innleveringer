import java.util.Random;

public class MyRandom {
    private Random rand;

    public MyRandom() {
        this.rand = new Random();
    }

    public int nextInt(int lower, int upper) {
        int number = -1;
        while (number < lower) {
            number = rand.nextInt(upper + 1);
        }
        return number;
    }

    public double nextDouble(double lower, double upper) {
        double number = -1;
        while (number < lower || number > upper) {
            number = rand.nextDouble();
        }
        return number;
    }
}
