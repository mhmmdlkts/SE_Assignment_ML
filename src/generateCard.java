import java.util.Random;

public class generateCard {

    static final char[] suits = {'C', 'D', 'H', 'S'};
    static final char[] ranks   = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
    static final int[] rankValues = { 2 ,  3 ,  4 ,  5 ,  6 ,  7 ,  8 ,  9 ,  10 ,  10,  10,  10,  11};
    // like that SQ S5 S3 S7 S8 H10 ...

    int value;
    char suit, rank;

    public generateCard(String card) {
        if (!isCard(card))
            throw new IllegalArgumentException();
        suit = card.charAt(0);
        rank = card.charAt(1);

        int i;
        for (i = 0; i < ranks.length; i++)
            if (ranks[i] == rank)
                break;

        value = rankValues[i];
    }

    public static generateCard generateCard() {
        Random random = new Random();
        int rndSuit = suits.length;
        int rndRank = ranks.length;
        rndSuit = random.nextInt(suits.length);
        rndRank = random.nextInt(ranks.length);
        return new generateCard(suits[rndSuit] + "" + ranks[rndRank]);
    }

    public static boolean isCard(String card) {
        if(card == null || 2 > card.length() || card.length() > 3)
            return false;

        boolean check = false;
        for (char s : suits)
            if (s == card.charAt(0))
                check = true;

        if (!check) return false;

        check = false;
        for (char r : ranks)
            if (r == card.charAt(1))
                check = true;

        return check;
    }

    @Override
    public String toString() {
        return suit + "" + rank;
    }
}
