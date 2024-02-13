<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>delete</name>
   <tag></tag>
   <elementGuidId>99333e40-9d01-4ba0-be26-b24543f4ac5f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;ServiceName\&quot;:\&quot;${ServiceName}\&quot;,\n   \&quot;BulkType\&quot;:\&quot;DB-MYSQL\&quot;,\n   \&quot;BulkID\&quot;:${BulkID},\n   \&quot;MySqlParameters\&quot;:{\n      \&quot;FetchSize\&quot;:4,\n      \&quot;NodeId\&quot;:4909,\n      \&quot;SqlQuery\&quot;:\&quot;SELECT ID,NAME,EMAIL,MSISDN,DATAPlan,FirstName FROM smdb.test_delete_update\&quot;,\n      \&quot;StopLimit\&quot;:\&quot;${StopLimit}\&quot;,\n      \&quot;OffsetEnable\&quot;:${OffsetEnable}\n   },\n   \&quot;Action\&quot;:{\n      \&quot;Protocol\&quot;:\&quot;MONGO\&quot;,\n      \&quot;PlaceholderType\&quot;:1,\n      \&quot;Headers\&quot;:{\n         \n      },\n      \&quot;username\&quot;:\&quot;\&quot;,\n      \&quot;NodeId\&quot;:\&quot;4929\&quot;,\n      \&quot;operation\&quot;:\&quot;Delete\&quot;,\n      \&quot;collectionName\&quot;:\&quot;DAP_BULK_MONGO_PROTOCOL_OPERATIONS_MYSQL\&quot;,\n      \&quot;condition\&quot;:\&quot;{\\\&quot;$and\\\&quot;:[{\\\&quot;inputValue.id\\\&quot;:\\\&quot;{:0}\\\&quot;}]}\&quot;\n   },\n   \&quot;CreatedOn\&quot;:\&quot;2022-11-19T16:47:56.884Z\&quot;,\n   \&quot;modifiedOn\&quot;:\&quot;2022-11-19T17:03:08.145Z\&quot;\n}&quot;,
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
      <defaultValue>GlobalVariable.deleteMysql</defaultValue>
      <description></description>
      <id>6d38be78-c3e9-4432-928a-5d3621808395</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.deletemysqlid</defaultValue>
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
