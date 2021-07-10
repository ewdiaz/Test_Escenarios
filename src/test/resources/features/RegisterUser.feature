Feature: Regiter practice

  @FakerSmoketest
  Scenario: fill each field of register with Faker data
    Given that a web user to register in toolsqa
    When he fills all the requested fields in the form register with faker
    Then he should see it a message using faker.

  @ExcelSmoketest
  Scenario: fill each field of register with Faker data
    Given that a web user to register in toolsqa
    When he fills all the requested fields in the form register with excel
    Then he should see it a message using excel.

  @PropertiesSmoketest
  Scenario: fill each field of register with Faker data
    Given that a web user to register in toolsqa
    When he fills all the requested fields in the form register with properties
    Then he should see it a message using properties.