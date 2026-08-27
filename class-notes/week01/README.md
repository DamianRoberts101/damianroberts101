# Week 01 - Getting Started with Java

- **Chapter:** `ch01`
- **Tier:** Core
- **Focus:** first program, main, printing, compile/run cycle
- **Checkpoint week:** No

## Learning objectives
- Identify the structure of a minimal Java program.
- Compile and run chapter examples from the command line.
- Explain what `main` and `System.out.println` do.

## Suggested live demos
- `ch01/Hello.java`
- `ch01/Hello2.java`
- `ch01/Hello3.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch01`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch01 -MainClass Hello`
  - `./scripts/run-chapter.ps1 -Chapter ch01 -MainClass Hello2`
  - `./scripts/run-chapter.ps1 -Chapter ch01 -MainClass Hello3`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week01`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Missing semicolons or braces.
- Editing the wrong file before compiling.
- Confusing source files with compiled `.class` output.

## In-class practice
- Trace the output of the three hello examples.
- Change a printed message and re-run the program.
- Create a personal introduction program with three lines of output.

## Exit ticket
Write and run a Java program that prints your name, course title, and one learning goal.

## Homework or lab
Create `AboutMe.java` with at least five `println` statements and a short reflection on the compile/run workflow.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Pair students with a checklist for opening the terminal, compiling a file, and reading compiler errors.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
