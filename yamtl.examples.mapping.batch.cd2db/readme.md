# CD2DB M2M Transformation

This is a sample project that shows how to invoke a YAMTL m2m transformation (in `mapping` mode).

This [m2m transformation](./src/main/java/cd2db/cd2db.xtend) is the YAMTL implementation of a mapping from a [simple class diagram metamodel](./src/main/resources/metamodels/CD.emf) to a [simple database schema metamodel](./src/main/resources/metamodels/Relational.emf). The figure below graphically depicts both the metamodels and the input and output models involved in the example.

<img src="./src/main/resources/metamodels/cd2db.png" alt="Transformation from CD to DB">


To run the transformation:
* Install [Eclipse Oxygen](https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygen3a) with 
  * EMF 2.12+;
  * Xtext SDK 2.13.0. **At the moment, YAMTL has been tested on Java 8 only** (see [update site](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/));
  * [Buildship Gradle Integration](https://marketplace.eclipse.org/content/buildship-gradle-integration).
* Within an instance of Eclipse:
  * Clone [this project](https://github.com/yamtl/examples) with EGit.
  * Import the project from your local Git repository using `File > Import > Gradle > Existing Gradle Project` and then:
    * select the root of the project folder `yamtl.examples.mapping.batch.cd2db` in your local Git Repository; and
    * select `Override workspace settings` whenever given the option (point at which this option appears varies depending on the Eclipse distribution) and `Gradle wrapper`
  * If the basic `Import project` wizard in Eclipse, Gradle still needs to be used to configure the project:
    * Using `Gradle Buildship`, right click on project and select `Gradle > Refresh Gradle Project`.
    * Using command line, open a terminal, cd to the project folder, run `./gradlew clean cleanEclipse eclipse`. Then refresh the project in the Eclipse IDE.    
  * Run the [runner app](src/main/java/cd2db/Runner.xtend) as a Java application or simply by using `./gradlew clean run` from command line, where:
    * the input model is [the abstract syntax of a simple class diagram](src/main/java/cd2db/sourceModel.pdf) that conforms to [this metamodel](src/main/resources/metamodels/CD.emf)
    * the transformation generates one output model, representing a database schema that conforms to [this metamodel](src/main/resources/metamodels/Relational.emf). 
* The transformation runner is [this class](src/main/java/cd2db/Runner.xtend).