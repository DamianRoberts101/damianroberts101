# Week 08 - Recursion and Problem Breakdown

- **Chapter:** `ch08`
- **Tier:** Stretch
- **Focus:** recursive thinking, base cases, self-similar problems
- **Checkpoint week:** Optional if using the stretch path

## Learning objectives
- Identify a valid base case in a recursive method.
- Describe how recursive calls shrink a problem.
- Compare recursive and iterative solutions at a conceptual level.

## Suggested live demos
- `ch08/Examples.java`
- `ch08/Exercise.java`
- `ch08/Recurse.java`
- `ch08/Series.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch08`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch08 -MainClass Examples`
  - `./scripts/run-chapter.ps1 -Chapter ch08 -MainClass Exercise`
  - `./scripts/run-chapter.ps1 -Chapter ch08 -MainClass Recurse`
  - `./scripts/run-chapter.ps1 -Chapter ch08 -MainClass Series`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week08`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Missing or unreachable base cases.
- Recursive calls that do not reduce the problem.
- Expecting recursion to execute all at once instead of step by step.

## In-class practice
- Trace a simple recursive countdown.
- Match base cases to recursive problem statements.
- Convert a small repetition task between loop and recursion forms.

## Exit ticket
Explain the base case and recursive case for a countdown method.

## Homework or lab
Implement a recursive method for summing integers from 1 to `n` and compare it with a loop solution.

## Pacing and differentiation
- **Tier:** Stretch
- **Remediation move:** Use call-stack sketches and spoken traces before students edit code.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
