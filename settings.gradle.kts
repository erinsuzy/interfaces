rootProject.name = "interfaces"
include("src:main:java")
findProject(":src:main:java")?.name = "java"
include("studio-spinning-disks")
