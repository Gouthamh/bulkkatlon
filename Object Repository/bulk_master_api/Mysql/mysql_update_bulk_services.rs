<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>mysql_update_bulk_services</name>
   <tag></tag>
   <elementGuidId>75b533e3-446e-4043-95c3-53ad0608c899</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \n    \&quot;ServiceName\&quot; : \&quot;${dummiservicename}\&quot;,\n    \&quot;BulkID\&quot; : \&quot;${dummiid}\&quot;,\n    \&quot;BulkType\&quot; : \&quot;DB-MYSQL\&quot;,\n    \&quot;Action\&quot; : {\n        \&quot;Protocol\&quot; : \&quot;REST\&quot;,\n        \&quot;Method\&quot; : \&quot;POST\&quot;,\n        \&quot;EndPoint\&quot; : \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n        \&quot;RequestFormat\&quot; : {\n            \&quot;notificationId\&quot; : 0,\n            \&quot;emailTo\&quot; : 1,\n            \&quot;shortCode\&quot; : 2,\n            \&quot;msisdn\&quot; : 3,\n            \&quot;systemId\&quot; : 4,\n            \&quot;inputValue\&quot; : {\n                \&quot;Name\&quot; : 5,\n                \&quot;DataPlan\&quot; : 6,\n                \&quot;amount\&quot; : 7\n            }\n        },\n        \&quot;Headers\&quot; : {},\n        \&quot;PlaceholderType\&quot; : 0,\n        \&quot;IsAuthenticationRequired\&quot; : false,\n        \&quot;username\&quot; : \&quot;\&quot;\n    },\n    \&quot;MySqlParameters\&quot; : {\n        \&quot;NodeId\&quot; : \&quot;4909\&quot;,\n        \&quot;SqlQuery\&quot; : \&quot;SELECT notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount FROM smdb.BulkNotificationServices\&quot;,\n        \&quot;FetchSize\&quot; : \&quot;10\&quot;,\n        \&quot;StopLimit\&quot; : \&quot;${StopLimit}\&quot;,\n        \&quot;OffsetEnable\&quot; : ${Offset_true}\n    }\n    \n}&quot;,
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
   <restUrl>https://${URL}/dapBulkProcess/configure/${UpdateBulkMasterConfig}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>ea93185e-1336-42e8-81d0-c60e3e7542f1</id>
      <masked>false</masked>
      <name>Offset_true</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>76b61d62-82ac-4d83-a6db-a6059ddb7ca1</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.UpdateBulkMasterConfig</defaultValue>
      <description></description>
      <id>0702a338-c1f8-41eb-a5ff-174bec43489f</id>
      <masked>false</masked>
      <name>UpdateBulkMasterConfig</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dummiid</defaultValue>
      <description></description>
      <id>d30006e0-cd31-4d20-a366-da39f3e7c995</id>
      <masked>false</masked>
      <name>dummiid</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dummiservicename</defaultValue>
      <description></description>
      <id>4348cd6e-582a-4d37-ad45-c4085fcca154</id>
      <masked>false</masked>
      <name>dummiservicename</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>5dbdf3d8-f359-4732-ba21-b1ab3d469522</id>
      <masked>false</masked>
      <name>StopLimit</name>
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
