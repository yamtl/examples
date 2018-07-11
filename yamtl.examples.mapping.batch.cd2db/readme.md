# CD2DB M2M Transformation

This is a sample project that shows how to invoke a YAMTL m2m transformation (in `mapping` mode).

This [m2m transformation](./src/main/java/cd2db/cd2db.xtend) is the YAMTL implementation of a mapping from a simple class diagram metamodel to a simple database schema metamodel. 

To run the transformation:
* Install [Eclipse Oxygen](https://www.eclipse.org/downloads/eclipse-packages/) with 
  * EMF 2.12+;
  * Xtext SDK 2.13.0. **At the moment, YAMTL has been tested on Java 8 only**;
  * CPS benchmark domain models from this update site: http://download.eclipse.org/viatra/examples/cps
  * [Buildship Gradle Integration](https://marketplace.eclipse.org/content/buildship-gradle-integration) 
* Within an instance of Eclipse:
  * Clone [this project](../) with EGit.
  * Import the project from your local Git repository using `File > Import > Gradle > Existing Gradle Project`
    * Select the root of the project folder `yamtl.examples.mapping.batch.cd2db` in your local Git Repository
    * Select `Override workspace settings` whenever given the option (point at which this option appears varies depending on the Eclipse distribution) and `Gradle wrapper`
  * Run the [runner app](src/main/java/cd2db/Runner.xtend) as a Java application. 
    * The input model is [the abstract syntax of a simple class diagram](src/main/java/cd2db/sourceModel.pdf) that conforms to [this metamodel](src/main/resources/metamodels/CD.emf)
    * The transformation generates one output model, representing a database schema that conforms to [this metamodel](src/main/resources/metamodels/Relational.emf). 
* The transformation runner is [this class](src/main/cd2db/Runner.xtend).