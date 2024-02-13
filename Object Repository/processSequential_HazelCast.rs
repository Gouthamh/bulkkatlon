<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>processSequential_HazelCast</name>
   <tag></tag>
   <elementGuidId>978416c5-ce71-4e46-a0a9-94a5cb1377a6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;notificationId\&quot;: ${notificationId},\n    \&quot;emailTo\&quot;: \&quot;${emailTo}\&quot;,\n    \&quot;msisdn\&quot;: \&quot;${msisdn}\&quot;,\n    \&quot;inputValue\&quot;: {\n        \&quot;Phone\&quot;: \&quot;6575848494\&quot;,\n        \&quot;FirstName\&quot;: \&quot;goutharaj24\&quot;,\n        \&quot;LastName\&quot;: \&quot;kumar\&quot;,\n        \&quot;Altno\&quot;: \&quot;7585758746\&quot;,\n        \&quot;emailTo\&quot;: \&quot;gouthamraj.kr@tecnotree.com\&quot;,\n        \&quot;DataPlan\&quot;: \&quot;120GB seq-postman\&quot;\n    },\n    \&quot;shortCode\&quot;: \&quot;${shortCode}\&quot;,\n    \&quot;systemId\&quot;: \&quot;${systemId}\&quot;\n}&quot;,
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
      <webElementGuid>e2440780-a55c-477f-8b4f-2f110d6b090d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>7.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${URL}/dmps/mqsequential/mqsequentialService/processSequential</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.Notification_Id</defaultValue>
      <description></description>
      <id>c1760069-7f73-4484-85d1-c2bcb37fa19b</id>
      <masked>false</masked>
      <name>notificationId</name>
   </variables>
   <variables>
      <defaultValue>'gouthamraj.Kr@tecnotree.com'</defaultValue>
      <description></description>
      <id>e5fbd11a-8273-4922-a37c-0b50fbb03120</id>
      <masked>false</masked>
      <name>emailTo</name>
   </variables>
   <variables>
      <defaultValue>'88886'</defaultValue>
      <description></description>
      <id>710add64-79ae-47c6-9c3b-6ff053984c02</id>
      <masked>false</masked>
      <name>msisdn</name>
   </variables>
   <variables>
      <defaultValue>8001</defaultValue>
      <description></description>
      <id>9d5276c6-1665-4921-888f-7ece1d3fda31</id>
      <masked>false</masked>
      <name>shortCode</name>
   </variables>
   <variables>
      <defaultValue>'smppclient1'</defaultValue>
      <description></description>
      <id>d3a1c375-bc67-4325-ae30-c6db06ac30b1</id>
      <masked>false</masked>
      <name>systemId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>b68a0124-a140-4401-a100-9d15d7a43fd1</id>
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
