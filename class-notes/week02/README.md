# Week 02 - Variables, Types, and Expressions

- **Chapter:** `ch02`
- **Tier:** Core
- **Focus:** variables, primitive types, expressions, strings
- **Checkpoint week:** No

## Learning objectives
- Declare variables with appropriate Java types.
- Predict the result of arithmetic and string expressions.
- Explain assignment as updating a stored value.

## Suggested live demos
- `ch02/DeclareAssign.java`
- `ch02/PrintingVars.java`
- `ch02/StringConcat.java`
- `ch02/FloatingPoint.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch02`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch02 -MainClass DeclareAssign`
  - `./scripts/run-chapter.ps1 -Chapter ch02 -MainClass PrintingVars`
  - `./scripts/run-chapter.ps1 -Chapter ch02 -MainClass StringConcat`
  - `./scripts/run-chapter.ps1 -Chapter ch02 -MainClass FloatingPoint`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week02`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Using the wrong type for decimal values.
- Expecting `+` to behave the same for numbers and strings.
- Forgetting that assignment replaces the old value.

## In-class practice
- Annotate each variable in a memory diagram.
- Modify sample code to calculate a total and average.
- Compare integer division with floating-point division.

## Exit ticket
Declare three variables and print a labeled summary sentence using string concatenation.

## Homework or lab
Create a small receipt calculator that stores item prices, computes a total, and prints labeled output.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Use side-by-side examples of `int`, `double`, and `String` and ask students to justify each choice.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
