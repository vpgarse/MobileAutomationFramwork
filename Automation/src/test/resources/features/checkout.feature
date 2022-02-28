@staging
Feature: Checkout screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
#@TC_Check_1
#Scenario Outline: Bookingflow-> select a tee time->signin->Adding credit card
#And I tap on location field
#When I search the course by  <coursename>
#And I select Course by suggestion box
#And I tap on Players field
#Then players dropdwon  displayed with "Player count" title
#And I select the <player>
#And I hit on search button
##Then displayed <coursename> with tee times  listing
#And I click on tee time card
#Then "Booking Options" screen is displayed
#When I pick hole as <holes>
#Then  rate types are displayed
#When I click on any one of available rates
#Then provider screen is displayed
#And I click on provider tee time rate
#And I hit on Sign In
#Then sign in page is displayed
#When I log in with  <Email> and  <Password>
#And I select login
#Then checkout screen is displayed
#And I hit on add card button
#And I click on Credit or Debit Card 
#When I fill "<First>","<Last>", "<CardNumber>", "<Expirydate>", "<CVV>" and "<Zipcode>"
#And I hit on save
#When I accept the terms and conditions
#And I click on Book now
#Then  navigating to "Booking Successful" 
#Examples:
#|coursename|holes|Email|Password|player|First|Last|CardNumber|Expirydate|CVV|Zipcode|
#|Course|holes1|Email|Password|player7|chinni|k|5555555555554444|092020|678|567890|


@TC_Check_2
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
Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email|Password|player7|
|Course|holes2|Email1|Password1|player7|

@TC_Check_2
Scenario Outline:  Bookingflow->signin->  select a tee time 
And I tap on My SG 
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on  Home screen
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
Then checkout screen is displayed
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 
Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email|Password|player7|
|Course|holes2|Email|Password|player7|
|Course|holes2|Email1|Password1|player7|

@TC_check3
Scenario Outline: Bookingflow-> select a tee time ->new user signup 
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
#Then  rate types are displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
And I hit on Sign up
Then Registartion page is displayed
When I fill "<FirstName>", "<LastName>" ,"<Email>", "<Passsword>" and "<Zipcode>"
And I agree termsandconditions checkbox
And I hit on Createaccount
Then checkout screen is displayed
When I accept the terms and conditions
And I click on Book now
Then  errormessage "Please select payment method"  is displayed
Examples: 
|FirstName|LastName|Email|Passsword|Zipcode|coursename|holes|player|
|firstname|lastname|email|password|zipcode|Course|holes1|player7|
|firstname1|lastname1|email1|password1|zipcode1|Course|holes2|player7|

@TC_check_4
Scenario Outline: Bookingflow-> select a tee time ->new user signup 
And I tap on location field
When I search the course by  <coursename>
And I select Course by suggestion box
And I tap on Players field
Then players dropdwon  displayed with "Player count" title
And I select the <player>
And I hit on search button
And I hit on course 
Then courselisting page is displayed with teetimes
#Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
When I pick hole as <holes>
Then  rate types are displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
And I hit on Sign up
Then Registartion page is displayed
When I fill "<FirstName>", "<LastName>" ,"<Email>", "<Passsword>" and "<Zipcode>"
And I agree termsandconditions checkbox
And I hit on Createaccount
Then checkout screen is displayed
And I hit on add card button
And I click on Credit or Debit Card 
When I fill "<First>","<Last>", "<CardNumber>", "<Expirydate>", "<CVV>" and "<Zipcode>"
And I hit on save
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 
Examples: 
|FirstName|LastName|Email|Passsword|Zipcode|coursename|holes|player|First|Last|CardNumber|Expirydate|CVV|Zipcode|
|firstname1|lastname1|email1|password1|zipcode1|Course|holes1|player7|chinni|k|5555555555554444|092020|678|567890|


@TC_check4
Scenario Outline: Bookingflow->Signed up user -> select a tee time
And I tap on My SG 
And I hit on Sign up
Then Registartion page is displayed
When I fill "<FirstName>", "<LastName>" ,"<Email>", "<Passsword>" and "<Zipcode>"
And I agree termsandconditions checkbox
And I hit on Createaccount
Then My SG dahboard is displayed
And I hit on  Home screen
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
Then checkout screen is displayed
And I hit on add card button
And I click on Credit or Debit Card 
When I fill "<First>","<Last>", "<CardNumber>", "<Expirydate>", "<CVV>" and "<Zipcode>"
And I hit on save
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 

Examples: 
|FirstName|LastName|Email|Passsword|Zipcode|coursename|holes|player|First|Last|CardNumber|Expirydate|CVV|Zipcode|
#|firstname|lastname|email|password|zipcode|city1|holes1|player7|aswini|k|5555555555554444|092020|678|567890|
|firstname3|lastname3|email3|password3|zipcode3|Course|holes2|player7|aswini|k|5555555555554444|092020|678|567890|


@TC_check5
Scenario Outline: verify booking flow->select teetime->gooogle sign in (already email displayed)
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
When I hit on continue with google
Then ChooseAccount Page dispalyed
When I click on email which already displaying
Then checkout screen is displayed
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 
Examples:
|coursename|holes|player|
|Course|holes1|player7|
|Course|holes2|player7|

@TC_check6
Scenario Outline: verify booking flow-> gooogle sign in (already email displayed)->select teetime
And I tap on My SG 
When I hit on continue with google
Then ChooseAccount Page dispalyed
When I click on email which already displaying
Then My SG dahboard is displayed
And I hit on  Home screen
And I tap on location field
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
#Then displayed <coursename> with tee times  listing
And I click on tee time card
Then "Booking Options" screen is displayed
When I pick hole as <holes>
Then  rate types are displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
Then checkout screen is displayed
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 
Examples:
|coursename|holes|player|
|Course|holes1|player7|
|Course|holes2|player7|


@TC_check7
Scenario Outline: verify booking flow->select teetime-> facebook user email  already displayed in  login page
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
When I hit on continue with Facebook
When I tap on the email which already displaying
Then checkout screen is displayed
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 
Examples:
|coursename|holes|player|
|Course|holes1|player7|
|Course|holes2|player7|

@TC_check8
Scenario Outline:verify booking flow->facebook user email  already displayed in  login page->select teetime
And I tap on My SG 
When I hit on continue with Facebook
#Then facebook account page is displaying
#When I tap on the email which already displaying
Then My SG dahboard is displayed
And I hit on  Home screen
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
Then checkout screen is displayed
When I accept the terms and conditions
And I click on Book now
Then  navigating to "Booking Successful" 
Examples:
|coursename|holes|player|
|Course|holes1|player7|
|Course|holes2|player7|
#
#@TC_check9
#Scenario Outline: verify booking flow->facebook new accountlogin->selet a tee time
#And I tap on My SG 
#When I hit on continue with Facebook
#Then facebook account page is displaying
#And I click on Loginto another account
#When I type <phoneoremail> and <Password>
#And I hit on facebooklogin
#Then My SG dahboard is displayed
#And I hit on  Home screen
#And I tap on location field
#When I search the course by  <coursename>
#And I select Course by suggestion box
#And I hit on search button
##Then displayed <coursename> with tee times  listing
#And I click on tee time card
#Then "Booking Options" screen is displayed
#When I pick hole as <holes>
#Then  rate types are displayed
#When I click on any one of available rates
#Then provider screen is displayed
#And I click on provider tee time rate
#Then checkout screen is displayed
#When I accept the terms and conditions
#And I click on Book now
#Then  navigating to "Booking Successful" 
#Examples:
#|coursename|holes|phoneoremail|Password|
#|Course|holes1|email_g|password_g|
##|Course|holes2|email_g|password_g|
#
#
#@TC_check10
#Scenario Outline: verify booking flow->select teetime-> facebook new user login
#And I tap on location field
#When I search the course by  <coursename>
#And I select Course by suggestion box
#And I hit on search button
##Then displayed <coursename> with tee times  listing
#And I click on tee time card
#Then "Booking Options" screen is displayed
#When I pick hole as <holes>
#Then  rate types are displayed
#When I click on any one of available rates
#Then provider screen is displayed
#And I click on provider tee time rate
#When I hit on continue with Facebook
#Then checkout screen is displayed
#When I accept the terms and conditions
#And I click on Book now
#Then "Booking Successful" screen is displayed
#Examples:
#|coursename|holes|
#|Course|holes1|
#|Course|holes2|




@TC_check11
Scenario Outline:Verify checkout screen
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
And rate type prices also displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
#And provider rate is displayed
And I hit on Sign In 
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then checkout screen is displayed
Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email|Password|player7|
|Course|holes2|Email|Password|player7|




@TC_check12
Scenario Outline:verify green fee amount if user increment player count
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
And rate type prices also displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
#And provider rate is displayed
And I hit on Sign In 
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then checkout screen is displayed
#And players count and  green fee amount is displayed
When I hit on players count plus icon
Then Green fee amount is incremented
Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email|Password|player7|
|Course|holes2|Email|Password|player7|

@TC_check13
Scenario Outline:verify  green fee , taxes and total amount field
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
And rate type prices also displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
#And provider rate is displayed
And I hit on Sign In 
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then checkout screen is displayed
Then Green fee amount , Supremegolf fee , Estimated saletax , Total amount due and Total due now is displayed
Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email|Password|player7|
|Course|holes2|Email|Password|player7|



@TC_check15
Scenario Outline:verify  last 4 digits field
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
And rate type prices also displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
#And provider rate is displayed
And I hit on Sign In 
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then checkout screen is displayed
Then last four digits of card displayed
Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email|Password|player7|
|Course|holes2|Email|Password|player7|


@TC_check16
Scenario Outline:verify  change payment at checkout screen 
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
And rate type prices also displayed
When I click on any one of available rates
Then provider screen is displayed
And I click on provider tee time rate
#And provider rate is displayed
And I hit on Sign In 
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then checkout screen is displayed
Then last four digits of card displayed
And I hit on change  button
Then Payment methods screeen displayed
Examples:
|coursename|holes|Email|Password|player|
|Course|holes1|Email|Password|player7|
|Course|holes2|Email|Password|player7|




