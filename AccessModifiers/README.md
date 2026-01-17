## LEVEL 1: Basics (Warm-up)
### Q1️

Create a class with:  

one private variable  

one public method  

Try accessing the variable:  

inside the same class  

from another class

Observe where it works and where it fails  

Output: 
---
compile time error:
```
ambika@ambikaPC:~/projects/OOP_practice/AccessModifiers/Q1$ javac pck1/Helper.java pck1/Test.java 
pck1/Test.java:10: error: x has private access in Helper
      obj2.x = 11;
          ^
1 error
ambika@ambikaPC:~/projects/OOP_practice/AccessModifiers/Q1$ java pck1.Helper
Hello. I am a public method inside Helper class
obj1 inside same Helper class. value of x : 10
ambika@ambikaPC:~/projects/OOP_practice/AccessModifiers/Q1$ java pck1.Test
Error: Could not find or load main class pck1.Test
Caused by: java.lang.ClassNotFoundException: pck1.Test
```

### Q2

Create two classes in the same package:

One class has a default (no modifier) method

Another class tries to access it

Is access allowed? Why?  

--->Yes access is allowed beacuse both classes are in the same package 

### Q3

Create a class with:

private, default, protected, and public variables

From inside the same class, which variables are accessible?  
--> all were accessible  
Output:  
```
ambika@ambikaPC:~/projects/OOP_practice/AccessModifiers/Q3$ java Apple
Hello...we are inside apple class.
Apple object created.Properties of this apple
: color : green
 imported_from :USA
weight:100.7
 batch_no:198
```

## LEVEL 2: Package & Subclass Confusion 
### Q4

Create:

A parent class with a protected method

A child class in the same package

Can the child access the method?  
--> yes it can  
```
ambika@ambikaPC:~/projects/OOP_practice/AccessModifiers$ javac Q4/Apple.java 
ambika@ambikaPC:~/projects/OOP_practice/AccessModifiers$ java Q4/Apple
Inside apple class. calling parent class protected method...
Fruit class protected method
```
### Q5

Create:

A parent class with a default method

A child class in a different package

Can the child access the method? Why?

### Q6

Create:

A parent class with a protected variable

A non-subclass class in a different package

Can it access the variable?

## LEVEL 3: Constructor Access Modifiers
### Q7

Create a class with:

a private constructor

Try creating an object:

inside the same class

from another class

### Q8

Create a class with a protected constructor and:

try to create its object from

same package

subclass in another package

Which works and why?

LEVEL 4: Tricky Interview Scenarios 
### Q9

Create:

a parent class with a protected method

a subclass in a different package

Try accessing the method using:

this.method()

parentReference.method()

Observe the difference

### Q10

Create:

a class with a private method

Can you override it in a subclass?
What happens if you create a method with the same name?

<b>BONUS (Think, Don’t Code Yet)</b>
### Q11

Why are top-level classes not allowed to be private or protected?

### Q12

Why is the main() method always public?
