<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>createfile</name>
   <tag></tag>
   <elementGuidId>0bc13c8d-a2fc-4cda-a2ba-36d989328ced</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n\t\&quot;BulkType\&quot;: \&quot;File\&quot;,\n\t\&quot;BulkID\&quot;: ${BulkID},\n\t\&quot;FileFormat\&quot;: {\n\t\t\&quot;NoOfFields\&quot;: 6,\n\t\t\&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n\t\t\&quot;FileUploadPath\&quot;: \&quot;/data/\&quot;,\n\t\t\&quot;IsHeaderPresent\&quot;: false,\n\t\t\&quot;CompressFiles\&quot;: true,\n\t\t\&quot;HouseKeepingEnable\&quot;: true,\n\t\t\&quot;DeleteDays\&quot;: 1\n\t},\n\t\&quot;Action\&quot;: {\n\t\t\&quot;Protocol\&quot;: \&quot;MONGO\&quot;,\n\t\t\&quot;NodeId\&quot;: \&quot;4929\&quot;,\n\t\t\&quot;collectionName\&quot;: \&quot;DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE\&quot;,\n\t\t\&quot;operation\&quot;: \&quot;Create\&quot;,\n\t\t\&quot;StopLimit\&quot;: \&quot;3\&quot;,\n\t\t\&quot;PlaceholderType\&quot;: 0,\n\t\t\&quot;Document\&quot;: \&quot;{\\\&quot;id\\\&quot;:0,\\\&quot;Name\\\&quot;:1,\\\&quot;Email\\\&quot;:2,\\\&quot;Team\\\&quot;:3,\\\&quot;City\\\&quot;:4,\\\&quot;Salary\\\&quot;:5,\\\&quot;information\\\&quot;:{\\\&quot;id\\\&quot;:0,\\\&quot;Name\\\&quot;:1,\\\&quot;Email\\\&quot;:2,\\\&quot;Team\\\&quot;:3,\\\&quot;City\\\&quot;:4,\\\&quot;Salary\\\&quot;:5}}\&quot;,\n\t\t\&quot;Headers\&quot;: {},\n\t\t\&quot;username\&quot;: \&quot;\&quot;,\n\t\t\&quot;updateFields\&quot;: \&quot;{}\&quot;,\n\t\t\&quot;condition\&quot;: \&quot;{}\&quot;\n\t},\n\t\&quot;CreatedOn\&quot;: \&quot;2023-04-04T17:51:50.539Z\&quot;,\n\t\&quot;modifiedOn\&quot;: \&quot;2023-04-04T17:52:06.183Z\&quot;\n}&quot;,
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
      <webElementGuid>f4d59f1b-6674-4258-be92-f6c35e8c9918</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=15</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>89dc5f04-afe9-4560-a01a-98986d72b87b</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>fc09eeaf-7cd4-454e-83e4-18c505fc9895</id>
      <masked>false</masked>
      <name>BulkType</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>c5b45d4f-6d1c-4060-bae7-f671b11d30ff</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>75ec3189-091f-4ee9-96e8-ee20ae6292df</id>
      <masked>false</masked>
      <name>NoOfFields</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>f8be8ee1-6de8-42e2-934c-316825f8b926</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>4e3ab6a6-64fb-48ff-9fe7-f70577d3e3a4</id>
      <masked>false</masked>
      <name>IsHeaderPresent</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>841b5434-7275-4198-83df-9ecacc679dcd</id>
      <masked>false</masked>
      <name>Protocol</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>ffbb46c9-7ba8-428c-8b7e-6d0e58c25687</id>
      <masked>false</masked>
      <name>collectionName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.mongofilecreate</defaultValue>
      <description></description>
      <id>a17e6126-a24e-408c-b62d-e5d903869824</id>
      <masked>false</masked>
      <name>Document</name>
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

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
