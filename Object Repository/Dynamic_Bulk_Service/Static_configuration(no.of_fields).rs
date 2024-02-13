<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Static_configuration(no.of_fields)</name>
   <tag></tag>
   <elementGuidId>7f463c98-55cf-4e13-b8aa-3dbff7996a75</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n  \&quot;IsHeaderPresent\&quot;: false,\n  \&quot;Action\&quot;: {\n    \&quot;Method\&quot;: \&quot;POST\&quot;,\n    \&quot;EndPoint\&quot;: \&quot;${Endpoint}\&quot;,\n    \&quot;IsAuthenticationRequired\&quot;: false,\n    \&quot;PlaceholderType\&quot;: 0,\n    \&quot;RequestFormat\&quot;:  {\n            \&quot;notificationId\&quot; : 0,\n            \&quot;emailTo\&quot; : 1,\n            \&quot;shortCode\&quot; : 2,\n            \&quot;systemId\&quot; : 3,\n            \&quot;inputValue\&quot; : {\n                \&quot;amount\&quot; : \&quot;11.22\&quot;,\n                \&quot;balance\&quot; : \&quot;12.20\&quot;,\n                \&quot;Name\&quot; : 4,\n                \&quot;DataPlan\&quot; : 5\n            }\n        }\n  }\n}&quot;,
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
      <webElementGuid>6a7d92ae-5099-4090-9f39-91a130db8753</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>7.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${URL}/dapBulkProcess/${bulkProcessName}/triggerDynamicBulkService</restUrl>
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
      <id>681376dd-a6f6-405b-9aac-0186e17084a9</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Dynamic_BulkProcess</defaultValue>
      <description></description>
      <id>dd896d81-d9e6-4d62-87b7-494c114011d8</id>
      <masked>false</masked>
      <name>bulkProcessName</name>
   </variables>
   <variables>
      <defaultValue>'http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification'</defaultValue>
      <description></description>
      <id>3ce7afde-0475-4d63-995f-b6b449309594</id>
      <masked>false</masked>
      <name>Endpoint</name>
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


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
