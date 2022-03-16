package footballTeam;

public class Player {
    private String name;
    private PlayerStats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("A name should not be empty!");
        }
    }

    public int getOverallSkills(){
        return (int) stats.getOverallSkills();
    }

    public void setStats(PlayerStats stats) {
        if (!stats.equals(null)) {
            this.stats = stats;
        } else {
            System.out.println("ERROR: null value for stats!");
        }
    }

    public Player(String name, PlayerStats stats) {
        setName(name);
        setStats(stats);
    }
}