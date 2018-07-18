# CPS2DEP M2M Transformation

This is a sample project that shows how to invoke a YAMTL m2m transformation (in `mapping` `batch` mode).

This [m2m transformation](./src/main/java/cps2dep/Cps2DepYAMTL.xtend) is the implementation of the batch component of the [VIATRA CPS benchmark](https://github.com/viatra/viatra-cps-benchmark) in YAMTL. 

This project has been extracted and adapted from [our variant of the VIATRA CPS benchmark](https://github.com/yamtl/viatra-cps-batch-benchmark/tree/master/m2m.batch.cps2dep.yamtl)to show how to run the transformation independently of the benchmark.

Benchmark results comparing the performance of YAMTL against state-of-the-art model transformation engines can be found [here](https://github.com/yamtl/viatra-cps-batch-benchmark).

To run the transformation:
* Install [Eclipse Oxygen](https://www.eclipse.org/downloads/eclipse-packages/) with 
  * EMF 2.12+;
  * Xtext SDK 2.13.0. **At the moment, YAMTL has been tested on Java 8 only**;
  * CPS benchmark domain models from this update site: http://download.eclipse.org/viatra/examples/cps;
  * [Buildship Gradle Integration](https://marketplace.eclipse.org/content/buildship-gradle-integration).
* Within an instance of Eclipse:
  * Clone [this project](https://github.com/yamtl/examples) with EGit.
  * Import the project from your local Git repository using `File > Import > Gradle > Existing Gradle Project`, then:
    * select the root of the project folder `yamtl.examples.mapping.batch.cps2dep` in your local Git Repository;
    * select `Override workspace settings` whenever given the option (point at which this option appears varies depending on the Eclipse distribution) and `Gradle wrapper`.
  * Run the [runner app](src/main/java/cps2dep/Runner.xtend) as a Java application or simply by using `./gradlew clean run` from command line, where
    * the input model is [a client-server model](src/main/resources/cps2dep/output/) (see [specification](https://github.com/viatra/viatra-cps-benchmark/wiki/Benchmark-specification) for a description of this scenario); and
    * the transformation generates two output models: a deployment model and a traceability model, both in the [output folder](src/main/resources/cps2dep/output/). 

If you are interested in running the sanity tests of the VIATRA CPS benchmark, note that there are small differences with the [official tests](https://github.com/viatra/viatra-docs/blob/master/cps/CPS-to-Deployment-Unit-Tests.adoc) as reported [here](https://github.com/yamtl/viatra-cps-batch-benchmark/tree/master/m2m.batch.cps2dep.yamtl#benchmark-sanity-checks), there are several options:
  * Use JUnit's plugin within Eclipse IDE to run the test suite of the project.
  * Run `./gradlew clean test` from command line.