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

Nous allons util
