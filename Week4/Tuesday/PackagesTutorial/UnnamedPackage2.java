/*
  Nothing about packages is written here,
  so this file uses the "unnamed package".

  To compile and run it...
   - cd to {where you saved things}/PackagesTutorial
   - run javac UnnamedPackage2.java
   - run java UnnamedPackage2
*/

/*
  It was intended that you'd look at this
  after looking at the file of similar name
  in the 'compiling' folder.

  This is a better use case for the unnamed package.
  Our folder structure is written for creating packages
  called 'compiling', 'accessModifiers', and 'testing'.
  It can be convenient to put test code in the base directory
  because it leads to shorter Terminal lines when compiling.
*/

class UnnamedPackage2 {
    public static void main(String[] args) {
        accessModifiers.ArrayFunctions.printSubArrays(new int[] {1, 2, 3, 4, 5});
        System.out.println("The code in UnnamedPackage2.java executed successfully");
    }
}