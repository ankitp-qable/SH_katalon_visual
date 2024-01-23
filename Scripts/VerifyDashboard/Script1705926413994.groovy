import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pyxis.lifeisgoodforlearner.com/login')

WebUI.setText(findTestObject('Object Repository/logout/input_email'), 'ankit@qable.io')

WebUI.setEncryptedText(findTestObject('Object Repository/logout/input_password'), 'GTlPq8sqzIAVcUdIXgqPeg==')

WebUI.click(findTestObject('Object Repository/logout/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/logout/button_Create Sequence'))

WebUI.click(findTestObject('Object Repository/logout/div_AP'))

WebUI.verifyElementVisible(findTestObject('Object Repository/logout/div_Log Out'))

WebUI.click(findTestObject('Object Repository/logout/div_Log Out'))

WebUI.verifyElementVisible(findTestObject('Object Repository/logout/span_Welcome Back to Saleshandy'))

