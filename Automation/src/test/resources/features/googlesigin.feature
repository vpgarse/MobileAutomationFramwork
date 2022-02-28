@staging
Feature: Google Signin
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on My SG 
@TC_SIGn6
Scenario: verify gooogle sign in by account exists
When I hit on continue with google
Then ChooseAccount Page dispalyed
When I click on email which already displaying
Then My SG dahboard is displayed

@TC_SIGN7
Scenario Outline: Sign in  to supremegolf using exisiting Google account
When I hit on continue with google
Then ChooseAccount Page dispalyed
When I click on Use another account Page
#Then SignIn Page displayed
When I use google <Email> and click on Next
And I use google  <Password> and I click on Next
And I click on I agree button
Then My SG dahboard is displayed
Examples:
|Email|Password|
|email_g|password_g|

@TC_FB1
Scenario: Sign in with face book
When I hit on continue with Facebook
Then facebook account page is displaying
When I tap on the email which already displaying
Then My SG dahboard is displayed

@TC_FB1
Scenario: Already account opened in user device
When I hit on continue with Facebook
Then My SG dahboard is displayed

@TC_FB3
Scenario Outline: Login with another account
When I hit on continue with Facebook
Then facebook account page is displaying
And I click on Loginto another account
When I type <phoneoremail> and <Password>
And I hit on facebooklogin
Then My SG dahboard is displayed
Examples:
|phoneoremail|Password|
|email_g|password_g|

