# Week 10 - References and Object Interaction

- **Chapter:** `ch10`
- **Tier:** Core
- **Focus:** references, object state, geometry-style examples
- **Checkpoint week:** No

## Learning objectives
- Explain the difference between object references and primitive values.
- Trace how methods interact with objects.
- Predict when two variables refer to the same object.

## Suggested live demos
- `ch10/PointRect.java`
- `ch10/Builder.java`
- `ch10/Surprise.java`
- `ch10/Riddle.java`

### Lecture compile/run flow
- Compile the chapter once before class:
  - `./scripts/compile-chapter.ps1 -Chapter ch10`
- Suggested classes to run during class:
  - `./scripts/run-chapter.ps1 -Chapter ch10 -MainClass PointRect`
  - `./scripts/run-chapter.ps1 -Chapter ch10 -MainClass Builder`
  - `./scripts/run-chapter.ps1 -Chapter ch10 -MainClass Surprise`
  - `./scripts/run-chapter.ps1 -Chapter ch10 -MainClass Riddle`

## Teaching notes
- Start with the smallest example in the chapter, then move toward the most complete one.
- Connect the demo back to the student starter tasks in `/home/runner/work/java101/java101/student-work/_template/week10`.
- Leave time for students to predict behavior before you run the program.

## Common mistakes to watch for
- Thinking object variables contain the whole object.
- Expecting aliasing to create separate copies automatically.
- Changing shared state unintentionally.

## In-class practice
- Draw reference diagrams for object assignments.
- Modify a point or rectangle example and predict the result.
- Identify when a method mutates an object versus returns a new one.

## Exit ticket
Explain what happens when two variables reference the same object and one of them changes it.

## Homework or lab
Write a small object-based example that updates a point or record-like object in two different methods.

## Pacing and differentiation
- **Tier:** Core
- **Remediation move:** Use diagrams showing arrows from variables to objects before writing code.
- **Stretch move:** Ask students to extend the starter task with one self-chosen feature and explain which Java concept it uses.
