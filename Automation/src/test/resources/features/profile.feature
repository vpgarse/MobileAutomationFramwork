@staging
Feature: MySG-Profile
  Background: 
    Given open the application in mobile
Then Find your tee time page is displayed
   And I tap on My SG
  And I hit on Sign In
  Scenario Outline: 
 When I log in with  <Email> and  <Password>
  And I select login
  Then My SG dahboard is displayed
  Then hit on View Profile  button
Then user profile is displayed
Examples: 
|Email|Password|
|sgad@yopmail.com|Welcome@01|


  

  @TC_PR_3
  Scenario Outline: verify  tell us about yourself  button
 When I log in with  <Email> and  <Password>
  And I select login
  Then My SG dahboard is displayed
  Then hit on View Profile  button
Then user profile is displayed
    Then Player stats are displayed    
Examples: 
|Email|Password|
|Email|Password|

  @TC_PR_4
  Scenario Outline: verify Edit  button
 When I log in with  <Email> and  <Password>
 And I select login
 Then My SG dahboard is displayed
 Then hit on View Profile  button
Then user profile is displayed
  And I hit on edit button
  Then Edit profile screen is displayed
  Examples: 
|Email|Password|
|Email|Password|

  @TC_PR_5
 Scenario Outline: verify skilllevel  button
 When I log in with  <Email> and  <Password>
 And I select login
 Then My SG dahboard is displayed
 Then hit on View Profile  button
Then user profile is displayed
 And I hit on edit button
 And I hit on Skill level
 And I select  <Skill level>
 Then selected <Skill level> is displayed in skilllevel field
    Examples: 
     	|Email|Password| Skill level  |
    	|Email|Password|Beginner    |
 	 	|Email|Password  | Intermediate |
  	 	|Email|Password   | Advanced     |
		|Email|Password| Expert      |

  @TC_PR_6
  Scenario Outline: verify frequency  button
   When I log in with  <Email> and  <Password>
 And I select login
 Then My SG dahboard is displayed
 Then hit on View Profile  button
Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    And I hit on Frequency
    And I pick a  <Frequency> value from dropdown
    Then selected <Frequency>  is displayed  in frequency field

    Examples: 
       |Email|Password|  Frequency  |
    |Email|Password| Few times a week |
 	|Email|Password | Once a week   |
  	|Email|Password   | Once a month  |
  	|Email|Password    | Once every three months |
    |Email|Password  |Twice a year         |
    |Email|Password| Once a year             |

  @TC_PR_7
  Scenario Outline: verify handicap level
     When I log in with  <Email> and  <Password>
 And I select login
 Then My SG dahboard is displayed
 Then hit on View Profile  button
Then user profile is displayed
    And I hit on edit button
     Then Edit profile screen is displayed
    And I hit on Handicap
When I enter the handicap field with  <handicapvalue>  
    And I click on update handicap
    Then handicap level displayed in handicap field

    Examples: 
    |Email|Password |handicapvalue|
   |Email|Password|  handicap    |

  
  @TC_PR_8
  Scenario Outline: verify Focus drop down
     When I log in with  <Email> and  <Password>
 And I select login
 Then My SG dahboard is displayed
 Then hit on View Profile  button
Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    And I hit on Focus
    And I have selected <options>
    Then selected focus <options> is dispalyed in focus field

    Examples: 
    |Email|Password | options    |
    |Email|Password| Recreation |
 	|Email|Password| Business   |
	|Email|Password| Pro        |
  	|Email|Password| Sport      |

  @TC_PR_9
  Scenario Outline: verify Location field
       When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    Then I hit on location field
    Then zipcode  should display
    Examples: 
	|Email|Password|
	|Email|Password|
	
	
@TC_56
Scenario Outline: verify location field with zipcode 
When I hit on Sign up button
Then Sign up screen is displayed
When I fill "<FirstName>", "<LastName>" ,"<Email>", "<Passsword>" and "<Zipcode>"
And I agree termsandconditions checkbox
And I hit on Createaccount
Then My SG dahboard is displayed
Then hit on View Profile  button
Then user profile is displayed
   And I hit on edit button
   Then Edit profile screen is displayed
    Then I hit on location field
    Then displayed <Zipcode> in location field
    
Examples: 
|FirstName|LastName|Email|Passsword|Zipcode|
|firstname|lastname|email|password|zipcode|
	
@TC_57
Scenario Outline: edit location field
     When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    Then I hit on location field
    Then zipcode  should display
#	And I click on  zipcode close button
	When I enter in zipcode field with <newzipcode> 
#	And I click on update location button 
#	Then location is updated 
	
Examples: 
	|Email|Password|newzipcode|
	|Email|Password|zip_code|
	
	@TC_58
Scenario Outline: edit location field
     When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    Then I hit on location field
    Then zipcode  should display
	And I click on  zipcode close button
	Then I enter new <Zipcode>
Examples: 
	|Email|Password|
	|Email|Password|
	

  @TC_PR_10
  Scenario Outline: verify change photo   
    When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    When I hit on plus icon in edit account screen 
    Then "Change photo from" from screen is dipslayed
    Then I have choosen <optionofphoto>
    Then selected photo screen is displayed
    Examples: 
|Email|Password|optionofphoto |
|Email|Password| Camera  |
|Email|Password| Gallery |

  @TC_PR_11
  Scenario Outline: verify  dropdown
         When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    And I hit on Skill level
    #Then skill levels are displayed
    And I select  <Skill level>
  Then selected <Skill level> is displayed in skilllevel field
    And I hit on Frequency
    And I pick a  <Frequency> value from dropdown
   Then selected <Frequency>  is displayed  in frequency field    
    And I hit on Focus
    And I have selected <options>
Then selected focus <options> is dispalyed in focus field
    Then hit on Done button
    Then Player stats are displayed

    Examples: 
     |Email|Password | Skill level  | Frequency        | options    |
     |Email|Password| Begineer     | Fews times a week    | Recreation |
 |Email|Password | Intermediate | Once a week          | Business   |
    |Email|Password  | Advanced     | Once a month          | Pro        |
 |Email|Password| Expert       | Once every three months  | Pro        |
    |Email|Password | Begineer     | Twice a year            | Sport      |
       |Email|Password| Intermediate | Once a year                | Business   |

  @TC_PR_12
  Scenario Outline: verify cancel button on skill level
         When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    And I hit on Skill level
    And I hit on cancel
#    Then captured account name
  Examples:
|Email|Password|
|Email|Password|
    

  

  @TC_PR_13
  Scenario Outline: verify cancel button on frequency
         When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    And I hit on Frequency
    And I hit on cancel
#   Then captured account name
  Examples:
|Email|Password|
|Email|Password|
  
#
#  @TC_PR_14
#  Scenario: verify cancel button on handicap level
#    And I hit on edit button
#    Then Edit profile screen is displayed
#    And I hit on Handicap
#    #Then handicap list dropdown is displayed
#    And I hit on cancel
#    Then Edit profile screen is displayed

  @TC_PR_15
  Scenario Outline: verify cancel button on focus
         When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    And I hit on Focus
    And I hit on cancel
      Examples:
|Email|Password|
|Email|Password|
#    Then captured account name

  

  @TC_PR_16
  Scenario Outline: verify back button on edit profile
         When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    When I hit on back button
    Then Profile screen is dispalyed
      Examples:
|Email|Password|
|Email|Password|


      
    @rate_type  
    @TC_PR_17
    Scenario Outline: verify password screen in edit profile
           When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    When I click on Password screen
    Then Password update screen  is opened
      Examples:
|Email|Password|
|Email|Password|
    
    @rate_type
      @TC_PR_18      
  Scenario Outline:verify password screen in edit profile
         When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
    And I hit on edit button
    Then Edit profile screen is displayed
    When I click on Password screen
    Then Password update screen  is opened
And I fill in  password screen with  <current password>,<New Password> and <ConfirmNewPassword> values
    And I hit on Update Password
    Then Password is updated with new changes
      Examples: 
|Email|Password|current password|New Password|ConfirmNewPassword|
|Email|Password |currentpwd|newpwd|confirmpwd|
      
      
   @TC_PR_19   
    Scenario Outline:update email
           When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
   And I hit on edit button
    Then Edit profile screen is displayed
    And I click on Email to edit the email
   And I click on <email field> to edit
   And I click on update email
   Examples: 
      |email field|
     |email|
      
      @rate_type
  @TC_PR_20
 Scenario Outline:update Name on profile screen
        When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
 And I hit on edit button
 Then Edit profile screen is displayed
 And I click on Name to edit the name
 When I fill the name field with <fname> and <lname>
 And I hit  update the name
 Then updated name is displayed in profile screen
     Examples: 
   |Email|Password |fname|lname|
     |Email|Password  |firstname|lastname|
      
  @TC_PR_21
Scenario Outline: verify logout 
       When I log in with  <Email> and  <Password>
 	And I select login
 	Then My SG dahboard is displayed
 	Then hit on View Profile  button
	Then user profile is displayed
And I hit logout
Then "Are you sure you want to sign out?" message is displayed
And  I tap on yes
Then "Register For Free" is displayed on my SG screen 
      Examples:
|Email|Password|
|Email|Password|
    
