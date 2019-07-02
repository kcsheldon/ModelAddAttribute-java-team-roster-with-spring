package com.launchacademy.teamrosterwithspring.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class League {
  private List<Team> teams;

  public League() {
    this.teams = new ArrayList<Team>();
  }

  public void addTeam(Team team) {
    teams.add(team);
  }

  public static League getLeague() {
    League theLeague = new League();
    Team team = new Team();
    team.setTeamName("Norway");
    Player player = new Player();
    player.setPosition("Skip");
    player.setName("Thomas Ulsrud");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Third");
    player.setName("Torger Nergård");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Second");
    player.setName("Christoffer Svae");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Lead");
    player.setName("Håvard Vad Petersson");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Alternate");
    player.setName("Markus Høiberg");
    team.addPlayer(player);

    theLeague.addTeam(team);

    team = new Team();
    team.setTeamName("South Korea");

    player = new Player();
    player.setPosition("Skip");
    player.setName("Kim Chang-min");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Third");
    player.setName("Seong Se-hyeon");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Second");
    player.setName("Oh Eun-su");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Lead");
    player.setName("Lee Ki-bok");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Alternate");
    player.setName("Kim Min-chan");
    team.addPlayer(player);

    theLeague.addTeam(team);

    team = new Team();
    team.setTeamName("Sweden");
    player = new Player();
    player.setPosition("Skip");
    player.setName("Niklas Edin");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Third");
    player.setName("Oskar Eriksson");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Second");
    player.setName("Rasmus Wranå");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Lead");
    player.setName("Christoffer Sundgren");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Alternate");
    player.setName("Henrik Leek");
    team.addPlayer(player);

    theLeague.addTeam(team);

    team = new Team();
    team.setTeamName("Switzerland");
    player = new Player();
    player.setPosition("Fourth");
    player.setName("Benoît Schwarz");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Third");
    player.setName("Claudio Pätz");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Skip");
    player.setName("Peter de Cruz");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Lead");
    player.setName("Valentin Tanner");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Alternate");
    player.setName("Dominik Märki");
    team.addPlayer(player);

    theLeague.addTeam(team);

    team = new Team();
    team.setTeamName("United States");
    player = new Player();
    player.setPosition("Skip");
    player.setName("John Shuster");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Third");
    player.setName("Tyler George");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Second");
    player.setName("Matt Hamilton");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Lead");
    player.setName("John Landsteiner");
    team.addPlayer(player);

    player = new Player();
    player.setPosition("Alternate");
    player.setName("Joe Polo");
    team.addPlayer(player);

    theLeague.addTeam(team);
    return theLeague;
  }

  public List<Team> getTeams() {
    return teams;
  }
}

