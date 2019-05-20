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

Mobile.startApplication('/Users/ini/Downloads/50.apk', true)

Mobile.tap(findTestObject('android.view.ViewGroup5'), GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('android.widget.EditText0'), 'inirubica@gmail.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1'), 'Password!2345678', 0)

Mobile.tap(findTestObject('android.view.ViewGroup4'), 10)

Mobile.delay(10)

Mobile.setText(findTestObject('android.widget.EditText0 (2)'), 'test-pixel', 10)

Mobile.tap(findTestObject('android.widget.ImageView3'), 10)

Mobile.waitForElementPresent(findTestObject('android.widget.ImageView2'), 10)

Mobile.delay(3)

Mobile.tap(findTestObject('android.widget.ImageView2'), 10)

Mobile.waitForElementPresent(findTestObject('android.widget.Button1 - OK'), 10)

Mobile.tap(findTestObject('android.widget.Button1 - OK'), GlobalVariable.G_LongTimeOut)

Mobile.tap(findTestObject('android.view.ViewGroup2'), 10)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('android.widget.TextView1 - Protected'), 'Protected')

Mobile.verifyElementText(findTestObject('android.widget.TextView17 - STATUS PROTECTED'), 'STATUS: PROTECTED')

Mobile.verifyElementText(findTestObject('android.widget.TextView18 - TURN OFF PROTECTION'), 'TURN OFF PROTECTION')

Mobile.tap(findTestObject('android.widget.TextView18 - TURN OFF PROTECTION'), 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('android.widget.TextView1 - Not Protected'), 'Not Protected')

Mobile.verifyElementText(findTestObject('android.widget.TextView17 - STATUS NOT PROTECTED'), 'STATUS: NOT PROTECTED')

Mobile.verifyElementText(findTestObject('android.widget.TextView18 - TURN ON PROTECTION'), 'TURN ON PROTECTION')

Mobile.tap(findTestObject('android.widget.TextView18 - TURN ON PROTECTION'), 0)

Mobile.closeApplication()

