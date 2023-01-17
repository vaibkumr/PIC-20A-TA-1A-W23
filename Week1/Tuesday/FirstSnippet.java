// package Basics.Lecture1;
// Ignore the line above for now.


/*
In JAVA,
everything is part of a class.
It is often the case that
a class called {ClassName}
is saved in a file called {ClassName}.java.
For example, this snippet, FirstSnippet.java,
contains a class called FirstSnippet.
We'll discuss the precise rules later on.

Using the terminal,
you can 'cd' (change directory) to
where {ClassName}.java is saved.
After that, running 'javac {ClassName.java}' will
compile {ClassName.java} to give {ClassName}.class.
In this case,
running 'javac FirstSnippet.java' will
compile this file to give FirstSnippet.class.

Here's the crucial part and
why we spoke about the 'static' keyword in C++
before even starting with JAVA...

Running 'java {ClassName}'
will attempt to execute
a member function of {ClassName}
called 'main'.
In this case,
running 'java FirstSnippet'
will attempt to execute
a member function of FirstSnippet
called 'main'.
For this to work,
'main' must be public.
Moreover, because there are no instances of
FirstSnippet around to call 'main',
'main' must be a static member function.

Finally, the parameter of 'main'
is an array of Strings.
This allows one to specify
command line arguments.
We'll talk about Arrays more carefully later.

In summary,
'java {ClassName} arg1 arg2 arg3'
will attempt to execute
{ClassName}.main(new String[] {"arg1", "arg2", "arg3"}).

For this snippet,
run 'javac FirstSnippet.java'
followed by 
'java FirstSnippet',
'java FirstSnippet arg',
'java FirstSnippet arg1 arg2 arg3 something_not_called_arg YayJAVA'.

Ask questions if you don't understand why the output is what it is.
*/


class FirstSnippet {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        // System.out.println does what it says:
        // it prints a line to the console.




        for (String s : args) {
            System.out.println(s);
        }
        // This is analogous to
        // a range-based 'for' loop in C++.
    }
}