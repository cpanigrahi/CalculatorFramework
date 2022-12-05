How to execute project - 
1- Right click on testng.xml file > Run As > TestNG Suite
2- Right click on pom.xml file > Run As > Maven test
3- Right click on TestNgRunner.java > Run As > TestNG Test
3- Right click on JunitRunner.java > Run As > JUnit Test

How to view the report-
ReportNg report is generated for the project
Refresh the project after execution > Navigate to test-output folder > html > index.html

Other Solutions
1- This framework is developed with page object design pattern. The another way to design this framework is using Page factory design pattern and with different frameworks
2- If this test was part of a much larger test set then we could separate the test cases by providing tags and execute.
3- Sometimes UI tests can fail unpredictable in that cases we can use different wait functionality for specific times.
