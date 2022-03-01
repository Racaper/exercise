package it.develhopes.Exercise.ClassesAndObjects02;

public class Competition {

    public static void main(String args[]){

        System.out.println("---------------------------");
        CompetitionRules printRules = CompetitionRules.getInstance();
        System.out.println("---" + printRules.competitionRule1 + "---");
        System.out.println("---" + printRules.competitionRule2 + "---");
        System.out.println("---" + printRules.competitionRule3 + "---");

        System.out.println("---------------------------");
        Team TeamA = new Team();
        TeamA.teamName = "Javalope";
        System.out.println(TeamA.teamName);

        System.out.println("---------------------------");
        Programmer p1 = new Programmer();
        p1.name = "Matteo";
        p1.programmingLanguage = "Java";
        p1.yearsOfExperience = 2;
        System.out.println("p1 " + p1.name + " - " + p1.programmingLanguage + " - " + p1.yearsOfExperience);

        Programmer p2 = new Programmer();
        p2.name = "Antonia";
        p2.programmingLanguage = "java";
        p2.yearsOfExperience = 4;
        System.out.println("p2 " + p2.name + " - " + p2.programmingLanguage + " - " + p2.yearsOfExperience);
        System.out.println("---------------------------");

        Team TeamB = new Team();
        TeamB.teamName = "Programers";
        System.out.println(TeamB.teamName);

        System.out.println("---------------------------");
        Programmer p3 = new Programmer();
        p3.name = "Giacomo";
        p3.programmingLanguage = "Java";
        p3.yearsOfExperience = 5;
        System.out.println("p1 " + p3.name + " - " + p3.programmingLanguage + " - " + p3.yearsOfExperience);

        Programmer p4 = new Programmer();
        p4.name = "Mario";
        p4.programmingLanguage = "java";
        p4.yearsOfExperience = 3;
        System.out.println("p2 " + p4.name + " - " + p4.programmingLanguage + " - " + p4.yearsOfExperience);
        System.out.println("---------------------------");
    }
}
