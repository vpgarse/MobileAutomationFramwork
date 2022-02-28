@staging
Feature: Friends
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on My SG 
And I hit on Sign In
@TC_FR_1
Scenario Outline: verify Add friend button
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
Examples: 
|Email|Password|
|Email|Password|


@TC_FR_2
Scenario Outline: verify Add friends functionality
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed
And I click on <First name> and <last name>
And I hit on Done 
Then  confirmation message displyed
And I hit ok 
Then friend added successfully to list
Examples:
|Email|Password|First name|last name|
|Email|Password|firstname|lastname|


@TC_FR_3
Scenario Outline: verify Add friends  with invalid name
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed
And I click on <First name> and <last name>
And I hit on Done 
Then  invalid <error message> should display


Examples:
|Email|Password|First name|last name|error message|
|Email|Password|invalidfirstname1|invalidlastname1|invalid firstname|
|Email|Password|invalidfirstname2|invalidlastname2|invalid lastname|

@TC_FR_4
Scenario Outline:verify change photo functionality
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed
Then I click on change photo
Then change photo drop down displayed
Examples:
|Email|Password|
|Email|Password|


@TC_FR_5
Scenario Outline:verify camera field
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed
Then I click on change photo
Then change photo drop down displayed
And I select Camera 
Then camera screen is displayed
Examples:
|Email|Password|
|Email|Password|


@TC_FR_6
Scenario Outline:verify Gallery option
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed
Then I click on change photo
Then change photo drop down displayed
And I select Gallery
Then Gallery in phone is displayed
Examples:
|Email|Password|
|Email|Password|


@TC_FR_7
Scenario Outline:verify cancel option
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed
Then I click on change photo
Then change photo drop down displayed
And I hit on cancel
Then  change photo drop down is closed
Examples:
|Email|Password|
|Email|Password|


@TC_FR_8
Scenario Outline: verify Remove friend option
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And I  hit on friend from friends list
Then friend profile is displayed
Then I hit on Remove friend
Then  confirmation message of remove friend displyed
And I hit ok 
Then friend is removed from the friends list
Examples:
|Email|Password|
|Email|Password|

@TC_FR_9
Scenario Outline: verify done option without entering the name
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed 
And I hit on Done 
Then alertmessages are displaying
Examples:
|Email|Password|
|Email|Password|
|Email|Password|




@TC_FR_10
Scenario Outline: verify end to end friend functinality
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
 And  I click on friends  
Then friend screen is displayed
And  I click on Add friend 
Then Addfriend screen is displayed
And I click on <First name> and <last name>
Then I click on change photo
Then change photo drop down displayed
And I hit on cancel
And I hit on Done 
Then  confirmation message displyed
And I hit ok 
Then friend added successfully to list
Examples:
|Email|Password|First name|last name|
|Email|Password|firstname|lastname|

