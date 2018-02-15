package ca.uqam.inf2015.labo.json;

public class Main {
    public static void main(String args[]) {


        String json = new FileReader().StringFromFile("/home/antoine/workspace/monitorat/INF2015-Labo/01-JSON/input.json");
        System.out.println(json);

        Exercices exercices = new Exercices(json);


        exercices.Exercice1();
        exercices.Exercice2();
        exercices.Exercice3();
        exercices.Exercice4();
        exercices.Exercice5();






    }
}
