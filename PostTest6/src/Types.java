public class Types {
    typeChart Normal = new typeChart("Normal", new String[]{"Fighting"}, new String[]{}, new String[]{"Ghost"});
    typeChart Fire = new typeChart("Fire", new String[]{"Water", "Rock", "Ground"}, new String[]{"Fire", "Grass", "Ice", "Bug", "Steel", "Fairy"}, new String[]{});
    typeChart Water = new typeChart("Water", new String[]{"Electric", "Grass"}, new String[]{"Water", "Fire", "Ice", "Steel"}, new String[]{});
    typeChart Grass = new typeChart("Grass", new String[]{"Fire", "Ice", "Poison", "Flying", "Bug"}, new String[]{"Water", "Electric", "Grass", "Ground"}, new String[]{});
    typeChart Electric = new typeChart("Electric", new String[]{"Ground"}, new String[]{"Electric", "Flying", "Steel"}, new String[]{});
    typeChart Ice = new typeChart("Ice", new String[]{"Fire", "Fighting", "Rock", "Steel"}, new String[]{"Ice"}, new String[]{});
    typeChart Fighting = new typeChart("Fighting", new String[]{"Flying", "Psychic", "Fairy"}, new String[]{"Bug", "Rock", "Dark"}, new String[]{});
    typeChart Poison = new typeChart("Poison", new String[]{"Ground", "Psychic"}, new String[]{"Grass", "Fighting", "Poison", "Bug", "Fairy"}, new String[]{});
    typeChart Ground = new typeChart("Ground", new String[]{"Water", "Grass", "Ice"}, new String[]{"Poison", "Rock"}, new String[]{"Electric"});
    typeChart Flying = new typeChart("Flying", new String[]{"Electric", "Ice", "Rock"}, new String[]{"Grass", "Fighting ", "Bug"}, new String[]{"Ground"});
    typeChart Psychic = new typeChart("Psychic", new String[]{"Bug", "Ghost", "Dark"}, new String[]{"Fighting", "Psychic"}, new String[]{});
    typeChart Bug = new typeChart("Bug", new String[]{"Fire", "Flying", "Rock"}, new String[]{"Grass", "Fighting", "Ground"}, new String[]{});
    typeChart Rock = new typeChart("Rock", new String[]{"Water", "Grass", "Fighting", "Ground", "Steel"}, new String[]{"Normal", "Fire", "Poison", "Flying"}, new String[]{});
    typeChart Ghost = new typeChart("Ghost", new String[]{"Ghost", "Dark"}, new String[]{"Poison", "Bug"}, new String[]{"Normal", "Fighting"});
    typeChart Dragon = new typeChart("Dragon", new String[]{"Ice", "Dragon", "Fairy"}, new String[]{"Fire", "Water", "Electric", "Grass"}, new String[]{});
    typeChart Dark = new typeChart("Dark", new String[]{"Fighting", "Bug", "Fairy"}, new String[]{"Ghost", "Dark"}, new String[]{"Psychic"});
    typeChart Steel = new typeChart("Steel", new String[]{"Fire", "Fighting", "Ground"}, new String[]{"Normal", "Grass", "Ice", "Flying", "Psychic", "Bug", "Rock", "Dragon", "Steel", "Fairy"}, new String[]{"Poison"});
    typeChart Fairy = new typeChart("Fairy", new String[]{"Poison", "Steel"}, new String[]{"Fighting", "Bug", "Dark"}, new String[]{"Dragon"});

    public typeChart getType(String type) {
        switch (type) {
            case "Normal":
                return Normal;
            case "Fire":
                return Fire;
            case "Water":
                return Water;
            case "Grass":
                return Grass;
            case "Electric":
                return Electric;
            case "Ice":
                return Ice;
            case "Fighting":
                return Fighting;
            case "Poison":
                return Poison;
            case "Ground":
                return Ground;
            case "Flying":
                return Flying;
            case "Psychic":
                return Psychic;
            case "Bug":
                return Bug;
            case "Rock":
                return Rock;
            case "Ghost":
                return Ghost;
            case "Dragon":
                return Dragon;
            case "Dark":
                return Dark;
            case "Steel":
                return Steel;
            case "Fairy":
                return Fairy;
            default:
                return null;
        }
    }
}
