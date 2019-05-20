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

Mobile.tap(findTestObject('android.view.ViewGroup5'), 0)

// Get text of the Test Object
def help_content = Mobile.getText(findTestObject('android.widget.TextView3 - NEED HELP'), 1)

//Verify if the content present on the app is correct
Mobile.verifyEqual(help_content, 'NEED HELP? ')

// Get text of the Test Object
def contact_content = Mobile.getText(findTestObject('android.widget.TextView4 - CONTACT US'), 1)

//Verify if the content present on the app is correct
Mobile.verifyEqual(contact_content, 'CONTACT US')

// Get text of the Test Object
def version_number = Mobile.getText(findTestObject('android.widget.TextView5 - 3.1.0  1.4.36'), 1)

//Verify if the content present on the app is correct
Mobile.verifyEqual(version_number, '3.1.0 / 1.4.36')

Mobile.closeApplication()

