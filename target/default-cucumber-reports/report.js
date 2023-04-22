$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SmokeTest.feature");
formatter.feature({
  "name": "Validating basic attributes on main pages",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Validate main page elements",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@ted"
    }
  ]
});
formatter.step({
  "name": "user open main page on browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.osdatahub.stepdefs.GeneralStepDefs.openMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user verifies \"main_page\" elements",
  "keyword": "And "
});
formatter.match({
  "location": "com.osdatahub.stepdefs.GeneralStepDefs.verifyPage(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027APIDashboard\u0027]\"}\n  (Session info: chrome\u003d112.0.5615.137)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ERTUG-MacBook-Pro.local\u0027, ip: \u00272a02:c7c:387d:4900:203d:fa0f:cb2b:f6bf%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002713.2\u0027, java.version: \u002711.0.15\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 112.0.5615.137, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: /var/folders/dk/ysrwyrq91sj...}, goog:chromeOptions: {debuggerAddress: localhost:50520}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ef74748d612be4640c7d8bea300203f9\n*** Element info: {Using\u003dname, value\u003dAPIDashboard}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\n\tat org.openqa.selenium.support.ByIdOrName.findElement(ByIdOrName.java:50)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\n\tat com.osdatahub.implementation.GeneralImpl.verifyPage(GeneralImpl.java:48)\n\tat com.osdatahub.stepdefs.GeneralStepDefs.verifyPage(GeneralStepDefs.java:21)\n\tat ✽.the user verifies \"main_page\" elements(file:///Users/ertugbatar/ideaprojects/osDataHubESAT/src/test/resources/features/SmokeTest.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "the user verifies \"docs_page_side_menu\" on \"docs\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.osdatahub.stepdefs.GeneralStepDefs.navigateAndVerify(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});