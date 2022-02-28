@staging
Feature: search button 
Background:
Given open the application in mobile
Then Find your tee time page is displayed
@TC_Se_01 
Scenario Outline: verify search by city name
And I tap on location field
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
Examples:
|cityname|
|city1|
#|city2|
|city6|


@TC_Se_02
Scenario Outline: verify search by city name
And I tap on location field
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
Examples:
|coursename|
|Course|



@TC_se_04
Scenario Outline: search by zipocde lessthan 5 digits
And I tap on location field
And I enter <cityname>
Then "No results found" message in search screen  is displayed
Examples:
|cityname|
|city3|
|city4|


@TC_se_05
Scenario Outline: search  by cityname and select holes 
And I tap on location field
And I enter <cityname>
And I select Course by suggestion box
And I tap on Holes
Then "Holes" as title is displaying in holes dropdown
When I select hole from  <holeoption> dropdown
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then course tee times list display with <holes>
Examples:
|cityname|holeoption|holes|
|city1|hole1|holes1|
|city1|hole2|holes2|
|city1|hole3|holes3|


@Tc_se_08
Scenario Outline:serach by city name and select players
And I tap on location field
And I enter <cityname>
And I select Course by suggestion box
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I select the <player>
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then tee times listing page  display with <players>
Examples:
|cityname|player|players|
|city1|player1|playerso/p1|
|city1|player2|playerso/p2|
|city1|player3|playerso/p3|
|city1|player4|playerso/p4|
|city1|player5|playerso/p5|
|city1|player6|playerso/p6|
|city1|player7|playerso/p7|

@Tc_se_15
Scenario Outline: search by coursename and select players
And I tap on location field
When I search the course by  <coursename>
And I select Course by suggestion box
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I select the <player>
And I hit on search button
Then displayed <coursename> with tee times  listing
Then tee times listing page  display with <players>
Examples:
|coursename|player|players|
|Course|player1|playerso/p1|
|Course|player2|playerso/p2|
|Course|player3|playerso/p3|
|Course|player4|playerso/p4|
|Course|player5|playerso/p5|
|Course|player6|playerso/p6|
|Course|player7|playerso/p7|

@Tc_Se_23
Scenario Outline: search courses by current location
And I tap on location field
And I tap on Current location
And I hit on search button
Then <cityname> name should display with the courses avaialbility
Examples:
|cityname|
|city5|

@Tc_Se_28 
Scenario Outline: search by course name with selected holes
And I tap on location field
When I search the course by  <coursename>
And I select Course by suggestion box
And I tap on Holes
Then "Holes" as title is displaying in holes dropdown
When I select hole from  <holeoption> dropdown
And I hit on search button
Then displayed <coursename> with tee times  listing
Then course tee times list display with <holes>
Examples:
|coursename|holeoption|holes|
|Course|hole1|holes1|
|Course|hole2|holes2|
|Course|hole3|holes3|

#@TC_Se_29
#Scenario: search without enter any course
#And I hit on search button
#Then alert message is displayed







