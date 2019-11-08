
/**
 * Write a description of class noBiasTobias here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class soldierOfGondor
{
    public int noBiasTobias;
    public int bellCurveMerv;
    public int surveyMurvey;
    public int skewedJude;
    public int scatterplotScott;
    public int histogramPam;
    public int zScoreIgor;
    
    private String name;
    private String rank;
    private int attackMod;
    private int attackDie;
    private String attackQuote;
    private String friendlyQuote;
    private int hitPoints;
    private boolean alive;
    private int armour;
    /**
     * no args constructor makes the base soldier: Beregond
     */
    public soldierOfGondor(){
        name = "Beregond";
        rank = "Capitain";
        attackQuote = "Never should've come here";
        friendlyQuote = "Hello friend";
        attackMod = 2;
        attackDie = 6;
        hitPoints = 30;
        alive = true;
        armour = 20;
    }
    /**
     * Constructor will take 9 parameter variables
     * @param aM the attack modifier
     * @param aD the attack die
     * @param hP the hit points or life
     * @param aR the armour/armour class
     * @param n the name of the soldier
     * @param r the rank;
     * @param aQ the thing he says while agressive
     * @param fQ the thing he says while non argressive
     * @param aL is he alive or not?
     */
    public soldierOfGondor(int aM, int aD, int hP, int aR, String n, String r, String aQ, String fQ, boolean aL){
        attackMod = aM;
        attackDie = aD;
        hitPoints = hP;
        armour = aR;
        name = n;
        rank = r;
        attackQuote = aQ;
        friendlyQuote = fQ;
        alive = aL;
    }
    /**
     * mutator mthod to change the attack modifier of the soldier
     * @param aM is the attack modifier
     */
    public void setAttackMod(int aM){
        attackMod = aM;
    }
    public int getAttackMod(){
        return attackMod;
    }
    /**
     * mutator mthod to change the attack die of the soldier
     * @param aD is the attack die
     */
    public void setAttackDie(int aD){
        attackDie = aD;
    }
    public int getAttackDie(){
        return attackDie;
    }
    /**
     * mutator mthod to change the hit points of the soldier
     * @param hP is the hitPoints
     */
    public void setHitPoints(int hP){
        hitPoints = hP;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    /**
     * mutator mthod to change the armour class of the soldier
     * @param a is the armour class
     */
    public void setArmour(int a){
        armour = a;
    }
    public int getArmour(){
        return armour;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setRank(String r){
        rank = r;
    }
    public String getRank(){
        return rank;
    }
    public void setAttackQuote(String aQ){
        attackQuote = aQ;
    }
    public String getAttackquote(){
        return attackQuote;
    }
    public void setFriendlyQuote(String fQ){
        friendlyQuote = fQ;
    }
    public String getFriendlyQuote(){
        return friendlyQuote;
    }
    public void setAlive(boolean fQ){
        alive = fQ;
    }
    public boolean getAlive(){
        return alive;
    }
    public String toString(){
        String objectData = " Name: " + name + " Rank: " + rank + " Hit Points: " + hitPoints + " Alive: " + alive;
        return objectData;
    }
    public int damageDone(){
        int damage = (int)(Math.random()*attackDie) + (attackMod + 1);
        return damage;
    }
}
