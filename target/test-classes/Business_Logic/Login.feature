Feature: Login functionality

Background: User is on main page
Given User launch "Chrome" browser with exe as "D:\Automation Support\\chromedriver.exe"
Given User enter  "https://tutorialsninja.com/demo/index.php?route=account/login" as url


@SmokeTest
Scenario: Login functionality with valid username and valid password
When user provide username as "abhirajshejul@gmail.com"
When user provide password as "Rajvika83!"
When user click on login button
Then Application shows user profile to user


          
             
             

