Feature: Add new row


Scenario Outline: User can add a new row

  Given User is on Web tables page

  When User clicks 'Add' button

  And User inputs <firstname>, <lastname> and <email>

  And User inputs <age>,<salary> and <department>

  And User clicks submit

  Then User added a new table row

  Examples:
    | firstname | lastname     | email  | age  | salary | department |
    | "Tamara"  | "Velickovic" | "tamara.devet@gmail.com" | "30" | "100"| "QA" |
    | "Marko"   | "Markovic"   | "marko@mail.com" | "33"| "200"| "Analyst"|
