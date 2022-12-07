@Tests
Feature: Buy product at saucedemo.com
  As a user of saucedemo.com
  I enter saucedemo.com
  To buy a product

  Background: Login to page saucedemo
    Given The "user" enters the site
    And User wants to login in saucedemo page


  @Successful_Purchase
  Scenario Outline: successful purchase of a product
    When Buy a product
      |product|firstname|lastname|postalCode|
      |<product>|<firstname>|<lastname>|<postalCode>|
    Then Verify that the purchase successful "THANK YOU FOR YOUR ORDER"
    Examples:
      |product|firstname|lastname|postalCode|
      ##@externaldata@./src/test/resources/datadriven/product_test_data.xlsx@Datos@1


  @Cancel_Purchase
  Scenario Outline: Cancel purchase
    When Buy a product
      |product|firstname|lastname|postalCode|
      |<product>|<firstname>|<lastname>|<postalCode>|
    And Cancel purchase and remove products
      |product|firstname|lastname|postalCode|
      |<product>|<firstname>|<lastname>|<postalCode>|
    Then Verify that the Products is not status "Remove"
    Examples:
      |product|firstname|lastname|postalCode|
      ##@externaldata@./src/test/resources/datadriven/product_test_data.xlsx@Datos@2

   




