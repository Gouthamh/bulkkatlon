<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>groupby</name>
   <tag></tag>
   <elementGuidId>20b255bb-5dfa-4740-b000-3afcafedc1b6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;File\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;FileFormat\&quot;: {\n        \&quot;NoOfFields\&quot;: 5,\n        \&quot;MandatoryFields\&quot;: \&quot;0\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n        \&quot;FileUploadPath\&quot;: \&quot;/data/\&quot;,\n        \&quot;groupId\&quot;: \&quot;msisdn\&quot;,\n        \&quot;IsHeaderPresent\&quot;: false,\n        \&quot;HouseKeepingEnable\&quot;: false,\n        \&quot;CompressFiles\&quot;: false\n    },\n    \&quot;CassandraDBParameters\&quot;: {\n        \&quot;CqlQuery\&quot;: \&quot;\&quot;,\n        \&quot;NodeId\&quot;: \&quot;\&quot;\n    },\n    \&quot;Action\&quot;: {\n        \&quot;CompressEnable\&quot;: true,\n        \&quot;Protocol\&quot;: \&quot;REST\&quot;,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;,\n        \&quot;TTL\&quot;: \&quot;3600\&quot;,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;boltonCode\&quot;: 0,\n            \&quot;timeband\&quot;: 1,\n            \&quot;origin\&quot;: 2,\n            \&quot;destination\&quot;: 3,\n            \&quot;msisdn\&quot;: 4,\n            \&quot;status\&quot;: 5\n        },\n        \&quot;Method\&quot;: \&quot;POST\&quot;,\n        \&quot;PlaceholderType\&quot;: 0,\n        \&quot;EndPoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/dap_5206_1\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;IsAuthenticationRequired\&quot;: false,\n        \&quot;username\&quot;: \&quot;\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: false,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;\&quot;,\n            \&quot;Method\&quot;: \&quot;\&quot;,\n            \&quot;Payload\&quot;: {}\n        }\n    },\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: false\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-09-26T15:12:53.481Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-09-26T15:13:09.512Z\&quot;\n}&quot;,
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
      <webElementGuid>fe788528-3051-4b12-ab34-2b2b7352060b</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=895</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.GroupID_BulkID</defaultValue>
      <description></description>
      <id>aa5e11a1-5554-43b8-9e14-12838ffafae0</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.GroupID_BulkProcess</defaultValue>
      <description></description>
      <id>a84c4262-00cd-4acf-b97d-87823e838713</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
