import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.setText(findTestObject('Page_Login  Salesforce/input_username'), 'sindhuja.e@mstsolutions.com')

WebUI.setText(findTestObject('Page_Login  Salesforce/input_pw'), 'S!ndhuja1219')

WebUI.click(findTestObject('Page_Login  Salesforce/input_Login'))

WebUI.click(findTestObject('Page_Home Page  Salesforce - Develo/a_Leads'))

WebUI.click(findTestObject('Page_Leads Home  Salesforce - Devel/a_Close'))

WebUI.click(findTestObject('Page_Leads Home  Salesforce - Devel/input_new'))

WebUI.click(findTestObject('Page_New Lead Select Lead Record Ty/input_save'))

WebUI.setText(findTestObject('Page_Lead Edit New Lead  Salesforce/input_name_lastlea2'), 'sai')

WebUI.setText(findTestObject('Page_Lead Edit New Lead  Salesforce/input_lea3'), 'ram')

WebUI.click(findTestObject('Page_Lead Edit New Lead  Salesforce/input_save'))

WebUI.closeBrowser()

