<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>kafka-producer-service</name>
   <tag></tag>
   <elementGuidId>761df6b2-8e1b-4949-a909-9c4b4aaac5d5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;notificationId\&quot;: ${notificationId},\n\&quot;emailTo\&quot;: \&quot;${emailTo}\&quot;,\n\&quot;shortCode\&quot;: ${shortCode},\n\&quot;msisdn\&quot;: \&quot;${msisdn}\&quot;,\n\&quot;systemId\&quot;: \&quot;${systemId}\&quot;,\n\&quot;inputValue\&quot;: {\n    \&quot;Name\&quot;: \&quot;Meera\&quot;,\n    \&quot;DataPlan\&quot;: \&quot;Kafka Bulk Request\&quot;\n  }\n\n}&quot;,
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
   <restUrl>http://${URL}/kps/kafka-producer-service/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>92948a34-8299-424c-a79c-28a42b8a2f44</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Notification_Id</defaultValue>
      <description></description>
      <id>233b15c9-c5d0-4269-abd5-b7cc3362548d</id>
      <masked>false</masked>
      <name>notificationId</name>
   </variables>
   <variables>
      <defaultValue>'koliki.kumar@tecnotree.com'</defaultValue>
      <description></description>
      <id>859dacb1-6c83-4f7c-a6b0-a3fd5c06ee46</id>
      <masked>false</masked>
      <name>emailTo</name>
   </variables>
   <variables>
      <defaultValue>8001</defaultValue>
      <description></description>
      <id>22a5e745-257b-4a1b-a1f7-f6ff3b49c26f</id>
      <masked>false</masked>
      <name>shortCode</name>
   </variables>
   <variables>
      <defaultValue>'9000000001'</defaultValue>
      <description></description>
      <id>2f3d3a39-ffce-4efe-9741-2da8da9a9aa8</id>
      <masked>false</masked>
      <name>msisdn</name>
   </variables>
   <variables>
      <defaultValue>'smppclient1'</defaultValue>
      <description></description>
      <id>0ac60ead-56d2-43a4-9eca-534a4548e960</id>
      <masked>false</masked>
      <name>systemId</name>
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
