Feature: QaclikAcdamy login funtionality
@smoke1
Scenario: positive test validating
Given Intialize the browser with chrome
And navigate to "http://www.qaclickacademy.com/" site
And click on log in button and land on secure signin page
When user enters "krishchy2014@gmail.com" and "123456" and logs in
Then verify that user is succesfully loged in
Then user close the browser
@smoke
Scenario Outline: positive test validating

Given Intialize the browser with chrome
And navigate to "http://www.qaclickacademy.com/" site
And click on log in button and land on secure signin page
When user enter <username> and <password> and logs in
Then verify that user is succesfully loged in
Then user close the browser
Examples:
|username              ||password|
|krishchy2014@gmail.com||123456  |
