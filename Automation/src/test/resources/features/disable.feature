@disable
Feature: Disable location
Background: 
#Given shellCommand to turn off location 
Given open the application in mobile
Then Find your tee time page is displayed
Scenario: Verify the location field when location is turned off
Then verified location field

@TC_D_2
Scenario: verify search button
And I hit on search button
Then alert message is displayed
And I hit on search button

@TC_D_3
Scenario: verify search button by selecting currrent location
And I tap on location field
Then Search a location page is displayed
And I tap on Current location
And I hit on search button
Then alert message is displayed