<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Actiontype-file</name>
   <tag></tag>
   <elementGuidId>6291a693-f427-40ee-a0e7-212106d106b7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-CASSANDRA\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;CassandraDBParameters\&quot;: {\n        \&quot;CqlQuery\&quot;: \&quot;SELECT usage_units,usage_discount,id,testdataone,holiday_date from test.testdb where id \u003e\u003d {:input.valeid} and id \u003c\u003d {:input.valeid1} ALLOW FILTERING\&quot;,\n        \&quot;NodeId\&quot;: \&quot;6725\&quot;\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;${FileTimeFormat}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/CassandraDB_\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;IsHeaderEnable\&quot;: ${IsHeaderEnable},\n        \&quot;SftpEnable\&quot;: ${SftpEnable},\n        \&quot;FileHeaders\&quot;: \&quot;${FileHeaders}\&quot;,\n\t\t\&quot;SftpNode\&quot;: \&quot;7441\&quot;,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;,\n        \&quot;EolDelimiter\&quot;: \&quot;;\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: ${Notify},\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dap-is/Timestameforbulkserviceinintegration\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {}\n        },\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: ${pvc},\n                \&quot;sftp\&quot;: ${sftp}\n            },\n            \&quot;endPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n            \&quot;templateCode\&quot;: \&quot;vi_bill_generate\&quot;,\n            \&quot;emailTo\&quot;: \&quot; gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;msisdn\&quot;: \&quot; 900000001\&quot;\n        },\n        \&quot;sendNotification\&quot;: ${sendNotification}\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-05-19T05:04:15.211Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-05-19T05:04:34.459Z\&quot;\n}&quot;,
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
      <webElementGuid>1900a264-c6b0-4fe8-beaa-ba31811cd212</webElementGuid>
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
      <defaultValue>'cache-post-bulk-service'</defaultValue>
      <description></description>
      <id>e989ce5d-dcab-44cf-b7e9-bda47900aa9e</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>847</defaultValue>
      <description></description>
      <id>c3c7343e-5ab5-446b-8a60-b986c10365d1</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>'.csv'</defaultValue>
      <description></description>
      <id>7e6ffef7-2ef5-4318-b7a3-7c8efa582fce</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>'YYYY:MM:dd:mm:ss:ns'</defaultValue>
      <description></description>
      <id>529086e5-cb12-4b87-acb7-d9aefc91537a</id>
      <masked>false</masked>
      <name>FileTimeFormat</name>
   </variables>
   <variables>
      <defaultValue>'|'</defaultValue>
      <description></description>
      <id>aa02feed-59bf-4e28-bb25-9e6b5b4ed90d</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>2d12b5fa-be1a-4cdd-b553-6025e1129ab1</id>
      <masked>false</masked>
      <name>IsHeaderEnable</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>a2a2013a-0c77-452c-82f2-13dd4ced6d27</id>
      <masked>false</masked>
      <name>SftpEnable</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>12bed2e7-b77e-49f4-a0f0-4bc3dc44550f</id>
      <masked>false</masked>
      <name>Notify</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>2b75a8d7-b740-424b-a2cd-eb8fab71921b</id>
      <masked>false</masked>
      <name>pvc</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>da5fa407-7ba3-40fa-a09b-d4ac3fad0ccd</id>
      <masked>false</masked>
      <name>sftp</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>654dd711-ad11-4bb5-b3a6-b34982fd46f2</id>
      <masked>false</masked>
      <name>sendNotification</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>0ad29fd6-d3e8-4903-9d64-5ccbc2a4411d</id>
      <masked>false</masked>
      <name>FileHeaders</name>
   </variables>
   <variables>
      <defaultValue>'0'</defaultValue>
      <description></description>
      <id>d8d37db5-3cb0-487c-b5b0-f20853fc1012</id>
      <masked>false</masked>
      <name>Limit</name>
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
