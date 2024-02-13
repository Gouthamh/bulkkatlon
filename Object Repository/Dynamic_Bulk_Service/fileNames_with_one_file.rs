<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>fileNames_with_one_file</name>
   <tag></tag>
   <elementGuidId>e9951f67-8f36-4522-ad23-1cf7e0364d65</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;NoOfFields\&quot;: 6,\n  \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n  \&quot;fileNames\&quot;:[\n    \&quot;C:\\\\Users\\\\KUMARKO\\\\Katalon Studio\\\\DynamicBulk Service\\\\Data Files\\test2.csv\&quot;\n  ],\n  \&quot;IsHeaderPresent\&quot;: false,\n  \&quot;Action\&quot;: {\n    \&quot;Method\&quot;: \&quot;POST\&quot;,\n    \&quot;EndPoint\&quot;: \&quot;http://dap-iat.hez-cluster.tecnotree.com/notification/triggerNotification\&quot;,\n    \&quot;IsAuthenticationRequired\&quot;: false,\n    \&quot;PlaceholderType\&quot;: 0,\n    \&quot;RequestFormat\&quot;:  {\n            \&quot;notificationId\&quot; : 0,\n            \&quot;emailTo\&quot; : 1,\n            \&quot;shortCode\&quot; : 2,\n            \&quot;systemId\&quot; : 3,\n            \&quot;inputValue\&quot; : {\n                \&quot;amount\&quot; : \&quot;11.22\&quot;,\n                \&quot;balance\&quot; : \&quot;12.20\&quot;,\n                \&quot;Name\&quot; : 4,\n                \&quot;DataPlan\&quot; : 5\n            }\n        }\n  }\n}&quot;,
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
   </httpHeaderProperties>
   <katalonVersion>7.5.0</katalonVersion>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${URL}/dapBulkProcess/${bulkProcessName}/triggerDynamicBulkService</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>d0721218-423a-44e6-9b54-21478fcffe15</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Dynamic_BulkProcess</defaultValue>
      <description></description>
      <id>ec956aa2-1e8f-4e6a-b12d-66f1ad64cac3</id>
      <masked>false</masked>
      <name>bulkProcessName</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
