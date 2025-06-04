## Problem Statement
The goal of this problem is to design a software scoreboard system that can handle a variety of sports such as Soccer, Baseball, Hockey, and Football. The program will employ polymorphism to create a flexible and extensible architecture that can adapt to the unique rules of each sport.

> **Note**: This project was originally part of a private GitLab repository and has been migrated to GitHub as an independent repository. As a result, the commit history starts from the migration point.

## Developer Documentation
The program is organized using a class hierarchy that includes the base class, 'Sport' and subclasses for each sport. This allows for a common interface while still complying to the unique kinds of scoring methods / period lengths for each sport. The 'ScoringMethod' and 'Team' classes were designed to encapsulate scoring methods and team information, respectively. This was done to enhance code readability and modularity. The user interacts with the program through a command-line interface. This was done for simplicity when handling user interaction. A menu driven approach was chosen for the user input. The program displays menus for game selection, scoring options, and team choices. I set up the menu to be like how it is in order for the user to easily navigate and choose their desired option. I tried making it look compact and simple in order for ease of use. I implemented a somewhat basic input validation with this program. I wanted to ensure numeric choices for the game and scoring selection. Non-numeric or invalid choices prompt the user to try again. Something I would change if I had more time would be how the team name selection works. Currently, if you do a name that has 2 words, it trims off the second word and the team name is just whatever the first word was. I think it would make sense for a user to be able to include the team's city or school when they select the teams they want to play with. <br>
The program dynamically creates game instances based on user input allowing for flexibility for the different sports. The user is then prompted to enter their team names. The period lengths and scoring methods are able to be changed within sport class which allows for easy adaptation for sports with different scoring methods and periods. The program was chosen to feature an interactive loop for scoring games. Users can input scores for various scoring methods until the game is over. The 'ScoringMethod' class holds the information regarding each scoring method and the program determines the right scoring method based on user input. Polymorphism is employed with this class to allow for the game-specific implementations of each sport while maintaining a consistent method interface. The specific scoring method for each sport is established within each of the different sports subclasses.<br>
If I had to make adjustments or add more features, I would opt to go with including a GUI for the program. I think this would increase the enjoyability as well as potentially the ease of use of the program. The command-line interface works for the time being, but a GUI would probably make it look better and/or make it feel more authentic. <br>
With the Hockey and Soccer implementations I was not too sure what kind of scoring methods there were besides just a straight up goal. To add more options, I googled the different ways for scoring in Hockey, hence the various ways that can be seen when running a Hockey game. For the Soccer, unfortunately, I could not really do any better than just having a straight up goal for the scoring method.


![image](https://github.com/user-attachments/assets/20b4ba3c-b826-46d2-bcfd-77b1ccd03cfa)


## JavaDocs
Java Documents are visible using a local server on the machine. You must have at least the doc folder on your local machine. To access them:
1. Open a terminal
2. Navigate to the `doc/` directory
   ```cd path\to\the\project\doc```
3. Start a local server:
   ```python -m http.server 8000```
4. Open your browser and vist:
   ```http://localhost:8000/package-summary.html```
 
[Java Docs can be accessed here!](https://github.com/jarkin0513/Java-Polymorphism-Scoreboard/blob/main/doc/package-summary.html) 
 

## User Documentation

<dl>
 
 <dt> Launching the Program </dt>
  <dd> 
To start the program navigate to the Main.java file and click the run button from your IDE.   
The run button should look like a green arrow, or something similar to that.
  </dd>

 <dt> Using the program </dt>
 <dd>
  Once the program begins, the console will display a menu prompting you to select the type of game you want (Football, Baseball, Soccer, or Hockey). <br>
After selecting the type of game you want, you will be prompted to enter in the home and away teams. Once you enter the teams the game will be started and you will be presented with a new menu specific for the type of game you've chosen. The teams, their scores, and the current period will be displayed as well. From the menu, you will be presented with the different types of scoring methods as well as the option to end the current period. <br>
Once you select a scoring method from the menu, you will be prompted with the option of choosing which team scored. You will be asked to enter either '1' or '2' for the respective team. After each time you select a certain scoring method, the menu will continue to display each time with the updated scores. The game will continue to go on until after the final period has ended. <br>
To end the current period, select the "End quarter / period" option from the menu. Every time you end the period, the same menu will appear in the console with the new updated current period. <br>
After the final period has ended, a game over message will appear in the console. The final scores, current period, and winner will be displayed. 
 </dd>

<dt> Exiting the Program </dt>
 <dd> 
Since the program terminates on its own once a game has ended, there is nothing required to exit the program.
 </dd>
 
</dl>


 

## Source Code
[Click here to view the source code](https://github.com/jarkin0513/Java-Polymorphism-Scoreboard/tree/main/src)
