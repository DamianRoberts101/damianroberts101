# Week 16 - Extending Simulations and Automata

- **Chapter:** `ch16`
- **Tier:** Stretch
- **Focus:** simulation extensions, automata, rule changes
- **Checkpoint week:** Yes

## Learning objectives
- Compare two simulation rule systems.
- Identify the extension points in an existing automaton design.
- Design a small experimental change and predict its effect.

## Suggested live demos
- `ch16/Automaton.java`
- `ch16/Conway.java`
- `ch16/Langton.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch16`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch16 -MainClass Langton`
  - `./scripts/run-chapter.ps1 -Chapter ch16 -MainClass Conway`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week16`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Changing multiple rules at once and losing track of cause and effect.
- Testing only one initial pattern.
- Not documenting the intended behavior before coding.

## In-class practice
- Compare Conway and Langton at a high level.
- Describe how one rule change could affect a simulation.
- Plan an experiment with inputs, expected behavior, and observations.

## Exit ticket
State one difference between the Conway and Langton simulations and why it matters.

## Homework or lab
Plan and run a small simulation experiment, then summarize the observed result.

## Pacing and differentiation
- **Tier:** Stretch
- **Remediation move:** Use compare/contrast organizers instead of more code volume for students who are overloaded.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
