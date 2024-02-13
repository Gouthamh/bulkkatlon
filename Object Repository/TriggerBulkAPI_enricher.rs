<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>TriggerBulkAPI_enricher</name>
   <tag></tag>
   <elementGuidId>9794edbf-ca77-4c72-9bbe-0b386d1507de</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;Approver\&quot;: {\n        \&quot;email_address\&quot;: 1,\n        \&quot;name\&quot;: \&quot;11111111\&quot;,\n        \&quot;role\&quot;: \&quot;NA\&quot;\n    },\n    \&quot;Customer\&quot;: [\n        {\n            \&quot;email_address\&quot;: \&quot;2023-10-09\&quot;,\n            \&quot;name\&quot;: 1,\n            \&quot;role\&quot;: true\n        }\n    ],\n    \&quot;Presenter\&quot;: {\n        \&quot;email_address\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n        \&quot;name\&quot;: 8,\n        \&quot;role\&quot;: \&quot;Presenter\&quot;\n    }\n}&quot;,
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
      <webElementGuid>bce7f82a-52ee-471d-b181-aa40034c5d14</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>7.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${URL}/dapBulkProcess/${bulkProcessName}/triggerBulkService</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.POST_bulkProcess</defaultValue>
      <description></description>
      <id>dfece0e9-d854-415e-981c-f5a7934fe69a</id>
      <masked>false</masked>
      <name>bulkProcessName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>5eafde16-1b03-4157-81ea-f8cdfb0af9db</id>
      <masked>false</masked>
      <name>URL</name>
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
