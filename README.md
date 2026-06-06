# Selenium Cucumber POM Framework

## Tech Stack

* Java 17
* Selenium WebDriver 4
* TestNG
* Cucumber BDD
* Maven
* Extent Reports
* Selenium Grid
* GitHub Actions

## Framework Design

* Page Object Model (POM)
* Cucumber Feature Files
* TestNG Runner
* Screenshot on Failure
* Extent Reports

## Scenarios Covered

### Login.feature

1. Valid Login
2. Invalid Login

### Product.feature

3. Verify Product Count

### Cart.feature

4. Add Product To Cart

### Checkout.feature

5. Complete Checkout

## Run Tests

mvn clean test

## Run On Selenium Grid

mvn clean test -Dexecution=remote

## Reports

reports/ExtentReport.html

## Screenshots

screenshots/
