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

Mobile.tap(findTestObject('android.view.ViewGroup3'), 0)

Mobile.tap(findTestObject('android.widget.LinearLayout1'), 0)

Mobile.tap(findTestObject('android.widget.LinearLayout1'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - ACCEPT  CONTINUE'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - NO THANKS'), 0)

def rubica_website = Mobile.getText(findTestObject('android.widget.EditText2 - httpsmy.rubica.comcheckoutp310b8c5d-7462-4f6b-8498-6e738c6f1298'), 1)

Mobile.verifyMatch(rubica_website, 'https://my.rubica.com/checkout.*', true)

Mobile.closeApplication()

