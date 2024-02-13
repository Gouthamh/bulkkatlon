<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>oracel_Api_int</name>
   <tag></tag>
   <elementGuidId>10ec2f31-f775-4bd3-817a-9ad41fe05723</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-ORACLE\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;OracleDBParameters\&quot;: {\n        \&quot;FetchSize\&quot;: \&quot;1000\&quot;,\n        \&quot;NodeId\&quot;: \&quot;5398\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;${StopLimit}\&quot;,\n        \&quot;OracleQuery\&quot;: \&quot;SELECT ID,account_holder,account_number FROM CBS_TBL_DEV.ACCOUNT_DEL WHERE id\u003c{:id}\&quot;,\n        \&quot;OffsetEnable\&quot;: \&quot;${OffsetEnable}\&quot;\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;REST\&quot;,\n        \&quot;EndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;username\&quot;: \&quot;\&quot;,\n        \&quot;Method\&quot;: \&quot;POST\&quot;,\n        \&quot;PlaceholderType\&quot;: 0,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;notificationId\&quot;: 0,\n            \&quot;msisdn\&quot;: 0,\n            \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;inputValue\&quot;: {\n                \&quot;Phone\&quot;: \&quot;9182\&quot;,\n                \&quot;Name\&quot;: 1,\n                \&quot;LastName\&quot;: 4,\n                \&quot;amount\&quot;: 1,\n                \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n                \&quot;DataPlan\&quot;: 2\n            },\n            \&quot;shortCode\&quot;: \&quot;8001\&quot;,\n            \&quot;systemId\&quot;: \&quot;smppclient12455\&quot;\n        },\n        \&quot;IsAuthenticationRequired\&quot;: false\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: true,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/bNotification1221\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {\n                \&quot;notificationId\&quot;: 37190,\n                \&quot;emailTo\&quot;: \&quot;Gouthamraj.kr@tecnotree.com\&quot;\n            }\n        }\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-05-08T07:07:01.703Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-05-08T07:28:46.939Z\&quot;\n}\n&quot;,
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
      <webElementGuid>191b4fd3-474d-4e8a-a402-6c2700419863</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=101</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'oracledb-test'</defaultValue>
      <description></description>
      <id>76d61ff0-9a8e-4053-9cca-d335ef92681c</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>'101'</defaultValue>
      <description></description>
      <id>de453413-b1ec-47e4-9d5d-7008727fea34</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>100</defaultValue>
      <description></description>
      <id>0891cc58-cc96-452c-aeac-1604de5a6156</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>a249c987-77ff-4887-9d12-e08eaef98ee1</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
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
