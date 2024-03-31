public class Trainer extends regionGen{
    private String name;
    private int age;
    String gender;
    private int money;
    private String trainerClass;
    private String trainerDesc;

    public Trainer(String name, int age, String gender, int money, String trainerClass, String trainerDesc,
                String regionName, int generation, String gameIntroduced) {
        super(regionName, generation, gameIntroduced);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.trainerClass = trainerClass;
        this.trainerDesc = trainerDesc;
    }

    //Getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public int getMoney() {
        return money;
    }
    public String getTrainerClass() {
        return trainerClass;
    }
    public String getTrainerDesc() {
        return trainerDesc;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setTrainerClass(String trainerClass) {
        this.trainerClass = trainerClass;
    }
    public void setTrainerDesc(String trainerDesc) {
        this.trainerDesc = trainerDesc;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("====================================");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Money : $" + money);
        System.out.println("Trainer Class : " + trainerClass);
        System.out.println("Trainer Description : " + trainerDesc);
        System.out.println("====================================");
    }
} 
