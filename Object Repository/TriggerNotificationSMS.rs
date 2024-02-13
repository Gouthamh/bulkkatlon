<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Sanity call</description>
   <name>TriggerNotificationSMS</name>
   <tag></tag>
   <elementGuidId>7a4da67c-15f9-46b0-bc7f-be31f7e0cec6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;notificationId\&quot;: ${notificationId},\n\&quot;emailTo\&quot; : \&quot;{emailTo}\&quot;,\n  \&quot;msisdn\&quot;: \&quot;${msisdn}\&quot;,\n  \&quot;shortCode\&quot;: ${shortCode},\n    \&quot;systemId\&quot;: \&quot;${systemId}\&quot;,\n  \&quot;inputValue\&quot; :\n    {\n       \&quot;amount\&quot; : ${amount},\n       \&quot;balance\&quot; : \&quot;11.13\&quot;\n    }                       \n}\n&quot;,
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
   </httpHeaderProperties>
   <katalonVersion>7.5.0</katalonVersion>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://${URL}/notification/triggerNotification</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>2094</defaultValue>
      <description>variablename</description>
      <id>55225a85-a029-4156-8436-89e57e645b43</id>
      <masked>false</masked>
      <name>notificationId</name>
   </variables>
   <variables>
      <defaultValue>'9000000001'</defaultValue>
      <description></description>
      <id>03bd0a24-4435-4b35-876e-b3d0df884d00</id>
      <masked>false</masked>
      <name>msisdn</name>
   </variables>
   <variables>
      <defaultValue>8001</defaultValue>
      <description></description>
      <id>b80e05af-49d5-4be6-9d40-10936ef3dfb0</id>
      <masked>false</masked>
      <name>shortCode</name>
   </variables>
   <variables>
      <defaultValue>11.11</defaultValue>
      <description></description>
      <id>f3509eed-e0c5-4fb6-8513-588a11e41927</id>
      <masked>false</masked>
      <name>amount</name>
   </variables>
   <variables>
      <defaultValue>'smppclient1'</defaultValue>
      <description></description>
      <id>4ada55a6-5a65-4d18-b6d2-98a3c1fcb707</id>
      <masked>false</masked>
      <name>systemId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>01d1bf3e-4e88-4575-9e04-6dc244c46f37</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>'gouthamraj.kr@tecnotree.com'</defaultValue>
      <description></description>
      <id>b803bc79-1c0c-4f1d-8dbe-7703500cbbce</id>
      <masked>false</masked>
      <name>emailTo</name>
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

assertThat(response.getStatusCode()).isEqualTo(200)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
