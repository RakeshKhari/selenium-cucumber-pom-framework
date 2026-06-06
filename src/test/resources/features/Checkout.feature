Feature: Checkout Functionality

Scenario: Complete Checkout

Given User is logged into SauceDemo
And User adds product to cart
And User opens cart page
When User completes checkout process
Then Order should be placed successfully