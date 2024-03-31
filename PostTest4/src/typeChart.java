public class typeChart {
    String type;
    String[] weaknesses;
    String[] resistances;
    String[] immunities;

    public typeChart(String type, String[] weaknesses, String[] resistances, String[] immunities) {
        this.type = type;
        this.weaknesses = weaknesses;
        this.resistances = resistances;
        this.immunities = immunities;
    }
    public String format(String[] list) {
        StringBuilder formatType =new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            if (i > 0) {
                formatType.append(", ");
            }
            formatType.append(list[i]);
        }
        return formatType.toString();
    }
}
