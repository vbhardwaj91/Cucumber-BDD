Feature: Verify Login Functionality

Scenario: Verify User is able to do Login

Given : User is on Login Page
When : User enters Password as "HPECloudSTC2021"
And : User click on Submit
Then : User lands to Dashboard Page with expected title as "HPE GreenLake"
