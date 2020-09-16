$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PagintionOnKeywordSearch.feature");
formatter.feature({
  "name": "Verify pagination on pages after keyword search on QAVendors portal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "QAVendors pagination verification after keyword search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@pagination"
    }
  ]
});
formatter.step({
  "name": "user navigates to the QAVendors App",
  "keyword": "Given "
});
formatter.step({
  "name": "user verify the title \"Top and Best qa testing outsourcing companies - Qavendors.com\" in the app",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters \"\u003ckeyword\u003e\" in the keyword search box",
  "keyword": "When "
});
formatter.step({
  "name": "user presses Enter key",
  "keyword": "And "
});
formatter.step({
  "name": "user verify the title \"QA Testing Vendors - Find \u0026 Compare QA Vendors Professionals\" in the app",
  "keyword": "Then "
});
formatter.step({
  "name": "user embed the \"result page\" screenshot in the report",
  "keyword": "And "
});
formatter.step({
  "name": "page should display number of records shown on page with total number of records",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on next button in pagination till last record is shown and take screenshot for every page",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on previous button in pagination till first record is shown",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword"
      ]
    },
    {
      "cells": [
        "testing"
      ]
    },
    {
      "cells": [
        "software"
      ]
    },
    {
      "cells": [
        "technologies"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is \"firefox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.CucumberHooks.browser_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "QAVendors pagination verification after keyword search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@pagination"
    }
  ]
});
formatter.step({
  "name": "user navigates to the QAVendors App",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.openQAVendorsApp()"
});
formatter.write("Navigated to https://qavendors.com");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the title \"Top and Best qa testing outsourcing companies - Qavendors.com\" in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DREAMBOX\u0027, ip: \u0027192.168.29.126\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200831163820, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 7560, moz:profile: C:\\Users\\DreamBook\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d0a73562-05a2-4756-ae4e-3619d625aa7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.controls.ObjectsControl.takeScreenshot(ObjectsControl.java:344)\r\n\tat com.controls.ObjectsControl.verifyPageTitle(ObjectsControl.java:72)\r\n\tat com.pages.CommonPage.pageVerify(CommonPage.java:27)\r\n\tat com.stepDefinition.SilverUserRegistrationSteps.verifyPageTitle(SilverUserRegistrationSteps.java:37)\r\n\tat ✽.user verify the title \"Top and Best qa testing outsourcing companies - Qavendors.com\" in the app(file:///D:/BestWorkspace2020/QAVendorsProject/src/test/resources/features/PagintionOnKeywordSearch.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters \"testing\" in the keyword search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.enterKeywordSearch(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user presses Enter key",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.userPressesEnterKey()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verify the title \"QA Testing Vendors - Find \u0026 Compare QA Vendors Professionals\" in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user embed the \"result page\" screenshot in the report",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.HeaderVerifySteps.embedScreenshot(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page should display number of records shown on page with total number of records",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.displayRecordsOnPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button in pagination till last record is shown and take screenshot for every page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.clickPaginationNextButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on previous button in pagination till first record is shown",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.clickPaginationPreviousButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DREAMBOX\u0027, ip: \u0027192.168.29.126\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200831163820, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 7560, moz:profile: C:\\Users\\DreamBook\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d0a73562-05a2-4756-ae4e-3619d625aa7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:694)\r\n\tat com.stepDefinition.CucumberHooks.executeAtEndOfScenario(CucumberHooks.java:72)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is \"firefox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.CucumberHooks.browser_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "QAVendors pagination verification after keyword search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@pagination"
    }
  ]
});
formatter.step({
  "name": "user navigates to the QAVendors App",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.openQAVendorsApp()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DREAMBOX\u0027, ip: \u0027192.168.29.126\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200831163820, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 7560, moz:profile: C:\\Users\\DreamBook\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d0a73562-05a2-4756-ae4e-3619d625aa7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.controls.ObjectsControl.navigateTo(ObjectsControl.java:101)\r\n\tat com.pages.CommonPage.navigateToQAVendors(CommonPage.java:23)\r\n\tat com.stepDefinition.SilverUserRegistrationSteps.openQAVendorsApp(SilverUserRegistrationSteps.java:32)\r\n\tat ✽.user navigates to the QAVendors App(file:///D:/BestWorkspace2020/QAVendorsProject/src/test/resources/features/PagintionOnKeywordSearch.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user verify the title \"Top and Best qa testing outsourcing companies - Qavendors.com\" in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"software\" in the keyword search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.enterKeywordSearch(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user presses Enter key",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.userPressesEnterKey()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verify the title \"QA Testing Vendors - Find \u0026 Compare QA Vendors Professionals\" in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user embed the \"result page\" screenshot in the report",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.HeaderVerifySteps.embedScreenshot(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page should display number of records shown on page with total number of records",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.displayRecordsOnPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button in pagination till last record is shown and take screenshot for every page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.clickPaginationNextButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on previous button in pagination till first record is shown",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.clickPaginationPreviousButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DREAMBOX\u0027, ip: \u0027192.168.29.126\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200831163820, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 7560, moz:profile: C:\\Users\\DreamBook\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d0a73562-05a2-4756-ae4e-3619d625aa7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:694)\r\n\tat com.stepDefinition.CucumberHooks.executeAtEndOfScenario(CucumberHooks.java:72)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is \"firefox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.CucumberHooks.browser_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "QAVendors pagination verification after keyword search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@pagination"
    }
  ]
});
formatter.step({
  "name": "user navigates to the QAVendors App",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.openQAVendorsApp()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DREAMBOX\u0027, ip: \u0027192.168.29.126\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200831163820, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 7560, moz:profile: C:\\Users\\DreamBook\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d0a73562-05a2-4756-ae4e-3619d625aa7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.controls.ObjectsControl.navigateTo(ObjectsControl.java:101)\r\n\tat com.pages.CommonPage.navigateToQAVendors(CommonPage.java:23)\r\n\tat com.stepDefinition.SilverUserRegistrationSteps.openQAVendorsApp(SilverUserRegistrationSteps.java:32)\r\n\tat ✽.user navigates to the QAVendors App(file:///D:/BestWorkspace2020/QAVendorsProject/src/test/resources/features/PagintionOnKeywordSearch.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user verify the title \"Top and Best qa testing outsourcing companies - Qavendors.com\" in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"technologies\" in the keyword search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.enterKeywordSearch(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user presses Enter key",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.userPressesEnterKey()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verify the title \"QA Testing Vendors - Find \u0026 Compare QA Vendors Professionals\" in the app",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.verifyPageTitle(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user embed the \"result page\" screenshot in the report",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.HeaderVerifySteps.embedScreenshot(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page should display number of records shown on page with total number of records",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.displayRecordsOnPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button in pagination till last record is shown and take screenshot for every page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.clickPaginationNextButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on previous button in pagination till first record is shown",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.PaginationAndKeywordSteps.clickPaginationPreviousButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DREAMBOX\u0027, ip: \u0027192.168.29.126\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 80.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200831163820, moz:geckodriverVersion: 0.27.0, moz:headless: false, moz:processID: 7560, moz:profile: C:\\Users\\DreamBook\\AppData\\..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d0a73562-05a2-4756-ae4e-3619d625aa7f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:694)\r\n\tat com.stepDefinition.CucumberHooks.executeAtEndOfScenario(CucumberHooks.java:72)\r\n",
  "status": "failed"
});
formatter.uri("file:src/test/resources/features/VerifyQAVendorsHeaders.feature");
formatter.feature({
  "name": "Verify Headers and sub headers on QAVendors portal",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.CucumberHooks.browser_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "QAVendors Header Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@headers"
    }
  ]
});
formatter.step({
  "name": "user navigates to the QAVendors App",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.SilverUserRegistrationSteps.openQAVendorsApp()"
});
