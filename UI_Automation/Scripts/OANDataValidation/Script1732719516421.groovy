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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForAngularLoad(GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_IntegratedDataService/button.AcceptAdditionalCookies'))

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Page_IntegratedDataService/Img.IntegratedDataService'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_IntegratedDataService/Lnk.AvailableData'))

WebUI.waitForAngularLoad(700)

WebUI.click(findTestObject('Page_DataSet/span_CouncilTaxPropertyAttributesDataInEnglandAndWalesIndexed'))

WebUI.waitForElementPresent(findTestObject('Page_CouncilTaxProperty/h1.DatasetResourceName'), GlobalVariable.TimeOut)

WebUI.verifyElementText(findTestObject('Page_CouncilTaxProperty/h1.DatasetResourceName'), findTestData('CouncilTaxPropertyData').getValue(
        2, 1))

WebUI.verifyElementText(findTestObject('Page_CouncilTaxProperty/span.Summary'), findTestData('CouncilTaxPropertyData').getValue(
        2, 2))

WebUI.verifyElementText(findTestObject('Page_CouncilTaxProperty/paragraph.Description'), findTestData('CouncilTaxPropertyData').getValue(
        2, 4))

def strTemporalcoverage = WebUI.getText(findTestObject('Page_AboutThisPage/Span.AboutPage'))
if (strTemporalcoverage.contains(findTestData('CouncilTaxPropertyData').getValue(2, 11))) {
    println('Temporal coverage verification is successful')
}

WebUI.verifyElementPresent(findTestObject('Page_AboutThisPage/Span.AboutPage'), 1000)

def strDataSetTheme = WebUI.getText(findTestObject('Page_AboutThisPage/Span.AboutPage'))

if (strDataSetTheme.contains(findTestData('CouncilTaxPropertyData').getValue(2, 7))) {
    println('DataSet Theme verification is successful')
}

def strSearchKeyword = WebUI.getText(findTestObject('Page_AboutThisPage/Span.AboutPage'))

if (strSearchKeyword.contains(findTestData('CouncilTaxPropertyData').getValue(2, 3))) {
    println('Search Keyword verification is successful')
}

def strDataCreator = WebUI.getText(findTestObject('Page_AboutThisPage/Span.AboutPage'))

if (strDataCreator.contains(findTestData('CouncilTaxPropertyData').getValue(2, 14))) {
    println('Data creator verification is successful')
}

def strFrequency = WebUI.getText(findTestObject('Page_AboutThisPage/Span.AboutPage'))

if (strFrequency.contains(findTestData('CouncilTaxPropertyData').getValue(2, 12))) {
    println('Frequency verification is successful')
}

def strRestrictionsAccess = WebUI.getText(findTestObject('Page_AboutThisPage/Span.AboutPage'))

if (strRestrictionsAccess.contains(findTestData('CouncilTaxPropertyData').getValue(2, 18))) {
    println('Restrictions for access verification is successful')
}

def strProjectApproval = WebUI.getText(findTestObject('Page_AboutThisPage/Span.AboutPage'))

if (strProjectApproval.contains(findTestData('CouncilTaxPropertyData').getValue(2, 21))) {
    println('Project approval verification is successful')
}

WebUI.click(findTestObject('Page_MetaData/lnk.Metadata'))

WebUI.waitForElementPresent(findTestObject('Page_MetaData/section.Metadata'), GlobalVariable.TimeOut)

def strGeographiCoverage = WebUI.getText(findTestObject('Page_MetaData/section.Metadata'))

if (strGeographiCoverage.contains(findTestData('CouncilTaxPropertyData').getValue(2, 10))) {
    println('Geographic coverage verification is successful')
}

def strGeographicLevel = WebUI.getText(findTestObject('Page_MetaData/section.Metadata'))

if (strGeographicLevel.contains(findTestData('CouncilTaxPropertyData').getValue(2, 13))) {
    println('Geographic Level verification is successful')
}

def strLicensingStatus = WebUI.getText(findTestObject('Page_MetaData/section.Metadata'))

if (strLicensingStatus.contains(findTestData('CouncilTaxPropertyData').getValue(2, 16))) {
    println('Licensing status verification is successful')
}

def strDisclosureControl = WebUI.getText(findTestObject('Page_MetaData/section.Metadata'))

if (strDisclosureControl.contains(findTestData('CouncilTaxPropertyData').getValue(2, 17))) {
    println('Disclosure Control verification is successful')
}

def strResearchOutputs = WebUI.getText(findTestObject('Page_MetaData/section.Metadata'))

if (strResearchOutputs.contains(findTestData('CouncilTaxPropertyData').getValue(2, 19))) {
    println('Research Outputs verification is successful')
}

def strResearchDisclaimer = WebUI.getText(findTestObject('Page_MetaData/section.Metadata'))

if (strResearchDisclaimer.contains(findTestData('CouncilTaxPropertyData').getValue(2, 21))) {
    println('Research Disclaimer verification is successful')
}

def strProvenance = WebUI.getText(findTestObject('Page_MetaData/section.Metadata'))

if (strProvenance.contains(findTestData('CouncilTaxPropertyData').getValue(2, 23))) {
    println('Provenance verification is successful')
}

WebUI.closeBrowser()

