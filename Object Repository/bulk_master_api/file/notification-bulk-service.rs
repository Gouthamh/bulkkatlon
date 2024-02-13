<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>notification-bulk-service</name>
   <tag></tag>
   <elementGuidId>6197835d-2f57-45c2-b033-7f9d0bb75005</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\n{\n    \&quot;ServiceName\&quot; : \&quot;${ServiceName}\&quot;,\n    \&quot;BulkID\&quot; : ${BulkID},\n    \&quot;BulkType\&quot; : \&quot;File\&quot;,\n    \&quot;FileFormat\&quot; : {\n        \&quot;NoOfFields\&quot; : 7,\n        \&quot;MandatoryFields\&quot; : \&quot;${MandatoryFields}\&quot;,\n        \&quot;FieldSeparator\&quot; : \&quot;|\&quot;,\n        \&quot;FileUploadPath\&quot; : \&quot;/data/\&quot;,\n        \&quot;groupId\&quot; : \&quot;\&quot;,\n        \&quot;IsHeaderPresent\&quot; : false,\n        \&quot;HouseKeepingEnable\&quot; : false,\n        \&quot;CompressFiles\&quot; : ${CompressFiles},\n\t\t\&quot;SkipRowCount\&quot;: ${SkipRowCount}\n    },\n    \&quot;Action\&quot; : {\n        \&quot;Protocol\&quot; : \&quot;REST\&quot;,\n        \&quot;EndPoint\&quot; : \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n        \&quot;Headers\&quot; : {},\n        \&quot;username\&quot; : \&quot;\&quot;,\n        \&quot;Method\&quot; : \&quot;POST\&quot;,\n        \&quot;PlaceholderType\&quot; : 1,\n        \&quot;RequestFormat\&quot; : {\n            \&quot;notificationId\&quot; : \&quot;{:0}\&quot;,\n            \&quot;emailTo\&quot; : \&quot;{:1}\&quot;,\n            \&quot;shortCode\&quot; : \&quot;{:2}\&quot;,\n            \&quot;msisdn\&quot; : \&quot;{:6}\&quot;,\n            \&quot;systemId\&quot; : \&quot;{:3}\&quot;,\n            \&quot;inputValue\&quot; : {\n                \&quot;amount\&quot; : \&quot;11.22\&quot;,\n                \&quot;balance\&quot; : \&quot;12.20\&quot;,\n                \&quot;Name\&quot; : \&quot;{:4}\&quot;,\n                \&quot;DataPlan\&quot; : \&quot;{:5}\&quot;\n            }\n        },\n        \&quot;IsAuthenticationRequired\&quot; : false\n    },\n    \&quot;processCompletionIntimation\&quot; : {\n        \&quot;Notify\&quot; : false,\n        \&quot;intimateProcessCompletion\&quot; : {\n            \&quot;RestEndoint\&quot; : \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dap-is/Timestameforbulkserviceinintegration\&quot;,\n            \&quot;Method\&quot; : \&quot;POST\&quot;,\n            \&quot;Payload\&quot; : {}\n        }\n    },\n    \&quot;enrichData\&quot; : {\n        \&quot;enrichEnable\&quot; : false\n    },\n    \&quot;_class\&quot; : \&quot;com.tecnotree.dap.bulk.document.BulkMasterConfigurationDocument\&quot;\n}&quot;,
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
      <webElementGuid>28551b14-415c-4b34-a9bc-f35640f48a22</webElementGuid>
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
      <defaultValue>GlobalVariable.Notification_BulkProcess</defaultValue>
      <description></description>
      <id>bd836a84-53fc-4145-b606-99c8e98d6f64</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Notification_BulkID</defaultValue>
      <description></description>
      <id>6ede235e-e171-4b65-93a2-f25064b1c5e4</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>04c65dbd-7ea1-4e9c-89a2-d0eb205edbeb</id>
      <masked>false</masked>
      <name>MandatoryFields</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>905e697d-3566-4b3e-b85e-fb4ce8a5c3eb</id>
      <masked>false</masked>
      <name>SkipRowCount</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>33d1c9c7-181d-4356-a389-c420c0d34a3d</id>
      <masked>false</masked>
      <name>CompressFiles</name>
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
