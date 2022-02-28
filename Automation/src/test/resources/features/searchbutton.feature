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