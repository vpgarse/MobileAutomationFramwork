@staging
Feature: cityresult screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on location field
@TC_ci_04
Scenario Outline: verify favourite icon on city rsult screeen 
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I tap on favourite icon
Then application added city as favourite in favourites screen
Examples:
|cityname|
|city1|
|city2|

@TC-Ci_08
Scenario Outline: verify the calendar icon on city listing page
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I  click on date 
Then calendar screen displayed
Examples:
|cityname|
|city1|
|city2|


@TC_Ci_09
Scenario Outline: verify the filter icon on city listing screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on filter icon
Then  filter screen is displayed
Examples:
|cityname|
|city1|
|city2|

@TC-Ci_10
Scenario Outline: verify the map icon on city listing page
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
Examples:
|cityname|
|city1|
|city2|




@TC_Ci_11
Scenario Outline: verify the weather icon on city listng screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on weather icon on cityresult screen
Then weather icon is displayed
Examples:
|cityname|
|city1|
|city2|


@TC_Ci_12
Scenario Outline: verify the green fee on city listng screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then green fee is displayed
Examples:
|cityname|
|city1|
|city2|

@TC_Ci_13
Scenario Outline: verify the rating  on city listng screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then  course rating displayed on city listing page
Examples:
|cityname|
|city1|
|city2|

@TC_Ci_14
Scenario Outline: verify the distance  on city listng screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then course distance is dispalyed from location
Examples:
|cityname|
|city1|
|city2|

@TC_Ci_15
Scenario Outline: verify the  course result screen through city search
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
And I hit on course 
Then courselisting page is displayed with teetimes
Examples:
|cityname|
|city1|
|city2|

