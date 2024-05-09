package oop.polymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        printFootballTeam(new RealMadrid());
        printFootballTeam(new Barcelona());
        printFootballTeam(new Looserpool());
        printFootballTeam(new FootballTeam());
    }

    private static void printFootballTeam(FootballTeam team) {
        System.out.println(team.toString());
    }
}
