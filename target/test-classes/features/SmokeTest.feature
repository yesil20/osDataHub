@Smoke
Feature: Validating basic attributes on main pages

  @ted
  Scenario: Validate main page elements
    Given user open main page on browser
    And the user verifies "main_page" elements
    When the user verifies "docs_page_side_menu" on "docs" page
