# Week 15 - 2D Grids and Simulation

- **Chapter:** `ch15`
- **Tier:** Stretch
- **Focus:** 2D arrays, grids, simulation state, Conway basics
- **Checkpoint week:** No

## Learning objectives
- Interpret row/column access in a grid-based program.
- Separate simulation state from display concerns.
- Describe how update rules create emergent behavior.

## Suggested live demos
- `ch15/Cell.java`
- `ch15/GridCanvas.java`
- `ch15/Conway.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch15`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch15 -MainClass Conway`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week15`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Mixing up row and column indexes.
- Updating cells before counting neighbors for the whole board.
- Confusing display code with simulation logic.

## In-class practice
- Trace neighbor counts for a small pattern.
- Explain why the simulation counts neighbors before mutating cells.
- Modify a starting pattern and predict the next generation.

## Exit ticket
Explain why a simulation often needs a separate counting pass before updating cells.

## Homework or lab
Document and test a new starting pattern for Conway’s Game of Life.

## Pacing and differentiation
- **Tier:** Stretch
- **Remediation move:** Work with hand-drawn 3x3 and 5x5 grids before using the full program.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
