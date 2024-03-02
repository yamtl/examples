# cd2db-python

Experimental use of YAMTL transformation using Python as host language, via Jython.

## Execution

* From Eclipse, install PyDev (Eclipse IDE plugin)
* In project properties, update the python path (external libraries) by adding all jars under the folder `lib`.
* Execute the file `cd2db/CD2DB.python` with `Run As > Jython Run`.

## Pending

* Resolution of references (marshalling/unmarshalling)
  * adding references to a many-bounded reference