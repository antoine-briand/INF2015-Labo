package ca.uqam.inf2015.labo.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class Exercices {

    private JSONArray baseArticle = new JSONArray();
    private String jsonString;


    Exercices(String jsonString){
        this.jsonString = jsonString;
    }


    /**
     * Lire un fichier
     */
    public void Exercice1(){
        // Exercice 1

        JSONArray baseArticle = new JsonParser().JSONStringToJSONArray(this.jsonString);
        System.out.println(baseArticle);

        System.out.println("Nombre d'articles : " + baseArticle.length());
        this.baseArticle = baseArticle;
    }

    void Exercice2(){
        System.out.println("Articles de type film :");
        for (int i = 0; i < baseArticle.length(); i++) {
            JSONObject article = baseArticle.getJSONObject(i);


            if(article.get("type").equals("film")){
                System.out.println("-" + article.get("nom"));
            }
        }
    }

    void Exercice3(){
        System.out.println("Prix des articles en stock");


        for (int i = 0; i < baseArticle.length(); i++) {
            JSONObject article = baseArticle.getJSONObject(i);

            if(article.getInt("quantite") > 0){
                System.out.println("-" + article.get("nom") + " : " + article.get("prix"));
            }
        }
    }

    void Exercice4(){
        JSONObject commande = new JSONObject();

        commande.accumulate("noCommande", 10432);
        commande.accumulate("date", "2014-01-23");
        commande.accumulate("total", 35.99);


        JSONObject article = new JSONObject();
        article.accumulate("id", 125);
        article.accumulate("nom", "Breaking Bad");

        JSONArray listeArticles = new JSONArray();
        listeArticles.put(article);

        commande.put("articles", listeArticles);

        System.out.println(commande.toString());
    }

    void Exercice5(){
        JSONArray articlesMoinsDe28Dollars = new JSONArray();
        Float total = 0f;

        for (int i = 0; i < baseArticle.length(); i++) {
            JSONObject _article = baseArticle.getJSONObject(i);
            float prix = _article.getFloat("prix");
            if (prix <= 28.00){
                articlesMoinsDe28Dollars.put(_article);
                total += prix;
            }
        }


        JSONObject commandeMoins28 = new JSONObject();

        commandeMoins28.accumulate("noCommande", 10432);
        commandeMoins28.accumulate("date", "2014-01-23");
        commandeMoins28.accumulate("total", total);
        commandeMoins28.accumulate("articles", articlesMoinsDe28Dollars);


        System.out.println(commandeMoins28);
    }
}
