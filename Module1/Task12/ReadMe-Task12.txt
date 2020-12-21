Task12 was used web project from Task11.

git bash trace for Task 12:
****************************

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (anotherBranch)
$ git commit -m "Changes were made in anotherBranch"
On branch anotherBranch
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Task11Servlet.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../../../../../../ReadMe-Task11.txt

no changes added to commit (use "git add" and/or "git commit -a")

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (anotherBranch)
$ git status
On branch anotherBranch
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Task11Servlet.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../../../../../../ReadMe-Task11.txt

no changes added to commit (use "git add" and/or "git commit -a")

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (anotherBranch)
$ git add Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (anotherBranch)
$ git commit -m "Changes were made in anotherBranch"
[anotherBranch 4ccc0d1] Changes were made in anotherBranch
 1 file changed, 1 insertion(+)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (anotherBranch)
$ ןרו ûופודû
bash: ןרו: command not found

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (anotherBranch)
$ git status
On branch anotherBranch
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../../../../../../ReadMe-Task11.txt

nothing added to commit but untracked files present (use "git add" to track)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (anotherBranch)
$ git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Task11Servlet.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../../../../../../ReadMe-Task11.txt

no changes added to commit (use "git add" and/or "git commit -a")

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ git add Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ git commit -m "Changes were made in master branch"
[master 2cd6595] Changes were made in master branch
 1 file changed, 4 insertions(+)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$ git merge anotherBranch
Auto-merging Module1/Task11/src/main/java/it/academy/hw/Task11Servlet.java
CONFLICT (content): Merge conflict in Module1/Task11/src/main/java/it/academy/hw/Task11Servlet.java
Automatic merge failed; fix conflicts and then commit the result.

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master|MERGING)
$ vim Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master|MERGING)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 3 commits.
  (use "git push" to publish your local commits)

You have unmerged paths.
  (fix conflicts and run "git commit")
  (use "git merge --abort" to abort the merge)

Unmerged paths:
  (use "git add <file>..." to mark resolution)
        both modified:   Task11Servlet.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../../../../../../ReadMe-Task11.txt

no changes added to commit (use "git add" and/or "git commit -a")

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master|MERGING)
$ git add Task11Servlet.java

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master|MERGING)
$ git commit -m "After merging and fixing conflicts of 2 branches"
[master 042ee61] After merging and fixing conflicts of 2 branches

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1/task11/src/main/java/it/academy/hw (master)
$
   