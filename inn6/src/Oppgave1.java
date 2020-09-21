import java.util.Random;

public class Oppgave1 {
    public static void main(String[] args) {
        Random random = new Random();

        int amountOfLoops = 50000;
        int[] occurrences = new int[10];

        for (int i = 0; i < amountOfLoops; i++) {
            int number = random.nextInt(10);
            occurrences[number]++;
        }

        for (int i = 0; i < occurrences.length; i++) {
            int amountOfStars = Math.round(occurrences[i] / 10);
            //Always round amountOfStars up
            if (occurrences[i] % 10 != 0) {
                amountOfStars++;
            }

            String stars = "";



            //Adds amountOfStars number of "*" to the string stars
            for (int j = 0; j < amountOfStars; j++) {
                stars += "*";
            }

            System.out.println(i + ": " + occurrences[i] + " " + stars);
        }
    }
}
