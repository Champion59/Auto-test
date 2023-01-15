Feature: Demo.nopcommerce Login Functionality 

Scenario Outline: Login into Demo.nopcommerce with valid credentials 

Given User navigates to "https://demo.nopcommerce.com" 
When User clicks on the Sign In Button 
And User enters "<email>" into the email feild
And User enters "<password>" into the password feild
And User clicks on final sign In Button
Then User should be able to access "https://www.demo.nopcommerce.com"

Examples: 
|email             |password   |
|persaudz@yahoo.com|champion|
