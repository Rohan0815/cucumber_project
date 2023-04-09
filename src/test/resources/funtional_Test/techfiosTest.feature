Feature: Change background color

Background:Open techfios application
Given I nevigate to techfios link

Scenario: Sky Blue Background
Given "Set SkyBlue Background" button exists
When I click on the button
Then The background color will change to sky blue

Scenario: Sky Blue Background
Given "Set White Background" button exists
When I click on the button
Then The background color will change to white