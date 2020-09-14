public class MyRandomClient {
    public static void main(String[] args) {
        MyRandom myRand = new MyRandom();

        int upperInt = 250;
        int lowerInt = 125;

        double upperDouble = 0.87;
        double lowerDouble = 0.03;

        for (int i = 0; i < 1000; i++) {
            int next = myRand.nextInt(lowerInt, upperInt);
            if (next > upperInt || next < lowerInt) {
                System.out.println("Error");
                break;
            } else if (i == 999) {
                System.out.println("No failures");
            }
        }

        for (int j = 0; j < 1000; j++) {
            double nextDouble = myRand.nextDouble(lowerDouble, upperDouble);
            if (nextDouble > upperDouble || nextDouble < lowerDouble) {
                System.out.println("Error");
                break;
            } else if (j == 999) {
                System.out.println("No failures");
            }
        }
    }
}
