/**
 * Singelton para el manejo de datos
 * @author Angel Piñeiro
 * @version v1.0
 */
public class Datos {
    /**
     * numero a adivinar
     */
    private int randomNumber;
    /**
     * numero elegido por el jugador
     */
    private int choiceNumber;
    /**
     * intentos restantes
     */
    private int trys;
    /**
     * numero de rondas
     */
    private final int ROUND_NUMBER = 10;
    /**
     * numeor maximo de intentos por ronda
     */
    private final int TRYS_NUMBER = 2;

    /**
     * Singleton
     */
    public static Datos instance = null;

    private Datos(int randomNumber, int choiceNumber, int successNumber, int failuresNumber, int actualRound) {
        this.randomNumber = randomNumber;
        this.choiceNumber = choiceNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getChoiceNumber() {
        return choiceNumber;
    }

    public void setChoiceNumber(int choiceNumber) {
        this.choiceNumber = choiceNumber;
    }

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }

    public int getROUND_NUMBER() {
        return ROUND_NUMBER;
    }

    public int getTRYS_NUMBER() {
        return TRYS_NUMBER;
    }

    public static Datos getInstance() {
        return instance;
    }

    public static void setInstance(Datos instance) {
        Datos.instance = instance;
    }

    public static Datos getInstance(Datos instance){
        if(instance == null){
            instance=new Datos(randomNumber, choiceNumber);
        }
        return instance;
    }

}
