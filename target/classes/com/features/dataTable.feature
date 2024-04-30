Feature: User Registration

Scenario: User registration with different data
    When User enters following user details
        | First Name    | Last Name   | Email            | Phone  | City      | Contact Person | Contact Email  | Contact Phone | Contact Address |
        | naveen        | automation  | nav@gmail.com    | 99999  | Bangalore | tom peter      | tom@gmail.com | 99999         | London          |
        | lisa          | dsouza      | lisa@gmail.com   | 8887777| SFO       |                |                |               |                 |
    Then user registration should be successful
