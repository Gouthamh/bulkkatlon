<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>mongoprotocalupdate</name>
   <tag></tag>
   <elementGuidId>d05dcf9e-c492-44bd-8280-58bd87632672</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n\t\&quot;BulkType\&quot;: \&quot;DB-MONGO\&quot;,\n\t\&quot;BulkID\&quot;: ${BulkID},\n\t\&quot;MONGODBParameters\&quot;: {\n\t\t\&quot;FetchSize\&quot;: 10,\n\t\t\&quot;NodeId\&quot;: \&quot;4929\&quot;,\n\t\t\&quot;collectionName\&quot;: \&quot;MONGO_DB_BULK_TEST_UPDATE_AND-DELETE\&quot;,\n\t\t\&quot;MongoDbQuery\&quot;: \&quot;{}\&quot;,\n\t\t\&quot;returnParams\&quot;: {\n\t\t\t\&quot;_id\&quot;: 0\n\t\t},\n\t\t\&quot;Order\&quot;: [\&quot;{:notificationId}\&quot;, \&quot;{:emailTo}\&quot;, \&quot;{:msisdn}\&quot;, \&quot;{:inputValue.Name}\&quot;, \&quot;{:inputValue.DataPlan}\&quot;, \&quot;{:shortCode}\&quot;, \&quot;{:systemId}\&quot;, \&quot;{:inputValue.amount}\&quot;],\n\t\t\&quot;StopLimit\&quot;: \&quot;${StopLimit}\&quot;,\n\t\t\&quot;OffsetEnable\&quot;: ${OffsetEnable}\n\t},\n\t\&quot;Action\&quot;: {\n\t\t\&quot;Protocol\&quot;: \&quot;MONGO\&quot;,\n\t\t\&quot;NodeId\&quot;: \&quot;4899\&quot;,\n\t\t\&quot;collectionName\&quot;: \&quot;DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MONGO\&quot;,\n\t\t\&quot;operation\&quot;: \&quot;Update\&quot;,\n\t\t\&quot;PlaceholderType\&quot;: 1,\n\t\t\&quot;condition\&quot;: \&quot;{\\\&quot;$and\\\&quot;:[{\\\&quot;msisdn\\\&quot;:\\\&quot;{:2}\\\&quot;}]}\&quot;,\n\t\t\&quot;updateFields\&quot;: \&quot;{\\\&quot;$set\\\&quot;:{\\\&quot;shortCode\\\&quot;:\\\&quot;{:5}\\\&quot;,\\\&quot;inputValue.Name\\\&quot;:\\\&quot;{:3}\\\&quot;,\\\&quot;inputValue.DataPlan\\\&quot;:\\\&quot;{:4}\\\&quot;}}\&quot;,\n\t\t\&quot;Headers\&quot;: {},\n\t\t\&quot;username\&quot;: \&quot;\&quot;\n\t},\n\t\&quot;CreatedOn\&quot;: \&quot;2023-02-01T10:30:07.014Z\&quot;,\n\t\&quot;modifiedOn\&quot;: \&quot;2023-02-01T10:30:16.026Z\&quot;\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.dummiservicename</defaultValue>
      <description></description>
      <id>6d38be78-c3e9-4432-928a-5d3621808395</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.dummiid</defaultValue>
      <description></description>
      <id>c9cd13ca-a00d-409c-8627-9a6d6a986363</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.stoplimitunderlimit</defaultValue>
      <description></description>
      <id>20c3f385-fff4-4735-8fd0-1445eb85a0b2</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>f1ccdacc-2709-4112-a063-240d07d9e476</id>
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
