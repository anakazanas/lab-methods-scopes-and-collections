# Java Methods Practice Lab

#### Learning Objectives

* Master the syntax and structure of method definitions in Java
* Implement conditional logic within methods to solve practical problems
* Practice working with different data types including strings, arrays, and primitives
* Develop skills in method parameter handling and return value management
* Understand variable scope (class, instance, and local variables) and their accessibility
* Gain proficiency with Java Collections Framework (List, Set, Map implementations)
* Learn to select appropriate collection types based on use case requirements
* Build confidence in breaking down complex problems into reusable method components

#### Introduction

Methods are fundamental building blocks in Java programming that allow you to organize code into reusable, modular
components. A well-designed method performs a specific task, accepts input through parameters, and returns a result.
This comprehensive lab will guide you through creating various utility methods that demonstrate core programming
concepts including conditionals, string manipulation, array processing, mathematical operations, variable scope
management, and collections manipulation.

By completing this lab, you'll gain practical experience with method creation while solving real-world programming
challenges. Each method you write will reinforce important concepts and prepare you for more advanced Java development.

#### Part A: Basic Methods and Parameter Handling

#### Requirements

Implement the following methods in Java, ensuring each meets the specified functionality:

**Method 1: Maximum of Two Numbers**

- Create a method named `maxOfTwoNumbers()` that accepts two integer parameters
- Use conditional statements to determine and return the larger value
- Handle cases where both numbers are equal

**Method 2: Maximum of Three Numbers**

- Develop a method called `maxOfThree()` that takes three integer arguments
- Return the largest value among the three inputs
- Consider using your `maxOfTwoNumbers()` method or implement fresh conditional logic

**Method 3: Vowel Detection**

- Write `isCharacterAVowel()` that accepts a single character (String of length 1)
- Return `true` if the character is a vowel (a, e, i, o, u), `false` otherwise
- Handle both uppercase and lowercase vowels

**Method 4: Argument Counter**

- Create a method that dynamically counts the number of arguments passed to it
- Use Java's varargs feature (`...`) to accept a variable number of parameters
- Return the total count as an integer

**Method 5: String Reversal**

- Implement `reverseString()` that takes a String parameter
- Return a new string with characters in reverse order
- Example: `reverseString("jag testar")` should return `"ratset gaj"`

**Method 6: Longest Word Length**

- Write `findLongestWord()` that processes an array of String objects
- Return the length (integer) of the longest word in the array
- Handle empty arrays appropriately

**Method 7: Word Filtering**

- Create `filterLongWords()` that accepts a String array and an integer threshold
- Return an array containing only words longer than the specified number of characters
- Maintain original order of qualifying words

#### Part B: Variable Scope Demonstration

#### Requirements

**Method 8: Variable Scope Demonstration Class**

- Create a class named `ScopeDemo` that demonstrates all three types of variable scope
- Include the following variable types with clear examples:
    - **Class/Static Variables**: Variables that belong to the class itself, shared across all instances
    - **Instance Variables**: Variables that belong to specific object instances
    - **Local Variables**: Variables declared within methods, with limited scope
- Implement methods that show how each scope type behaves:
    - `demonstrateStaticScope()`: Shows static variable behavior across multiple instances
    - `demonstrateInstanceScope()`: Shows instance variable behavior with different objects
    - `demonstrateLocalScope()`: Shows local variable accessibility and lifetime
- Include comments explaining scope rules and accessibility for each variable type

#### Part C: Collections Implementation

#### Requirements

**Method 9: List Filtering and Manipulation**

- Create `filterEvenNumbers()` that takes a `List<Integer>` parameter
- Return a new `ArrayList<Integer>` containing only even numbers from the input list
- Preserve the original order of elements
- Choose ArrayList for optimal random access performance

**Method 10: Set Operations for Duplicate Removal**

- Implement `removeDuplicates()` that accepts a `List<String>` parameter
- Return a `Set<String>` with all duplicate values removed
- Choose `LinkedHashSet` to maintain insertion order while ensuring uniqueness
- Demonstrate why Set is the appropriate collection for this operation

**Method 11: Map Operations for Frequency Counting**

- Write `countWordFrequency()` that takes an array of String objects
- Return a `Map<String, Integer>` where keys are words and values are their frequencies
- Use `HashMap` for optimal key-based lookup performance
- Handle case sensitivity appropriately (convert to lowercase)

**Method 12: Collection Type Selection Analysis**

- Create `analyzeCollectionPerformance()` that demonstrates performance characteristics
- Compare insertion, lookup, and iteration times for different collection types
- Return a formatted String report showing when to use each collection type:
    - `ArrayList` vs `LinkedList` for different use cases
    - `HashSet` vs `TreeSet` vs `LinkedHashSet` comparison
    - `HashMap` vs `TreeMap` vs `LinkedHashMap` analysis

#### Part D: Advanced Parameter Types and Return Values

#### Requirements

**Method 13: Generic Method with Bounded Type Parameters**

- Create a generic method `findMinMax()` with bounded type parameter `<T extends Comparable<T>>`
- Accept a `List<T>` parameter and return a custom `MinMaxResult<T>` object
- The result object should contain both minimum and maximum values
- Demonstrate type safety and reusability across different comparable types

**Method 14: Method with Multiple Parameter Types**

- Implement `processDataWithCallback()` that accepts:
    - A `List<Integer>` of data to process
    - A `Predicate<Integer>` for filtering criteria
    - A `Function<Integer, String>` for transformation
- Return a `List<String>` containing transformed values that match the predicate
- Demonstrate functional programming concepts and method references

**Method 15: Complex Return Type with Nested Collections**

- Write `groupDataByCategory()` that processes a list of custom objects
- Accept a `List<Student>` where Student has properties: name, grade, subject
- Return a `Map<String, Map<Character, List<String>>>` structure:
    - Outer key: subject name
    - Inner key: letter grade (A, B, C, D, F)
    - Value: list of student names
- Create the Student class with appropriate constructors and getters

#### Testing Requirements

For each part, create comprehensive test methods that:

- Verify correct functionality with typical inputs
- Test edge cases (empty collections, null values, boundary conditions)
- Demonstrate the specific learning objectives of each section
- Include clear output that shows method behavior

#### Additional Resources

- [Oracle Java Documentation: Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Oracle Java Tutorial: Method Parameters and Arguments](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html)
- [Java String Class Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [Oracle Tutorial: Variables and Scope](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html)
- [Java Collections Framework Guide](https://docs.oracle.com/javase/tutorial/collections/index.html)
- [ArrayList vs LinkedList Performance](https://docs.oracle.com/javase/tutorial/collections/implementations/list.html)
- [HashMap vs TreeMap vs LinkedHashMap](https://docs.oracle.com/javase/tutorial/collections/implementations/map.html)
- [HashSet vs TreeSet vs LinkedHashSet](https://docs.oracle.com/javase/tutorial/collections/implementations/set.html)
- [Oracle Java Generics Tutorial](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
- [Functional Interfaces in Java 8](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)
- [Princeton CS: Java Programming Fundamentals](https://introcs.cs.princeton.edu/java/11cheatsheet/)
- [Java Modifier Types Reference](http://www.tutorialspoint.com/java/java_modifier_types.htm)