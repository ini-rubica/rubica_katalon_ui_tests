import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

Mobile.delay(3)

Mobile.tap(findTestObject('android.view.ViewGroup2'), 0)

Mobile.tap(findTestObject('android.view.ViewGroup3'), 0)

Mobile.tap(findTestObject('android.widget.TextView1 - Ask Rubica'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - Security Expert Advice'), 0)

Mobile.tap(findTestObject('android.view.ViewGroup5 (2)'), 0)

Mobile.tap(findTestObject('android.widget.TextView3 - Help with my Service'), 0)

Mobile.tap(findTestObject('android.view.ViewGroup5 (2)'), 0)

Mobile.tap(findTestObject('android.widget.TextView4 - Rubica Overview'), 0)

Mobile.tap(findTestObject('android.view.ViewGroup5 (2)'), 0)

Mobile.tap(findTestObject('android.widget.TextView6 - Application Features'), 0)

Mobile.tap(findTestObject('android.view.ViewGroup5 (2)'), 0)

Mobile.tap(findTestObject('android.widget.TextView7 - How It Works (Basic)'), 0)

Mobile.tap(findTestObject('android.view.ViewGroup5 (2)'), 0)

Mobile.tap(findTestObject('android.widget.TextView8 - NEED HELP'), 0)

Mobile.tap(findTestObject('android.widget.TextView9 - CALL US'), 0)

Mobile.closeApplication()

