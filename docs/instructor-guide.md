# Instructor Guide

This guide turns the repository into a repeatable Java 101 teaching workspace built around `/home/runner/work/java101/java101/book-code/ThinkJavaCode2`.

## Teaching assumptions
- Full 17-week sequence by default
- `Think Java, 2nd Edition` chapter order as the baseline pacing
- PowerShell scripts are the primary classroom automation
- Book code remains read-only reference material; instructor demos and student work live outside `/book-code`

## Weekly delivery routine
1. Open the matching folder in `/home/runner/work/java101/java101/class-notes/weekXX`.
2. Review the learning objectives, demos, practice tasks, and assessment prompts.
3. Compile the chapter before class:
   ```powershell
   .\scripts\compile-chapter.ps1 -Chapter chXX
   ```
4. Run each live demo as needed:
   ```powershell
   .\scripts\run-chapter.ps1 -Chapter chXX -MainClass ExampleClass
   ```
5. Copy or distribute the matching folder from `/home/runner/work/java101/java101/student-work/_template/weekXX`.
6. Collect submissions outside the repository template or in student-specific folders ignored by the root `.gitignore`.

## Weekly map
| Week | Chapter | Focus | Tier | Suggested demo classes |
| --- | --- | --- | --- | --- |
| Week 01 | `ch01` | Getting Started with Java | Core | Hello, Hello2, Hello3 |
| Week 02 | `ch02` | Variables, Types, and Expressions | Core | DeclareAssign, PrintingVars, StringConcat, FloatingPoint |
| Week 03 | `ch03` | Input, Randomness, and Interaction | Core | Echo, GuessStarter, ScannerBug, Formatting |
| Week 04 | `ch04` | Methods and Decomposition | Core | PrintTwice, PrintTime, Distance, Circle |
| Week 05 | `ch05` | Conditionals and Boolean Logic | Core | IfElse, LogicalOpers, Switch, ChainNest |
| Week 06 | `ch06` | Loops and Repetition | Core | Loops, Format, Strings, Exercise |
| Week 07 | `ch07` | Arrays and Collection-Like Thinking | Core | ArrayExamples, Histogram, Fruit, Doubloon |
| Week 08 | `ch08` | Recursion and Problem Breakdown | Stretch | Examples, Exercise, Recurse, Series |
| Week 09 | `ch09` | Program Design Utilities | Core | ArgValid, Max, Pow, Tables |
| Week 10 | `ch10` | References and Object Interaction | Core | PointRect, Builder, Surprise, Riddle |
| Week 11 | `ch11` | Class Design and Encapsulation | Core | TimeClient |
| Week 12 | `ch12` | Objects in Collections and Search | Core | Search, CardTable |
| Week 13 | `ch13` | Multi-Class Program Design | Core | Test, War |
| Week 14 | `ch14` | Integrated Object-Oriented Programs | Core | Eights |
| Week 15 | `ch15` | 2D Grids and Simulation | Stretch | Conway |
| Week 16 | `ch16` | Extending Simulations and Automata | Stretch | Langton, Conway |
| Week 17 | `ch17` | Graphics, Interaction, and Capstone Review | Stretch | Main, VideoGame |

## Assessment cadence
- Weekly: one exit ticket plus one homework/lab task in every week folder
- Checkpoints: use Weeks 04, 08, 12, and 16 as cumulative review points
- Capstone: Week 17 includes scope planning for a final mini-project or demo day

## Pacing guidance
- **Core path for a shorter course:** Weeks 01-07 and Weeks 10-14
- **Stretch topics:** Weeks 08, 15, 16, and 17
- **Common remediation hotspots:** scanner input, methods with returns, loops, arrays, and object references

## Repo management notes
- Keep `/home/runner/work/java101/java101/book-code/ThinkJavaCode2` unchanged so the original examples stay trustworthy.
- Use `/home/runner/work/java101/java101/class-notes` for lecture-ready notes and pacing adjustments.
- Use `/home/runner/work/java101/java101/student-work/_template` as the distribution baseline for each new class section.
- Generated artifacts belong in `/home/runner/work/java101/java101/build` and `/home/runner/work/java101/java101/dist`; both are ignored at the repository root.

## Chapter command reference
Use the same compile command for every chapter, replacing `chXX` with the desired folder.

```powershell
.\scripts\compile-chapter.ps1 -Chapter ch01
.\scripts\run-chapter.ps1 -Chapter ch01 -MainClass Hello
.\scripts\jar-chapter.ps1 -Chapter ch01 -MainClass Hello
```

The script defaults assume a Windows teaching machine rooted at `D:\java\ThinkJava101`. If your source or build paths differ, pass the optional script parameters to point at the correct folders.

## Pilot and refinement checklist
- Pilot Weeks 01-03 with a small group or first live section.
- Note which demos are too large to read live.
- Record common compiler or scanner mistakes.
- Tighten later week exercises based on early student performance.
- Reclassify optional versus core weeks if the course calendar changes.
