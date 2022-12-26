Feature: Create Lead 

Background:
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on LoginButton
Then Verify that login successful


Scenario Outline:
Given Click on CRMSFA Link
And Click on Leads Button
And Click on CreateLead Button
And Enter the CompanyName as <cname>
And Enter the FristName as <fname>
And Enter the LastName as <lname>
And Click on Submit Button
And Verify Page

Examples:
|cname|fname|lname|
|'TestLeaf'|'Dilip'|'Kumar'|
|'TestLeaf'|'Priyadharshini'|'S'|
