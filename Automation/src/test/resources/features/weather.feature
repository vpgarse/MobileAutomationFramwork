@staging
Feature: Weather screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on weather icon
@TC_we_1
Scenario: verify weather screen
Then weather screen is displayed
Then today weather is displayed
And max min temperature is displayed


@TC_we_4
Scenario: verify Todayweather button
Then default Today weather is displayed


@TC_we_5
Scenario: verify weekly weather button
Then I click on Weekely weather button
Then next 7days wather is displayed

@TC_we_6
Scenario: verify wind button on weather screen
Then I click on Windbutton
Then  wind displayed in mph
 
@TC_we_12
Scenario: verify cancel button on weather screen
And I tap on back  icon
Then home screen is opened