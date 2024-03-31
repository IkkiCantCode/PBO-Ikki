public class regionGen {
    private String regionName;
    private int generation;
    private String gameIntroduced;

    public regionGen(String regionName, int generation, String gameIntroduced) {
        this.regionName = regionName;
        this.generation = generation;
        this.gameIntroduced = gameIntroduced;
    }

    // Getter   
    public String getRegionName() {
        return regionName;
    }
    public int getGeneration() {
        return generation;
    }
    public String getGameIntroduced() {
        return gameIntroduced;
    }

    // Setter 
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public void setGameIntroduced(String gameIntroduced) {
        this.gameIntroduced = gameIntroduced;
    }
}



