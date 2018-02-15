[Labo original](https://github.com/hugoscurti/INF2015-H14/wiki/Labo-02-:-JSON-et-Java)


# Labo JSON / Java

Objectifs

* Écrire un document JSON
* Valider un document JSON
* Utiliser json-lib dans un projet java
* Lire du JSON avec org.json
* Générer du JSON avec org.json

Nous manipulerons du JSON en Java à l'aide de la librairie org.json.

## Ressources utiles

* [Site officiel JSON](http://json.org/)
* [Linter JSON](https://jsonlint.com)
* []Documentation de la librairie org.json](http://stleary.github.io/JSON-java/index.html)

## Retour sur JSON

### Modéliser un document JSON

Modélisez le modèle ci-dessous en un document JSON valide.

```
noCommande: 10432
date: 2014-01-23
total: 63.98
articles: 
    id: 125
    nom: Breaking Bad
    type: tele-serie
    prix: 35.99
    quantite: 0
    
    id: 127
    nom: Sherlock
    type: film
    prix: 27.99
    quantite: 1
```
Vous pouvez valider votre document à l'aide de [json-lint](https://jsonlint.com).

## Manipulation de documents JSON en java

La librairie que nous utiliserons est la suivante :

* [JSON-java (org.json)](https://github.com/stleary/JSON-java)

* [Téléchargez la](http://central.maven.org/maven2/org/json/json/20180130/json-20180130.jar) et ajoutez la aux dépendances de votre projet Java.
* Pour ceux qui seraient déja familiers avec maven, clonez ce répertoire, il contient déja la dépendance.


### Exercice 1 : Lire un fichier JSON
    
* Téléchargez le document JSON suivant
* Dans un projet Java, effectuez la lecture du fichier vers un string.
* Vous pouvez utiliser le fichier [FileReader.java](https://github.com/antoine-briand/INF2015-Labo/blob/master/01-JSON/src/main/java/ca/uqam/inf2015/labo/json/FileReader.java) fournie pour lire un fichier vers un string.
* Convertissez la chaîne de caractères en un objet JSONArray
* En manipulant l'objet généré, afficher le nombre d'éléments dans la collection
    * Conseil : Utiliser la fonction ```length()```
    
Résultat attendu:
    
    Nombre d'article(s): 7

### Exercice 2 : Manipuler un fichier JSON
    
On veut itérer sur les objets de la collection pour afficher le nom de tous les articles de type "film". Le résultat devrait ressembler à ceci :
    
    Nom des articles de type film :
    -Robocop
    -Captain Phillips
    -Lone Ranger
    
* Conseil : JSONArray.getJSONObject

### Exercice 3 : Manipuler un fichier JSON (Suite)
    
On veut afficher le prix des articles qui sont encore disponible en stock. Le résultat devrait ressembler à ceci :
    
    Prix des articles en stock :
    -Tomb Raider: 29.99
    -Robocop: 9.99
    -Sherlock: 29.99
    -Lone Ranger: 20.99
    
### Exercice 4 : Créer un objet JSON à l'aide de json-lib
    
Créez l'objet JSON suivant à l'aide de la librairie org.json

```json   
{
    "noCommande": 10432,
    "date": "2014-01-23",
    "total": 35.99,
    "articles": [
        {
            "id": 125,
            "nom": "Breaking Bad"
        }
    ]
}
```
Conseil : JSONObject.accumulate
    
Affichez-le à la sortie à l'aide de la fonction JSON.toString

### Exercice 5 : Créer un document JSON avec les données d'un autre document JSON

Cette fois, créez une commande en y ajoutant un item de chaque article dont le prix est inférieur à 28.00$. Ajuster le total en fonction du prix de chaque article

Le résultat devrait ressembler à ceci :
```json
{
    "noCommande": 10432,
    "date": "2014-01-23",
    "total": 58.97,
    "articles": [
        {
            "id": 124,
            "nom": "Robocop",
            "type": "film",
            "prix": 9.99,
            "quantite": 1
        },
        {
            "id": 126,
            "nom": "Captain Phillips",
            "type": "film",
            "prix": 27.99,
            "quantite": 1
        },
        {
            "id": 129,
            "nom": "Lone Ranger",
            "type": "film",
            "prix": 20.99,
            "quantite": 1
        }
    ]
}
```
Valider le document à l'aide de [json-lint](https://jsonlint.com)


## Correction

La correction du labo est disponible [ici](https://github.com/antoine-briand/INF2015-Labo/tree/correction/01-JSON/src/main/java/ca/uqam/inf2015/labo/json)
