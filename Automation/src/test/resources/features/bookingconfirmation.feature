@staging
Feature: Booking confirmation screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
@TC_Check_1
Scenario Outline: Bookingflow-> select a tee time->signin
And I tap on location field
When I search the course by  <coursename>
And I select Course by suggestion box
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I select the <player>
And I hit on search button
#Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
When I pick hole as <holes>
Then  rate types are displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then checkout screen is displayed
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 
Then <coursename> displayed with amount as Amount paid, Amount Due at Course and Paymenthod, booking details
#Then I click on   done button
# Then home screen is displayed 

Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email1|Password1|player7|
|Course|holes2|Email1|Password1|player7|



