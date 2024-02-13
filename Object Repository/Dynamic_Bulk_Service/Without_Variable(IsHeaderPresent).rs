<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Without_Variable(IsHeaderPresent)</name>
   <tag></tag>
   <elementGuidId>e9256b14-af29-4e68-87f6-b231b3c9465a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;NoOfFields\&quot;: 6,\n  \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n  \&quot;Action\&quot;: {\n    \&quot;Method\&quot;: \&quot;POST\&quot;,\n    \&quot;EndPoint\&quot;: \&quot;${Endpoint}\&quot;,\n    \&quot;IsAuthenticationRequired\&quot;: false,\n    \&quot;PlaceholderType\&quot;: 0,\n    \&quot;RequestFormat\&quot;:  {\n            \&quot;notificationId\&quot; : 0,\n            \&quot;emailTo\&quot; : 1,\n            \&quot;shortCode\&quot; : 2,\n            \&quot;systemId\&quot; : 3,\n            \&quot;inputValue\&quot; : {\n                \&quot;amount\&quot; : \&quot;11.22\&quot;,\n                \&quot;balance\&quot; : \&quot;12.20\&quot;,\n                \&quot;Name\&quot; : 4,\n                \&quot;DataPlan\&quot; : 5\n            }\n        }\n  }\n}&quot;,
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
      <webElementGuid>be2266ed-fc05-4a9a-8701-8a8b2d8e8870</webElementGuid>
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
      <id>eaf88efe-7edc-486c-807c-c059208ddc84</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Dynamic_BulkProcess</defaultValue>
      <description></description>
      <id>f0e1b70f-38ae-46d6-afaf-c54fe1c1e2a3</id>
      <masked>false</masked>
      <name>bulkProcessName</name>
   </variables>
   <variables>
      <defaultValue>'http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification'</defaultValue>
      <description></description>
      <id>80d5c129-9ecb-47cb-8e18-15974449b337</id>
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
