# Week 13 - Multi-Class Program Design

- **Chapter:** `ch13`
- **Tier:** Core
- **Focus:** cooperating classes, deck/pile/game modeling
- **Checkpoint week:** No

## Learning objectives
- Explain the responsibilities of multiple collaborating classes.
- Trace data flow across object interactions.
- Extend a design without collapsing everything into one file.

## Suggested live demos
- `ch13/Card.java`
- `ch13/Deck.java`
- `ch13/Pile.java`
- `ch13/War.java`
- `ch13/Test.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch13`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch13 -MainClass Test`
  - `./scripts/run-chapter.ps1 -Chapter ch13 -MainClass War`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week13`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Giving one class too many responsibilities.
- Calling methods on the wrong object.
- Changing one class without updating its collaborators.

## In-class practice
- Map class responsibilities in a small card game.
- Add one behavior to an existing multi-class design.
- Trace a turn of execution across methods in different files.

## Exit ticket
Name three collaborating classes and state one responsibility for each.

## Homework or lab
Extend a multi-class model with one new rule, report, or helper behavior.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Use CRC-style cards or a responsibility table before students edit Java files.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
