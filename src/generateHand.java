import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class generateHand implements Iterable<generateCard> {

    List<generateCard> generateCards;
    int value;

    public generateHand(generateCard generateCard1, generateCard generateCard2, generateCard generateCard3) {
        generateCards = new ArrayList<>();
        generateCards.add(generateCard1);
        generateCards.add(generateCard2);
        generateCards.add(generateCard3);
        value = calculateValue(this);
    }

    public generateHand(String hand) {
        String[] string_cards = hand.split(" ");
        generateCards = new ArrayList<>();
        for (String card : string_cards)
            generateCards.add(new generateCard(card));
        value = calculateValue(this);
    }

    public static generateHand generateNewHand() {
        return new generateHand(generateCard.generateCard(), generateCard.generateCard(), generateCard.generateCard());
    }

    public static int calculateValue(generateHand generateHand) {
        int totC = 0, totD = 0, totH = 0, totS = 0;
        for (generateCard generateCard : generateHand) {
            switch (generateCard.suit) {
                case 'C':
                    totC += generateCard.value;
                    break;
                case 'D':
                    totD += generateCard.value;
                    break;
                case 'H':
                    totH += generateCard.value;
                    break;
                case 'S':
                    totS += generateCard.value;
                    break;
            }
        }
        return Math.max(Math.max(totC, totD), Math.max(totH, totS));
    }

    @Override
    public Iterator<generateCard> iterator() {
        return generateCards.iterator();
    }

    @Override
    public String toString() {
        StringBuilder csvWriter = new StringBuilder();

        for(generateCard generateCard : generateCards)
            csvWriter.append(generateCard.toString()).append(",");
        csvWriter.append(value);

        return csvWriter.toString();
    }
}
