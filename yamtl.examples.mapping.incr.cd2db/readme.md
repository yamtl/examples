# CD2DB M2M Transformation

This is a sample project that shows how to invoke the YAMTL m2m transformation that maps simple class diagrams to simple relational schemas (in `mapping` `incremental` mode). 

The transformation definition is taken from [this project](https://github.com/yamtl/examples/tree/master/yamtl.examples.mapping.batch.cd2db). The main difference consists in:
* Configuration of the transformation in the [runner class](https://github.com/yamtl/examples/blob/master/yamtl.examples.mapping.incr.cd2db/src/main/java/cd2db/Runner.xtend):
    * [Aspect](https://github.com/yamtl/examples/blob/master/yamtl.examples.mapping.incr.cd2db/cd2db/FeatureCallAspect.xtend) constraining where to track dependencies; and
    * Configuration of the transformation.
* Configuration for executing the transformation in the Gradle build file configures the AspectJ compiler.
  
To import the project follow the steps documented in [the batch transformation project](https://github.com/yamtl/examples/tree/master/yamtl.examples.mapping.batch.cd2db). 

The source deltas that have been implemented are depicted in the figure below:

<img src="./src/main/resources/metamodels/deltas.png" alt="Transformation from CD to DB and propagation of source deltas">

* Runner classes can be found in [this folder](https://github.com/yamtl/examples/blob/master/yamtl.examples.mapping.incr.cd2db/src/main/java/cd2db/):
    * delta a: `Runner_incr_delta1`
    * delta b: `Runner_incr_delta2`
    * delta c: `Runner_incr_delta3`
    * delta d: `Runner_incr_delta4`
    * delta e: `Runner_incr_delta5`
* The EMF change model representation of these source deltas can be found in [this folder](https://github.com/yamtl/examples/blob/master/yamtl.examples.mapping.incr.cd2db/src/main/java/cd2db/deltas/).
* The target models (relational schemas) with the propagated deltas can be found in [this folder](https://github.com/yamtl/examples/blob/master/yamtl.examples.mapping.incr.cd2db/src/main/java/cd2db/output/).  

To execute the transformation in incremental mode in order to propagate a specific delta, proceed as follows:
1. Select the corresponding runner for the poperty `mainClassName` in the [Gradle build file](https://github.com/yamtl/examples/blob/master/yamtl.examples.mapping.incr.cd2db/build.gradle).
2. Use `./gradlew clean run` . This will weave the necessary code before executing the corresponding runner.
