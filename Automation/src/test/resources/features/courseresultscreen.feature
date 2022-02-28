@staging
Feature:  Course result screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on location field
@TC_Cs_01
Scenario Outline: verify the course result screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I tap on favourite icon
Then application added in course automatically in favourite screen
Examples:
|coursename|
|Course|


@TC_CS_10
Scenario Outline: verify calendar screen on course result screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I  click on date 
Then calendar screen displayed
Examples:
|coursename|
|Course|

@TC_Cs_11
Scenario Outline: verify filter icon
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on filter icon
Then filter screen is displayed
Examples:
|coursename|
|Course|

@TC_cs_12
Scenario Outline: verify weathreicon
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on weather icon on courseresult screen
Then weather icon is displayed
Examples:
|coursename|
|Course|

@TC_cs_13
Scenario Outline: verify info icon
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Examples:
|coursename|
|Course|

@TC_cs_14
Scenario Outline: verify alert icon
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on alert icon on course listing page
Then alert screen is displayed
Examples:
|coursename|
|Course|


@TC_cs_15
Scenario Outline: verify the lowest green price amount
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
Then validated green fee
Examples:
|coursename|
|Course|

@TC_cs_16
Scenario Outline: verify the players
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
Then avaialble players are displayed
Examples:
|coursename|
|Course|

@TC_cs_18
Scenario Outline: verify  tee time time
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
Then tee time time is displyed
Examples:
|coursename|
|Course|

@TC_Cs_19
Scenario Outline: verify the holes on tee time
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
Then holes are displayed
Examples:
|coursename|
|Course|

@TC_Cs_20
Scenario Outline: verify the booking screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then booking screen is dispalyed
Examples:
|coursename|
|Course|


@TC_cs_21
Scenario Outline: verify the  review screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
Examples:
|coursename|
|Course|



@TC_cs_23
Scenario Outline: verify providers aviability 
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
Then Avialable provider sites is dispalyed
Examples:
|coursename|
|Course|



