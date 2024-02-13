<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Action_type_file</name>
   <tag></tag>
   <elementGuidId>57b85580-2698-421f-a96e-7104610864aa</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;File\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;FileFormat\&quot;: {\n        \&quot;NoOfFields\&quot;: 7,\n        \&quot;MandatoryFields\&quot;: \&quot;\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n        \&quot;FileUploadPath\&quot;: \&quot;/data/\&quot;,\n        \&quot;groupId\&quot;: \&quot;\&quot;,\n        \&quot;IsHeaderPresent\&quot;: false,\n        \&quot;HouseKeepingEnable\&quot;: false,\n        \&quot;CompressFiles\&quot;: true\n    },\n    \&quot;Action\&quot;: {\n        \&quot;RetryEnable\&quot;: ${RetryEnable},\n        \&quot;FileHeaders\&quot;: [\n            \&quot;notificationId\&quot;,\n            \&quot;emailTo\&quot;,\n            \&quot;shortCode\&quot;,\n            \&quot;msisdn\&quot;,\n            \&quot;systemId\&quot;,\n            \&quot;Name\&quot;,\n            \&quot;DataPlan\&quot;,\n            \&quot;amount\&quot;\n        ],\n        \&quot;IsHeaderEnable\&quot;: ${IsHeaderEnable},\n        \&quot;SftpEnable\&quot;: ${SftpEnable},\n        \&quot;CompressEnable\&quot;: ${CompressEnable},\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/file_\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;_YYYY:MM:dd:mm:ss:ns\&quot;,\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;,\n        \&quot;EolDelimiter\&quot;: \&quot;|\&quot;,\n        \&quot;RetryServiceName\&quot;: \&quot;notification-bulk-service\&quot;,\n        \&quot;RetryMapTTL\&quot;: \&quot;3600\&quot;,\n        \&quot;RetryEndpoint\&quot;: \&quot;https://dap.pe-lab3.bdc-rancher.tecnotree.com/RetryEngine/createRetryRequest\&quot;,\n        \&quot;SftpNode\&quot;: \&quot;7441\&quot;,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;sendNotification\&quot;: ${sendNotification},\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: ${pvc},\n                \&quot;sftp\&quot;: ${sftp}\n            },\n            \&quot;endPoint\&quot;: \&quot;\&quot;,\n            \&quot;templateCode\&quot;: \&quot;\&quot;,\n            \&quot;emailTo\&quot;: \&quot;\&quot;,\n            \&quot;msisdn\&quot;: \&quot;\&quot;\n        },\n        \&quot;Notify\&quot;: ${Notify},\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/fetchAllMasterConfiguratoins\&quot;,\n            \&quot;Method\&quot;: \&quot;GET\&quot;,\n            \&quot;Payload\&quot;: {}\n        }\n    },\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: false\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-11-07T10:43:06.057Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-11-07T10:46:58.074Z\&quot;\n}&quot;,
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
      <webElementGuid>3d51455b-05bf-4c72-a76f-9dfc753efefa</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
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
      <defaultValue>''</defaultValue>
      <description></description>
      <id>fcfe487b-e74a-4e71-a541-28cf4f2cedd6</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>1fcf9020-2599-4553-9863-b90b2a24e23c</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>59c802bc-f88c-4ea3-bd53-ea695842bcb1</id>
      <masked>false</masked>
      <name>RetryEnable</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>e32a9624-4b55-404b-a079-ba2b6f9203ca</id>
      <masked>false</masked>
      <name>IsHeaderEnable</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>2b257eef-b44a-4b15-81d4-13f31cc31567</id>
      <masked>false</masked>
      <name>SftpEnable</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>10328ed5-7a41-43d7-b35c-fc24f2f000a1</id>
      <masked>false</masked>
      <name>CompressEnable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>532f1788-4ebf-4fec-86f4-46f63e37e877</id>
      <masked>false</masked>
      <name>Limit</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>79c5d5eb-aa35-49ff-995e-ed963f2a9d7f</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>32d29703-dec7-4f43-b086-c962e8b84862</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>6747b3b4-b0b3-4bd0-8de5-b3ccdb37d684</id>
      <masked>false</masked>
      <name>sendNotification</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>4fa3e03a-9ae8-4cb0-b104-24206b792c6b</id>
      <masked>false</masked>
      <name>pvc</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>63f8c3c2-fa40-4270-8fc4-c65bafaeff5d</id>
      <masked>false</masked>
      <name>sftp</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>febf62d0-72d8-48b8-a77d-342f08c0c6db</id>
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
