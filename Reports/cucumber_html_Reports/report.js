$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fbLogin.feature");
formatter.feature({
  "line": 1,
  "name": "fb1 Login scripts",
  "description": "",
  "id": "fb1-login-scripts",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Invalid fb1 login",
  "description": "",
  "id": "fb1-login-scripts;invalid-fb1-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i log into the fb",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the invalid login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "application \"Logs in\" successfully",
  "keyword": "And "
});
formatter.match({
  "location": "Com_Steps.login()"
});
formatter.result({
  "duration": 5391808608,
  "status": "passed"
});
formatter.match({
  "location": "Com_Steps.verify_invlid_login_page()"
});
formatter.result({
  "duration": 18512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logs in",
      "offset": 13
    }
  ],
  "location": "Com_Steps.application_successfully(String)"
});
formatter.result({
  "duration": 1238883,
  "status": "passed"
});
});