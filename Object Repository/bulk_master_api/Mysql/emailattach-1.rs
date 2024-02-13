<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>emailattach-1</name>
   <tag></tag>
   <elementGuidId>24e7350a-31a9-4a26-9fe8-3d6f275c8ad1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-MYSQL\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;Action\&quot;: {\n        \&quot;RetryEnable\&quot;: false,\n        \&quot;FileHeaders\&quot;: \&quot;\&quot;,\n        \&quot;IsHeaderEnable\&quot;: false,\n        \&quot;SftpEnable\&quot;: false,\n        \&quot;SendEmailAsAttachment\&quot;: ${SendEmailAsAttachment},\n        \&quot;NotificationEndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotificationForEmailAttachment\&quot;,\n        \&quot;TemplateCode\&quot;: \&quot;Attached\&quot;,\n        \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n        \&quot;CompressEnable\&quot;: ${CompressEnable},\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/mysql\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;YYYY-MM-dd-hh-mm-ss-ns\&quot;,\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;,\n        \&quot;EolDelimiter\&quot;: \&quot;---\u003e\&quot;\n\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;sendNotification\&quot;: false,\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: true,\n                \&quot;sftp\&quot;: true\n            },\n            \&quot;endPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n            \&quot;templateCode\&quot;: \&quot;vi_bill_generate\&quot;,\n            \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;msisdn\&quot;: \&quot;900001\&quot;\n        },\n        \&quot;Notify\&quot;: false,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/dap_5206_1\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {}\n        }\n    },\n    \&quot;MySqlParameters\&quot;: {\n        \&quot;NodeId\&quot;: \&quot;4909\&quot;,\n        \&quot;SqlQuery\&quot;: \&quot;SELECT notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount FROM smdb.BulkNotificationServices\&quot;,\n        \&quot;FetchSize\&quot;: \&quot;1000\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;${StopLimit}\&quot;,\n        \&quot;OffsetEnable\&quot;: ${OffsetEnable},\n        \&quot;nullHandler\&quot;: false\n    },\n    \&quot;nullHandler\&quot;: false,\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: false\n    }\n}&quot;,
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
      <webElementGuid>3084d6dd-5483-42a5-92e0-e626f4739fae</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://${URL}/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=911</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>7299e8a9-f886-4b94-88ad-f853991e4d2f</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.POST_bulkProcess</defaultValue>
      <description></description>
      <id>154a7e94-7091-4204-a3dd-921fcc8171b0</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.POST_bulkID</defaultValue>
      <description></description>
      <id>1fb85f40-b63c-49f6-ba2e-185909feecd0</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_true</defaultValue>
      <description></description>
      <id>d5183cca-40cc-4acb-88dc-46299122c621</id>
      <masked>false</masked>
      <name>SendEmailAsAttachment</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>84c2bfb3-586a-47ad-8486-0495a587f892</id>
      <masked>false</masked>
      <name>CompressEnable</name>
   </variables>
   <variables>
      <defaultValue>'.csv'</defaultValue>
      <description></description>
      <id>ba046932-e3bf-408a-aac6-a6bbad084207</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>'|'</defaultValue>
      <description></description>
      <id>5940c857-0a1e-46f0-9a6e-b8be91b8d086</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.offsetiszero</defaultValue>
      <description></description>
      <id>a234403d-ed53-49e6-818e-314300714a2b</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>16cad1ef-c953-4601-8b9a-5a50bf091712</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6851cce2-8784-44fa-b6ad-2048bdf1a2ee</id>
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
