param(
    [Parameter(Mandatory = $true)]
    [string]$Chapter,

    [string]$SourceRoot = "D:\java\ThinkJava101\book-code\ThinkJavaCode2",
    [string]$BuildRoot = "D:\java\ThinkJava101\build"
)

$chapterLower = $Chapter.ToLower()
$chapterDir = Join-Path $SourceRoot $chapterLower
if (-not (Test-Path -LiteralPath $chapterDir)) {
    throw "Chapter folder not found: $chapterDir"
}

$outDir = Join-Path $BuildRoot $chapterLower
if (Test-Path -LiteralPath $outDir) {
    Remove-Item -LiteralPath $outDir -Recurse -Force
}
New-Item -ItemType Directory -Path $outDir -Force | Out-Null

$javaFiles = Get-ChildItem -LiteralPath $chapterDir -Filter *.java -Recurse | Select-Object -ExpandProperty FullName
if (-not $javaFiles -or $javaFiles.Count -eq 0) {
    throw "No .java files found in $chapterDir"
}

Write-Host "Compiling $($javaFiles.Count) files from $chapterLower ..."
javac -d $outDir $javaFiles
if ($LASTEXITCODE -ne 0) {
    throw "javac failed for chapter $chapterLower"
}

Write-Host "Done. Classes in: $outDir"
