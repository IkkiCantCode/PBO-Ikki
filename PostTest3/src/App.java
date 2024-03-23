
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException{
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
                5. Type Chart
                6. Exit
                """);

            System.out.print("Select: ");
            String menu = br.readLine();

            int dexNumber = 0;
            double height = 0.0;
            double weight = 0.0;
            int hp = 0;
            int attack = 0;
            int defense = 0;
            int spAttack = 0;
            int spDefense = 0;
            int speed = 0;

            if (menu.equals("1")) {
                System.out.println("=====Adding Pokemon to Pokedex=====");
                System.out.println("Please fill all the information of your Pokemon");
                System.out.print("Dex Number : ");
                    if (pokedex.size() > 0) {
                        dexNumber = Integer.parseInt(br.readLine());
                        for (int i = 0; i < pokedex.size(); i++) {
                            if (dexNumber == pokedex.get(i).getDexNumber()) {
                                System.out.println("Pokemon with the same Dex Number already exists");
                                System.out.println("Please enter a different Dex Number");
                                dexNumber = Integer.parseInt(br.readLine());
                            }
                        }
                    } else {
                        while (true) {
                            String input = br.readLine();
                            if (input.matches("\\d+")) {
                                dexNumber = Integer.parseInt(input);
                                break;
                            } else {
                                System.out.println("Invalid Dex Number");
                                System.out.print("Dex Number : ");
                                continue; 
                            }
                        }
                    }
                System.out.print("Name : ");
                String name = br.readLine();
                System.out.print("Primary Type : ");
                String type1 = br.readLine();
                System.out.print("Secondary Type (Press Enter if the Pokemon is Mono Type) : ");
                String type2 = br.readLine();
                System.out.print("Species : ");
                String species = br.readLine();
                System.out.print("Height : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("[0-9]+(\\.[0-9]+)?")) {
                            height = Double.parseDouble(input);
                            break;
                        } else {
                            System.out.println("Invalid Height");
                            System.out.print("Height : ");
                            continue;
                        }
                    }
                System.out.print("Weight : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("[0-9]+(\\.[0-9]+)?")) {
                            weight = Double.parseDouble(input);
                            break;
                        } else {
                            System.out.println("Invalid Weight");
                            System.out.print("Weight : ");
                            continue;
                        }
                    }
                System.out.print("Ability 1 : ");
                String ability1 = br.readLine();
                System.out.print("Ability 2 (Press Enter if the Pokemon only has 1 Ability) : ");
                String ability2 = br.readLine();
                System.out.print("Hidden Ability (Press Enter if the Pokemon doesn't have Hidden Ability) : ");
                String hiddenAbility = br.readLine();
                System.out.print("HP : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("\\d+")) {
                            hp = Integer.parseInt(input);
                            break;
                        } else {
                            System.out.println("Invalid HP");
                            System.out.print("HP : ");
                            continue;
                        }
                    }
                System.out.print("Attack : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("\\d+")) {
                            attack = Integer.parseInt(input);
                            break;
                        } else {
                            System.out.println("Invalid Attack");
                            System.out.print("Attack : ");
                            continue;
                        }
                    }
                System.out.print("Defense : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("\\d+")) {
                            defense = Integer.parseInt(input);
                            break;
                        } else {
                            System.out.println("Invalid Defense");
                            System.out.print("Defense : ");
                            continue;
                        }
                    }
                System.out.print("Special Attack : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("\\d+")) {
                            spAttack = Integer.parseInt(input);
                            break;
                        } else {
                            System.out.println("Invalid Special Attack");
                            System.out.print("Special Attack : ");
                            continue;
                        }
                    }
                System.out.print("Special Defense : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("\\d+")) {
                            spDefense = Integer.parseInt(input);
                            break;
                        } else {
                            System.out.println("Invalid Special Defense");
                            System.out.print("Special Defense : ");
                            continue;
                        }
                    }
                System.out.print("Speed : ");
                    while (true) {
                        String input = br.readLine();
                        if (input.matches("\\d+")) {
                            speed = Integer.parseInt(input);
                            break;
                        } else {
                            System.out.println("Invalid Speed");
                            System.out.print("Speed : ");
                            continue;
                        }
                    }

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
                    System.out.println("=====Updating Pokedex=====");
                    for (int i = 0; i < pokedex.size(); i++) {
                        System.out.println("Pokemon Number : " + (i + 1));
                        pokedex.get(i).display();
                    }
                    System.out.print("Enter the Pokemon Number you want to update: ");
                    int update = Integer.parseInt(br.readLine()) - 1;

                    if (update >= 0 && update < pokedex.size()) {
                        System.out.println("Updating Pokemon Number " + (update + 1));
                        Pokemon pokemonToUpdate = pokedex.get(update);
            
                        System.out.println("Please fill all the information of your Pokemon");
                        System.out.print("Dex Number : ");
                            if (pokedex.size() > 0) {
                                dexNumber = Integer.parseInt(br.readLine());
                                for (int i = 0; i < pokedex.size(); i++) {
                                    if (dexNumber == pokedex.get(i).getDexNumber()) {
                                        System.out.println("Pokemon with the same Dex Number already exists");
                                        System.out.println("Please enter a different Dex Number");
                                        dexNumber = Integer.parseInt(br.readLine());
                                    }
                                }
                            } else {
                                while (true) {
                                    String input = br.readLine();
                                    if (input.matches("\\d+")) {
                                        dexNumber = Integer.parseInt(input);
                                        break;
                                    } else {
                                        System.out.println("Invalid Dex Number");
                                        System.out.print("Dex Number : ");
                                        continue; 
                                    }
                                }
                            }
                        pokemonToUpdate.setDexNumber(dexNumber);
                        System.out.print("Name : ");
                        pokemonToUpdate.setName(br.readLine());
                        System.out.print("Primary Type : ");
                        pokemonToUpdate.setType1(br.readLine());
                        System.out.print("Secondary Type (Press Enter if the Pokemon is Mono Type) : ");
                        pokemonToUpdate.setType2(br.readLine());
                        System.out.print("Species : ");
                        pokemonToUpdate.setSpecies(br.readLine());
                        System.out.print("Height : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("[0-9]+(\\.[0-9]+)?")) {
                                    height = Double.parseDouble(input);
                                    break;
                                } else {
                                    System.out.println("Invalid Height");
                                    System.out.print("Height : ");
                                    continue;
                                }
                            }
                        pokemonToUpdate.setHeight(height);
                        System.out.print("Weight : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("[0-9]+(\\.[0-9]+)?")) {
                                    weight = Double.parseDouble(input);
                                    break;
                                } else {
                                    System.out.println("Invalid Weight");
                                    System.out.print("Weight : ");
                                    continue;
                                }
                            }
                        pokemonToUpdate.setWeight(weight);
                        System.out.print("Ability 1 : ");
                        pokemonToUpdate.setAbility1(br.readLine());
                        System.out.print("Ability 2 (Press Enter if the Pokemon only has 1 Ability) : ");
                        pokemonToUpdate.setAbility2(br.readLine());
                        System.out.print("Hidden Ability (Press Enter if the Pokemon doesn't have Hidden Ability) : ");
                        pokemonToUpdate.setHiddenAbility(br.readLine());
                        System.out.print("HP : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("\\d+")) {
                                    hp = Integer.parseInt(input);
                                    break;
                                } else {
                                    System.out.println("Invalid HP");
                                    System.out.print("HP : ");
                                    continue;
                                }
                            }   
                        pokemonToUpdate.setHp(hp);
                        System.out.print("Attack : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("\\d+")) {
                                    attack = Integer.parseInt(input);
                                    break;
                                } else {
                                    System.out.println("Invalid Attack");
                                    System.out.print("Attack : ");
                                    continue;
                                }
                            }
                        pokemonToUpdate.setAttack(attack);
                        System.out.print("Defense : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("\\d+")) {
                                    defense = Integer.parseInt(input);
                                    break;
                                } else {
                                    System.out.println("Invalid Defense");
                                    System.out.print("Defense : ");
                                    continue;
                                }
                            }
                        pokemonToUpdate.setDefense(defense);
                        System.out.print("Special Attack : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("\\d+")) {
                                    spAttack = Integer.parseInt(input);
                                    break;
                                } else {
                                    System.out.println("Invalid Special Attack");
                                    System.out.print("Special Attack : ");
                                    continue;
                                }
                            }
                        pokemonToUpdate.setSpAttack(spAttack);
                        System.out.print("Special Defense : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("\\d+")) {
                                    spDefense = Integer.parseInt(input);
                                    break;
                                } else {
                                    System.out.println("Invalid Special Defense");
                                    System.out.print("Special Defense : ");
                                    continue;
                                }
                            }
                        pokemonToUpdate.setSpDefense(spDefense);
                        System.out.print("Speed : ");
                            while (true) {
                                String input = br.readLine();
                                if (input.matches("\\d+")) {
                                    speed = Integer.parseInt(input);
                                    break;
                                } else {
                                    System.out.println("Invalid Speed");
                                    System.out.print("Speed : ");
                                    continue;
                                }
                            }
                        pokemonToUpdate.setSpeed(speed);
            
                        System.out.println("Pokemon Number " + (update + 1) + " has been updated");
                        } else {
                            System.out.println("Pokemon Number" + (update + 1) + " did not exist");
                        }
                    }
                
            } else if (menu.equals("4")) {
                if (pokedex.size() == 0) {
                    System.out.println("Pokedex is empty");
                } else {
                    System.out.println("=====Releasing Pokemon=====");
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
                System.out.println("=====Type Chart=====");
                Types typeChart = new Types();
                System.out.println("Type List");
                System.out.println("Normal, Fire, Water, Grass, Electric, Ice, Fighting, Poison, Ground, Flying, Psychic, Bug, Rock, Ghost, Dragon, Dark, Steel, Fairy");
                System.out.print("Enter the Pokemon Type you want to check"); br.readLine(); 
                System.out.println("Primary Type :");
                String type1 = br.readLine();
                System.out.println("Secondary Type (Press Enter if the Pokemon is Mono Type) :");
                String type2 = br.readLine();
                TypeChart primaryType = typeChart.getType(type1);
                TypeChart secondaryType = typeChart.getType(type2);
                    if (type2.equals("")) {
                        System.out.println("Primary Type:");
                        primaryType.display();
                    } else if (primaryType != null && secondaryType != null){
                        System.out.println("Primary Type:");
                        primaryType.display();
                        System.out.println("Secondary Type:");
                        secondaryType.display();
                    } else {
                        System.out.println("Invalid Type");
                        continue;
                    }
                
            } else if (menu.equals("6")) {
                System.out.println("Exiting Pokedex");
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
