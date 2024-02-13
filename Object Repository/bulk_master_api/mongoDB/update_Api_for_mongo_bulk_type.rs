<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>update_Api_for_mongo_bulk_type</name>
   <tag></tag>
   <elementGuidId>e3422696-695b-450f-8880-c7de83f39ac3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;ServiceName\&quot;:\&quot;${ServiceName}\&quot;,\n   \&quot;BulkType\&quot;:\&quot;DB-MONGO\&quot;,\n   \&quot;BulkID\&quot;:\&quot;${ServiceId}\&quot;,\n   \&quot;MONGODBParameters\&quot;:{\n      \&quot;FetchSize\&quot;:10,\n      \&quot;NodeId\&quot;:\&quot;4929\&quot;,\n      \&quot;collectionName\&quot;:\&quot;MONGO_DB_BULK_TEST\&quot;,\n      \&quot;StopLimit\&quot;:\&quot;${StopLimit}\&quot;,\n      \&quot;returnParams\&quot;:{\n         \&quot;_id\&quot;:0\n      },\n      \&quot;Order\&quot;:[\n         \&quot;{:notificationId}\&quot;,\n         \&quot;{:shortCode}\&quot;,\n         \&quot;{:msisdn}\&quot;,\n         \&quot;{:emailTo}\&quot;,\n         \&quot;{:systemId}\&quot;,\n         \&quot;{:inputValue.amount}\&quot;,\n         \&quot;{:inputValue.Name}\&quot;,\n         \&quot;{:inputValue.balance}\&quot;,\n         \&quot;{:inputValue.DataPlan}\&quot;\n      ],\n      \&quot;OffsetEnable\&quot;:${OffSet},\n      \&quot;MongoDbQuery\&quot;:{\n         \n      }\n   },\n   \&quot;Action\&quot;:{\n      \&quot;Protocol\&quot;:\&quot;REST\&quot;,\n      \&quot;EndPoint\&quot;:\&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n      \&quot;Headers\&quot;:{\n         \n      },\n      \&quot;username\&quot;:\&quot;\&quot;,\n      \&quot;RequestFormat\&quot;:{\n         \&quot;notificationId\&quot;:0,\n         \&quot;shortCode\&quot;:1,\n         \&quot;msisdn\&quot;:2,\n         \&quot;emailTo\&quot;:3,\n         \&quot;systemId\&quot;:4,\n         \&quot;inputValue\&quot;:{\n            \&quot;amount\&quot;:5,\n            \&quot;Name\&quot;:6,\n            \&quot;balance\&quot;:7,\n            \&quot;DataPlan\&quot;:8\n         }\n      },\n      \&quot;Method\&quot;:\&quot;POST\&quot;,\n      \&quot;PlaceholderType\&quot;:0,\n      \&quot;IsAuthenticationRequired\&quot;:false\n   },\n   \&quot;CreatedOn\&quot;:\&quot;2022-10-29T02:43:00.951Z\&quot;,\n   \&quot;modifiedOn\&quot;:\&quot;2022-10-29T03:14:12.916Z\&quot;\n}&quot;,
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
      <id>696a40e9-fa6d-40cc-a7a9-ef0332da8cac</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.UpdateBulkMasterConfig</defaultValue>
      <description></description>
      <id>b4538021-2dcc-4715-b792-92bc713b3621</id>
      <masked>false</masked>
      <name>UpdateBulkMasterConfig</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dummiservicename</defaultValue>
      <description></description>
      <id>5103a622-e1b5-4e66-ba3f-c28da34f48af</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dummiid</defaultValue>
      <description></description>
      <id>cd90786e-9004-4f63-bca5-0add255a5030</id>
      <masked>false</masked>
      <name>ServiceId</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>67a14286-1570-49d4-abe4-4b2a0bfcc8c2</id>
      <masked>false</masked>
      <name>OffSet</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.stoplimitunderlimit</defaultValue>
      <description></description>
      <id>eb7c0270-0918-44a0-ad79-e87c26dc74b4</id>
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
