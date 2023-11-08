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

ResponseGetProduct = WS.sendRequest(findTestObject('Object Repository/DummyJSON/Get All Products'))

WS.verifyResponseStatusCode(ResponseGetProduct, 200)

WS.verifyElementPropertyValue(ResponseGetProduct, 'total', '100')

WS.verifyElementPropertyValue(ResponseGetProduct, 'limit', '30')

limitProducts = WS.getElementPropertyValue(ResponseGetProduct, 'limit')

for (i = 0; i < limitProducts; i++) {
    productId = WS.getElementPropertyValue(ResponseGetProduct, "products[$i].id")

    productName = WS.getElementPropertyValue(ResponseGetProduct, "products[$i].name")

    productPrice = WS.getElementPropertyValue(ResponseGetProduct, "products[$i].price")

    WS.verifyElementPropertyValue(ResponseGetProduct, "products[$i].id", productId)

    WS.verifyElementPropertyValue(ResponseGetProduct, "products[$i].name", productName)

    WS.verifyElementPropertyValue(ResponseGetProduct, "products[$i].price", productPrice)
}

ResponseGetSingleProduct = WS.sendRequest(findTestObject('DummyJSON/Get Single Product', [('numProduct') : GlobalVariable.numProduct]))

WS.verifyResponseStatusCode(ResponseGetSingleProduct, 200)

WS.verifyElementPropertyValue(ResponseGetSingleProduct, 'id', GlobalVariable.numProduct)

if(GlobalVariable.numProduct == 1) {
	WS.verifyElementPropertyValue(ResponseGetSingleProduct, 'title', GlobalVariable.titleProduct1)
} else if(GlobalVariable.numProduct == 2) {
	WS.verifyElementPropertyValue(ResponseGetSingleProduct, 'title', GlobalVariable.titleProduct2)
} else {
	WS.verifyElementPropertyValue(ResponseGetSingleProduct, 'title', GlobalVariable.titleProduct3)
}
