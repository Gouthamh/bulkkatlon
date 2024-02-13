<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>api_inte</name>
   <tag></tag>
   <elementGuidId>be650d80-c8ef-4a5b-9188-e71e88208ec7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;mysql-post-bulk-service\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-MYSQL\&quot;,\n    \&quot;BulkID\&quot;: 804,\n    \&quot;MySqlParameters\&quot;: {\n        \&quot;NodeId\&quot;: \&quot;4909\&quot;,\n        \&quot;SqlQuery\&quot;: \&quot;SELECT notificationId,emailTo,shortCode,msisdn,systemId,Name,DataPlan,amount FROM smdb.bulkdata where DataPlan \u003c{:inputValue.DataPlan}\&quot;,\n        \&quot;FetchSize\&quot;: \&quot;100\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;100\&quot;,\n        \&quot;OffsetEnable\&quot;: true\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;REST\&quot;,\n        \&quot;Method\&quot;: \&quot;POST\&quot;,\n        \&quot;EndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;notificationId\&quot;: 0,\n            \&quot;msisdn\&quot;: 1,\n            \&quot;shortCode\&quot;: 2,\n            \&quot;msgGroupId\&quot;: 3,\n            \&quot;emailTo\&quot;: 4,\n            \&quot;systemId\&quot;: 5,\n            \&quot;inputValue\&quot;: {\n                \&quot;amount\&quot;: 6,\n                \&quot;Name\&quot;: \&quot;Puneeth\&quot;,\n                \&quot;DataPlan\&quot;: 7\n            }\n        },\n        \&quot;Headers\&quot;: {},\n        \&quot;PlaceholderType\&quot;: 0,\n        \&quot;IsAuthenticationRequired\&quot;: false,\n        \&quot;username\&quot;: \&quot;\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: true,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap-orchestration-workflownitiator.dap-ns:8080/DAP/workflow/bNotification1221\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {\n                \&quot;notificationId\&quot;: 37190,\n                \&quot;emailTo\&quot;: \&quot;Gouthamraj.kr@tecnotree.com\&quot;\n            }\n        }\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-05-08T06:15:51.039Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-05-08T06:16:08.517Z\&quot;\n}&quot;,
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
      <webElementGuid>8af86d8b-c3bf-4a16-ba91-c472cf931f62</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=804</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
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
