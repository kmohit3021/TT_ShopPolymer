import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link mensTshirts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_mensTshirts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link mensTshirts.png')

"Step 3: Click on link product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_product'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link product.png')

"Step 4: Select option with input value from select quantitySize (size)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel]), select_quantitySize)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Select option with input value from select quantitySize size.png')

"Step 5: Select option with input value from select quantitySize (quantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel_1]), select_quantitySize_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Select option with input value from select quantitySize quantity.png')

"Step 6: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button addToCart.png')

"Step 7: Click on link viewCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_viewCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link viewCart.png')

"Step 8: Click on link checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link checkout.png')

"Step 9: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input email.png')

"Step 10: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input email.png')

"Step 11: Click on input accountPhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_accountPhone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on input accountPhone.png')

"Step 12: Click on input shipAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipAddress'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input shipAddress.png')

"Step 13: Click on input shipCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipCity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on input shipCity.png')

"Step 14: Click on input shipState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipState'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on input shipState.png')

"Step 15: Click on input shipZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipZip'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input shipZip.png')

"Step 16: Select option with input value from select shipCountry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_shipCountry'), select_shipCountry)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Select option with input value from select shipCountry.png')

"Step 17: Click on input cardholderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardholderName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input cardholderName.png')

"Step 18: Click on shopMdDecorator cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/shopMdDecorator_cardNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on shopMdDecorator cardNumber.png')

"Step 19: Click on input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on input cardNumber.png')

"Step 20: Enter input value in input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'), input_cardNumber)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Enter input value in input cardNumber.png')

"Step 21: Select option with input value from select expiryMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_expiryMonth'), select_expiryMonth)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Select option with input value from select expiryMonth.png')

"Step 22: Select option with input value from select ccExpYear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_ccExpYear'), select_ccExpYear)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Select option with input value from select ccExpYear.png')

"Step 23: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cvv'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on input cvv.png')

"Step 24: Enter input value in input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cvv'), input_cvv)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Enter input value in input cvv.png')

"Step 25: Click on input placeOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on input placeOrder.png')

"Step 26: Click on p demoCheckoutComplete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/p_demoCheckoutComplete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on p demoCheckoutComplete.png')

"Step 27: Click on p demoCheckoutComplete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/p_demoCheckoutComplete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on p demoCheckoutComplete.png')

"Step 28: Click on p demoCheckoutComplete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/p_demoCheckoutComplete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on p demoCheckoutComplete.png')

"Step 29: Click on link finish"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on link finish.png')

"Step 30: Click on link mensTshirts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_mensTshirts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on link mensTshirts.png')

"Step 31: Click on link mensTshirts2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_mensTshirts2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on link mensTshirts2.png')

"Step 32: Click on link product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_product'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on link product.png')

"Step 33: Select option with input value from select quantitySize (size)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel_2]), select_quantitySize_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Select option with input value from select quantitySize size.png')

"Step 34: Select option with input value from select quantitySize (quantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel_3]), select_quantitySize_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Select option with input value from select quantitySize quantity.png')

"Step 35: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on button addToCart.png')

"Step 36: Click on link viewCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_viewCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on link viewCart.png')

"Step 37: Click on link checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on link checkout.png')

"Step 38: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on input email.png')

"Step 39: Click on input accountPhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_accountPhone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on input accountPhone.png')

"Step 40: Click on input shipAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipAddress'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on input shipAddress.png')

"Step 41: Click on input shipCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipCity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on input shipCity.png')

"Step 42: Click on div cityLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/div_cityLabel'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on div cityLabel.png')

"Step 43: Click on input shipCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipCity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on input shipCity.png')

"Step 44: Click on div stateProvinceZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/div_stateProvinceZip'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on div stateProvinceZip.png')

"Step 45: Click on input shipState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipState'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on input shipState.png')

"Step 46: Click on input shipZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipZip'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on input shipZip.png')

"Step 47: Select option with input value from select shipCountry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_shipCountry'), select_shipCountry_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Select option with input value from select shipCountry.png')

"Step 48: Click on input cardholderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardholderName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Click on input cardholderName.png')

"Step 49: Click on input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Click on input cardNumber.png')

"Step 50: Enter input value in input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'), input_cardNumber_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Enter input value in input cardNumber.png')

"Step 51: Select option with input value from select expiryMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_expiryMonth'), select_expiryMonth_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Select option with input value from select expiryMonth.png')

"Step 52: Select option with input value from select ccExpYear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_ccExpYear'), select_ccExpYear_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 52-Select option with input value from select ccExpYear.png')

"Step 53: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cvv'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 53-Click on input cvv.png')

"Step 54: Enter input value in input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cvv'), input_cvv_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 54-Enter input value in input cvv.png')

"Step 55: Click on input placeOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 55-Click on input placeOrder.png')

"Step 56: Click on link finish"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 56-Click on link finish.png')

"Step 57: Click on link mensTshirts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_mensTshirts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 57-Click on link mensTshirts.png')

"Step 58: Click on link product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_product'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 58-Click on link product.png')

"Step 59: Select option with input value from select quantitySize (size)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel_4]), select_quantitySize_4)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 59-Select option with input value from select quantitySize size.png')

"Step 60: Select option with input value from select quantitySize (quantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel_5]), select_quantitySize_5)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 60-Select option with input value from select quantitySize quantity.png')

"Step 61: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 61-Click on button addToCart.png')

"Step 62: Click on link viewCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_viewCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 62-Click on link viewCart.png')

"Step 63: Click on link checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 63-Click on link checkout.png')

"Step 64: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 64-Click on input email.png')

"Step 65: Click on input accountPhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_accountPhone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 65-Click on input accountPhone.png')

"Step 66: Click on input shipAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipAddress'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 66-Click on input shipAddress.png')

"Step 67: Click on input shipCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipCity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 67-Click on input shipCity.png')

"Step 68: Click on input shipState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipState'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 68-Click on input shipState.png')

"Step 69: Click on input shipZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipZip'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 69-Click on input shipZip.png')

"Step 70: Select option with input value from select shipCountry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_shipCountry'), select_shipCountry_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 70-Select option with input value from select shipCountry.png')

"Step 71: Click on input cardholderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardholderName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 71-Click on input cardholderName.png')

"Step 72: Click on div cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/div_cardNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 72-Click on div cardNumber.png')

"Step 73: Click on input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 73-Click on input cardNumber.png')

"Step 74: Enter input value in input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'), input_cardNumber_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 74-Enter input value in input cardNumber.png')

"Step 75: Select option with input value from select expiryMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_expiryMonth'), select_expiryMonth_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 75-Select option with input value from select expiryMonth.png')

"Step 76: Select option with input value from select ccExpYear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_ccExpYear'), select_ccExpYear_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 76-Select option with input value from select ccExpYear.png')

"Step 77: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cvv'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 77-Click on input cvv.png')

"Step 78: Enter input value in input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cvv'), input_cvv_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 78-Enter input value in input cvv.png')

"Step 79: Click on input placeOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 79-Click on input placeOrder.png')

"Step 80: Click on link finish"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 80-Click on link finish.png')

"Step 81: Click on link mensTshirts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_mensTshirts'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 81-Click on link mensTshirts.png')

"Step 82: Click on link product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_product'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 82-Click on link product.png')

"Step 83: Select option with input value from select quantitySize (size)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel_6]), select_quantitySize_6)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 83-Select option with input value from select quantitySize size.png')

"Step 84: Select option with input value from select quantitySize (quantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Dynamic Objects/Page_home/select_quantitySize', ['select_quantitySize_internalLabel': select_quantitySize_internalLabel_7]), select_quantitySize_7)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 84-Select option with input value from select quantitySize quantity.png')

"Step 85: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 85-Click on button addToCart.png')

"Step 86: Click on link viewCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_viewCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 86-Click on link viewCart.png')

"Step 87: Click on link checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 87-Click on link checkout.png')

"Step 88: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 88-Click on input email.png')

"Step 89: Click on input accountPhone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_accountPhone'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 89-Click on input accountPhone.png')

"Step 90: Click on input shipAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipAddress'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 90-Click on input shipAddress.png')

"Step 91: Click on input shipCity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipCity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 91-Click on input shipCity.png')

"Step 92: Click on input shipState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipState'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 92-Click on input shipState.png')

"Step 93: Click on input shipZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_shipZip'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 93-Click on input shipZip.png')

"Step 94: Select option with input value from select shipCountry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_shipCountry'), select_shipCountry_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 94-Select option with input value from select shipCountry.png')

"Step 95: Click on input cardholderName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardholderName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 95-Click on input cardholderName.png')

"Step 96: Click on input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 96-Click on input cardNumber.png')

"Step 97: Enter input value in input cardNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cardNumber'), input_cardNumber_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 97-Enter input value in input cardNumber.png')

"Step 98: Select option with input value from select expiryMonth"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_expiryMonth'), select_expiryMonth_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 98-Select option with input value from select expiryMonth.png')

"Step 99: Select option with input value from select ccExpYear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/QA/Page_home/select_ccExpYear'), select_ccExpYear_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 99-Select option with input value from select ccExpYear.png')

"Step 100: Click on input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_cvv'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 100-Click on input cvv.png')

"Step 101: Enter input value in input cvv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/QA/Page_home/input_cvv'), input_cvv_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 101-Enter input value in input cvv.png')

"Step 102: Click on input placeOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/input_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 102-Click on input placeOrder.png')

"Step 103: Click on link finish -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_home/link_finish'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 103-Click on link finish - Navigate to page .png')

"Step 104: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Multiple Checkout Processes for Mens T Shirts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}