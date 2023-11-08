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

WS.verifyResponseStatusCode(ResponseAddBook, 201)

AddBookRespCode = WS.getResponseStatusCode(ResponseAddBook)

WS.verifyEqual(AddBookRespCode, 201)

WS.verifyElementPropertyValue(ResponseAddBook, 'status', 'success')

WS.verifyElementPropertyValue(ResponseAddBook, 'message', 'Buku berhasil ditambahkan')

bookId = WS.getElementPropertyValue(ResponseAddBook, 'data.bookId')

WS.verifyElementPropertyValue(ResponseAddBook, 'data.bookId', bookId)

ResponseAddBookWithoutName = WS.sendRequest(findTestObject('BookShelf/Add Book without Name', [('port') : GlobalVariable.port
            , ('newName') : GlobalVariable.newName, ('newYear') : GlobalVariable.newYear, ('newAuthor') : GlobalVariable.newAuthor
            , ('newSummary') : GlobalVariable.newSummary, ('newPublisher') : GlobalVariable.newPublisher, ('newPageCount') : GlobalVariable.newPageCount
            , ('newReadPage') : GlobalVariable.newReadPage, ('newReading') : GlobalVariable.newReading]))

WS.verifyResponseStatusCode(ResponseAddBookWithoutName, 400)

AddBookWithoutNameRespCode = WS.getResponseStatusCode(ResponseAddBookWithoutName)

WS.verifyEqual(AddBookWithoutNameRespCode, 400)

WS.verifyElementPropertyValue(ResponseAddBookWithoutName, 'status', 'fail')

WS.verifyElementPropertyValue(ResponseAddBookWithoutName, 'message', 'Gagal menambahkan buku. Mohon isi nama buku')

ResponseAddBookMoreThanReadPage = WS.sendRequest(findTestObject('Object Repository/BookShelf/Add Book with Read Page more than Page Count', [('port') : GlobalVariable.port
	, ('newName') : GlobalVariable.newName, ('newYear') : GlobalVariable.newYear, ('newAuthor') : GlobalVariable.newAuthor
	, ('newSummary') : GlobalVariable.newSummary, ('newPublisher') : GlobalVariable.newPublisher, ('newPageCount') : GlobalVariable.newPageCount
	, ('newReadPage') : GlobalVariable.newReadPage, ('newReading') : GlobalVariable.newReading]))

WS.verifyResponseStatusCode(ResponseAddBookMoreThanReadPage, 400)

AddBookMoreThanReadRespCode = WS.getResponseStatusCode(ResponseAddBookMoreThanReadPage)

WS.verifyEqual(AddBookMoreThanReadRespCode, 400)

WS.verifyElementPropertyValue(ResponseAddBookMoreThanReadPage, 'status', 'fail')

WS.verifyElementPropertyValue(ResponseAddBookMoreThanReadPage, 'message', 'Gagal menambahkan buku. readPage tidak boleh lebih besar dari pageCount')

