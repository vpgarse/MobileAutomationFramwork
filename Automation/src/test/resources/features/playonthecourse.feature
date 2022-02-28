@staging
Feature: Play on the course 
Background:
Given open the application in mobile
Then Find your tee time page is displayed
And I hit on golfcart icon
Then search on the course screen displayed
@TC_POC_03
Scenario Outline: Play on the course search screen
When I hit on search box
And I search with <CourseName>
Then Course GPS screeen is displayed
Examples:
|CourseName|
|Tribute|


@TC_POC_O4_0
Scenario: Verify Recent  tab
And I hit on golfcart icon
Then search on the course screen displayed
When I hit on search box
Then Recent tab is  displaying default


@TC_POC_O4_1
Scenario: verify suggest tab
When I hit on search box
Then Suggested tab is displaying 

@TC_POC_06
Scenario: verify the previous search courses
Then  previous serach result displayed in Recent tab


@TC_POC_07
Scenario Outline: verify suggest tab click function
And I hit on suggest a course
Then Suggest A Course page is displayed
And I fill the form with  <Name>,<City>, <State> and <Country>
And I hit on Submit a course
Then course details are submitted 
Examples:
|Name|City|State|Country|
|Supremegolf|Dallas|Tx|USA|

#@TC_POC_08
#Scenario Outline: verify range finder screen
#When I hit on search box
#And I search with <CourseName>
#Then Course GPS screeen is displayed
#And I hit on Course GPS screen
#Then range finder screen is displayed 
#And I click on Course GPS Settings
#Examples:
#|CourseName|
#|Tribute|




