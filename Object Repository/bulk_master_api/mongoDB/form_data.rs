<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>form_data</name>
   <tag></tag>
   <elementGuidId>243383c5-1a49-4a03-898c-7d8c5350aaa1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot; : \&quot;${ServiceName}\&quot;,\n    \&quot;BulkID\&quot; : ${BulkID},\n    \&quot;BulkType\&quot; : \&quot;DB-MONGO\&quot;,\n    \&quot;Action\&quot; : {\n        \&quot;Protocol\&quot; : \&quot;FORM-DATA\&quot;,\n        \&quot;Method\&quot; : \&quot;POST\&quot;,\n        \&quot;EndPoint\&quot; : \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotificationForEmailAttachment\&quot;,\n        \&quot;RequestFormat\&quot; : {\n            \&quot;emailUserInput\&quot; : {\n                \&quot;notificationId\&quot; : 0,\n                \&quot;msisdn\&quot; : 1,\n                \&quot;emailTo\&quot; : 2,\n                \&quot;inputValue\&quot; : {\n                    \&quot;DataPlan\&quot; : 3,\n                    \&quot;Name\&quot; : 4,\n                    \&quot;amount\&quot; : 5\n                },\n                \&quot;shortCode\&quot; : 6,\n                \&quot;systemId\&quot; : 7\n            },\n            \&quot;fileData\&quot; : 8,\n            \&quot;filename\&quot; : 9\n        },\n        \&quot;Headers\&quot; : {\n            \&quot;Content-Type\&quot; : [ \n                \&quot;multipart/form-data\&quot;\n            ]\n        },\n        \&quot;PlaceholderType\&quot; : 0,\n        \&quot;IsAuthenticationRequired\&quot; : false,\n        \&quot;username\&quot; : \&quot;\&quot;\n    },\n    \&quot;MONGODBParameters\&quot; : {\n        \&quot;FetchSize\&quot; : 1,\n        \&quot;NodeId\&quot; : \&quot;4929\&quot;,\n        \&quot;collectionName\&quot; : \&quot;MONGODB_FORM_DATA\&quot;,\n        \&quot;MongoDbQuery\&quot; : {},\n        \&quot;returnParams\&quot; : {\n            \&quot;_id\&quot; : 0\n        },\n        \&quot;Order\&quot; : [ \n            \&quot;{:emailUserInput.notificationId}\&quot;, \n            \&quot;{:emailUserInput.msisdn}\&quot;, \n            \&quot;{:emailUserInput.emailTo}\&quot;, \n            \&quot;{:emailUserInput.inputValue.DataPlan}\&quot;, \n            \&quot;{:emailUserInput.inputValue.Name}\&quot;, \n            \&quot;{:emailUserInput.inputValue.amount}\&quot;, \n            \&quot;{:emailUserInput.shortCode}\&quot;, \n            \&quot;{:emailUserInput.systemId}\&quot;, \n            \&quot;{:fileData}\&quot;, \n            \&quot;{:filename}\&quot;\n        ],\n        \&quot;StopLimit\&quot; : ${StopLimit},\n        \&quot;OffsetEnable\&quot; : ${OffsetEnable}\n    },\n    \&quot;_class\&quot; : \&quot;com.tecnotree.dap.bulk.document.BulkMasterConfigurationDocument\&quot;\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://${URL}/dapBulkProcess/configure/UpdateBulkMasterConfig</restUrl>
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
      <id>6b5149e9-c071-4add-a640-29d44261e78b</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>'mongo-formdata'</defaultValue>
      <description></description>
      <id>fac9b21d-b428-4f91-896e-7f0b9578a210</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>480</defaultValue>
      <description></description>
      <id>6092aff6-341a-4d53-8593-7c55f2eb8da9</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>2</defaultValue>
      <description></description>
      <id>3154ee0a-f15c-4ab1-b23f-ae8c224b4a6f</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>e0bcde00-2e70-40c3-b577-1b8200019f80</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
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
