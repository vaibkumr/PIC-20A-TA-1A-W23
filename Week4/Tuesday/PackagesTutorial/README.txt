Working through the provided files
in the order indicated by this file
will help explain...

 - the concept of packages
   - how to compile using the unnamed package
   - how to compile when using named packages

 - the concepts of public classes and package-private classes
   - using fully qualified names to access public classes from other packages
   - importing public classes from other packages
   - importing static members of public classes from other packages
   - an important rule concerning   public classes

 - some Java packages
 - testing using the unnamed package




This file is contained in a folder called PackagesTutorial.
Here's the structure of that folder.

 - PackagesTutorial                 - cd to here
   - README.txt                     - the file you're currently reading

   - compiling                      - cd to here
     - UnnamedPackage.java          - javac UnnamedPackage.java
     - PackageCalledCompiling.java  - go back to PackagesTutorial
                                    - javac compiling/PackageCalledCompiling.java

   - accessModifiers
     - Point2D.java                 - contains one public class
     - SubArrays.java               - contains one package-private class
     - SubArraysSummingToTotal.java - contains one package-private class
     - ArrayFunctions.java          - contains one public class;
                                      uses the previous two package-privates classes
     - ArrayFuncsOneFile.java       - contains one public class and two package-privates class;
                                      the public class makes use of the other two classes

   - testing
     - Accessing.java               - uses the accessModifiers package
     - Importing.javac              - imports classes from accessModifiers
     - StaticImporting.java         - imports static members of classes in accessModifiers
     - Error.java                   - highlights a rule concerning public classes
     - JavaAPI.java                 - reviews some of the previous concepts with Java's API

   - UnnamedPackage2.java           - demonstrates a sensible use for the unnamed package:
                                      testing named packages




At a minimum,
after cd'ing to the folder where you saved PackagesTutorial,
you should execute the following commands...


cd PackagesTutorial
cd compiling
javac UnnamedPackage.java
java UnnamedPackage
cd ../
javac compiling/PackageCalledCompiling.java
java compiling/PackageCalledCompiling
javac testing/Accessing.java
java testing/Accessing
javac testing/Importing.java
java testing/Importing
javac testing/StaticImporting.java
java testing/StaticImporting
javac testing/Error.java
javac testing/JavaAPI.java
java testing/JavaAPI
javac UnnamedPackage2.java
java UnnamedPackage2