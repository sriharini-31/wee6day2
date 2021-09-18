Feature: MergeLead for LeafTaps application
Scenario Outline: TC001_MergeLead
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click crmsfa link
Given Click on Lead
Given Click on Merge Lead 
Given Merge Records 

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|