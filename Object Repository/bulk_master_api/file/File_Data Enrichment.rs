<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>File_Data Enrichment</name>
   <tag></tag>
   <elementGuidId>d936b0ef-bb5b-4722-af9b-b46a104f234e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;File\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;FileFormat\&quot;: {\n        \&quot;NoOfFields\&quot;: 7,\n        \&quot;MandatoryFields\&quot;: \&quot;0\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n        \&quot;FileUploadPath\&quot;: \&quot;/data/\&quot;,\n        \&quot;groupId\&quot;: \&quot;\&quot;,\n        \&quot;IsHeaderPresent\&quot;: false,\n        \&quot;HouseKeepingEnable\&quot;: false,\n        \&quot;CompressFiles\&quot;: false\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;REST\&quot;,\n        \&quot;EndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dap-is/insertforautomation\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;username\&quot;: \&quot;\&quot;,\n        \&quot;Method\&quot;: \&quot;POST\&quot;,\n        \&quot;PlaceholderType\&quot;: 1,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;Approver\&quot;: {\n                \&quot;email_address\&quot;: 1,\n                \&quot;name\&quot;: \&quot;{:headerMap.transetionid}\&quot;,\n                \&quot;role\&quot;: \&quot;{:requestMap.Approver.role}\&quot;\n            },\n            \&quot;Customer\&quot;: [\n                {\n                    \&quot;email_address\&quot;: \&quot;2023-10-09\&quot;,\n                    \&quot;name\&quot;: \&quot;{:responseMap.finalResponse.response.Customer[0].name}\&quot;,\n                    \&quot;role\&quot;: \&quot;{:responseMap.finalResponse.response.Customer[0].role}\&quot;\n                }\n            ],\n            \&quot;Presenter\&quot;: {\n                \&quot;email_address\&quot;: \&quot;{:1}\&quot;,\n                \&quot;name\&quot;: 8,\n                \&quot;role\&quot;: \&quot;{:requestMap.Presenter.role}\&quot;\n            }\n        },\n        \&quot;IsAuthenticationRequired\&quot;: false\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: false,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dap-is/Timestameforbulkserviceinintegration\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {}\n        }\n    },\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: true,\n        \&quot;endPoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/dap_5206_1\&quot;,\n        \&quot;method\&quot;: \&quot;POST\&quot;,\n        \&quot;requestPayload\&quot;: {\n            \&quot;Approver\&quot;: {\n                \&quot;email_address\&quot;: \&quot;{:requestMap.Approver.email_address}\&quot;,\n                \&quot;name\&quot;: \&quot;Tim\&quot;,\n                \&quot;role\&quot;: \&quot;{:requestMap.Approver.role}\&quot;\n            },\n            \&quot;Customer\&quot;: [\n                {\n                    \&quot;email_address\&quot;: \&quot;2023-10-09\&quot;,\n                    \&quot;name\&quot;: \&quot;{:requestMap.Customer[0].name}\&quot;,\n                    \&quot;role\&quot;: \&quot;{:0}\&quot;\n                }\n            ],\n            \&quot;Presenter\&quot;: {\n                \&quot;email_address\&quot;: \&quot;{:1}\&quot;,\n                \&quot;name\&quot;: 8,\n                \&quot;role\&quot;: \&quot;{:3}\&quot;\n            }\n        }\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-10-20T06:24:06.101Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-10-20T06:26:23.109Z\&quot;\n}&quot;,
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
      <webElementGuid>e4fa5fb2-31ca-4857-b31f-f31f53736f23</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=${BulkID}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.Notification_BulkProcess</defaultValue>
      <description></description>
      <id>7d31ffb1-6931-4231-bbd7-73b0ded53349</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Notification_BulkID</defaultValue>
      <description></description>
      <id>fe213baa-7c25-4456-ba97-25fc36716f9f</id>
      <masked>false</masked>
      <name>BulkID</name>
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
