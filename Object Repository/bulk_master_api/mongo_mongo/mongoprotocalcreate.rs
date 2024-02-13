<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>mongoprotocalcreate</name>
   <tag></tag>
   <elementGuidId>affdb5ba-934a-455a-beda-7a501ee1f3cd</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;ServiceName\&quot;:\&quot;${ServiceName}\&quot;,\n   \&quot;BulkType\&quot;:\&quot;DB-MONGO\&quot;,\n   \&quot;BulkID\&quot;:${BulkID},\n   \&quot;MONGODBParameters\&quot;:{\n      \&quot;FetchSize\&quot;:10,\n      \&quot;NodeId\&quot;:\&quot;4929\&quot;,\n      \&quot;collectionName\&quot;:\&quot;MONGO_DB_BULK_TEST\&quot;,\n      \&quot;StopLimit\&quot;:${StopLimit},\n      \&quot;MongoDbQuery\&quot;:{\n         \n      },\n      \&quot;returnParams\&quot;:{\n         \&quot;_id\&quot;:0\n      },\n      \&quot;Order\&quot;:[\n         \&quot;{:notificationId}\&quot;,\n         \&quot;{:emailTo}\&quot;,\n         \&quot;{:msisdn}\&quot;,\n         \&quot;{:inputValue.Name}\&quot;,\n         \&quot;{:inputValue.DataPlan}\&quot;,\n         \&quot;{:shortCode}\&quot;,\n         \&quot;{:systemId}\&quot;,\n         \&quot;{:inputValue.amount}\&quot;\n      ],\n      \&quot;OffsetEnable\&quot;:${OffsetEnable}\n   },\n   \&quot;Action\&quot;:{\n      \&quot;Protocol\&quot;:\&quot;MONGO\&quot;,\n      \&quot;NodeId\&quot;:\&quot;4929\&quot;,\n      \&quot;collectionName\&quot;:\&quot;DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO\&quot;,\n      \&quot;operation\&quot;:\&quot;Create\&quot;,\n      \&quot;PlaceholderType\&quot;:1,\n      \&quot;Document\&quot;:{\n         \&quot;notificationId\&quot;:\&quot;{:0}\&quot;,\n         \&quot;emailTo\&quot;:\&quot;{:1}\&quot;,\n         \&quot;shortCode\&quot;:\&quot;{:5}\&quot;,\n         \&quot;msisdn\&quot;:\&quot;{:2}\&quot;,\n         \&quot;systemId\&quot;:\&quot;{:6}\&quot;,\n         \&quot;inputValue\&quot;:{\n            \&quot;amount\&quot;:\&quot;{:7}\&quot;,\n            \&quot;balance\&quot;:\&quot;12.20\&quot;,\n            \&quot;Name\&quot;:\&quot;{:3}\&quot;,\n            \&quot;DataPlan\&quot;:\&quot;{:4}\&quot;\n         }\n      },\n      \&quot;Headers\&quot;:{\n         \n      },\n      \&quot;username\&quot;:\&quot;\&quot;\n   },\n   \&quot;CreatedOn\&quot;:\&quot;2022-11-16T05:31:43.470Z\&quot;,\n   \&quot;modifiedOn\&quot;:\&quot;2022-11-16T05:32:06.011Z\&quot;\n}&quot;,
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
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.dummiservicename</defaultValue>
      <description></description>
      <id>6d38be78-c3e9-4432-928a-5d3621808395</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dummiid</defaultValue>
      <description></description>
      <id>c9cd13ca-a00d-409c-8627-9a6d6a986363</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.stoplimitunderlimit</defaultValue>
      <description></description>
      <id>20c3f385-fff4-4735-8fd0-1445eb85a0b2</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>f1ccdacc-2709-4112-a063-240d07d9e476</id>
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
