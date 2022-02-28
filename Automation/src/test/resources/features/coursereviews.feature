@staging
Feature: Course Reviews Screen
Background: 
Given open the application in mobile
Then Find your tee time page is displayed
And I tap on location field
@TC_CR_1
Scenario Outline:  verify Sort icon Course Reviews page
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on Sort icon
Then Sort by screen is displayed
Examples:
|coursename|
|Course|


#@CourseReviews
@TC_CR_2
Scenario Outline:  verify Most Recent button in Sort icon Course Reviews page
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on Sort icon
Then Sort by screen is displayed
And  hit on Most Recent button
Then Most recent review displayed
 Examples:
|coursename|
|Course|

#@CourseReviews
@TC_CR_3
Scenario Outline:  verify Most Favourable button in Sort icon Course Reviews page
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on Sort icon
Then Sort by screen is displayed
And  hit on Most Favourble  button
Then Most favourite review displayed
 Examples:
|coursename|
|Course|


@TC_CR_4
Scenario Outline:verify Most Critical button in sort icon in Course Reviews page
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on Sort icon
Then Sort by screen is displayed
And  hit on Most Critical  button
Then Most Critical review displayed
 Examples:
|coursename|
|Course|


@TC_CR_5
Scenario Outline:verify Most Helpful button in sort icon in Course Reviews page
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on Sort icon
Then Sort by screen is displayed
And  hit on Most Helpful  button
Then Most helpful review displayed
 Examples:
|coursename|
|Course|


@TC_CR_6
Scenario Outline:verify Most Established  button in sort icon in Course Reviews page
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on Sort icon
Then Sort by screen is displayed
And  hit on MostEstablished button
Then Most establishes review displayed
 Examples:
|coursename|
|Course|

@TC_CR_7
Scenario Outline:verify total rating of course
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
Then Overall rating is displayed of course
Examples:
|coursename|
|Course|


@TC_CR_8
Scenario Outline:Verify total review count
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
Then  course rating displayed 
Examples:
|coursename|
|Course|


@TC_CR_9
Scenario Outline:verify more button
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
 Examples:
|coursename|
|Course|


@TC_CR_10
Scenario Outline:verify yes button on more  option without sign in
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
And  I hit on yes
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then "Feedback already submitted for this course"
#Then error message is displayed
 Examples:
|coursename|Email|Password|
|Course|Email|Password|

@CourseReviews
@TC_CR_11
Scenario Outline: verify the  yes button message after sign in 
And I tap on My SG 
And I hit on Sign In
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on  Home screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
And  I hit on yes
Then "Feedback already submitted for this course"
Examples:
|coursename|Email|Password|
|Course|Email|Password|

@TC_CR_12
Scenario Outline:verify No button on more  option
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
And  I hit on No 
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then "Feedback already submitted for this course"
 Examples:
|coursename|Email|Password|
|Course|Email|Password|

@TC_CR_13
Scenario Outline: verify the no button after sign in 
And I tap on My SG 
And I hit on Sign In
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on  Home screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
And  I hit on No
Then "Feedback already submitted for this course"
Examples:
|coursename|Email|Password|
|Course|Email|Password|




@TC_CR_14
Scenario Outline:verify Report It button on more  option
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
And  I hit on Report It
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then "Your report has been submitted"
 Examples:
|coursename|Email|Password|
|Course|Email|Password|



@TC_CR_15
Scenario Outline: verify the report button after sign in 
And I tap on My SG 
And I hit on Sign In
 When I log in with  <Email> and  <Password>
And I select login
Then My SG dahboard is displayed
And I hit on  Home screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
And  I hit on Report It
Then "Your report has been submitted"
Examples:
|coursename|Email|Password|
|Course|Email|Password|



@TC_CR_16
Scenario Outline:verify less button on more  option
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I hit on more option
Then review card display
And  I hit on less
Then review will display in short
 Examples:
|coursename|
|Course|

@TC_CR_17
Scenario Outline: Verify Write a review option for new user
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I tap on Write A review  option
And I hit on Sign up
When I fill "<FirstName>", "<LastName>" ,"<Email>", "<Passsword>" and "<Zipcode>"
And I agree termsandconditions checkbox
And I hit on Createaccount
#And I hit on  Home screen
And I tap on Write A review  option
And I hit on stars to rate the course
And I have added the  <title>
And I hit on Post a Review
Then "Your review was posted succcessfully. Thank you!"  is displayed
#Then review  displayed on course reviews screen 
Examples: 
|coursename|FirstName|LastName|Email|Passsword|Zipcode|title|
|Course|firstname|lastname|email|password|zipcode|Good|




@TC_CR_19
Scenario Outline:verify write a review option  without Sign in 
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
#Then displayed <coursename> with tee times  listing
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I tap on Write A review  option
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then I verify the write reveiw option is "True"
And I tap on Write A review  option
And I hit on stars to rate the course
And I have added the  <title>
And I hit on Post a Review
Then "Your review was posted succcessfully. Thank you!"  is displayed
Examples:
|coursename|Email|Password|title|
|Course2|Email|Password|good|

@TC_CR_20
Scenario Outline:verify write a review option  without Sign in 
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I tap on Write A review  option
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
Then I verify the write reveiw option is "False"
Then review has already submitted
Examples:
|coursename|Email|Password|
|Course|Email|Password|

@TC_CR_21
Scenario Outline: verify the  Write a reviwew screen
When I search the course by  <coursename>
And I select Course by suggestion box
And I hit on search button
And I click on info icon
Then course info screen is displayed
Then I tap on review option
Then review screen is displayed
And I tap on Write A review  option
And I hit on Sign In
Then sign in page is displayed
When I log in with  <Email> and  <Password>
And I select login
And I tap on Write A review  option
And I hit on stars to rate the course
And I have added the  <title>
And I hit on Post a Review
Then "Your review was posted succcessfully. Thank you!"  is displayed
Then I hit on Ok 
Then review is displayed
Examples:
|coursename|Email|Password|title|
|Course3|Email2|Password2|Goodexperience|





