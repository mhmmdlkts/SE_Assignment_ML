import java.io.FileWriter;
import java.io.IOException;

public class generateTrainDat {

    public static final int trainCount = 100_000;
    public static final int testCount = 10_000;

    public static void main(String[] args) {
        try {
            createData("training.csv", trainCount);
            createData("test.txt", testCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createData(String filename, int size) throws IOException {
        FileWriter csvWriter = new FileWriter(filename);

        csvWriter.append("1. Card,").append("2. Card,").append("3. Card,").append("Hand Value").append("\n");

        for (int i = 0; i < size; i++)
            csvWriter.append(generateHand.generateNewHand().toString()).append((i+1 < size)?"\n":"");

        csvWriter.flush();
        csvWriter.close();
    }
}
