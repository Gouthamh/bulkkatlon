<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>false</name>
   <tag></tag>
   <elementGuidId>b3e1e7e9-5468-4c83-a292-a53f6b74edc2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;mysql\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-MONGO\&quot;,\n    \&quot;BulkID\&quot;: ${id},\n    \&quot;MONGODBParameters\&quot;: {\n        \&quot;FetchSize\&quot;: 10,\n        \&quot;NodeId\&quot;: \&quot;4929\&quot;,\n        \&quot;collectionName\&quot;: \&quot;MONGO_DB_BULK_TEST\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;0\&quot;,\n        \&quot;returnParams\&quot;: {\n            \&quot;_id\&quot;: 0\n        },\n        \&quot;Order\&quot;: [\n            \&quot;{:notificationId}\&quot;,\n            \&quot;{:shortCode}\&quot;,\n            \&quot;{:msisdn}\&quot;,\n            \&quot;{:emailTo}\&quot;,\n            \&quot;{:systemId}\&quot;,\n            \&quot;{:inputValue.amount}\&quot;,\n            \&quot;{:inputValue.Name}\&quot;,\n            \&quot;{:inputValue.balance}\&quot;,\n            \&quot;{:inputValue.DataPlan}\&quot;\n        ],\n        \&quot;OffsetEnable\&quot;: ${OffsetEnable},\n        \&quot;MongoDbQuery\&quot;: \&quot;{}\&quot;\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;REST\&quot;,\n        \&quot;EndPoint\&quot;: \&quot;http://dap-api-lookup-router.dap-ns/dapApiLookup/registration/sms/saveData\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;username\&quot;: \&quot;\&quot;,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;notificationId\&quot;: 0,\n            \&quot;shortCode\&quot;: 1,\n            \&quot;msisdn\&quot;: 2,\n            \&quot;emailTo\&quot;: 3,\n            \&quot;systemId\&quot;: 4,\n            \&quot;inputValue\&quot;: {\n                \&quot;amount\&quot;: 5,\n                \&quot;Name\&quot;: 6,\n                \&quot;balance\&quot;: 7,\n                \&quot;DataPlan\&quot;: 8\n            }\n        },\n        \&quot;Method\&quot;: \&quot;POST\&quot;,\n        \&quot;PlaceholderType\&quot;: 0,\n        \&quot;IsAuthenticationRequired\&quot;: false\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2022-10-29T02:33:45.846Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2022-10-29T02:40:13.088Z\&quot;\n}&quot;,
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
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=${id}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.dummiid</defaultValue>
      <description></description>
      <id>88acf11f-6342-4728-8c28-5890765116fd</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>054959c7-588d-4516-83be-6d1d56a7fff0</id>
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
