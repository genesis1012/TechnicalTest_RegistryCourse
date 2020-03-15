#Author: heriberto-hg@hotmail.com
#Keywords Summary : LogIn


@LogIn
Feature: LogIn Users
  I want to log in with valid and invalid users to test the system validations

  Background: The user starts out on the login page
        Given the user is on home page

    Scenario Outline: The user enters a valid username and password, they must log in without a problem
         When Enter the userName <userName> and <password>
         Then Login <result> 

         Examples:
         |userName|password |result	|
         |TEST		|TEST			|True		|
         |TEST		|TEST			|Fail		|

##	Scenario: The user enters a valid username and password, they must log in without a problem
##       When Enter the userName "USER"
##       And Enter the password "PASS"
##       Then Login successful         
##    @LogInOnlyUser
##    Scenario: User enters only username, must not log in
##         When Enter the userName "USER"
##         Then Login fail
##        
##    @LogInOnlyPass
##    Scenario: User enters only password, must not log in
##         When Enter the password "PASS"
##         Then Login fail
##         
##    @LogInUserSucc
##    Scenario: The user enters a valid username and  invalid password, must not log in
##         When Enter the userName "USER"
##         And Enter the password "PASS"
##         Then Login fail
##         
##    @LogInPassSucc
##    Scenario: The user enters a invalid username and valid password, must not log in
##         When Enter the userName "USER"
##         And Enter the password "PASS"
##         Then Login successful
         