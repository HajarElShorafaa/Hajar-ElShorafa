# Hajar-ElShorafa


## Test cases covered by automation:


| Test Case ID	| Test Case name | Scenario type	| Steps |	Expected result |
| ----------- | ----------- |  ----------- | ----------- |----------- |
|	TC_Login_001	|Check placeholder|	Positive scenario |	1.open saucedemo 2.check input fields placeholder	|-“Username” for the first input field.-“Password” for the first input field.|
|	TC_Login_002	| Check no entry case	|Negative scenario	|1.open saucedemo 2.click on Login button without any entry |	- error icons in the two input fields - error text “Epic sadface:Username is required” |
|	TC_Login_003	|	Check login without username	|Negative scenario	|1.open saucedemo 2.enter “secret_sauce” in password field. 3.click Login button	|- error icons in the two input fields - error text “Epic sadface: Username is required”|
|	TC_Login_004	|	Check login without password	|Negative scenario	|1.open saucdemo 2.enter “standard_user” in username field.3.click Login button|	- error icons in the two input fields - error text “Epic sadface: Password is required”|
|	TC_Login_005	|	Check login with standard user	|Positive scenario	|1.open saucdemo 2.enter “standard_user” in username field. 3.enter “secret_sauce” in password field. 4.click Login button	|- URL changes to https://www.saucedemo.com/inventory.html - backpack product is displyed|
|	TC_Login_006	|Check login with locked user	|Negative scenario	|1.open saucdemo 2.enter “locked_out_user” in username field. 3.enter “secret_sauce” in password field. 4.click Login button	|- error icons in the two input fields - error text “Epic sadface: Sorry, this user has been locked out.”|
|	TC_Login_007	|Check login with problem user|	Positive scenario|	1.open saucdemo 2.enter “problem_user” in username field. 3.enter “secret_sauce” in password field. 4.click Login button	|- URL changes to https://www.saucedemo.com/inventory.html - dog picture is displayed instead of the backpack|
|	TC_Login_008	|Check Login with wrong credentials	|	Negative scenario	|	1.open saucdemo 2.enter “standard_user” in username field. 3.enter “any-password” in password field. 4.click Login button|	- error icons in the two input fields - error text “Epic sadface: Username and password do not match any user in this service”|

