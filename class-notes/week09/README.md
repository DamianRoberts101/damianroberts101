# Week 09 - Program Design Utilities

- **Chapter:** `ch09`
- **Tier:** Core
- **Focus:** argument handling, validation, utilities, larger programs
- **Checkpoint week:** No

## Learning objectives
- Validate program inputs and arguments.
- Break a larger task into smaller utility methods.
- Use tables or repeated output to inspect behavior.

## Suggested live demos
- `ch09/ArgValid.java`
- `ch09/Max.java`
- `ch09/Pow.java`
- `ch09/Tables.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch09`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch09 -MainClass ArgValid`
  - `./scripts/run-chapter.ps1 -Chapter ch09 -MainClass Max`
  - `./scripts/run-chapter.ps1 -Chapter ch09 -MainClass Pow`
  - `./scripts/run-chapter.ps1 -Chapter ch09 -MainClass Tables`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week09`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Assuming valid input without checking.
- Bundling unrelated logic into one large method.
- Not using helper methods for repeated rules.

## In-class practice
- Add input validation to a small console tool.
- Compare two approaches for finding a maximum.
- Generate a formatted table of results.

## Exit ticket
Write a method that validates whether a number is within an allowed range.

## Homework or lab
Create a small command-line utility that checks input and prints a formatted report.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Have students write preconditions in plain English before coding the validation.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
