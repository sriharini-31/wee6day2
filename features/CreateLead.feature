Feature: CreateLead for LeafTaps application
@functional  
Scenario Outline: TC001_CreateLead test using positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click crmsfa link
Given Click on Create Lead button
Given Enter company name as 'TestLeaf'
Given Enter firstname as 'Hema'
Given Enter lastname as 'Priya'
Given Enter phone number as '9878'
Given Click on submit button

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|

@regression
Scenario Outline: TC002_CreateLead test using positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click crmsfa link
Given Click on Create Lead button
Given Enter company name as 'TestLeaf'
Given Enter firstname as 'Hema'
Given Enter lastname as 'Priya'
Given Enter phone number as '9878'
Given Click on submit button

Examples:
|username|password|
|'DemoCSR'|'crmsfa'|

@smoke @sanity
Scenario: TC002_CreteLead test using negative credential
Given Enter the username as 'Demo123'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed

@sanity
Scenario: Click login without credential
When Click on Login button
But Error message should be displayed