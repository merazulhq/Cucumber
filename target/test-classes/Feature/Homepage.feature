Feature:


Scenario: successfull loging with valid credential
Given Userlunch chrome browser
When user opens url "http://admin-demo.nopcommerce.com/loging"
And User enter Email as "admin@yourstore.com" and Password as "admin"
And Click on loging 
Then Page Title should be "Dashbord / nopcommerce administration"
When User click on log out link 
Then Page title should be "your store. Loging"
And close browser



