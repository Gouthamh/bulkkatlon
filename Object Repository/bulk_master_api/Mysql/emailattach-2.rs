<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>emailattach-2</name>
   <tag></tag>
   <elementGuidId>66b5fb6b-5a76-48fa-9a74-bba3955ffbab</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-MYSQL\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;Action\&quot;: {\n        \&quot;RetryEnable\&quot;: false,\n        \&quot;FileHeaders\&quot;: \&quot;\&quot;,\n        \&quot;IsHeaderEnable\&quot;: ${IsHeaderEnable},\n        \&quot;SftpEnable\&quot;: true,\n        \&quot;SendEmailAsAttachment\&quot;: ${SendEmailAsAttachment},\n        \&quot;NotificationEndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotificationForEmailAttachment\&quot;,\n        \&quot;TemplateCode\&quot;: \&quot;Attached\&quot;,\n        \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n        \&quot;CompressEnable\&quot;: false,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;,\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;EolDelimiter\&quot;: \&quot;---\u003e\&quot;,\n        \&quot;SftpNode\&quot;: \&quot;7441\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/mysql\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;YYYY-MM-dd-hh-mm-ss-ns\&quot;,\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;sendNotification\&quot;: false,\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: true,\n                \&quot;sftp\&quot;: true\n            },\n            \&quot;endPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n            \&quot;templateCode\&quot;: \&quot;vi_bill_generate\&quot;,\n            \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;msisdn\&quot;: \&quot;900001\&quot;\n        },\n        \&quot;Notify\&quot;: false,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/dap_5206_1\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {}\n        }\n    },\n    \&quot;MySqlParameters\&quot;: {\n        \&quot;NodeId\&quot;: \&quot;4909\&quot;,\n        \&quot;SqlQuery\&quot;: \&quot;SELECT notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount FROM smdb.BulkNotificationServices\&quot;,\n        \&quot;FetchSize\&quot;: \&quot;1000\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;0\&quot;,\n        \&quot;OffsetEnable\&quot;: false,\n        \&quot;nullHandler\&quot;: false\n    },\n    \&quot;nullHandler\&quot;: false,\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: false\n    }\n}&quot;,
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
      <webElementGuid>b3210b9a-b5c3-47c2-8f72-8817ff719375</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://${URL}/dapBulkProcess/configure/UpdateBulkMasterConfig</restUrl>
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
      <id>8ca9476f-55b0-4278-a012-91238157038f</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.POST_bulkProcess</defaultValue>
      <description></description>
      <id>5dc50f02-a5a0-4b3f-8871-9f84f7033eeb</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.POST_bulkID</defaultValue>
      <description></description>
      <id>cff0da39-a94d-4024-8f53-2efcc05eb573</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>a358bf2e-7278-4294-a5c3-ce475f6fa1ac</id>
      <masked>false</masked>
      <name>IsHeaderEnable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_true</defaultValue>
      <description></description>
      <id>e1ab9022-c547-4d8d-8d47-905d583227a7</id>
      <masked>false</masked>
      <name>SendEmailAsAttachment</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.offsetiszero</defaultValue>
      <description></description>
      <id>f403e4cb-9895-4f85-a18a-54f53e78fd4a</id>
      <masked>false</masked>
      <name>Limit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.FileExtension</defaultValue>
      <description></description>
      <id>b6c4f314-57c4-4fb9-a2d4-8117950b22cb</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.FieldSeparator</defaultValue>
      <description></description>
      <id>38073866-b274-4857-87dc-bd192a30fdbc</id>
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
