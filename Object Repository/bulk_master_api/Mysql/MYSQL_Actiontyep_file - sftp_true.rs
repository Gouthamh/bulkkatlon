<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>MYSQL_Actiontyep_file - sftp_true</name>
   <tag></tag>
   <elementGuidId>5822be2c-a6d5-4f72-8255-8a8de36e96ec</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-MYSQL\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;MySqlParameters\&quot;: {\n        \&quot;NodeId\&quot;: \&quot;4909\&quot;,\n        \&quot;SqlQuery\&quot;: \&quot;SELECT notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount FROM smdb.BulkNotificationServices\&quot;,\n        \&quot;FetchSize\&quot;: \&quot;1000\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;10\&quot;,\n        \&quot;OffsetEnable\&quot;: true\n    },\n    \&quot;Action\&quot;: {\n        \&quot;RetryEnable\&quot;:${RetryEnable},\n        \&quot;FileHeaders\&quot;: \&quot;${FileHeaders}\&quot;,\n        \&quot;IsHeaderEnable\&quot;: ${IsHeaderEnable},\n        \&quot;SftpEnable\&quot;: ${SftpEnable},\n        \&quot;CompressEnable\&quot;: ${CompressEnable},\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/mysql\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;YYYY:MM:dd:ns\&quot;,\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;,\n\t\t\&quot;SftpNode\&quot;: \&quot;7441\&quot;,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;sendNotification\&quot;: false,\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: true,\n                \&quot;sftp\&quot;: true\n            },\n            \&quot;endPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n            \&quot;templateCode\&quot;: \&quot;vi_bill_generate\&quot;,\n            \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;msisdn\&quot;: \&quot;900001\&quot;\n        },\n        \&quot;Notify\&quot;: false,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/dap_5206_1\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {}\n        }\n    },\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: false\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-10-27T06:31:27.058Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-10-27T06:31:46.918Z\&quot;\n}&quot;,
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
      <webElementGuid>ab7e1b33-7b9d-474a-a89e-35aabd695faa</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.5</katalonVersion>
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
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>8f77ddd9-4884-491d-bd92-10ceb2188f6f</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>4ee4b7f8-8798-4462-ba45-d6c5465aea3d</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>3346b3a0-d2f2-4d9f-86a5-7c7cdaf00579</id>
      <masked>false</masked>
      <name>RetryEnable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>3b5caac2-278a-438d-8d3f-7b5559b9f0fb</id>
      <masked>false</masked>
      <name>FileHeaders</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>72f2cc85-8ed2-43dc-94ec-0c4fe5079b8b</id>
      <masked>false</masked>
      <name>IsHeaderEnable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>45145767-2b53-482d-a9bf-d086978b72f1</id>
      <masked>false</masked>
      <name>SftpEnable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>f2bb3b65-1c5c-4b90-a2ea-127efd4dc1fd</id>
      <masked>false</masked>
      <name>CompressEnable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>53c2cf85-3e98-45f5-92d8-bc331739af93</id>
      <masked>false</masked>
      <name>Limit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>a5a6ddec-9316-4674-b351-af10eccbd681</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>bc6502c5-38c2-44e8-99cc-ac1ce768679f</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
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
