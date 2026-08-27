# ThinkJava101 Class Setup

This repository is organized as a chapter-aligned teaching workspace for *Think Java, 2nd Edition*.

## Repository layout
- `book-code/ThinkJavaCode2` -> canonical book examples and starter code (`ch01`..`ch17`, `appa`..`appd`)
- `class-notes/week01` .. `class-notes/week17` -> instructor weekly teaching modules
- `student-work/_template` -> copyable weekly student starter workspace
- `docs/instructor-guide.md` -> instructor quick-start, pacing, and delivery notes
- `docs/student-onboarding.md` -> student setup and workflow guide
- `build` -> generated compiled classes per chapter (ignored)
- `dist` -> generated jar outputs per chapter (ignored)

## Course shape
The workspace now supports a full 17-week Java 101 sequence with one instructional unit per `Think Java` chapter.

- Weeks 01-07 are the core beginner spine for syntax, variables, input, methods, conditionals, loops, and arrays.
- Weeks 08, 15, 16, and 17 are marked as stretch/enrichment topics for courses that need a shorter sequence.
- Weeks 11-14 provide the main object-oriented transition from single-file programs to larger multi-class systems.

## Teaching workflow
Use the book code as the canonical example set and keep instructor/student authored work in the teaching folders.

1. Choose the week in `class-notes`.
2. Review the chapter demos listed for that week.
3. Compile the chapter with the PowerShell script.
4. Run one or more example classes during lecture.
5. Distribute the matching folder from `student-work/_template`.

## Scripts
All scripts live in `scripts`.

### 1) Compile a chapter
```powershell
cd D:\java\ThinkJava101
.\scripts\compile-chapter.ps1 -Chapter ch01
```

### 2) Run a class from a chapter
```powershell
.\scripts\run-chapter.ps1 -Chapter ch01 -MainClass Hello
```

### 3) Build a jar from a chapter
```powershell
.\scripts\jar-chapter.ps1 -Chapter ch01 -MainClass Hello
```

If a class is in a package, pass the fully-qualified class name.
Example: `-MainClass com.example.app.Main`

## Platform note
The included automation is PowerShell-first because the existing classroom scripts target that workflow. On non-Windows systems, instructors can still compile and run the book examples directly with `javac` and `java`, or adapt the script parameters to local paths.

## Where to start
- Instructors: see `docs/instructor-guide.md`
- Students: see `docs/student-onboarding.md`
- Weekly teaching plans: see `class-notes/README.md`
- Weekly starter workspace: see `student-work/README.md`
