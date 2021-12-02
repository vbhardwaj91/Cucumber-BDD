Feature: Verify Dashboard Page


Background:
Given : User is already on DashBoardPage using Password
|Password|
|HPECloudSTC2021|


Scenario: Verify Dashboard Page Header Label

Given User is on Dashboard Page
When User check the Header Label of Dashboard Page
Then Verify the Header Label of Dashboard Page "Dashboard"

Scenario: Verify the Number of Cards

Given User is on Dashboard Page
When User check the number of Cards
Then Verify the following Cards as shown
|My active subscriptions|
|Upcoming renewals|
|My trials / evals|
|My credits|
|Expired subscriptions|
And Verify the Cards Count as 5


Scenario: Verify Feature service Label is showing or not

Given User is on Dashboard Page
When User check the Feature Services 
Then Verify Features services section is showing or not with Label as "Featured Services"

