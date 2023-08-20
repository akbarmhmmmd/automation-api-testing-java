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

ResponseAddBook = WS.sendRequest(findTestObject('BookShelf/Add Book with Complete Data'))

bookId = WS.getElementPropertyValue(ResponseAddBook, 'data.bookId')

ResponseGetBooks = WS.sendRequest(findTestObject('BookShelf/Get All Books'))

WS.verifyResponseStatusCode(ResponseGetBooks, 200)

WS.verifyElementPropertyValue(ResponseGetBooks, 'status', 'success')

bookId_1 = WS.getElementPropertyValue(ResponseGetBooks, 'data.books[0].id')

WS.verifyElementPropertyValue(ResponseGetBooks, 'data.books[0].id', bookId_1)

WS.verifyElementPropertyValue(ResponseGetBooks, 'data.books[0].name', 'Buku A')

WS.verifyElementPropertyValue(ResponseGetBooks, 'data.books[0].publisher', 'Muhammad Akbar')

ResponseGetBookValidId = WS.sendRequest(findTestObject('BookShelf/Get Book with Valid Id', [('port') : GlobalVariable.port
            , ('bookId') : bookId]))

WS.verifyResponseStatusCode(ResponseGetBookValidId, 200)

WS.verifyElementPropertyValue(ResponseGetBookValidId, 'status', 'success')

WS.verifyElementPropertyValue(ResponseGetBookValidId, 'data.book.id', bookId)

ResponseGetBookInvalidId = WS.sendRequest(findTestObject('BookShelf/Get Book with Invalid Id'))

WS.verifyResponseStatusCode(ResponseGetBookInvalidId, 404)

WS.verifyElementPropertyValue(ResponseGetBookInvalidId, 'status', 'fail')

WS.verifyElementPropertyValue(ResponseGetBookInvalidId, 'message', 'Buku tidak ditemukan')

