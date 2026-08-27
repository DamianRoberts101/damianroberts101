# Week 07 - Arrays and Collection-Like Thinking

- **Chapter:** `ch07`
- **Tier:** Core
- **Focus:** arrays, traversal, counting, aggregation
- **Checkpoint week:** No

## Learning objectives
- Create and traverse arrays with indexes.
- Count, search, and summarize array contents.
- Relate loop patterns to array problems.

## Suggested live demos
- `ch07/ArrayExamples.java`
- `ch07/Histogram.java`
- `ch07/Fruit.java`
- `ch07/Doubloon.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch07`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch07 -MainClass ArrayExamples`
  - `./scripts/run-chapter.ps1 -Chapter ch07 -MainClass Histogram`
  - `./scripts/run-chapter.ps1 -Chapter ch07 -MainClass Fruit`
  - `./scripts/run-chapter.ps1 -Chapter ch07 -MainClass Doubloon`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week07`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Accessing an index outside the array bounds.
- Using the wrong loop limit.
- Confusing element values with index positions.

## In-class practice
- Find the largest value in an array.
- Count matching items that meet a rule.
- Create a histogram-style summary from repeated values.

## Exit ticket
Write a program that stores five quiz scores in an array and prints the highest score.

## Homework or lab
Create an array report that prints all values, the total, and the average.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Use index cards laid out as boxes to visualize indexes and values.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
