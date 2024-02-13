<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update_App_status</name>
   <tag></tag>
   <elementGuidId>b1b15e89-5b93-4a7e-82fd-5f36f2151cf8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;ServiceName\&quot;:\&quot;${ServiceName}\&quot;,\n   \&quot;BulkType\&quot;:\&quot;DB-MONGO\&quot;,\n   \&quot;BulkID\&quot;:\&quot;${ServiceId}\&quot;,\n   \&quot;MONGODBParameters\&quot;:{\n      \&quot;FetchSize\&quot;:10,\n      \&quot;NodeId\&quot;:\&quot;4929\&quot;,\n      \&quot;collectionName\&quot;:\&quot;${collectionName}\&quot;,\n      \&quot;StopLimit\&quot;:0,\n      \&quot;returnParams\&quot;:{\n         \&quot;_id\&quot;:0\n      },\n      \&quot;Order\&quot;:[\n         \&quot;{:notificationId}\&quot;,\n         \&quot;{:shortCode}\&quot;,\n         \&quot;{:msisdn}\&quot;,\n         \&quot;{:emailTo}\&quot;,\n         \&quot;{:systemId}\&quot;,\n         \&quot;{:inputValue.amount}\&quot;,\n         \&quot;{:inputValue.Name}\&quot;,\n         \&quot;{:inputValue.balance}\&quot;,\n         \&quot;{:inputValue.DataPlan}\&quot;\n      ],\n      \&quot;OffsetEnable\&quot;:false,\n      \&quot;MongoDbQuery\&quot;:{\n         \n      }\n   },\n   \&quot;Action\&quot;:{\n      \&quot;Protocol\&quot;:\&quot;REST\&quot;,\n      \&quot;EndPoint\&quot;:\&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n      \&quot;Headers\&quot;:{\n         \n      },\n      \&quot;username\&quot;:\&quot;\&quot;,\n      \&quot;RequestFormat\&quot;:{\n         \&quot;notificationId\&quot;:0,\n         \&quot;shortCode\&quot;:1,\n         \&quot;msisdn\&quot;:2,\n         \&quot;emailTo\&quot;:3,\n         \&quot;systemId\&quot;:4,\n         \&quot;inputValue\&quot;:{\n            \&quot;amount\&quot;:5,\n            \&quot;Name\&quot;:6,\n            \&quot;balance\&quot;:7,\n            \&quot;DataPlan\&quot;:8\n         }\n      },\n      \&quot;Method\&quot;:\&quot;POST\&quot;,\n      \&quot;PlaceholderType\&quot;:0,\n      \&quot;IsAuthenticationRequired\&quot;:false\n   },\n   \&quot;CreatedOn\&quot;:\&quot;2022-10-29T02:43:00.951Z\&quot;,\n   \&quot;modifiedOn\&quot;:\&quot;2022-10-29T03:14:12.916Z\&quot;\n}&quot;,
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
      <id>9a73d93c-3250-4c04-af78-78dd9b9cca94</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Mongo_BulkProcess</defaultValue>
      <description></description>
      <id>d87246ac-3ccc-43de-bfb6-bf8b2e7347a4</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Mongo_BulkID</defaultValue>
      <description></description>
      <id>0be29b96-8cf4-47cd-ac40-2bf237caf6ab</id>
      <masked>false</masked>
      <name>ServiceId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.App_Status_Collection</defaultValue>
      <description></description>
      <id>db365550-4a90-49e6-9b3f-443057bcf289</id>
      <masked>false</masked>
      <name>collectionName</name>
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
