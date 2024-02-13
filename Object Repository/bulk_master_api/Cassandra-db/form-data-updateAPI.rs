<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>form-data-updateAPI</name>
   <tag></tag>
   <elementGuidId>af30c0f7-fa58-4a56-8a02-b8851f10cb93</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;BulkType\&quot;: \&quot;${BulkType}\&quot;,\n    \&quot;Action\&quot;: {\n        \&quot;EndPoint\&quot;: \&quot;${EndPoint}\&quot;,\n        \&quot;Headers\&quot;: {\n            \&quot;Content-Type\&quot;: [\n                \&quot;${Content-Type}\&quot;\n            ]\n        },\n        \&quot;IsAuthenticationRequired\&quot;: false,\n        \&quot;Method\&quot;: \&quot;${Method}\&quot;,\n        \&quot;PlaceholderType\&quot;: 0,\n        \&quot;Protocol\&quot;: \&quot;FORM-DATA\&quot;,\n        \&quot;RequestFormat\&quot;: {\n            \&quot;emailUserInput\&quot;: {\n                \&quot;notificationId\&quot;: \&quot;2094\&quot;,\n                \&quot;msisdn\&quot;: 3,\n                \&quot;emailTo\&quot;: 2,\n                \&quot;inputValue\&quot;: {\n                    \&quot;DataPlan\&quot;: 4,\n                    \&quot;Name\&quot;: 1,\n                    \&quot;amount\&quot;: 0\n                },\n                \&quot;shortCode\&quot;: \&quot;8001\&quot;,\n                \&quot;systemId\&quot;: \&quot;smppserver\&quot;\n            },\n            \&quot;fileData\&quot;: 5,\n            \&quot;filename\&quot;: 6\n        },\n        \&quot;username\&quot;: \&quot;\&quot;\n    },\n    \&quot;CassandraDBParameters\&quot;: {\n        \&quot;NodeId\&quot;: ${NodeId\t},\n        \&quot;CqlQuery\&quot;: \&quot;${CqlQuery}\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: ${Notify},\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;${RestEndoint}\&quot;,\n            \&quot;Method\&quot;: \&quot;${Method}\&quot;,\n            \&quot;Payload\&quot;: \&quot;{}\&quot;\n        }\n    },\n    \&quot;_class\&quot;: \&quot;com.tecnotree.dap.bulk.document.BulkMasterConfigurationDocument\&quot;\n}&quot;,
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
      <webElementGuid>5fccdfa4-2f68-4b92-a685-c57b5a9c8298</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
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
      <defaultValue>GlobalVariable.cassandravalue</defaultValue>
      <description></description>
      <id>819e1625-806c-4580-8ed9-de7cba56361e</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>c181b36e-1200-484b-99dc-e78e1dc1755b</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b80037b5-48cf-4717-b6cc-bdc4d65ff93c</id>
      <masked>false</masked>
      <name>BulkType</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>20dfc3b1-e6b0-4a54-bda6-e60d9b1caa06</id>
      <masked>false</masked>
      <name>EndPoint</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>7f2997d7-296a-4076-aee6-f1c105df7466</id>
      <masked>false</masked>
      <name>Content-Type</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b85c98c5-b604-47aa-9792-9b6b9fb0f71c</id>
      <masked>false</masked>
      <name>Method</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3891a1a5-f0b5-482f-98d1-8a6401750c50</id>
      <masked>false</masked>
      <name>NodeId</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>a5d28e6b-490b-49c3-90f3-56c01b109c7d</id>
      <masked>false</masked>
      <name>CqlQuery</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>2bedd09c-7517-4715-a226-342f017fa52e</id>
      <masked>false</masked>
      <name>Notify</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>dba774f1-5f09-461f-a026-65f09e262381</id>
      <masked>false</masked>
      <name>RestEndoint</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ff5f734c-423f-4e83-9a5a-532f89cef73b</id>
      <masked>false</masked>
      <name>variable_10</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d2b8a395-9a6c-4cdf-8ef1-715179cfdf13</id>
      <masked>false</masked>
      <name>variable_11</name>
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
