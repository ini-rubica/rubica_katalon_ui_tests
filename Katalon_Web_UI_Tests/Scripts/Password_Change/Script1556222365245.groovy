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

WebUI.click(findTestObject('Page_Rubica/span_Billing_caret'))

WebUI.click(findTestObject('Page_Rubica/a_Change Password'))

WebUI.setEncryptedText(findTestObject('Page_Rubica/input__current_password'), 'p4y+y39Ir5PMiJLQrHqmDw5aULBovMWX')

WebUI.setEncryptedText(findTestObject('Page_Rubica/input__password'), 'p4y+y39Ir5PMiJLQrHqmD3gCqiE7FGJU')

WebUI.setEncryptedText(findTestObject('Page_Rubica/input__password_confirmation'), 'p4y+y39Ir5PMiJLQrHqmD3gCqiE7FGJU')

WebUI.click(findTestObject('Page_Rubica/span_Update'))

WebUI.delay(2)

WebUI.verifyTextPresent('Your password has been updated!', false)

WebUI.click(findTestObject('Page_Rubica/span_Billing_caret'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Rubica/a_Logout'))

WebUI.setText(username, GlobalVariable.Username)

WebUI.setEncryptedText(password, 'p4y+y39Ir5PMiJLQrHqmD3gCqiE7FGJU')

WebUI.click(findTestObject('Page_Rubica/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Rubica/input__token'), CustomKeywords.'mfa.readMFA.getMFAToken'())

WebUI.click(findTestObject('Object Repository/Page_Rubica/button_Verify'))

WebUI.click(findTestObject('Page_Rubica/a_Settings'))

WebUI.click(findTestObject('Page_Rubica/a_Change Password'))

WebUI.setEncryptedText(findTestObject('Page_Rubica/input__current_password'), 'p4y+y39Ir5PMiJLQrHqmD3gCqiE7FGJU')

WebUI.setEncryptedText(findTestObject('Page_Rubica/input__password'), 'p4y+y39Ir5PMiJLQrHqmDw5aULBovMWX')

WebUI.setEncryptedText(findTestObject('Page_Rubica/input__password_confirmation'), 'p4y+y39Ir5PMiJLQrHqmDw5aULBovMWX')

WebUI.click(findTestObject('Page_Rubica/button_Update (1)'))

WebUI.delay(3)

WebUI.verifyTextPresent('Your password has been updated!', false)

WebUI.click(findTestObject('Page_Rubica/a_Settings'))

WebUI.click(findTestObject('Page_Rubica/a_Logout'))

WebUI.closeBrowser()

