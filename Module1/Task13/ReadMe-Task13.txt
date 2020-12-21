

git bash trace:
**************

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 7 commits.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Task11/src/main/java/it/academy/hw/Task11Servlet.java

no changes added to commit (use "git add" and/or "git commit -a")

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git commit -a -m "Changes from Task13"
[master 05e1e9b] Changes from Task13
 1 file changed, 2 insertions(+)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git log
commit 05e1e9be06d27c19066682a1557d0d91f6b0d7f2 (HEAD -> master)
Author: Andrikevich <d.andrikevich@gmail.com>
Date:   Mon Dec 21 14:32:25 2020 +0300

    Changes from Task13

commit 3704e78171c5320b4cd2c3f21f052e747757c17d
Author: Andrikevich <d.andrikevich@gmail.com>
Date:   Mon Dec 21 14:27:12 2020 +0300

    Has been finished Task12

commit 042ee619fc673f20d8eb4ebe6d341027dbd9dd3a
Merge: 2cd6595 4ccc0d1
Author: Andrikevich <d.andrikevich@gmail.com>
Date:   Mon Dec 21 14:21:28 2020 +0300

    After merging and fixing conflicts of 2 branches

commit 2cd6595a2c04fca4623a93270ba16039366bdefb
Author: Andrikevich <d.andrikevich@gmail.com>
Date:   Mon Dec 21 14:17:58 2020 +0300

    Changes were made in master branch

commit 4ccc0d144319add701992bd41ce349336802264b (anotherBranch)
Author: Andrikevich <d.andrikevich@gmail.com>
Date:   Mon Dec 21 14:14:15 2020 +0300

    Changes were made in anotherBranch

commit 9895ea79a04406d1c69806e0b30a9fe0adaede21
Author: Andrikevich <d.andrikevich@gmail.com>

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git revert 05e1e9be06d27c19066682a1557d0d91f6b0d7f2
[master bacc29d] Revert "Changes from Task13"
 1 file changed, 2 deletions(-)

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 9 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

Dmitry_An@NB-A1-432949 MINGW64 /c/hw/Module1 (master)
$
