# Week 14 - Integrated Object-Oriented Programs

- **Chapter:** `ch14`
- **Tier:** Core
- **Focus:** larger OO integration, game flow, Crazy Eights
- **Checkpoint week:** No

## Learning objectives
- Read a larger object-oriented program and identify subsystems.
- Trace turn-based program flow through multiple classes.
- Plan small, safe extensions to an existing multi-class codebase.

## Suggested live demos
- `ch14/CardCollection.java`
- `ch14/Deck.java`
- `ch14/Hand.java`
- `ch14/Player.java`
- `ch14/Eights.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch14`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch14 -MainClass Eights`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week14`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Trying to understand every line before finding the high-level flow.
- Editing core classes without first tracing the call sequence.
- Changing a game rule in only one place.

## In-class practice
- Trace one complete player turn in `Eights`.
- Document how cards move between the draw pile, hand, and discard pile.
- Plan a small extension such as score tracking or alternate prompts.

## Exit ticket
Summarize the responsibilities of `Eights`, `Player`, and `Hand` in one sentence each.

## Homework or lab
Design a proposal for one small Crazy Eights extension and identify the classes it would touch.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Focus students on one turn of execution instead of the whole codebase at once.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
