
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;

class Pokemon {
    int dexNumber;
    String name;
    String type1;
    String type2;
    String species;
    double height;
    double weight;
    String ability1;
    String ability2;
    String hiddenAbility;
    int hp;
    int attack;
    int defense;
    int spAttack;
    int spDefense;
    int speed;
    int total = hp + attack + defense + spAttack + spDefense + speed;

    public Pokemon(int dexNumber, String name, String type1, String type2,
                    String species, double height, double weight, 
                    String ability1, String ability2, String hiddenAbility, 
                    int hp, int attack, int defense, int spAttack, int spDefense, 
                    int speed) {
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

    void display() {
        total = hp + attack + defense + spAttack + spDefense + speed;
        System.out.println("========================================");
        System.out.println("Dex Number: " + dexNumber);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type1 + " " + type2);
        System.out.println("Species: " + species + "Pokemon");
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "kg");
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
// class TypeChart {
//     String type;
//     String[] weaknesses;
//     String[] resistances;
//     String[] immunities;

//     public TypeChart(String type, String[] weaknesses, String[] resistances, String[] immunities) {
//         this.type = type;
//         this.weaknesses = weaknesses;
//         this.resistances = resistances;
//         this.immunities = immunities;
//     }
// }

// class Types {
//     TypeChart Normal = new TypeChart("Normal", new String[]{"Fighting"}, new String[]{}, new String[]{"Ghost"});
//     TypeChart Fire = new TypeChart("Fire", new String[]{"Water", "Rock", "Ground"}, new String[]{"Fire", "Grass", "Ice", "Bug", "Steel", "Fairy"}, new String[]{});
//     TypeChart Water = new TypeChart("Water", new String[]{"Electric", "Grass"}, new String[]{"Water", "Fire", "Ice", "Steel"}, new String[]{});
//     TypeChart Grass = new TypeChart("Grass", new String[]{"Fire", "Ice", "Poison", "Flying", "Bug"}, new String[]{"Water", "Electric", "Grass", "Ground"}, new String[]{});
//     TypeChart Electric = new TypeChart("Electric", new String[]{"Ground"}, new String[]{"Electric", "Flying", "Steel"}, new String[]{});
//     TypeChart Ice = new TypeChart("Ice", new String[]{"Fire", "Fighting", "Rock", "Steel"}, new String[]{"Ice"}, new String[]{});
//     TypeChart Fighting = new TypeChart("Fighting", new String[]{"Flying", "Psychic", "Fairy"}, new String[]{"Bug", "Rock", "Dark"}, new String[]{});
//     TypeChart Poison = new TypeChart("Poison", new String[]{"Ground", "Psychic"}, new String[]{"Grass", "Fighting", "Poison", "Bug", "Fairy"}, new String[]{});
//     TypeChart Ground = new TypeChart("Ground", new String[]{"Water", "Grass", "Ice"}, new String[]{"Poison", "Rock"}, new String[]{"Electric"});
//     TypeChart Flying = new TypeChart("Flying", new String[]{"Electric", "Ice", "Rock"}, new String[]{"Grass", "Fighting ", "Bug"}, new String[]{"Ground"});
//     TypeChart Psychic = new TypeChart("Psychic", new String[]{"Bug", "Ghost", "Dark"}, new String[]{"Fighting", "Psychic"}, new String[]{});
//     TypeChart Bug = new TypeChart("Bug", new String[]{"Fire", "Flying", "Rock"}, new String[]{"Grass", "Fighting", "Ground"}, new String[]{});
//     TypeChart Rock = new TypeChart("Rock", new String[]{"Water", "Grass", "Fighting", "Ground", "Steel"}, new String[]{"Normal", "Fire", "Poison", "Flying"}, new String[]{});
//     TypeChart Ghost = new TypeChart("Ghost", new String[]{"Ghost", "Dark"}, new String[]{"Poison", "Bug"}, new String[]{"Normal", "Fighting"});
//     TypeChart Dragon = new TypeChart("Dragon", new String[]{"Ice", "Dragon", "Fairy"}, new String[]{"Fire", "Water", "Electric", "Grass"}, new String[]{});
//     TypeChart Dark = new TypeChart("Dark", new String[]{"Fighting", "Bug", "Fairy"}, new String[]{"Ghost", "Dark"}, new String[]{"Psychic"});
//     TypeChart Steel = new TypeChart("Steel", new String[]{"Fire", "Fighting", "Ground"}, new String[]{"Normal", "Grass", "Ice", "Flying", "Psychic", "Bug", "Rock", "Dragon", "Steel", "Fairy"}, new String[]{"Poison"});
//     TypeChart Fairy = new TypeChart("Fairy", new String[]{"Poison", "Steel"}, new String[]{"Fighting", "Bug", "Dark"}, new String[]{"Dragon"});

//     public TypeChart getType(String type) {
//         switch (type) {
//             case "Normal":
//                 return Normal;
//             case "Fire":
//                 return Fire;
//             case "Water":
//                 return Water;
//             case "Grass":
//                 return Grass;
//             case "Electric":
//                 return Electric;
//             case "Ice":
//                 return Ice;
//             case "Fighting":
//                 return Fighting;
//             case "Poison":
//                 return Poison;
//             case "Ground":
//                 return Ground;
//             case "Flying":
//                 return Flying;
//             case "Psychic":
//                 return Psychic;
//             case "Bug":
//                 return Bug;
//             case "Rock":
//                 return Rock;
//             case "Ghost":
//                 return Ghost;
//             case "Dragon":
//                 return Dragon;
//             case "Dark":
//                 return Dark;
//             case "Steel":
//                 return Steel;
//             case "Fairy":
//                 return Fairy;
//             default:
//                 return null;
//         }
//     }
// }

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {
            System.out.println("""
                Pokedex Menu
                1. Add Pokemon 
                2. View Pokedex
                3. Update Pokedex
                4. Release Pokemon
                5. Exit
                """);

            System.out.print("Select: ");
            String menu = br.readLine();

            if (menu.equals("1")) {
                System.out.println("Adding Pokemon to Pokedex");
                System.out.println("Please fill all the information of your Pokemon");
                System.out.print("Dex Number : ");
                int dexNumber = Integer.parseInt(br.readLine());
                System.out.print("Name : ");
                String name = br.readLine();
                System.out.print("Primary Type : ");
                String type1 = br.readLine();
                System.out.print("Secondary Type (Press Enter if the Pokemon is Mono Type) : ");
                String type2 = br.readLine();
                System.out.print("Species : ");
                String species = br.readLine();
                System.out.print("Height : ");
                double height = Double.parseDouble(br.readLine());
                System.out.print("Weight : ");
                double weight = Double.parseDouble(br.readLine());
                System.out.print("Ability 1 : ");
                String ability1 = br.readLine();
                System.out.print("Ability 2 (Press Enter if the Pokemon only has 1 Ability) : ");
                String ability2 = br.readLine();
                System.out.print("Hidden Ability (Press Enter if the Pokemon doesn't have Hidden Ability) : ");
                String hiddenAbility = br.readLine();
                System.out.print("HP : ");
                int hp = Integer.parseInt(br.readLine());
                System.out.print("Attack : ");
                int attack = Integer.parseInt(br.readLine());
                System.out.print("Defense : ");
                int defense = Integer.parseInt(br.readLine());
                System.out.print("Special Attack : ");
                int spAttack = Integer.parseInt(br.readLine());
                System.out.print("Special Defense : ");
                int spDefense = Integer.parseInt(br.readLine());
                System.out.print("Speed : ");
                int speed = Integer.parseInt(br.readLine());

                Pokemon newPokemon = new Pokemon(dexNumber, name, type1, type2, species, 
                                                    height, weight, ability1, ability2, 
                                                    hiddenAbility, hp, attack, defense, spAttack, 
                                                    spDefense, speed);
                pokedex.add(newPokemon);

            } else if (menu.equals("2")) {
                if (pokedex.size() == 0) {
                    System.out.println("Pokedex is empty");
                
                } else {
                    System.out.println("Viewing Pokedex");
                    for (int i = 0; i < pokedex.size(); i++) {
                        System.out.println("Pokemon Number : " + (i + 1));
                        pokedex.get(i).display();
                    }
                }
            } else if (menu.equals("3")) {
                if (pokedex.size() == 0) {
                    System.out.println("Pokedex is empty");
                    
                } else {
                    System.out.println("Updating Pokedex");
                    for (int i = 0; i < pokedex.size(); i++) {
                        System.out.println("Pokemon Number : " + (i + 1));
                        pokedex.get(i).display();
                    }
                    System.out.print("Enter the Pokemon Number you want to update: ");
                    int update = Integer.parseInt(br.readLine()) - 1;

                    for (int i = 0; i < pokedex.size(); i++) {
                        if (update == i) {
                            System.out.println("Updating Pokemon Number" + (i + 1));
                            System.out.println("Please fill all the information of your Pokemon");
                            System.out.print("Dex Number : ");
                            pokedex.get(update).dexNumber = Integer.parseInt(br.readLine());
                            System.out.print("Name : ");
                            pokedex.get(update).name = br.readLine();
                            System.out.print("Primary Type : ");
                            pokedex.get(update).type1 = br.readLine();
                            System.out.print("Secondary Type (Press Enter if the Pokemon is Mono Type) : ");
                            pokedex.get(update).type2 = br.readLine();
                            System.out.print("Species : ");
                            pokedex.get(update).species = br.readLine();
                            System.out.print("Height : ");
                            pokedex.get(update).height = Double.parseDouble(br.readLine());
                            System.out.print("Weight : ");
                            pokedex.get(update).weight = Double.parseDouble(br.readLine());
                            System.out.print("Ability 1 : ");
                            pokedex.get(update).ability1 = br.readLine();
                            System.out.print("Ability 2 (Press Enter if the Pokemon only has 1 Ability) : ");
                            pokedex.get(update).ability2 = br.readLine();
                            System.out.print("Hidden Ability (Press Enter if the Pokemon doesn't have Hidden Ability) : ");
                            pokedex.get(update).hiddenAbility = br.readLine();
                            System.out.print("HP : ");
                            pokedex.get(update).hp = Integer.parseInt(br.readLine());
                            System.out.print("Attack : ");
                            pokedex.get(update).attack = Integer.parseInt(br.readLine());
                            System.out.print("Defense : ");
                            pokedex.get(update).defense = Integer.parseInt(br.readLine());
                            System.out.print("Special Attack : ");
                            pokedex.get(update).spAttack = Integer.parseInt(br.readLine());
                            System.out.print("Special Defense : ");
                            pokedex.get(update).spDefense = Integer.parseInt(br.readLine());
                            System.out.print("Speed : ");
                            pokedex.get(update).speed = Integer.parseInt(br.readLine());
                            
                            System.out.println("Pokemon Number" + (i + 1) + " has been updated");

                        } else {
                            System.out.println("Pokemon Number" + (i + 1) + " did not exist");
                        }
                    }
                }
            } else if (menu.equals("4")) {
                if (pokedex.size() == 0) {
                    System.out.println("Pokedex is empty");
                } else {
                    System.out.println("Releasing Pokemon");
                    for (int i = 0; i < pokedex.size(); i++) {
                        System.out.println("Pokemon Number : " + (i + 1));
                        pokedex.get(i).display();
                    }
                    System.out.print("Enter the Pokemon Number you want to release: ");
                    int release = Integer.parseInt(br.readLine()) - 1;
                    if (release >= 0 && release < pokedex.size()) {
                        System.out.println("Do you really want to release this pokemon? (Y/N)");
                        String confirm = br.readLine();
                        if (confirm.equals("Y")) {
                            System.out.println("Pokemon Number " + (release + 1) + " has been released");
                            pokedex.remove(release);
                        } else {
                            System.out.println("Pokemon Number " + (release + 1) + " has not been released");
                        }
                    } else {
                        System.out.println("Pokemon Number " + (release + 1) + " did not exist");
                    }
                }
            } else if (menu.equals("5")) {
                System.out.println("Exiting Pokedex");
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}