Feature: Login Functionality

Scenario: Valid Login

Given User launches SauceDemo application
When User enters valid username and password
And User clicks login button
Then User should navigate to Products page


Scenario: Invalid Login

Given User launches SauceDemo application
When User enters invalid username and password
And User clicks login button
Then User should see login error message