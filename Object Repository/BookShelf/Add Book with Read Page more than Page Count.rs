<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Add Book with Read Page more than Page Count</name>
   <tag></tag>
   <elementGuidId>63903092-0df9-4dd0-9602-8f7a4aa79a63</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;${newName}\&quot;,\n    \&quot;year\&quot;: \&quot;${newYear}\&quot;,\n    \&quot;author\&quot;: \&quot;${newAuthor}\&quot;,\n    \&quot;summary\&quot;: \&quot;${newSummary}\&quot;,\n    \&quot;publisher\&quot;: \&quot;${newPublisher}\&quot;,\n    \&quot;pageCount\&quot;: 80,\n    \&quot;readPage\&quot;: 90,\n    \&quot;reading\&quot;: ${newReading}\n}&quot;,
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
      <webElementGuid>d70230fb-369a-45a1-a63d-95efa3a29b96</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.6</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://localhost:${port}/books</restUrl>
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
      <id>c1eb5aca-9d6b-4e90-997b-2da6b7beecb4</id>
      <masked>false</masked>
      <name>port</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newName</defaultValue>
      <description></description>
      <id>c1aedb40-3a23-4d6e-b910-957d7b90403e</id>
      <masked>false</masked>
      <name>newName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newYear</defaultValue>
      <description></description>
      <id>77b25298-bec6-48ef-9e83-cbdda3b27645</id>
      <masked>false</masked>
      <name>newYear</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newAuthor</defaultValue>
      <description></description>
      <id>15d94ef5-6278-4a67-b4a5-3e01f41c495c</id>
      <masked>false</masked>
      <name>newAuthor</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newSummary</defaultValue>
      <description></description>
      <id>bd49b22a-0caf-4290-9088-e26eefb8c1af</id>
      <masked>false</masked>
      <name>newSummary</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newPublisher</defaultValue>
      <description></description>
      <id>7366380b-5301-4502-947a-15ecec6c950e</id>
      <masked>false</masked>
      <name>newPublisher</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newPageCount</defaultValue>
      <description></description>
      <id>42feeff1-d920-4344-bbf5-73129a1a762e</id>
      <masked>false</masked>
      <name>newPageCount</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newReadPage</defaultValue>
      <description></description>
      <id>cfd2b0ca-4841-4a62-b461-c359e353109a</id>
      <masked>false</masked>
      <name>newReadPage</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.newReading</defaultValue>
      <description></description>
      <id>2c6fb4dc-dd50-4218-b32b-2d0d1f40dc32</id>
      <masked>false</masked>
      <name>newReading</name>
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
