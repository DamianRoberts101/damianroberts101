# ThinkJava101 Class Setup

This folder is organized for teaching every chapter in *Think Java, 2nd Edition*.

## Main folders
- `book-code\ThinkJavaCode2` -> keep official chapter code here (`ch01`..`ch17`, `appa`..`appd`)
- `class-notes\week01`..`week17` -> your lecture/demo files
- `student-work\_template` -> copy for each student
- `build\chXX` -> compiled classes per chapter
- `dist` -> jar outputs per chapter

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
