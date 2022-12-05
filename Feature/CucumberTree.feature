Feature: Calculator Application

  Scenario: Verification of borrowing calculator functionality
    Given Open browser and Launch the appilcation
    When Perform the the calculator functionality with Valid data
    Then Verify the estimated the borrow value
    Then Click on startover button
    When Perform the Calculator functionality with only living expences
    Then Verify the callback message
    
    
    