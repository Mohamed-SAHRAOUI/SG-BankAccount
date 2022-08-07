# SG-BankAccount
Think of your personal bank account experience When in doubt, go for the simplest solution Requirements

        - Deposit and Withdrawal

        - Account statement (date, amount, balance)

        - Statement printing

 User Stories

* US 1:

           In order to save money

           As a bank client

           I want to make a deposit in my account

* US 2:

          In order to retrieve some or all of my savings

          As a bank client

          I want to make a withdrawal from my account

* US 3:

          In order to check my operations

          As a bank client

          I want to see the history (operation, date, amount, balance) of my operations
          
          
# Working method
I used TDD approach : Write tests First before start coding:

          should_increase_balance_when_make_deposit()
          
          deposit_amount_should_be_positive()
          
          should_calculate_balance_when_make_deposit_and_withdraw()
          
          withdraw_amount_should_be_positive()
          
          verify_the_statement_printing_is_correct()
          
