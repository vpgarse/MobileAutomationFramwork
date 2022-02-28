@staging
Feature: Sign up
Background:
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on My SG 
And I hit on Sign up
Then Registartion page is displayed
@TC_signup01
Scenario Outline: SIgn up screen
When I fill "<FirstName>", "<LastName>" ,"<Email>", "<Passsword>" and "<Zipcode>"
And I agree termsandconditions checkbox
And I hit on Createaccount
And I agree termsandconditions checkbox
Then My SG dahboard is displayed
Examples: 
|FirstName|LastName|Email|Passsword|Zipcode|
|firstname|lastname|email|password|zipcode|

@TC_Signup_02
Scenario Outline: Invaid sign up
When I fill "<FirstName>", "<LastName>" ,"<Email>", "<Passsword>" and "<Zipcode>"
#And I agree termsandconditions checkbox
And I hit on Createaccount
Then validation message is displayed
Examples: 
|FirstName|LastName|Email|Passsword|Zipcode|
|invalidfirstname1|invalidlastname1|invalidemail1|invalidpwd1|invalidzipcode1|
|invalidfirstname2|invalidlastname2|invalidemail2|invalidpwd2|invalidzipcode2|
|invalidfirstname3|invalidlastname3|invalidemail3|invalidpwd3|invalidzipcode3|
|invalidfirstname4|invalidlastname4|invalidemail4|invalidpwd4|invalidzipcode4|
|invalidfirstname5|invalidlastname5|invalidemail5|invalidpwd5|invalidzipcode5|
|invalidfirstname6|invalidlastname6|invalidemail6|invalidpwd6|invalidzipcode6|
|invalidfirstname7|invalidlastname7|invalidemail7|invalidpwd7|invalidzipcode7|
|invalidfirstname8|invalidlastname8|invalidemail8|invalidpwd8|invalidzipcode8|


#Scenario: verify referal code

Scenario: verify termsand conditions
And I hit on Termssandconditions link
Then termsandconditions page is displayed

@TC_SI_9
Scenario Outline: Already have an account
When I fill  email Field <existingEmail>
#And I agree termsandconditions checkbox
And I hit on Createaccount
Then email exits validataion message is displaying
And I hit on Login 
Then Sign in page is displayed
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
Examples:
|existingEmail|Email|Password|
|Email|Email|Password|

Scenario: close buttton on signup screen
And  I tap on back button
Then My SG Screen is displayed


