public class GreyPrinceZote {
    private String spawnLocation = "Dream(Dirtmouth)";
    private int health = 1200;
    private int level;
    private int essence = 300;

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setEssence(int essence) {
        this.essence = essence;
    }

    public int getEssence() {
            return essence;
    }

    /*public int definitionHelthAndEssence(int level){
        if(level > -1 & level <= 8){
            this.health = health + 100*level;
            this.essence = essence + 10*level;
        }
        return this.health & this.essence;
    }*/

    public void allDefinition (int level){
        setLevel(level);
        setEssence(level>-1 & level<=8 ? 300 + 10*level : null);
        setHealth(level>-1 & level<=8 ? 1200 + 100*level : null);

    }

    public String allOut(){
        return "Серый Принц Зот " + "\n" + "Уровень - "+ getLevel() + "\nЗдоровье на данном уровне существа - " + getHealth()+
                "\nСущность выпадающая, как дроп, на данном уровне существа - " + getEssence();

    }


}
