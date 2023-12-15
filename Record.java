/**
 * Guarda los datos del jugador
 * @author Angel Piñeiro
 * @version v1.0
 */
public class Record {
    /**
     * Player name
     */
    private String alias;
    /**
     * Score of player
     */
    private int score;


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

