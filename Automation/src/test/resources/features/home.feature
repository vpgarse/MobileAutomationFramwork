@staging
Feature: Home Screen
Background:
Given open the application in mobile
Then Find your tee time page is displayed
@TC_home_03
Scenario: Verify location
Then "Location" is displayed

@TC_home_04
Scenario: verify location field
And I tap on location field
Then "Search a location" page is displayed


@TC_home_05
Scenario: Verify Date field
And I tap on Date field
Then Calendar screen with "Select a date" title is displayed


@TC_home_06
Scenario: Verify Players Field
And I tap on Players field
Then players dropdwon  displayed with "Player count" title

@TC_home_07
Scenario: Verify Holes Field
And I tap on Holes
Then "Holes" as title is displaying in holes dropdown

@TC_home_08
Scenario: Verify Cancel button on location field
And I tap on location field
Then "Search a location" page is displayed
And I hit on Cancel button
Then Home page is displayed


@TC_home_09
Scenario: Verify cancel button on date field
And I tap on Date field
Then Calendar screen with "Select a date" title is displayed
And I hit on Cancel button
Then Home page is displayed


@TC_home_10
Scenario: Verify Cancel button on Players field
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I hit on Cancel button
Then Home page is displayed


@TC_home_11
Scenario: Verify Cancel button on Hole field
And I tap on Holes
Then "Holes" as title is displaying in holes dropdown
And I hit on Cancel button
Then Home page is displayed


@TC_home_12
Scenario Outline: Select date calendar
And I tap on Date field
Then Calendar screen with "Select a date" title is displayed
And I hit on current Date from calendar
Then <date> is displayed on home screen
Examples:
|date|
|currentday|


#@TC_home_13
#Scenario: verify next month in  date calendar
#And I tap on Date field
#Then Calendar screen with "Select a date" title is displayed
#When I select next button from calendar
#And I select following date 
#Then Selected date displayed on Home screen




@TC_home_13_5
Scenario Outline: Select an option from Players field
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I select the <player>
Then selected <player> displayed on Home screen
Examples:
|player|
|player7|
|player1|
|player2|
|player3|
|player4|
|player5|
|player6|

@TC_home_14
Scenario Outline: holes field
And I tap on Holes
Then "Holes" as title is displaying in holes dropdown
When I select hole from  <holeoption> dropdown
Then selected <holeoption> displayed on Home screen  
Examples:
|holeoption|
|hole1|
|hole2|

@home
@TC_home_15
Scenario Outline: Search by Course
And I tap on location field
Then "Search a location" page is displayed
When I click on Search box
And I enter <cityname>
And I select Course by suggestion box
Then <cityname> name should display with the courses avaialbility
Examples:
|cityname|
|city1|
|city2|

@TC_home_18
Scenario: Search by currentlocation
And I tap on location field
Then "Search a location" page is displayed
And I tap on Current location
Then current location displayed on location field

@TC_home_24
Scenario: Verify Favourites button
When I tap on heart icon in bottom of page
Then  SG Account page is displayed

#
 @TC_home_25
Scenario: Verify Alerts button
When I tap on bell icon in bottom of page
Then  SG Account page is displayed


@TC_home_26
Scenario: verify Play on the course screen
When I tap on golfcart icon in bottom of the page
Then Play on the course screen displayed

@TC_home_27
Scenario: verify MySG screen 
When I tap on hamburger icon
Then  SG Account page is displayed

























 
 