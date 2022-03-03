package homework7;

import java.util.LinkedList;

public class Team {
    private String teamName;
    private double teamRating;
    private LinkedList<Player> teamPlayers = new LinkedList<>();

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        if (!teamName.trim().isEmpty()) {
            this.teamName = teamName;
        } else {
            System.out.println("Invalid team name!");
        }
    }

    public double getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(double teamRating) {
        this.teamRating = teamRating;
    }

    public LinkedList<Player> getNumberOfPlayers() {
        return teamPlayers;
    }

    public void setNumberOfPlayers(LinkedList<Player> numberOfPlayers) {
        this.teamPlayers = numberOfPlayers;
    }

    public Team(String teamName){
        setTeamName(teamName);
    }
    public void addPlayer (Player player){
        if(player.getEndurance()>0 && player.getDribble() > 0 && player.getPassing() > 0 && player.getShooting()>0 && player.getSprint()> 0){
            this.teamPlayers.add(player);
            teamRating += player.getStat();
        }
    }

    public void removePlayer (Player player){
        if(this.teamPlayers.contains(player)){
            this.teamPlayers.remove(player);
            teamRating -= player.getStat();
        }else {
            System.out.printf("Player %s is not in %s team. ", player.getName(), this.teamName);
        }
    }

    public void printTeam(){
        System.out.printf("%n%s - %d", this.teamName, Math.round(teamRating));
    }
}
