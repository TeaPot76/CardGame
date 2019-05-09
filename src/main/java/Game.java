import java.util.ArrayList;

public class Game {
    private String name;
    private Deck deck;
    private ArrayList<Player> players;
    private Dealer dealer;




    public Game(String name, ArrayList<Player> players, Deck deck, Dealer dealer) {
        this.name = name;
        this.players = players;
        this.deck = deck;
        this.dealer = dealer;
    }

    public String getName() {
        return name;
    }


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getNumberOfPlayers(){
       return this.players.size();
    }


    public Deck getDeck() {
        return deck;
    }
    public Dealer getDealer() {
        return dealer;
    }

    public void playGame(){
        for (Player player : this.players) {
            Card card = dealer.deal(deck);
            player.getCard(card);
        }
    }

    public Player checkWinner() {

        Player winner = players.get(0);
        for (Player player: this.players){
            if (player.getCardValue() > winner.getCardValue()){
                winner = player;
            }
        }
         return winner;
    }


}
