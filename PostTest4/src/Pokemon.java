public class Pokemon extends regionGen {
    private int dexNumber;
    private String name;
    private String type1;
    private String type2;
    private String species;
    private double height;
    private double weight;
    private String ability1;
    private String ability2;
    private String hiddenAbility;
    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private int total = hp + attack + defense + spAttack + spDefense + speed;

    public Pokemon(int dexNumber, String name, String type1, String type2,
                    String species, double height, double weight, 
                    String ability1, String ability2, String hiddenAbility, 
                    int hp, int attack, int defense, int spAttack, int spDefense, 
                    int speed, String regionName, int generation, String gameIntroduced) {
        super(regionName, generation, gameIntroduced);
        this.dexNumber = dexNumber;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.hiddenAbility = hiddenAbility;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
    }
    //Getter menggunakan access modifier public
    public int getDexNumber() {
        return dexNumber;
    }
    public String getName() {
        return name;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }
    public String getSpecies() {
        return species;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String getAbility1() {
        return ability1;
    }
    public String getAbility2() {
        return ability2;
    }
    public String getHiddenAbility() {
        return hiddenAbility;
    }
    public int getHp() {
        return hp;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getSpAttack() {
        return spAttack;
    }
    public int getSpDefense() {
        return spDefense;
    }
    public int getSpeed() {
        return speed;
    }
    public int getTotal() {
        return total;
    }
    
    //Setter menggunakan access modifier public 
    public void setDexNumber(int dexNumber) {
        this.dexNumber = dexNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAbility1(String ability1) {
        this.ability1 = ability1;
    }
    public void setAbility2(String ability2) {
        this.ability2 = ability2;
    }
    public void setHiddenAbility(String hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }
    public void setSpDefense(int spDefense) {
        this.spDefense = spDefense;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    //Override method display dari class regionGen
    @Override
    public void display() {
        super.display();
        total = hp + attack + defense + spAttack + spDefense + speed;
        System.out.println("========================================");
        System.out.println("Dex Number: " + dexNumber);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type1 + " " + type2);
        System.out.println("Species: " + species + " Pokemon");
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Abilities: " + ability1 + " " + ability2);
        System.out.println("Hidden Ability: " + hiddenAbility);
        System.out.println("========================================");
        System.out.println("Stats: ");
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Special Attack: " + spAttack);
        System.out.println("Special Defense: " + spDefense);
        System.out.println("Speed: " + speed);
        System.out.println("Total: " + total);
        System.out.println("========================================");
    }
}
