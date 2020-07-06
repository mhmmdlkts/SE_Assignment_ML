import java.io.FileWriter;
import java.io.IOException;

public class generateTrainDat {

    public static final int trainCount = 100_000;

    public static void main(String[] args) throws IOException {
        FileWriter csvWriter = new FileWriter("train.csv");

        for (int i = 0; i < trainCount; i++)
            csvWriter.append(generateHand.generateNewHand().toString()).append((i+1 < trainCount)?"\n":"");

        csvWriter.flush();
        csvWriter.close();
    }
}
