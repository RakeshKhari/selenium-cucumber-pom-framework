Feature: Cart Functionality

Scenario: Add Product To Cart

Given User is logged into SauceDemo
When User adds product to cart
And User opens cart page
Then Product should be visible inside cart