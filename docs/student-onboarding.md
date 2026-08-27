# Student Onboarding

Welcome to the Java 101 workspace.

## What is in this repository?
- `book-code/ThinkJavaCode2` contains the official example code from *Think Java, 2nd Edition*.
- `student-work/_template` contains the weekly starter workspace you should copy before editing.
- `class-notes` contains instructor-facing lesson materials.

## Recommended setup
- Java JDK 11 or newer
- A code editor such as VS Code, IntelliJ IDEA Community Edition, or another Java-capable editor
- A terminal or PowerShell window for compiling and running files

## Basic workflow
1. Copy the current week from `student-work/_template/weekXX` into your own working folder.
2. Read that week’s `README.md` before changing any files.
3. Keep the book examples unchanged unless your instructor explicitly asks you to experiment with them.
4. Compile and run often so you catch mistakes early.

## Running chapter examples
If your class is using the provided PowerShell scripts:

```powershell
cd <path-to-repo>
.\scripts\compile-chapter.ps1 -Chapter ch01
.\scripts\run-chapter.ps1 -Chapter ch01 -MainClass Hello
```

Replace `<path-to-repo>` with the folder where you cloned the repository.

If your class is working directly from a terminal with `javac` and `java`, your instructor may provide alternate commands for your environment.

## Good beginner habits
- Change one thing at a time, then run the program.
- Read compiler errors from top to bottom.
- Save your file before you compile.
- Use clear variable and method names.
- Ask for help early when input, loops, or arrays stop making sense.

## Submitting work
Follow your instructor’s workflow for file naming and submission. A good default is to keep one folder per week and include:
- your `.java` files
- a short reflection or answers file if requested
- any screenshots or output samples your instructor requires
