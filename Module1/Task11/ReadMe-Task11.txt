Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ cd Task11/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/Task11 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ./

nothing added to commit but untracked files present (use "git add" to track)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/Task11 (master)
$ cd ..

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Task11/

nothing added to commit but untracked files present (use "git add" to track)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git add Task11/
warning: LF will be replaced by CRLF in Module1/Task11/pom.xml.
The file will have its original line endings in your working directory

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Task11/pom.xml
        new file:   Task11/src/main/java/it/academy/hw/Task11Servlet.java


Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git commit -m "Created proect for Task11"
[master c7a2742] Created proect for Task11
 2 files changed, 54 insertions(+)
 create mode 100644 Module1/Task11/pom.xml
 create mode 100644 Module1/Task11/src/main/java/it/academy/hw/Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git branch
* master


Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git checkout -b anotherBranch
Switched to a new branch 'anotherBranch'

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git status
On branch anotherBranch
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Task11/src/main/java/it/academy/hw/Task11Servlet.java

no changes added to commit (use "git add" and/or "git commit -a")

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git restore Task11/src/main/java/it/academy/hw/Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git status
On branch anotherBranch
nothing to commit, working tree clean

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git status
On branch anotherBranch
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Task11/src/main/java/it/academy/hw/Task11Servlet.java

no changes added to commit (use "git add" and/or "git commit -a")

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git add Task11/src/main/java/it/academy/hw/Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git status
On branch anotherBranch
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   Task11/src/main/java/it/academy/hw/Task11Servlet.java


Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git commit -m "Task11Servlet was changed and commit from anotherBranch"
[anotherBranch 9895ea7] Task11Servlet was changed and commit from anotherBranch
 1 file changed, 3 insertions(+)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (anotherBranch)
$ git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ ls
Task1/  Task11/  Task2-4/  Task5-6/  Task7/  Task8/  Task9/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ cd task11/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ ls
Task11.iml  pom.xml  src/  target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd
.idea/      Task11.iml  pom.xml     src/        target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd
.idea/      Task11.iml  pom.xml     src/        target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd
.idea/      Task11.iml  pom.xml     src/        target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd
.idea/      Task11.iml  pom.xml     src/        target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd
.idea/      Task11.iml  pom.xml     src/        target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd
.idea/      Task11.iml  pom.xml     src/        target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd
.idea/      Task11.iml  pom.xml     src/        target/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11 (master)
$ cd src/main/java/it/academy/hw/

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ ls
Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ task11Servlet.java
bash: task11Servlet.java: command not found

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ vim task22Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ vim task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        task22Servlet.java

nothing added to commit but untracked files present (use "git add" to track)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$
