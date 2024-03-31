private static void viewPokedex(ArrayList<Pokemon> pokedex) {
        System.out.println("=====Viewing Pokedex=====");
        if (pokedex.isEmpty()) {
            System.out.println("Pokedex is empty");
        } else {
            for (int i = 0; i < pokedex.size(); i++) {
                System.out.println("Pokemon Number : " + (i + 1));
                pokedex.get(i).display();
            }
        }
    }