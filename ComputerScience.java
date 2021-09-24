public class ComputerScience
{
    public static void main(String[] args) {
        System.out.println("Hi!" + "\n");

        String [] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades" } ;
        String [] RANKS =
                {
                        "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "lack", "Queen", "King", "Ace"
                };

        int a = (int) (Math.random() * RANKS.length);
        int b = (int) (Math.random() * SUITS.length);
        System.out.println(RANKS [a] + " of " + SUITS [b]);

        System.out.println(SUITS.length);
        System.out.println(RANKS.length);

        String [] deck = new String [RANKS.length * SUITS.length];

        for ( int i = 0; i < SUITS.length; i++)
        {
            for (int j = 0; j < RANKS.length; j++)

                // int k = SUITS.length * i + j;

                // deck [RANKS.length * i + j] = RANKS [j] + " of " + SUITS[i];
                System.out.println(RANKS [j] + " of " + SUITS[i]);

        }

        /*
        for ( int i = 0; i < deck.length; i++)
        {
            System.out.println(deck [i]);
        }
        */
    }
}
