<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Dynamic_Count_Failure_Test3</name>
   <tag></tag>
   <elementGuidId>1fd95f3b-08ac-4f42-91fb-ce3aff155ebd</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;NoOfFields\&quot;: 7,\n  \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n  \&quot;IsHeaderPresent\&quot;: false,\n  \&quot;Action\&quot;: {\n    \&quot;Method\&quot;: \&quot;POST\&quot;,\n    \&quot;EndPoint\&quot;: \&quot;${EndPoint}\&quot;,\n    \&quot;IsAuthenticationRequired\&quot;: false,\n    \&quot;PlaceholderType\&quot;: 0,\n    \&quot;RequestFormat\&quot;:  {\n            \&quot;notificationId\&quot; : 0,\n            \&quot;emailTo\&quot; : 1,\n            \&quot;shortCode\&quot; : 2,\n            \&quot;systemId\&quot; : 3,\n            \&quot;inputValue\&quot; : {\n                \&quot;amount\&quot; : \&quot;11.22\&quot;,\n                \&quot;balance\&quot; : \&quot;12.20\&quot;,\n                \&quot;Name\&quot; : 4,\n                \&quot;DataPlan\&quot; : 5\n            }\n        }\n  }\n}&quot;,
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
      <webElementGuid>3f2ea3fd-7fd0-452a-8ba1-758d0b733d66</webElementGuid>
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
      <id>b4c7b09c-cab2-4cfa-9420-528829864447</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Dynamic_BulkProcess</defaultValue>
      <description></description>
      <id>bdc79e21-6f8e-41d5-a89c-4eb7f39acb3a</id>
      <masked>false</masked>
      <name>bulkProcessName</name>
   </variables>
   <variables>
      <defaultValue>'http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification'</defaultValue>
      <description></description>
      <id>0e3f0814-76a6-4ada-8f4d-2f3f25a18a36</id>
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
