param(
    [Parameter(Mandatory = $true)]
    [string]$Chapter,

    [string]$BuildRoot = "D:\java\ThinkJava101\build",
    [string]$DistRoot = "D:\java\ThinkJava101\dist",
    [string]$MainClass
)

$chapterLower = $Chapter.ToLower()
$classDir = Join-Path $BuildRoot $chapterLower
if (-not (Test-Path -LiteralPath $classDir)) {
    throw "Compiled classes not found: $classDir. Run compile-chapter.ps1 first."
}

New-Item -ItemType Directory -Path $DistRoot -Force | Out-Null
$jarPath = Join-Path $DistRoot "$chapterLower.jar"
if (Test-Path -LiteralPath $jarPath) {
    Remove-Item -LiteralPath $jarPath -Force
}

if ($MainClass) {
    jar --create --file $jarPath --main-class $MainClass -C $classDir .
} else {
    jar --create --file $jarPath -C $classDir .
}

if ($LASTEXITCODE -ne 0) {
    throw "jar build failed for $chapterLower"
}

Write-Host "Created: $jarPath"
if ($MainClass) {
    Write-Host "Run with: java -jar $jarPath"
}
