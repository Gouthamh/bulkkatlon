<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>fileintnemtion</name>
   <tag></tag>
   <elementGuidId>1db27473-8aff-4e29-adcc-0d94684ab4ed</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;File\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;FileFormat\&quot;: {\n        \&quot;NoOfFields\&quot;: 7,\n        \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n        \&quot;FileUploadPath\&quot;: \&quot;/data/\&quot;,\n        \&quot;IsHeaderPresent\&quot;: false,\n        \&quot;CompressFiles\&quot;: true,\n        \&quot;HouseKeepingEnable\&quot;: true,\n        \&quot;DeleteDays\&quot;: 1\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;REST\&quot;,\n        \&quot;sendNotification\&quot;: true,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;notificationId\&quot;: \&quot;{:0}\&quot;,\n            \&quot;msisdn\&quot;: \&quot;{:0}\&quot;,\n            \&quot;shortCode\&quot;: \&quot;{:1}\&quot;,\n            \&quot;emailTo\&quot;: \&quot;{:3}\&quot;,\n            \&quot;systemId\&quot;: \&quot;{:4}\&quot;,\n            \&quot;inputValue\&quot;: {\n                \&quot;amount\&quot;: 35000.1234566,\n                \&quot;Name\&quot;: \&quot;{:2}\&quot;,\n                \&quot;DataPlan\&quot;: true\n            }\n        },\n        \&quot;Method\&quot;: \&quot;POST\&quot;,\n        \&quot;PlaceholderType\&quot;: 1,\n        \&quot;EndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;IsAuthenticationRequired\&quot;: false,\n        \&quot;username\&quot;: \&quot;\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: ${Notify},\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/bNotification1221\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {\n                \&quot;notificationId\&quot;: 37190,\n                \&quot;emailTo\&quot;: \&quot;Gouthamraj.kr@tecnotree.com\&quot;\n            }\n        }\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-05-09T12:39:16.093Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-05-10T04:19:17.224Z\&quot;\n}&quot;,
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
      <webElementGuid>153816bb-e855-4c58-8cca-efcb5b48e5e9</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=831</restUrl>
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
      <id>fbaca963-2d37-45d7-aa7d-34ab2d34bf21</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3ef72a2c-7830-4cd6-9dcb-44576e76fdc3</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>1dc017c8-7103-4e33-bc05-d57e4f84e674</id>
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
