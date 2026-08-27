# Week 03 - Input, Randomness, and Interaction

- **Chapter:** `ch03`
- **Tier:** Core
- **Focus:** scanner input, user prompts, randomness, formatting
- **Checkpoint week:** No

## Learning objectives
- Collect user input with `Scanner`.
- Use random numbers to drive simple program behavior.
- Explain why input buffering causes common scanner bugs.

## Suggested live demos
- `ch03/Echo.java`
- `ch03/GuessStarter.java`
- `ch03/ScannerBug.java`
- `ch03/Formatting.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch03`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch03 -MainClass Echo`
  - `./scripts/run-chapter.ps1 -Chapter ch03 -MainClass GuessStarter`
  - `./scripts/run-chapter.ps1 -Chapter ch03 -MainClass ScannerBug`
  - `./scripts/run-chapter.ps1 -Chapter ch03 -MainClass Formatting`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `student-work/_template/week03`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Mixing `nextInt` and `nextLine` without consuming the newline.
- Forgetting to prompt before reading input.
- Not testing multiple input cases.

## In-class practice
- Run `ScannerBug` and explain the unexpected behavior.
- Extend a number guessing starter with extra prompts.
- Format output into complete, user-friendly sentences.

## Exit ticket
Write a short prompt-and-response program that asks for a name and favorite number, then prints both back.

## Homework or lab
Complete a basic guess-the-number game with at least one additional hint or replay prompt.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Provide a prompt/read/print pattern card and rehearse scanner usage with sentence starters.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
