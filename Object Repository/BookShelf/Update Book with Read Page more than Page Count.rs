<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Book with Read Page more than Page Count</name>
   <tag></tag>
   <elementGuidId>4b53e77e-ef58-437b-a67f-5feb5815b192</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;${updateName}\&quot;,\n    \&quot;year\&quot;: \&quot;${updateYear}\&quot;,\n    \&quot;author\&quot;: \&quot;${updateAuthor}\&quot;,\n    \&quot;summary\&quot;: \&quot;${updateSummary}\&quot;,\n    \&quot;publisher\&quot;: \&quot;${updatePublisher}\&quot;,\n    \&quot;pageCount\&quot;: 80,\n    \&quot;readPage\&quot;: 90,\n    \&quot;reading\&quot;: ${updateReading}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a512879c-5839-4476-bbaa-f5bb8c8ff932</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.6</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://localhost:${port}/books/${bookId}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.port</defaultValue>
      <description></description>
      <id>45275b9b-f179-4227-bfe8-58e07236c612</id>
      <masked>false</masked>
      <name>port</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.bookId</defaultValue>
      <description></description>
      <id>b472eec1-cff8-46fa-bfcb-9950ee009a1e</id>
      <masked>false</masked>
      <name>bookId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updateName</defaultValue>
      <description></description>
      <id>4473e3b9-d4bb-49fe-ba5e-0d7e6b9cf827</id>
      <masked>false</masked>
      <name>updateName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updateYear</defaultValue>
      <description></description>
      <id>0639b3b5-956f-405c-82c2-78c2a2872f9a</id>
      <masked>false</masked>
      <name>updateYear</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updateAuthor</defaultValue>
      <description></description>
      <id>baefc3c8-0913-4221-b570-dc7b60883e60</id>
      <masked>false</masked>
      <name>updateAuthor</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updateSummary</defaultValue>
      <description></description>
      <id>823bdf91-d2a6-4350-b5ad-e4c1d67c219d</id>
      <masked>false</masked>
      <name>updateSummary</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updatePublisher</defaultValue>
      <description></description>
      <id>e23c38fd-55e1-475b-9958-feae114df651</id>
      <masked>false</masked>
      <name>updatePublisher</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updatePageCount</defaultValue>
      <description></description>
      <id>c1c2377c-84c3-409e-b1fd-7b8b5e21815d</id>
      <masked>false</masked>
      <name>updatePageCount</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updateReadPage</defaultValue>
      <description></description>
      <id>94657baf-7a3b-4a92-a90b-1ea5470601fd</id>
      <masked>false</masked>
      <name>updateReadPage</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.updateReading</defaultValue>
      <description></description>
      <id>62074eae-7b3c-43f0-aa27-7b4c8a1da822</id>
      <masked>false</masked>
      <name>updateReading</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
