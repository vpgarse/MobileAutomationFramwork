@staging
Feature: Payment methods
Background:
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on My SG 
And I hit on Sign In
Then sign in page is displayed
@TC_1
Scenario Outline: verify the payment 
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

@TC_2 
Scenario Outline:  verify add button
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
Then I hit on Add your first payment method 
Then Add payment method screeen is displayed
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

@TC_3
Scenario Outline:  verify add button
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

@TC_4
Scenario Outline:verify addcard page
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
And I click on Credit or Debit Card 
Then add card page is displayed
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

@TC_5
Scenario Outline:verify add card functionality
When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
And I click on Credit or Debit Card 
Then add card page is displayed
When I fill "<First>","<Last>", "<CardNumber>", "<Expirydate>", "<CVV>" and "<Zipcode>"
And I hit on save
Then card is added to Payment methods
Examples: 
|Email|Password|First|Last|CardNumber|Expirydate|CVV|Zipcode|
|Email|Password|aswini|k|5555555555554444|092020|678|567890|
|Email|Password|aswini|k|41111111111111111|0920201|6781|567890|

@TC_6
Scenario Outline: Invalid card details
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
And I click on Credit or Debit Card 
Then add card page is displayed
When I fill the invalid data of "<First>","<Last>", "<CardNumber>", "<Expirydate>" and "<CVV>" 
And I hit on save
Then captured error messages
Examples: 
|Email|Password|First|Last|CardNumber|Expirydate|CVV|
|koritalaaswini429@gmail.com|Aswini@550||||||

@TC_7
Scenario Outline: Google pay
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
And I click on  google pay
Then google pay is added as primary payment method
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|


@TC_8
Scenario Outline: Edit card method
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on  card listed in the Payment methods
Then Edit Payment method screen is displayed
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

@TC_9
Scenario Outline: edit card details
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on  card listed in the Payment methods
Then Edit Payment method screen is displayed
When I modified details  <First name>,<Last name>, <Expiration date> and <Zipcode>
And  I hit on Edit button
Then modified card details are saved
Examples: 
|Email|Password|First name|Last name|Expiration date|Zipcode|
|aswini.koritala@supremegolf.com|aswini@550|as|jk|09 2020|67890|
|aswini.koritala@supremegolf.com|aswini@550| &&&|   56767|09 2020|67890|
#|aswini.koritala@supremegolf.com|aswini@550|as|jk|09 2025|67890|

@TC_10
Scenario Outline:Delete card details
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on  card listed in the Payment methods
Then Edit Payment method screen is displayed
And I hit on delete card
Then card is removed from payment methods
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

@TC_11
Scenario Outline: verify the back button on Edit payment method
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on  card listed in the Payment methods
Then Edit Payment method screen is displayed
And  I tap on back button
Then Payment methods screeen displayed
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

#@TC_11
#Scenario Outline: verify the back button on Edit payment method

@TC_12
Scenario Outline:verify the invalid credit card scenario
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
And I click on Credit or Debit Card 
Then add card page is displayed
When I fill "<First>","<Last>", "<CardNumber>", "<Expirydate>", "<CVV>" and "<Zipcode>"
And I hit on save
Then  invlid card error message should display
Examples: 
|Email|Password|First|Last|CardNumber|Expirydate|CVV|Zipcode|
|aswini.koritala@supremegolf.com|aswini@550|aswini|k|5555555555555555|092020|678|567890|

@TC_13
Scenario Outline: veify save button 
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
And I click on Credit or Debit Card 
Then add card page is displayed
And I hit on save
Then captured error messages
Examples: 
|Email|Password|
|aswini.koritala@supremegolf.com|aswini@550|

@TC_14
Scenario Outline:verfy  zipcode by entering letters
When I log in with  "<Email>" and  "<Password>"
And I select login
Then My SG dahboard is displayed
And I hit on Payment Methods
Then Payment methods screeen displayed
And I click on Add button
Then Add payment method screeen is displayed
And I click on Credit or Debit Card 
Then add card page is displayed
When I fill the letters in  <zipcode> field
Then zipcode field displayed with letters
Examples: 
|Email|Password|zipcode|
|aswini.koritala@supremegolf.com|aswini@550|126789tyuii|
 