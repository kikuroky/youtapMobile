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

Mobile.startExistingApplication('com.youtap.indo.merchant.sit')

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button - Izinkan'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.ClosePopupBanner'), 5)

//Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button - Saat aplikasi digunakan'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/LoginPage/android.widget.PhoneNumberField'), '6281293320979', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/LoginPage/android.widget.Button - Kirim OTP'), 5)

Mobile.tap(findTestObject('Object Repository/LoginPage/android.widget.Button - Kirim OTP'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/LoginPage/android.widget.FirstIDXOTP'), 5)

Mobile.setText(findTestObject('Object Repository/LoginPage/android.widget.FirstIDXOTP'), '123456', 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Homepage/android.widget.Image - profile'), 5)

Mobile.closeApplication()

