Feature: Revenue Calculator

  Scenario: Adjust slider and verify values
  
    Given I am on the FitPeo Homepage
    
    When I navigate to the Revenue Calculator Page
    
    And I scroll down to the Slider section
    
    When I adjust the slider to set its value to 820
    
    And I update the text field to 560
        
    When I select the CPT codes CPT-99091, CPT-99453, CPT-99454, and CPT-99474
    
    Then the Total Recurring Reimbursement should show the value $110,700