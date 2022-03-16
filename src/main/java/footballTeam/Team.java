package footballTeam;

import java.util.LinkedList;

public class Team {
    private String name;
    private int rating;
    public LinkedList<Player> playerList = new LinkedList<>();

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid team name!");
        }
    }

    public Team(String name) {
        setName(name);
    }

    public void addPlayerToTheTeam(Player player) {
        playerList.add(player);
        calculateCurrentRating();
    }

    public void removePlayerFromTheTeam(Player player) {
        if (playerList.contains(player)) {
            playerList.remove(player);
            calculateCurrentRating();
        } else {
            System.out.printf("Player %s is not in %s team. ", player.getName(), this.name);
        }
    }
    //internal setter of the rating
    private void calculateCurrentRating() {
        int result = 0;
        for (Player player : playerList) {
            result += player.getOverallSkills();
        }
        rating = result/playerList.size();
    }
}