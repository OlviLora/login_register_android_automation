# login_register_android_automation
This project contains web automation built using Appium with UIAutomator2 with the Java programming language, integrated with Cucumber to define BDD steps in test cases. The project has been developed using Maven as the build tool.

## Features
The scenario in this web automation consists of 7 test cases:
1. [[POSITIVE] User Successfully Registered and Login to App](https://github.com/OlviLora/login_register_android_automation/blob/master/src/teast/resources/features/register_login_success.feature)
2. [[NEGATIVE] User Register with Empty Name](https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/resources/features/register_empty_name.feature)
3. [[NEGATIVE] User Register with Empty Password](https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/resources/features/register_empty_password.feature)
4. [[NEGATIVE] User Register with Invalid Email Format](https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/resources/features/register_invalid_email_format.feature)
5. [[NEGATIVE] User Register with Password doesn't match with Confirm Password](https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/resources/features/register_password_not_match.feature)
6. [NE[GATIVE] User Login with Invalid Email Format](https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/resources/features/login_invalid_email_format.feature)
7. [[NEGATIVE] User Login with Not Registered Email](https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/resources/features/login_not_register_email.feature)

## Prerequisites
- Java
- Appium Driver
- Appium Inspector
- UIAutomator2
- Emulator
- Android Studio
- Editor Intellij
- Git

## How to Run?
1. Clone the repository or unzipped the file.
```
git clone git@github.com:OlviLora/login_register_android_automation.git
```
2. Go to the repository automation and open in the Intellij Editor.
3. Add Dependency defined in pom.xml file by running script below to load all the dependency in local.
```
mvn clean install
```
4. Update the UDID (https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/java/org/example/base/BaseFunction.java#L13)
```
.setUdid("{udid_in_local}")
```
5. Update the APK path (https://github.com/OlviLora/login_register_android_automation/blob/master/src/test/java/org/example/base/BaseFunction.java#L14)
```
.setApp("{apk_file_path.apk}");
```
6. Set-up the capabilities in appium. Update the value based on configuration emulator running in local.<br />
<img width="1081" alt="Screen Shot 2023-09-12 at 00 10 10" src="https://github.com/OlviLora/login_register_android_automation/assets/11285853/8b6ce5ab-bea6-4ece-ab87-9c6b2ff36a27">
7. Run the scenario → Right click the each feature file `src/test/resources/features/*.feature` and select Run Feature.<br />
<img width="357" alt="Screen Shot 2023-09-12 at 00 11 51" src="https://github.com/OlviLora/login_register_android_automation/assets/11285853/3e03377f-1171-4f5d-a0e4-7cb1c9dad219"><br />
8. Test Automation is running → It will open the apps in emulator and running each scenarios.<br />
<img width="366" alt="Screen Shot 2023-09-12 at 00 15 16" src="https://github.com/OlviLora/login_register_android_automation/assets/11285853/6b57b2b5-f4d5-453c-9085-ded79e723e9f"><br />

