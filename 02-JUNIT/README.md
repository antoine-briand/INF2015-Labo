## Penser à ajouter les jar suivant :

- JUNIT : https://github.com/junit-team/junit4/releases/download/r4.12/junit-4.12.jar
- Hamcrest http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar



## Exécution :

### Windows :

```bash
javac Greeter.java
javac -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar GreeterTest.java
java -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore GreeterTest
```

### Unix based :

```bash
javac Greeter.java
javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar GreeterTest.java
java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore GreeterTest