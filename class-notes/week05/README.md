# Week 05 - Conditionals and Boolean Logic

- **Chapter:** `ch05`
- **Tier:** Core
- **Focus:** if/else, comparisons, boolean expressions, switch
- **Checkpoint week:** No

## Learning objectives
- Write boolean expressions that control branching.
- Compare `if`, `else if`, nested conditionals, and `switch`.
- Trace the path a program takes for different inputs.

## Suggested live demos
- `ch05/IfElse.java`
- `ch05/LogicalOpers.java`
- `ch05/Switch.java`
- `ch05/ChainNest.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch05`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch05 -MainClass IfElse`
  - `./scripts/run-chapter.ps1 -Chapter ch05 -MainClass LogicalOpers`
  - `./scripts/run-chapter.ps1 -Chapter ch05 -MainClass Switch`
  - `./scripts/run-chapter.ps1 -Chapter ch05 -MainClass ChainNest`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week05`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Using assignment instead of comparison in a condition.
- Writing overlapping branches that hide later cases.
- Not testing boundary values.

## In-class practice
- Classify numbers as positive, negative, or zero.
- Translate a rubric into a chain of `if/else if` branches.
- Rewrite a menu as a `switch` statement.

## Exit ticket
Write a program that prints whether a test score is passing or needs revision.

## Homework or lab
Create a simple grading helper that reports a letter grade and one feedback sentence.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Have students fill truth tables before writing the final condition in code.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
