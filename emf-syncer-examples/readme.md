# EMF-Subtyping for comparing Ecore models

Example showcasing how EMFSubtyping is used to compare EMF metamodels by means of the subtypeOf operator `<:`: `metamodel1 <: metamodel2` will check whether all the elements in `metamodel1` are also defined in `metamodel2`. If not, a complement metamodel is computed illustrating the differences.

