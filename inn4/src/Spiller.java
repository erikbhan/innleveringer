import java.util.Random;

public class Spiller {
    private Random terning;
    private int sumPoeng;

    public Spiller() {
        this.terning = new Random();
        this.sumPoeng = 0;
    }

    public int getSumPoeng() {
        return this.sumPoeng;
    }

    public int kastTerning() {
        int kast = this.terning.nextInt(6) + 1;
        if (this.getSumPoeng() > 100) {
            this.sumPoeng -= kast;
        } else {
            this.sumPoeng += kast;
        }
        return kast;
    }
}