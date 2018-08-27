
Feature: account creation

@raja
Scenario Outline: Verification of account creation

Given application main screen
When user open savings account with cut_id "<username>" and operating_inst "<password>"



Examples:                      		

| username | password |		

|User1     |password1        |		

|User2     |password2        |		

|User3     |password3        |