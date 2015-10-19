$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fbLogin.feature");
formatter.feature({
  "line": 1,
  "name": "fb1 Login scripts",
  "description": "",
  "id": "fb1-login-scripts",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5161903330,
  "status": "passed"
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
  "duration": 476972654,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\u0027Log In1\u0027]\"}\nCommand duration or timeout: 19 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027411b314\u0027, time: \u00272015-07-30 03:03:16\u0027\nSystem info: host: \u0027Ravikumars-MacBook-Pro.local\u0027, ip: \u0027192.168.1.109\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d41.0.2, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: e821d408-78a7-8642-83bc-b9bb86357b5f\n*** Element info: {Using\u003dxpath, value\u003d//input[@value\u003d\u0027Log In1\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:358)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat com.pages.login.Loginpage.doLogin(Loginpage.java:36)\n\tat com.cucumber.Steps.Com_Steps.login(Com_Steps.java:23)\n\tat ✽.Given i log into the fb(fbLogin.feature:5)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\u0027Log In1\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.47.1\u0027, revision: \u0027411b314\u0027, time: \u00272015-07-30 03:03:16\u0027\nSystem info: host: \u0027Ravikumars-MacBook-Pro.local\u0027, ip: \u0027192.168.1.109\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/zs/s94hzcwd0rjfk0db1h3036cc0000gn/T/anonymous7201464236260894088webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10667)\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///var/folders/zs/s94hzcwd0rjfk0db1h3036cc0000gn/T/anonymous7201464236260894088webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10676)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///var/folders/zs/s94hzcwd0rjfk0db1h3036cc0000gn/T/anonymous7201464236260894088webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12643)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///var/folders/zs/s94hzcwd0rjfk0db1h3036cc0000gn/T/anonymous7201464236260894088webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12648)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///var/folders/zs/s94hzcwd0rjfk0db1h3036cc0000gn/T/anonymous7201464236260894088webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12590)\n",
  "status": "failed"
});
formatter.match({
  "location": "Com_Steps.verify_invlid_login_page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.write("Current Page URL is https://www.facebook.com/?_rdr\u003dp");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 217945935,
  "status": "passed"
});
});