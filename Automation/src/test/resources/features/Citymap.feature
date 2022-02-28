@staging
Feature: City Map view screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on location field
@TC_Map_01
Scenario Outline: Filter icon on city mapview screen
When I click on Search box
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I click on filter icon
Then filter screen is displayed
Examples:
|cityname|
|city1|
|city2|

@TC_Map_02
Scenario Outline:Verify Favourites screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I tap on favourite icon
Then city added to favourite screeen
Examples:
|cityname|
|city1|
|city2|

@TC_Map_03
Scenario Outline:verify list view screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I tap on list view icon
Then <city> name should display with the courses avaialbility
Examples:
|cityname|
|city1|
|city2|


@TC_Map_04
Scenario Outline: verify the map icon on city listing page
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I click on weather icon
Then weather screen is displayed based ons earch location
Examples:
|cityname|
|city1|
|city2|


@TC_Map_05
Scenario Outline: verify the calendar icon on city map view
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I  click on date 
Then calendar screen displayed
Examples:
|cityname|
|city1|
|city2|

@TC_Map_06
Scenario Outline:verify next button on city map view
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I click on next button
Then next date is dispalyed
Examples:
|cityname|
|city1|
|city2|

@TC_Map_07
Scenario Outline:verify previous button on city map view
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I click on next button
Then next date is dispalyed
And I hit on previous button
Then current date is displayed
Examples:
|cityname|
|city1|
|city2|

@TC_Map_08
Scenario Outline:verify courses on map view screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
Then courses are displayed
Examples:
|cityname|
|city1|
|city2|

@TC_Map_09
Scenario Outline:Verify green fee
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
Then green fee is displayed
Examples:
|cityname|
|city1|
|city2|


@TC_Map_10
Scenario Outline:verify course rating on city map view
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
Then  course rating displayed on city listing page
Examples:
|cityname|
|city1|
|city2|

@TC_Map_11
Scenario Outline:verify course distance
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
Then course distance is dispalyed from location
Examples:
|cityname|
|city1|
|city2|

@TC_Map_12
Scenario Outline:verify course listing page
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
And I hit on course 
Then courselisting page is displayed with teetimes
Examples:
|cityname|
|city1|
|city2|

@TC_Map_13
Scenario Outline:verify back button
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I click on map icon 
Then mapview screen with <cityname>  is displayed
Then I hit on back button
Then course listing screen displayed
Examples:
|cityname|
|city1|
|city2|
