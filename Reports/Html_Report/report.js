$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/fitpeofeature/fitpeo.feature");
formatter.feature({
  "line": 1,
  "name": "Revenue Calculator",
  "description": "",
  "id": "revenue-calculator",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Adjust slider and verify values",
  "description": "",
  "id": "revenue-calculator;adjust-slider-and-verify-values",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the FitPeo Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Revenue Calculator Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I scroll down to the Slider section",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I adjust the slider to set its value to 820",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I update the text field to 560",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select the CPT codes CPT-99091, CPT-99453, CPT-99454, and CPT-99474",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the Total Recurring Reimbursement should show the value $110,700",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.i_am_on_the_FitPeo_Homepage()"
});
formatter.result({
  "duration": 1391689800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.i_navigate_to_the_Revenue_Calculator_Page()"
});
formatter.result({
  "duration": 471435700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.i_scroll_down_to_the_Slider_section()"
});
formatter.result({
  "duration": 89716100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "820",
      "offset": 40
    }
  ],
  "location": "stepdefinition.i_adjust_the_slider_to_set_its_value_to(int)"
});
formatter.result({
  "duration": 771550900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "560",
      "offset": 27
    }
  ],
  "location": "stepdefinition.i_update_the_text_field_to(int)"
});
formatter.result({
  "duration": 321558200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99091",
      "offset": 27
    },
    {
      "val": "99453",
      "offset": 38
    },
    {
      "val": "99454",
      "offset": 49
    },
    {
      "val": "99474",
      "offset": 64
    }
  ],
  "location": "stepdefinition.i_select_the_CPT_codes_CPT_CPT_CPT_and_CPT(int,int,int,int)"
});
formatter.result({
  "duration": 1433950900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "110",
      "offset": 57
    },
    {
      "val": "700",
      "offset": 61
    }
  ],
  "location": "stepdefinition.the_Total_Recurring_Reimbursement_should_show_the_value_$(int,int)"
});
formatter.result({
  "duration": 243871600,
  "status": "passed"
});
});