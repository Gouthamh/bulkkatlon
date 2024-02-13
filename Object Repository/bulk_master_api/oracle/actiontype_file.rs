<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>actiontype_file</name>
   <tag></tag>
   <elementGuidId>971fc346-e680-4a8f-94d9-2d121d7113de</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-ORACLE\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;OracleDBParameters\&quot;: {\n        \&quot;FetchSize\&quot;: \&quot;100\&quot;,\n        \&quot;NodeId\&quot;: \&quot;5398\&quot;,\n        \&quot;OracleQuery\&quot;: \&quot;SELECT ID,account_holder,account_number FROM CBS_TBL_DEV.ACCOUNT_DEL\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;10\&quot;,\n        \&quot;OffsetEnable\&quot;: ${OffsetEnable}\n    },\n    \&quot;Action\&quot;: {\n        \&quot;RetryEnable\&quot;: ${RetryEnable},\n        \&quot;FileHeaders\&quot;: [\n            \&quot;ID\&quot;,\n            \&quot;account_holder\&quot;,\n            \&quot;account_number\&quot;\n        ],\n        \&quot;IsHeaderEnable\&quot;: ${IsHeaderEnable},\n        \&quot;SftpEnable\&quot;: ${SftpEnable},\n        \&quot;CompressEnable\&quot;: ${CompressEnable},\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;EolDelimiter\&quot;: \&quot;---\u003e\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/oracel\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;ns\&quot;,\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;,\n        \&quot;SftpNode\&quot;: \&quot;3326\&quot;,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;,\n        \&quot;RetryServiceName\&quot;: \&quot;SFTP_for_groupid\&quot;,\n        \&quot;RetryMapTTL\&quot;: \&quot;3600\&quot;,\n        \&quot;RetryEndpoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/RetryEngine/createRetryRequest\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;sendNotification\&quot;: ${sendNotification},\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: ${pvc},\n                \&quot;sftp\&quot;: ${sftp}\n            },\n            \&quot;endPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n            \&quot;templateCode\&quot;: \&quot;vi_bill_generate\&quot;,\n            \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;msisdn\&quot;: \&quot;90000000001\&quot;\n        },\n        \&quot;Notify\&quot;: ${Notify},\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dap-is/Timestameforbulkserviceinintegration\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {\n                \&quot;accounting\&quot;: [\n                    {\n                        \&quot;firstName\&quot;: \&quot;{:requestMap.accounting[0].firstName}\&quot;,\n                        \&quot;lastName\&quot;: \&quot;{:requestMap.accounting[0].lastName}\&quot;,\n                        \&quot;age\&quot;: \&quot;{:requestMap.accounting[0].age}\&quot;\n                    },\n                    {\n                        \&quot;firstName\&quot;: \&quot;{:0}\&quot;,\n                        \&quot;lastName\&quot;: \&quot;{:1}\&quot;,\n                        \&quot;age\&quot;: \&quot;{:2}\&quot;\n                    }\n                ],\n                \&quot;sales\&quot;: [\n                    {\n                        \&quot;firstName\&quot;: true,\n                        \&quot;lastName\&quot;: 1e+46,\n                        \&quot;age\&quot;: \&quot;{:3}\&quot;\n                    },\n                    {\n                        \&quot;firstName\&quot;: \&quot;Jim\&quot;,\n                        \&quot;lastName\&quot;: \&quot;Galley\&quot;,\n                        \&quot;age\&quot;: 41\n                    }\n                ]\n            }\n        }\n    },\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: false\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-11-06T06:54:06.232Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-11-06T06:58:37.765Z\&quot;\n}&quot;,
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
      <webElementGuid>dbd37fc3-25ae-474f-8a97-730c96308211</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=866</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'ServiceName'</defaultValue>
      <description></description>
      <id>e1d78713-11fe-4e19-bf35-62b5a775f4fa</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>'BulkID'</defaultValue>
      <description></description>
      <id>4e4f5697-50f0-4701-bb3f-9701fa4a4870</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>'IsHeaderEnable'</defaultValue>
      <description></description>
      <id>e1f09102-3568-43d4-952b-0988a19780a6</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
   </variables>
   <variables>
      <defaultValue>'SftpEnable'</defaultValue>
      <description></description>
      <id>17142a65-995d-4022-9031-ff637493b0f5</id>
      <masked>false</masked>
      <name>RetryEnable</name>
   </variables>
   <variables>
      <defaultValue>'Limit'</defaultValue>
      <description></description>
      <id>84dcf1f0-fda8-4d6b-b269-f3190f8afa06</id>
      <masked>false</masked>
      <name>IsHeaderEnable</name>
   </variables>
   <variables>
      <defaultValue>'FileExtension'</defaultValue>
      <description></description>
      <id>c4d95fe6-8d48-463f-a2ef-61588a0e2752</id>
      <masked>false</masked>
      <name>SftpEnable</name>
   </variables>
   <variables>
      <defaultValue>'FieldSeparator'</defaultValue>
      <description></description>
      <id>b74ea608-f33e-4381-abe0-c6b632ceaa9c</id>
      <masked>false</masked>
      <name>CompressEnable</name>
   </variables>
   <variables>
      <defaultValue>'sendNotification'</defaultValue>
      <description></description>
      <id>ba2e12b4-d564-4d9a-9d24-4d25d7e3e388</id>
      <masked>false</masked>
      <name>Limit</name>
   </variables>
   <variables>
      <defaultValue>'pvc'</defaultValue>
      <description></description>
      <id>91205a90-102e-4041-b0db-c9a00f662e6a</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>'sftp'</defaultValue>
      <description></description>
      <id>687afd5c-9e98-4b19-8817-228c82b34105</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
   </variables>
   <variables>
      <defaultValue>'Notify'</defaultValue>
      <description></description>
      <id>cf24401a-7cde-4259-9d43-3c8309b3c3b8</id>
      <masked>false</masked>
      <name>sendNotification</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3520720d-0233-472b-9288-7f6c450c8e1e</id>
      <masked>false</masked>
      <name>pvc</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>0666563f-c3e8-4473-a007-6498ed5a4de4</id>
      <masked>false</masked>
      <name>sftp</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>20d38b35-6f83-4371-b308-601539a871dc</id>
      <masked>false</masked>
      <name>Notify</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>7e469443-786e-4780-bcc2-444d665acadd</id>
      <masked>false</masked>
      <name>variable_2</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>772402c8-a265-4532-b42c-2c03da8e12b5</id>
      <masked>false</masked>
      <name>variable_3</name>
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
