# GLang
Check the Issues tab above for what needs to be done.

Instructions:

Click the green Code button and copy the https://github.com/...../....git url.

Go to Intellij IDEA and click File > New > Project from Version Control

If it gives GitHub as an option, sign in to github in intellij and choose the GLang repository from the provided list, otherwise, paste the url into the git url box.

If it asks you to sign into github at any point, do it.

You should now have the project on your computer and in IntelliJ. From here, you may have some errors. The project should import as a MAVEN project. This is extremely important.

On the right side of the intellij window, there should be a tab called Maven. Open it up, and click the refresh button on the top left of that panel. This should read the pom.xml file included in the root of the project, reload any dependencies, and allow you to build the project.

Now you can start to write some code and add new features.

Before writing any code, you need to make a new branch, based off of the main branch to write your code in.

The main branch should not be touched. Someone should always be able to download and compile the source code from the main branch and have a working program.

To get around this, you create a new LOCAL branch in intellij by using the hotkey CTRL + SHIFT + '`' (under the escape key)

Click new branch. Type in a name for your branch (should describe the code you're about to write.)

Once the branch is created, you can start writing code. Write the code for your feature, then press CTRL + K to open the commit window.

Describe the changes to the code you made in detail, then click commit or click the arrow on the button and click commit and push.
(ALWAYS COMMIT AND PUSH YOUR CHANGES SO OTHERS CAN ACCESS YOUR CODE ASAP WHEN NEEDED)

When you commit changes, they are recorded in the local repository. You won't see the changes on github until you PUSH the changes. Once pushed, you'll see your new branch of the repository on github. You'll probably see a little popup at the top of any github page saying to create a pull request. Click that.

If you do not see that message, click the Pull Requests page of the repository.

Create a new pull request for your newly coded branch.

Once your pull request is made, request that it be reviewed by clicking the gear icon by "Reviewers" on the right panel and adding the users you want to have review the code.

When the code reviews are done for that pull request, I will squash and merge the pull request. When that's done, your code will now be in the main branch, ready for the new version to be deployed.

If someone merges changes in to the main branch, but you were working on code that uses an older version of the main branch, you can rebase the main branch, and it will "undo" your changes to the code, update the code to reflect the new version of the main branch, then redo your changes ontop of that new version of the main branch. 

Test your code. From here you can commit, push, and create a PR (pull request)

Garzaaa was hereee :)