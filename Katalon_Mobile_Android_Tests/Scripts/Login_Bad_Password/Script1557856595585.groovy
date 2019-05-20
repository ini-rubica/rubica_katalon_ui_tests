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

Mobile.setText(findTestObject('android.widget.EditText0'), 'ryanrubica+portalauto@gmail.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1'), '123456', 0)

Mobile.tap(findTestObject('android.widget.ImageView2'), 0)

Mobile.delay(5)

// Get text of the Test Object
def message = Mobile.getText(findTestObject('android.widget.TextView2 - Unable to log in try again'), 1)

//Verify if displayed message is correct
Mobile.verifyEqual(message, 'Unable to log in, try again')

Mobile.closeApplication()

