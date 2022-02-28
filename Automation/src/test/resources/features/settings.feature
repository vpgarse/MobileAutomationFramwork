@staging
Feature: Settings
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
@TC_Se_1
Scenario Outline: verify settings screen
And I tap on My SG 
And I hit on Sign In
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on Settings
Then settings screen is displayed
Examples: 
|Email|Password|
|Email|Password|

@TC_Se_2
Scenario Outline: verify User agreement  screen
And I tap on My SG 
And I hit on Sign In
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on Settings
Then settings screen is displayed
And I hit on User Agreement
#Then user agreement static page is displayed
Examples: 
|Email|Password|
|Email|Password|

@TC_Se_3
Scenario Outline: verify privacy policy page
And I tap on My SG 
And I hit on Sign In
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on Settings
Then settings screen is displayed
And I hit on Privacy policy
#Then privacy policy static page is displayed
Examples: 
|Email|Password|
|Email|Password|

@TC_Se_4
Scenario Outline: verify Help &FAQ page
And I tap on My SG 
And I hit on Sign In
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on Settings
Then settings screen is displayed
And I hit on HelpandFAQ's
#Then FAQ's page is displayed
Examples: 
|Email|Password|
|Email|Password|



