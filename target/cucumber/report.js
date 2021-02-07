$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberJava\cucumberJava.feature');
formatter.feature({
  "line": 1,
  "name": "Tranca Jogatina",
  "description": "",
  "id": "tranca-jogatina",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open app and read texts",
  "description": "",
  "id": "tranca-jogatina;open-app-and-read-texts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The texts should appear in english",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberJava.basicTest()"
});
formatter.result({
  "duration": 12183883500,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.getTexts()"
});
formatter.result({
  "duration": 207387100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Click button",
  "description": "",
  "id": "tranca-jogatina;click-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Click in Play now button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "The text is in correct language",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click in two players button",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberJava.basicTest()"
});
formatter.result({
  "duration": 11175246800,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.clickPlay()"
});
formatter.result({
  "duration": 1011690600,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.readText()"
});
formatter.result({
  "duration": 36274900,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.clickPlayers()"
});
formatter.result({
  "duration": 132395600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Start a game",
  "description": "",
  "id": "tranca-jogatina;start-a-game",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click in Play now button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click in two players button",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberJava.basicTest()"
});
formatter.result({
  "duration": 11675191800,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.clickPlay()"
});
formatter.result({
  "duration": 857674800,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.clickPlayers()"
});
formatter.result({
  "duration": 105256300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Playing a Tutorial",
  "description": "",
  "id": "tranca-jogatina;playing-a-tutorial",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I open app",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Click in Play now button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click in two players button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Play tutorial",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberJava.basicTest()"
});
formatter.result({
  "duration": 11529448900,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.clickPlay()"
});
formatter.result({
  "duration": 968858500,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.clickPlayers()"
});
formatter.result({
  "duration": 104753900,
  "status": "passed"
});
formatter.match({
  "location": "CucumberJava.playTutorial()"
});
formatter.result({
  "duration": 31080934700,
  "status": "passed"
});
});