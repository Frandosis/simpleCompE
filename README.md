# Antlr project for Eclipse
This project is made for 02332-Compilerteknik to make it easier to work with Antlr in group work.
This project uses Gradle to build the whole project by generating the Antlr sources and linking it to your main.java project folder
## How to use
You first clone this project into Eclipse, then under src/main/java you put your main source files.
After you put all your grammar files into src/main/antlr.
Pro tip!

You can create an fresh file and give name.g4, and copy the raw text into.

PS. Grammar name and file name has to be the same.

Input.txt in the project root, is the input file which your main file is supposed to parse and use.

## What Gradle does
Gradle takes the .g4 files in the specified directory and generates the source codes, afterward it links the generated sources to your main directory.
You can generate these sources files before running, by opening the terminal in the IDE and type in the following command:

```
gradlew generateGrammarSources
```
You can also remove by typing in the following command
```
gradlew clean
```
The IDEA project files have already been implemented, but you can generate some new ones by using the following commands
```
gradlew generateGrammarSources // If there are no existing generated sources
gradlew idea
```
If everything is set up, just right click your main.java file and run it.
Gradle will compile and combine everything. Then it will run your file.
