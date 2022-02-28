@staging
Feature: Signin
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on My SG 
And I hit on Sign In
Then sign in page is displayed

@TC_SIGN_1
Scenario Outline:  verify sign in
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
Examples: 
|Email|Password|
|Email|Password|

@TC_SIGN_2
Scenario Outline:  verify  invalid sign in
 When I log in with  <Email> and  <Password>
And I select login
Then email or password error message is dispalyed

Examples: 
|Email|Password|
|invalidemail1|invalidpassword1|
|invalidemail2|invalidpassword2|


@TC_SIGN3
Scenario Outline:  verify sign in
 When I log in with  <Email> and  <Password>
Then validation message is displayed
Examples: 
|Email|Password|
 |invalidemail3|invalidpassword3|
|invalidemail4|invalidpassword4|


@TC_SIGN4
Scenario Outline: verify forgot password
When I hit on forgot password
Then Forgot password screen opened
When I hit on  email Field <existingEmail>
And I hit on Reset Password screen  
Then Password reset message will display
Examples:
|existingEmail|
|Email|


@TC_SIGN5
Scenario: verify sign up button in sign in screen
When I hit on Sign up button
Then Sign up screen is displayed


