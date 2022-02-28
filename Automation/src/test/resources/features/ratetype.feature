@staging
Feature: Rate type screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on location field
@TC_rt1
Scenario Outline:   verify rate tyoe screen
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
Examples: 
|cityname|
|city1|



@TC_rt2
Scenario Outline:
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
Then I verified "1" player  displayed by default
Examples: 
|cityname|
|city1|

@TC_rt3
Scenario Outline:
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
Then I verified "18" Holes displayed by deafult
Examples: 
|cityname|
|city1| 


@TC_rt4
Scenario Outline: 
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
When I hit on  plus icon to increase the players count
Then verified max players
Examples: 
|cityname|
|city1|

@TC_rt5
Scenario Outline: verify min player avaibility
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
When I hit on  plus icon to increase the players count
When I hit on minus icon to decrease the players
Then verified min players count
Examples: 
|cityname|
|city1|

@TC_rt6
Scenario Outline:Verify defalut cart value
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
Then I verified Cart as "Ride" selecetd default value
Examples:
|cityname|
|city1|

@TC_rt7
Scenario Outline:verify the rate types availbility
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
Then  rate types are displayed
Examples:
|cityname|
|city1|

@TC_rt8
Scenario Outline:verify the 9 holes walk  rates
And I enter <cityname>
And I select Course by suggestion box
And I hit on search button
Then <cityname> name should display with the courses avaialbility
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then "Booking Options" screen is displayed
When I select  <holes>
Then  rate types are displayed
Examples:
|cityname|holes|
|city1|holes1|
|city1|holes2|




@TC_rt9
Scenario Outline:verify the 9 holes walk  rates
And I enter <cityname>
And I select Course by suggestion box
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I select the <player>
And I hit on search button
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then verified  the  <player> value
Examples:
|cityname|player|
|city1|player1|
|city1|player2|
|city1|player3|
|city1|player4|
|city1|player5|
|city1|player6|

@TC_rt10
Scenario Outline:verify the holes 
And I enter <cityname>
And I select Course by suggestion box
And I tap on Holes
When I select hole from  <holeoption> dropdown
And I hit on search button
And I hit on course 
Then courselisting page is displayed with teetimes
And I click on tee time card
Then verified the field <hole> option
Examples:
|cityname|holeoption|hole|
|city1|hole1|holes1|
|city1|hole2|holes2|


@TC_rt_11
Scenario Outline:verify the the booking screen by searching with coursename
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
Examples:
|coursename|
|Course|


@TC_rt_12
Scenario Outline:verify the the default player when user  searching with coursename
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
Then I verified "1" player  displayed by default

Examples:
|coursename|
|Course|



@TC_rt_13
Scenario Outline:verify the default hole value when user search by course
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
Then I verified "18" Holes displayed by deafult
Examples:
|coursename|
|Course|


@TC_rt_14
Scenario Outline:verify the max player , when user search by course
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
When I hit on  plus icon to increase the players count
Then verified max players
Examples: 
|coursename|
|Course|


@TC_rt_15
Scenario Outline:verify the min  player,  when user search by course
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
When I hit on  plus icon to increase the players count
When I hit on minus icon to decrease the players
Then verified min players count
Examples: 
|coursename|
|Course|

#
#@TC_rt_16
#Scenario Outline:verify the rate of 18 hole ride, when user search by course
#When I search the course by  <coursename>
#And I select Course by suggestion box
#And I hit on search button
#Then displayed <coursename> with tee times  listing
#And I click on tee time card
#Then "Booking Options" screen is displayed
#When I select 18 holes
#Then  rate types are displayed
#Examples: 
#|coursename|
#|Course|


@TC_rt_16
Scenario Outline:verify the player value field  when user search by course
When I search the course by  <coursename>
And I select Course by suggestion box
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I select the <player>
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
Then verified  the  <player> value
Examples:
|coursename|player|
|Course|player1|
|Course|player2|
|Course|player3|
|Course|player4|
|Course|player5|
|Course|player6|

@TC_rt_17
Scenario Outline:verify the hole value field when user search by course
When I search the course by  <coursename>
And I select Course by suggestion box
And I tap on Holes
When I select hole from  <holeoption> dropdown
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
Then verified the field <hole> option
Examples:
|coursename|holeoption|hole|
|Course|hole1|holes1|
|Course|hole2|holes2|



@TC_rt_18
Scenario Outline:verify the rate of 18 hole ride, when user search by course
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
When I pick hole as <holes>
Then  rate types are displayed
Examples: 
|coursename|holes|
|Course|holes1|
|Course|holes2|

@TC_rt_19
Scenario Outline:verify the rate of 18 hole ride, when user search by course
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
When I pick hole as <holes>
Then  rate types are displayed
And rate type prices also displayed
Examples: 
|coursename|holes|
|Course|holes1|
|Course|holes2|
#
#@TC_rt_16
#Scenario Outline:verify the rate of 18 hole ride, when user search by course
#When I search the course by  <coursename>
#And I select Course by suggestion box
#And I hit on search button
#Then displayed <coursename> with tee times  listing
#And I click on tee time card
#Then "Booking Options" screen is displayed
#When I select 9 holes
#Then  rate types are displayed
#Examples: 
#|coursename|
#|Course|





