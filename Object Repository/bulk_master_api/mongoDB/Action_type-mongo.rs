<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Action_type-mongo</name>
   <tag></tag>
   <elementGuidId>13e5ab5d-7156-4823-bf5f-3eeb17ec5a06</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-MONGO\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;MONGODBParameters\&quot;: {\n        \&quot;FetchSize\&quot;: \&quot;100\&quot;,\n        \&quot;NodeId\&quot;: \&quot;4929\&quot;,\n        \&quot;collectionName\&quot;: \&quot;MONGO_DB_BULK_TEST\&quot;,\n        \&quot;MongoDbQuery\&quot;: \&quot;{}\&quot;,\n        \&quot;returnParams\&quot;: {\n            \&quot;_id\&quot;: 0\n        },\n        \&quot;Order\&quot;: [\n            \&quot;{:_id}\&quot;,\n            \&quot;{:notificationId}\&quot;,\n            \&quot;{:shortCode}\&quot;,\n            \&quot;{:msisdn}\&quot;,\n            \&quot;{:emailTo}\&quot;,\n            \&quot;{:systemId}\&quot;,\n            \&quot;{:inputValue.amount}\&quot;,\n            \&quot;{:inputValue.Name}\&quot;,\n            \&quot;{:inputValue.balance}\&quot;,\n            \&quot;{:inputValue.DataPlan}\&quot;\n        ],\n        \&quot;StopLimit\&quot;: \&quot;${StopLimit}\&quot;,\n        \&quot;OffsetEnable\&quot;: ${OffsetEnable}\n    },\n    \&quot;Action\&quot;: {\n        \&quot;RetryEnable\&quot;: ${RetryEnable},\n        \&quot;RetryServiceName\&quot;: \&quot;cache-sync-bulk-service\&quot;,\n        \&quot;RetryMapTTL\&quot;: \&quot;3600\&quot;,\n        \&quot;RetryEndpoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/RetryEngine/createRetryRequest\&quot;,\n        \&quot;FileHeaders\&quot;: [\n            \&quot;{:emailUserInput.notificationId}\&quot;,\n            \&quot;{:emailUserInput.msisdn}\&quot;,\n            \&quot;{:emailUserInput.emailTo}\&quot;,\n            \&quot;{:emailUserInput.inputValue.DataPlan}\&quot;,\n            \&quot;{:emailUserInput.inputValue.Name}\&quot;,\n            \&quot;{:emailUserInput.inputValue.amount}\&quot;,\n            \&quot;{:emailUserInput.shortCode}\&quot;,\n            \&quot;{:emailUserInput.systemId}\&quot;,\n            \&quot;{:fileData}\&quot;,\n            \&quot;{:filename}\&quot;\n        ],\n        \&quot;IsHeaderEnable\&quot;: ${IsHeaderEnable},\n        \&quot;SftpEnable\&quot;: ${SftpEnable},\n        \&quot;CompressEnable\&quot;: ${CompressEnable},\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;,\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;SftpNode\&quot;: \&quot;7441\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/mongo\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;ns\&quot;,\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;sendNotification\&quot;: ${sendNotification},\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: ${pvc},\n                \&quot;sftp\&quot;: ${sftp}\n            },\n            \&quot;endPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n            \&quot;templateCode\&quot;: \&quot;vi_bill_generate\&quot;,\n            \&quot;emailTo\&quot;: \&quot; gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;msisdn\&quot;: \&quot; 9001\&quot;\n        },\n        \&quot;Notify\&quot;: true,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/dap_5206_1\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {\n                \&quot;filename\&quot;: \&quot;{:generatedFiles}\&quot;\n            }\n        }\n    },\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: ${enrichEnable},\n        \&quot;endPoint\&quot;: \&quot;https://dap.pe-lab3.bdc-rancher.tecnotree.com/DAP/workflow/dap_5206_1\&quot;,\n        \&quot;method\&quot;: \&quot;POST\&quot;,\n        \&quot;requestPayload\&quot;: {\n            \&quot;Offset\&quot;: \&quot;{:requestMap.Offset}\&quot;,\n            \&quot;bulk-select-serv\&quot;: {\n                \&quot;response\&quot;: [\n                    {\n                        \&quot;IP_PORT\&quot;: \&quot;12331\&quot;,\n                        \&quot;ID\&quot;: \&quot;1\&quot;,\n                        \&quot;NAME\&quot;: \&quot;iqo31\&quot;,\n                        \&quot;IP_ADRESS\&quot;: \&quot;12331\&quot;\n                    },\n                    {\n                        \&quot;IP_PORT\&quot;: \&quot;1221\&quot;,\n                        \&quot;ID\&quot;: \&quot;2\&quot;,\n                        \&quot;NAME\&quot;: \&quot;iqo32\&quot;,\n                        \&quot;IP_ADRESS\&quot;: \&quot;123312\&quot;\n                    },\n                    {\n                        \&quot;IP_PORT\&quot;: \&quot;1331\&quot;,\n                        \&quot;ID\&quot;: \&quot;3\&quot;,\n                        \&quot;NAME\&quot;: \&quot;iq332\&quot;,\n                        \&quot;IP_ADRESS\&quot;: \&quot;{:requestMap.bulk-select-serv.response[0].IP_ADRESS}\&quot;\n                    }\n                ]\n            }\n        },\n        \&quot;enrichedRecord\&quot;: [\n            \&quot;{:0}\&quot;,\n            \&quot;{:1}\&quot;,\n            \&quot;{:2}\&quot;,\n            \&quot;{:3}\&quot;,\n            \&quot;{:4}\&quot;,\n            \&quot;{:responseMap.finalResponse.response[\\\&quot;bulk-select-serv\\\&quot;].response[2].IP_ADRESS}\&quot;,\n            \&quot;{:requestMap.Offset}\&quot;\n        ]\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-10-30T09:32:18.757Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-10-30T09:33:26.386Z\&quot;\n}&quot;,
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
      <webElementGuid>77fd6ab4-e379-4cf3-8918-23af997bf7fe</webElementGuid>
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
      <defaultValue>'cache-sync-bulk-service'</defaultValue>
      <description></description>
      <id>7272bbbf-743a-4e77-90e6-c09b287af6b8</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>901</defaultValue>
      <description></description>
      <id>dbab3769-d1fb-4c6f-b594-a77beb0e30b8</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>bfd245e0-ab2c-4f8f-b0b5-d3c4e848ffa8</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
   </variables>
   <variables>
      <defaultValue>'10'</defaultValue>
      <description></description>
      <id>1985b606-abcc-400e-9371-ad340f5cbbd7</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>af8f8e6b-e733-4c49-ba60-377b61b3aec7</id>
      <masked>false</masked>
      <name>RetryEnable</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>fadc3f88-ab32-47c8-b588-59891fdb675f</id>
      <masked>false</masked>
      <name>IsHeaderEnable</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>382ee996-accf-41fd-8e7a-050ab860ba83</id>
      <masked>false</masked>
      <name>SftpEnable</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>e8d282bb-ee3b-42f0-8090-c0c3152a3b3d</id>
      <masked>false</masked>
      <name>CompressEnable</name>
   </variables>
   <variables>
      <defaultValue>'.csv'</defaultValue>
      <description></description>
      <id>b0c2691b-447e-4b3f-a680-67c61ccac710</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>'|'</defaultValue>
      <description></description>
      <id>ca2ec988-69be-4827-b3ba-3b55f04e34c7</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>c8049cd3-01d4-4800-b53c-9e79ecd03d42</id>
      <masked>false</masked>
      <name>sendNotification</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>f58db7b3-2506-4eaa-9b40-bdb3a83d1a97</id>
      <masked>false</masked>
      <name>pvc</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>c0887c08-33df-40f7-b23a-840d484f3ced</id>
      <masked>false</masked>
      <name>sftp</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>5bc725ed-9bb5-4e78-b338-17f310b18cbe</id>
      <masked>false</masked>
      <name>enrichEnable</name>
   </variables>
   <variables>
      <defaultValue>'0'</defaultValue>
      <description></description>
      <id>a7c57529-3f3b-4f0e-8c66-90880d73430a</id>
      <masked>false</masked>
      <name>Limit</name>
   </variables>
   <variables>
      <defaultValue>false</defaultValue>
      <description></description>
      <id>bc9dff55-f473-4fba-8833-f87ec5fbf13c</id>
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
