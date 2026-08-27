# Week 04 - Methods and Decomposition

- **Chapter:** `ch04`
- **Tier:** Core
- **Focus:** methods, parameters, return values, reuse
- **Checkpoint week:** Yes

## Learning objectives
- Break a program into named methods.
- Pass values into methods and interpret returned results.
- Explain how decomposition improves readability and reuse.

## Suggested live demos
- `ch04/PrintTwice.java`
- `ch04/PrintTime.java`
- `ch04/Distance.java`
- `ch04/Circle.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch04`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch04 -MainClass PrintTwice`
  - `./scripts/run-chapter.ps1 -Chapter ch04 -MainClass PrintTime`
  - `./scripts/run-chapter.ps1 -Chapter ch04 -MainClass Distance`
  - `./scripts/run-chapter.ps1 -Chapter ch04 -MainClass Circle`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week04`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Calling a method with the wrong number of arguments.
- Printing inside a method when a return value is needed.
- Not matching method names exactly.

## In-class practice
- Refactor repeated print logic into a helper method.
- Write methods that convert seconds to formatted time.
- Test a geometry method with multiple inputs.

## Exit ticket
Write a method that accepts a name and prints a greeting twice.

## Homework or lab
Build a small utility class with at least three methods that calculate and print simple measurements.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Use method call diagrams to show the flow into and out of helper methods.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
