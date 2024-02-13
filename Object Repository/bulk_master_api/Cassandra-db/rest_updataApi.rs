<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>rest_updataApi</name>
   <tag></tag>
   <elementGuidId>d731cdfe-fa87-47f0-967b-a0b151e782c0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-CASSANDRA\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;CassandraDBParameters\&quot;: {\n        \&quot;CqlQuery\&quot;: \&quot;SELECT usage_units,usage_discount,id,testdataone,holiday_date from test.testdb where id \u003e\u003d {:input.valeid} and id \u003c\u003d {:input.valeid1} ALLOW FILTERING\&quot;,\n        \&quot;NodeId\&quot;: \&quot;6725\&quot;\n    },\n    \&quot;Action\&quot;: {\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;,\n        \&quot;Protocol\&quot;: \&quot;REST\&quot;,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;notificationId\&quot;: \&quot;2094\&quot;,\n            \&quot;msisdn\&quot;: \&quot;{:0}\&quot;,\n            \&quot;shortCode\&quot;: \&quot;{:1}\&quot;,\n            \&quot;emailTo\&quot;: \&quot;{:3}\&quot;,\n            \&quot;systemId\&quot;: \&quot;{:4}\&quot;,\n            \&quot;inputValue\&quot;: {\n                \&quot;amount\&quot;: 35000.1234566,\n                \&quot;Name\&quot;: \&quot;{:2}\&quot;,\n                \&quot;DataPlan\&quot;: true\n            }\n        },\n        \&quot;Method\&quot;: \&quot;POST\&quot;,\n        \&quot;PlaceholderType\&quot;: 1,\n        \&quot;EndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;IsAuthenticationRequired\&quot;: false,\n        \&quot;username\&quot;: \&quot;\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: ${Notify},\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dap-is/Timestameforbulkserviceinintegration\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {\n                \&quot;notificationId\&quot;: 37165,\n                \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;\n            }\n        }\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-05-18T07:28:20.651Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-05-18T07:30:33.319Z\&quot;\n}\n&quot;,
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
      <webElementGuid>429c1061-fa14-4b43-8e34-1c12ad062c0d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'cassandra-bulk-service'</defaultValue>
      <description></description>
      <id>2fb57e71-2940-46a4-8a44-04ebeaac1f4f</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>'859'</defaultValue>
      <description></description>
      <id>c674b871-04cf-4bc3-9459-b6dc1d7e2975</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>'SELECT usage_units,usage_discount,id,testdataone,holiday_date from test.testdb where id >= {:input.valeid} and id &lt;= {:input.valeid1} ALLOW FILTERING'</defaultValue>
      <description></description>
      <id>b91c09f6-6e55-4f84-892e-296a56eb6974</id>
      <masked>false</masked>
      <name>CqlQuery</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>2e9a3dac-8111-462c-8f9d-2d93fe7b6b9f</id>
      <masked>false</masked>
      <name>Notify</name>
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
