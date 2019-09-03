import java.util.Random;

public class RandomGenerator {

    private StringBuilder randomNumber = new StringBuilder("");
    private Random random = new Random();

    public StringBuilder random(int numberOfDigits) {

        for (int i = 0; i < numberOfDigits; i++) {

            randomNumber.append(random.nextInt(10));

        }

        return randomNumber;

    }

}
