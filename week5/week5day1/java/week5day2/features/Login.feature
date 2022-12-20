Feature: Login To Leaftap Applications

@smoke
Scenario: Login for positive data

And Enter the username as 'DemoCsr'
And Enter the password as 'crmsfa'
When Click on LoginButton
Then Verify that login successful


@dilip 
Scenario: Login for negative data

And Enter the username as 'Democsr'
And Enter the password as 'crmsfa'
When Click on LoginButton
Then Verify that login successful

@testleaf
Scenario: Login for positive or negative data

And Enter the username as 'DemoCsr'
And Enter the password as 'crmfa'
When Click on LoginButton
Then Verify that login successful



#
#Scenario: Login for Negative data
#Given launch the browse and url and maximize
#And Enter the username as 'Democsr'
#And Enter the password as 'crmfa'
#When Click on LoginButton
#But Verify that login notsuccessful
#
#
#
#
#
#Background:
#Given launch the browse and url and maximize
#
#Scenario Outline:
#And Enter the username as <username>
#And Enter the password as <password>
#When Click on LoginButton
#Then Verify that login successful or not
#But Verify that login successful1 or not
#Examples:
#|username|password|
#|'Democsr2'|'crmsfa'|
#|'Demo'|'crmsfa'|
#
#
#Scenario Outline:
#And Enter the username as <username>
#And Enter the password as <password>
#When Click on LoginButton
#Then Verify that login successful or not
#But Verify that login successful1 or not
#
#Examples:
#|username|password|
#|'Democsr'|'crmsfa'|
#|'Demo'|'crmsfa'|










