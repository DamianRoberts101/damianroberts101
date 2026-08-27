param(
    [Parameter(Mandatory = $true)]
    [string]$Chapter,

    [Parameter(Mandatory = $true)]
    [string]$MainClass,

    [string]$BuildRoot = "D:\java\ThinkJava101\build",
    [string[]]$ProgramArgs = @()
)

$chapterLower = $Chapter.ToLower()
$classDir = Join-Path $BuildRoot $chapterLower
if (-not (Test-Path -LiteralPath $classDir)) {
    throw "Compiled classes not found: $classDir. Run compile-chapter.ps1 first."
}

Write-Host "Running $MainClass from $chapterLower ..."
java -cp $classDir $MainClass @ProgramArgs
if ($LASTEXITCODE -ne 0) {
    throw "java run failed for $MainClass"
}
