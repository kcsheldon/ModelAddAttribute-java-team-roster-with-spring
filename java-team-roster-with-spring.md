The Olympic Committee has hired you to migrate their system to Spring. Lucky you!

## Getting Started

```no-highlight
et get java-team-roster-with-spring
cd java-team-roster-with-spring
idea .
```

## Learning Objectives

- Build a Spring application to serve dynamically generated HTML
- Work with Spring Controllers and Thymeleaf views to rebuild a familiar application

We have supplied a `League` with relevant `Team` and `Player` data for you to accomplish the user stories below. You will likely have multiple calls to `Team.getLeague()` to build the required data.

## Core User Stories

### View Linked List of Teams

```no-highlight
As a curling fan
I want to see a list of teams
So that I can learn more about them
```

Acceptance Criteria:

- When I navigate to `/` I get an unordered list of team names
- Each team name is a link that sends me to `/teams/<index in array>`

### View Teams

```no-highlight
As a curling fan
I want to see a team roster
So that I can learn more about my favorite team
```

Acceptance Criteria:

- When I navigate to `/teams/<index in array>`, I receive details about the team located at that index in the League's list of teams
- I should see the team's name, as well as a list of all of the players and their correlating positions
- If I attempt to access an index that is out of range for the list of teams, I'm receive a 404

## Non-Core User Stories

### List Positions

```no-highllight
As a curling fan
I want to see a list of positions
So that I can learn more about the players that occupy them
```

Acceptance Criteria:

- When I navigate to `/positions`, I can see an unordered list of all positions in the game of curling.
- Each position should be a link that sends me to `/positions/<position-name>`

### List Players in Position

```no-highlight
As a curling fan
I want to see a list of players that play a certain position
So I can study the matchups
```

Acceptance Criteria:

- When I navigate to `/positions/<position-name>`, I can see the position name, as well as all of the players that play the position in the league.
- The player's team should also be listed in a way that helps me understand what team each player is on

**You can add methods to the supplied classes, but you may not modify the data provided.**

You may create utility classes or other helpers to complete this challenge.
