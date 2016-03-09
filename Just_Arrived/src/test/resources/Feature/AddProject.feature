Feature: Add Project
As a User
I need to add a project to dashboard

Scenario: Add Project
Given the user is on project dashboard page
When user click on Add project button
And switch to Add project popup window
And select Project type from dropdown
And enter <input_field>

Examples:
|input_field|
|ProjectName|
|EM|
|DOE|
|IterationLength|
|StoryBoard|

Scenario Outline: Add project details and Save/Cancel
Given the user is on Add project form
And click <Save-Cancel>
Then project should get saved to project list on dashboard

Examples:
|Save-Cancel|
|Save|
|Cancel|



