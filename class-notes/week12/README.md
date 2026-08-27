# Week 12 - Objects in Collections and Search

- **Chapter:** `ch12`
- **Tier:** Core
- **Focus:** object collections, cards, search patterns
- **Checkpoint week:** Yes

## Learning objectives
- Work with collections of objects through loops and helper methods.
- Apply linear search ideas to richer data types.
- Separate model objects from client or UI code.

## Suggested live demos
- `ch12/Card.java`
- `ch12/Search.java`
- `ch12/CardTable.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch12`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch12 -MainClass Search`
  - `./scripts/run-chapter.ps1 -Chapter ch12 -MainClass CardTable`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week12`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Treating object comparisons as primitive comparisons.
- Not separating search criteria from traversal logic.
- Losing track of object responsibilities across files.

## In-class practice
- Trace a search through card-like data.
- Write a loop that finds a matching object by one field.
- Discuss how client code should display versus store data.

## Exit ticket
Describe a loop that finds the first object matching a target property.

## Homework or lab
Extend a small object collection example with search and reporting behavior.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Start with arrays of strings before moving back to arrays of objects.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
