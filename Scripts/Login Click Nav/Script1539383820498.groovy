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

WebUI.setText(findTestObject('Page_Rubica/input__email'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Page_Rubica/input_Forgot Your Password_pas'), 'p4y+y39Ir5PMiJLQrHqmDw5aULBovMWX')

WebUI.click(findTestObject('Page_Rubica/button_Login'))

WebUI.setText(findTestObject('Page_Rubica/input__token'), CustomKeywords.'mfa.readMFA.getMFAToken'())

WebUI.click(findTestObject('Page_Rubica/button_Verify'))

WebUI.click(findTestObject('Page_Rubica/a_Users  Devices'))

WebUI.click(findTestObject('Page_Rubica/a_Billing'))

WebUI.click(findTestObject('Page_Rubica/a_Settings'))

WebUI.click(findTestObject('Page_Rubica/a_Your Settings'))

WebUI.click(findTestObject('Page_Rubica/a_Security'))

WebUI.click(findTestObject('Page_Rubica/a_Manage Users'))

WebUI.closeBrowser()

