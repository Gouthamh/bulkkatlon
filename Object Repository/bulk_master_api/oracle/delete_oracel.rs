<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>delete_oracel</name>
   <tag></tag>
   <elementGuidId>822db5ca-f7da-4615-8091-40915e1fdbf2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n\t\&quot;BulkType\&quot;: \&quot;DB-ORACLE\&quot;,\n\t\&quot;BulkID\&quot;: ${BulkID},\n\t\&quot;OracleDBParameters\&quot;: {\n\t\t\&quot;FetchSize\&quot;: 3,\n\t\t\&quot;NodeId\&quot;: \&quot;5398\&quot;,\n\t\t\&quot;OracleQuery\&quot;: \&quot;SELECT id,name,ip_adress,ip_port,(ID+1) AS addation,(ID-1) AS sub ,(ID*2) AS multiplaction,(ID/10) AS div FROM CBS_TBL_DEV.test12 ORDER by ID ASC\&quot;,\n\t\t\&quot;StopLimit\&quot;: \&quot;${StopLimit}\&quot;,\n\t\t\&quot;OffsetEnable\&quot;: ${OffsetEnable}\n\t},\n\t\&quot;Action\&quot;: {\n\t\t\&quot;Protocol\&quot;: \&quot;MONGO\&quot;,\n\t\t\&quot;NodeId\&quot;: \&quot;4929\&quot;,\n\t\t\&quot;collectionName\&quot;: \&quot;DAP_BULK_MONGO_PROTOCOL_OPERATIONS_KAFKA\&quot;,\n\t\t\&quot;operation\&quot;: \&quot;Delete\&quot;,\n\t\t\&quot;PlaceholderType\&quot;: 1,\n\t\t\&quot;condition\&quot;: \&quot;{\\\&quot;$and\\\&quot;:[{\\\&quot;notificationId\\\&quot;:2094,\\\&quot;msisdn\\\&quot;:\\\&quot;{:0}\\\&quot;,\\\&quot;inputValue.Phone\\\&quot;:\\\&quot;{:5}\\\&quot;}]}\&quot;,\n\t\t\&quot;Headers\&quot;: {},\n\t\t\&quot;username\&quot;: \&quot;\&quot;\n\t},\n\t\&quot;CreatedOn\&quot;: \&quot;2023-02-22T06:54:13.349Z\&quot;,\n\t\&quot;modifiedOn\&quot;: \&quot;2023-02-22T06:54:33.203Z\&quot;\n}&quot;,
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
      <webElementGuid>66197b71-307a-4979-91c3-53c00523378f</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=113</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.delete_oracel_value</defaultValue>
      <description></description>
      <id>f52f57a9-a135-45fc-a1fd-d6c124d39763</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.delete_oracel_value</defaultValue>
      <description></description>
      <id>7e02fd70-30b7-42ab-bb75-749311e85e8f</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.delete_oracel_value</defaultValue>
      <description></description>
      <id>a7e3699b-1214-44db-9a56-d6ced9f699ab</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.delete_oracel_value</defaultValue>
      <description></description>
      <id>0fea232c-0dd5-4b00-8cb9-971ca22c092c</id>
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
