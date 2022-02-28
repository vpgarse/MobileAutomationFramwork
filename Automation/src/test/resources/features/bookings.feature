@staging
Feature: Booking screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on My SG 
And I hit on Sign In
Then sign in page is displayed
Scenario Outline:verify the bookings screen   
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings 
Then bookings screen displayed
Examples: 
|Email|Password|
|Email1|Password1|


Scenario Outline: verify Upcoming bookings
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on Upcoming bookings
Then Upcoming bookings screen dispalyed
Examples: 
|Email|Password|
|Email1|Password1|

Scenario Outline: verify Completed bokings
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on Completed bookings
Then completed bookings screen dispalyed
Examples: 
|Email|Password|
|Email1|Password1|

Scenario Outline: verify Cancelled bokings
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on canceeled bookings
Then cancelled bookings screen dispalyed
Examples: 
|Email|Password|
|Email1|Password1|

Scenario Outline: verify Cancelled bokings tee time
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on canceeled bookings
Then cancelled bookings screen dispalyed
When I hit on any one of cancelled booking
Then booking details should display
Examples: 
|Email|Password|
|Email1|Password1|

Scenario Outline: verify Completed bokings tee time
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on Completed bookings
Then completed bookings screen dispalyed
When I hit on any one of Completed booking
Then booking details should display
Examples: 
|Email|Password|
|Email1|Password1|


Scenario Outline: verify upcoming  bokings tee time
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on Upcoming bookings
Then Upcoming bookings screen dispalyed
When I hit on any one of upcoming booking tee time
Then booking details should display
Examples: 
|Email|Password|
|Email1|Password1|
@TC_up3
Scenario Outline: Verify booking details in upcoming bookings
When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on Upcoming bookings
Then Upcoming bookings screen dispalyed
When I hit on any one of upcoming booking tee time
Then Upcoming bookings screen dispalyed
Then <coursename> displayed with amount as Amount paid, Amount Due at Course and Paymenthod, booking details
Examples: 
|Email|Password|coursename|
|Email1|Password1|Course|

@TC_co3
Scenario Outline: verify booking details in completed  bookings
When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on Completed bookings
Then completed bookings screen dispalyed
When I hit on any one of Completed booking
Then completed bookings screen dispalyed
Then <coursename> displayed with amount as Amount paid, Amount Due at Course and Paymenthod, booking details
Examples: 
|Email|Password|coursename|
|Email1|Password1|Course|


@TC_co4
Scenario Outline: verify booking details in cancelled  bookings
When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
When I hit on Bookings
Then bookings screen displayed
And I hit on canceeled bookings
Then cancelled bookings screen dispalyed
When I hit on any one of cancelled booking
Then cancelled bookings screen dispalyed
Then <coursename> displayed with amount as Amount paid, Amount Due at Course and Paymenthod, booking details
Examples: 
|Email|Password|coursename|
|Email1|Password1|Course|