<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>create_oracel</name>
   <tag></tag>
   <elementGuidId>fc445c88-472e-4424-ba9a-971be51bb1c4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n\t\&quot;BulkType\&quot;: \&quot;DB-ORACLE\&quot;,\n\t\&quot;BulkID\&quot;: ${BulkID},\n\t\&quot;OracleDBParameters\&quot;: {\n\t\t\&quot;FetchSize\&quot;: 3,\n\t\t\&quot;NodeId\&quot;: \&quot;5398\&quot;,\n\t\t\&quot;OracleQuery\&quot;: \&quot;SELECT id,name,ip_adress,ip_port,(ID+1) AS addation,(ID-1) AS sub ,(ID*2) AS multiplaction,(ID/10) AS div FROM CBS_TBL_DEV.test12 ORDER by ID ASC\&quot;,\n\t\t\&quot;StopLimit\&quot;: ${StopLimit},\n\t\t\&quot;OffsetEnable\&quot;: ${OffsetEnable}\n\t},\n\t\&quot;Action\&quot;: {\n\t\t\&quot;Protocol\&quot;: \&quot;MONGO\&quot;,\n\t\t\&quot;NodeId\&quot;: \&quot;4929\&quot;,\n\t\t\&quot;collectionName\&quot;: \&quot;DAP_BULK_MONGO_PROTOCOL_OPERATIONS_KAFKA\&quot;,\n\t\t\&quot;operation\&quot;: \&quot;Create\&quot;,\n\t\t\&quot;PlaceholderType\&quot;: 1,\n\t\t\&quot;Document\&quot;: \&quot;{\\\&quot;notificationId\\\&quot;:2094,\\\&quot;msisdn\\\&quot;:\\\&quot;{:0}\\\&quot;,\\\&quot;emailTo\\\&quot;:\\\&quot;{:1}\\\&quot;,\\\&quot;inputValue\\\&quot;:{\\\&quot;id\\\&quot;:\\\&quot;{:3}\\\&quot;,\\\&quot;Name\\\&quot;:\\\&quot;{:4}\\\&quot;,\\\&quot;Phone\\\&quot;:\\\&quot;{:5}\\\&quot;,\\\&quot;FirstName\\\&quot;:\\\&quot;{:6}\\\&quot;,\\\&quot;Altno\\\&quot;:\\\&quot;{:7}\\\&quot;,\\\&quot;emailTo\\\&quot;:\\\&quot;{:8}\\\&quot;,\\\&quot;DataPlan\\\&quot;:\\\&quot;unlimited\\\&quot;},\\\&quot;shortCode\\\&quot;:\\\&quot;8001\\\&quot;,\\\&quot;systemId\\\&quot;:\\\&quot;smppclient1\\\&quot;}\&quot;,\n\t\t\&quot;Headers\&quot;: {},\n\t\t\&quot;username\&quot;: \&quot;\&quot;,\n\t\t\&quot;updateFields\&quot;: \&quot;{}\&quot;,\n\t\t\&quot;condition\&quot;: \&quot;{}\&quot;\n\t},\n\t\&quot;CreatedOn\&quot;: \&quot;2023-02-21T12:27:18.415Z\&quot;,\n\t\&quot;modifiedOn\&quot;: \&quot;2023-02-21T12:27:30.674Z\&quot;\n}&quot;,
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
      <webElementGuid>2789c7fb-876f-41e0-be40-0636f0373307</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://${uri}/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=111</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.oracel_create_service_name</defaultValue>
      <description></description>
      <id>55cab6d3-0a0c-420e-8b5b-6af5dc3a272c</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.oracel_create_id</defaultValue>
      <description></description>
      <id>1a61224a-c42d-422a-9378-ffb288c1e0a7</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.offsetiszero</defaultValue>
      <description></description>
      <id>a768b393-be5b-4a9d-912c-8989eda3e01b</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>508f903a-e273-4623-91ee-a4362ed55629</id>
      <masked>false</masked>
      <name>uri</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_true</defaultValue>
      <description></description>
      <id>de647438-050c-4e1a-8363-cc8e353dfd23</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
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
