# Week 11 - Class Design and Encapsulation

- **Chapter:** `ch11`
- **Tier:** Core
- **Focus:** class design, constructors, getters/setters, instance methods
- **Checkpoint week:** No

## Learning objectives
- Read and explain a class with fields, constructors, and methods.
- Describe how encapsulation groups data with related behavior.
- Use objects through their public methods.

## Suggested live demos
- `ch11/Time.java`
- `ch11/TimeClient.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch11`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch11 -MainClass TimeClient`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week11`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Mixing up static and instance methods.
- Bypassing helper methods when behavior belongs on the class.
- Forgetting to initialize object state in a constructor.

## In-class practice
- Instantiate `Time` objects and call their methods.
- Design a small class with two fields and at least one behavior method.
- Compare constructor overloads or default initialization paths.

## Exit ticket
Design a tiny `Course` or `Book` class with fields, a constructor, and one behavior method.

## Homework or lab
Implement a two-field class and a client program that creates and prints multiple objects.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Separate class design into fields, constructor, methods, then client usage on the board.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
