import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

username = findTestObject('Page_Rubica/input__email')

WebUI.setText(username, GlobalVariable.Username)

password = findTestObject('Page_Rubica/input_Forgot Your Password_password')

WebUI.setEncryptedText(password, 'p4y+y39Ir5PMiJLQrHqmDw5aULBovMWX')

WebUI.click(findTestObject('Page_Rubica/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__token'), CustomKeywords.'mfa.readMFA.getMFAToken'())

WebUI.click(findTestObject('Object Repository/Page_Rubica/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Rubica/a_Billing'))

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control (1)'), '4000056655665556')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_1 (1)'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_2 (1)'), '06')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_3 (1)'), '06')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_4 (1)'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_5 (1)'), '20')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_6 (1)'), '202')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_7 (1)'), '2020')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_8 (1)'), '2020')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_9 (1)'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_10 (1)'), '18')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_11 (1)'), '189')

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__form-control_12 (1)'), '189')

WebUI.click(findTestObject('Object Repository/Page_Rubica/span_Update (2)'))

WebUI.delay(6)

WebUI.verifyTextPresent('Your billing information has been updated.', false)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Rubica/span_Current Card                                                5556'))

WebUI.click(findTestObject('Page_Rubica/a_Settings'))

WebUI.click(findTestObject('Page_Rubica/a_Logout'))

WebUI.closeBrowser()

