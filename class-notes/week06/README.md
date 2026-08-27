# Week 06 - Loops and Repetition

- **Chapter:** `ch06`
- **Tier:** Core
- **Focus:** while loops, for loops, counting patterns, strings
- **Checkpoint week:** No

## Learning objectives
- Choose between `while` and `for` for common repetition tasks.
- Use loop counters and accumulators correctly.
- Trace loop state across iterations.

## Suggested live demos
- `ch06/Loops.java`
- `ch06/Format.java`
- `ch06/Strings.java`
- `ch06/Exercise.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch06`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch06 -MainClass Loops`
  - `./scripts/run-chapter.ps1 -Chapter ch06 -MainClass Format`
  - `./scripts/run-chapter.ps1 -Chapter ch06 -MainClass Strings`
  - `./scripts/run-chapter.ps1 -Chapter ch06 -MainClass Exercise`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week06`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Infinite loops caused by missing updates.
- Off-by-one errors in loop bounds.
- Resetting accumulators inside the loop.

## In-class practice
- Print counting patterns and multiplication rows.
- Accumulate totals across repeated input or generated data.
- Process strings one character at a time.

## Exit ticket
Write a loop that prints the numbers 1 through 10 and a running total.

## Homework or lab
Build a loop-driven progress tracker or countdown tool that prints each step and a final summary.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Walk loops on paper with a trace table before running the code.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
