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

ResponseUpdateBook = WS.sendRequest(findTestObject('BookShelf/Update Book with Complete Data', [('port') : GlobalVariable.port
            , ('bookId') : bookId, ('updateName') : GlobalVariable.updateName, ('updateYear') : GlobalVariable.updateYear
            , ('updateAuthor') : GlobalVariable.updateAuthor, ('updateSummary') : GlobalVariable.updateSummary, ('updatePublisher') : GlobalVariable.updatePublisher
            , ('updatePageCount') : GlobalVariable.updatePageCount, ('updateReadPage') : GlobalVariable.updateReadPage, ('updateReading') : GlobalVariable.updateReading]))

WS.verifyResponseStatusCode(ResponseUpdateBook, 200)

WS.verifyElementPropertyValue(ResponseUpdateBook, 'status', 'success')

WS.verifyElementPropertyValue(ResponseUpdateBook, 'message', 'Buku berhasil diperbarui')

ResponseUpdateWithoutName = WS.sendRequest(findTestObject('BookShelf/Update Book without Name', [('port') : GlobalVariable.port
            , ('bookId') : bookId, ('updateName') : GlobalVariable.updateName, ('updateYear') : GlobalVariable.updateYear
            , ('updateAuthor') : GlobalVariable.updateAuthor, ('updateSummary') : GlobalVariable.updateSummary, ('updatePublisher') : GlobalVariable.updatePublisher
            , ('updatePageCount') : GlobalVariable.updatePageCount, ('updateReadPage') : GlobalVariable.updateReadPage, ('updateReading') : GlobalVariable.updateReading]))

WS.verifyResponseStatusCode(ResponseUpdateWithoutName, 400)

WS.verifyElementPropertyValue(ResponseUpdateWithoutName, 'status', 'fail')

WS.verifyElementPropertyValue(ResponseUpdateWithoutName, 'message', 'Gagal memperbarui buku. Mohon isi nama buku')

ResponseUpdateReadmorethanPage = WS.sendRequest(findTestObject('BookShelf/Update Book with Read Page more than Page Count', 
        [('port') : GlobalVariable.port, ('bookId') : bookId, ('updateName') : GlobalVariable.updateName, ('updateYear') : GlobalVariable.updateYear
            , ('updateAuthor') : GlobalVariable.updateAuthor, ('updateSummary') : GlobalVariable.updateSummary, ('updatePublisher') : GlobalVariable.updatePublisher
            , ('updatePageCount') : GlobalVariable.updatePageCount, ('updateReadPage') : GlobalVariable.updateReadPage, ('updateReading') : GlobalVariable.updateReading]))

WS.verifyResponseStatusCode(ResponseUpdateReadmorethanPage, 400)

WS.verifyElementPropertyValue(ResponseUpdateReadmorethanPage, 'status', 'fail')

WS.verifyElementPropertyValue(ResponseUpdateReadmorethanPage, 'message', 'Gagal memperbarui buku. readPage tidak boleh lebih besar dari pageCount')

ResponseUpdateInvalidId = WS.sendRequest(findTestObject('BookShelf/Update Book with Invalid Id', [('port') : GlobalVariable.port
            , ('bookId') : bookId, ('updateName') : GlobalVariable.updateName, ('updateYear') : GlobalVariable.updateYear
            , ('updateAuthor') : GlobalVariable.updateAuthor, ('updateSummary') : GlobalVariable.updateSummary, ('updatePublisher') : GlobalVariable.updatePublisher
            , ('updatePageCount') : GlobalVariable.updatePageCount, ('updateReadPage') : GlobalVariable.updateReadPage, ('updateReading') : GlobalVariable.updateReading]))

WS.verifyResponseStatusCode(ResponseUpdateInvalidId, 404)

WS.verifyElementPropertyValue(ResponseUpdateInvalidId, 'status', 'fail')

WS.verifyElementPropertyValue(ResponseUpdateInvalidId, 'message', 'Gagal memperbarui buku. Id tidak ditemukan')

