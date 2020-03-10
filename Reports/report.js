$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/One.feature");
formatter.feature({
  "name": "To validating Search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify the Search Functionality with Valid Credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the products name \"\u003cproducts\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click enter button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "products"
      ]
    },
    {
      "cells": [
        "nike air max"
      ]
    },
    {
      "cells": [
        "puma shoes"
      ]
    },
    {
      "cells": [
        "addidas shoes"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify the Search Functionality with Valid Credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.user_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the products name \"nike air max\"",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_enters_the_products_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click enter button",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.click_enter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the Search Functionality with Valid Credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.user_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the products name \"puma shoes\"",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_enters_the_products_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click enter button",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.click_enter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the Search Functionality with Valid Credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.user_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the products name \"addidas shoes\"",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_enters_the_products_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click enter button",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.click_enter_button()"
});
formatter.result({
  "status": "passed"
});
});