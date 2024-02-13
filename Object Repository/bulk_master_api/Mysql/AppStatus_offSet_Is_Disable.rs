<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>AppStatus_offSet_Is_Disable</name>
   <tag></tag>
   <elementGuidId>ad33dead-7329-4cb7-97ea-3a9055d4c6f4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n\t\&quot;BulkType\&quot;: \&quot;DB-MYSQL\&quot;,\n\t\&quot;BulkID\&quot;: ${BulkID},\n\t\&quot;MySqlParameters\&quot;: {\n\t\t\&quot;FetchSize\&quot;: 1,\n\t\t\&quot;NodeId\&quot;: \&quot;4909\&quot;,\n\t\t\&quot;OffsetEnable\&quot;: false,\n\t\t\&quot;SqlQuery\&quot;: \&quot;${SqlQuery}\&quot;,\n\t\t\&quot;StopLimit\&quot;: 0\n\t},\n\t\&quot;Action\&quot;: {\n\t\t\&quot;EndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotificationForEmailAttachment\&quot;,\n\t\t\&quot;Headers\&quot;: {},\n\t\t\&quot;IsAuthenticationRequired\&quot;: false,\n\t\t\&quot;Method\&quot;: \&quot;POST\&quot;,\n\t\t\&quot;PlaceholderType\&quot;: 0,\n\t\t\&quot;Protocol\&quot;: \&quot;REST\&quot;,\n\t\t\&quot;RequestFormat\&quot;: {\n\t\t\t\&quot;boltonCode\&quot;: 0,\n\t\t\t\&quot;timeband\&quot;: 1,\n\t\t\t\&quot;origin\&quot;: 2\n\t\t},\n\t\t\&quot;username\&quot;: \&quot;\&quot;\n\t},\n\t\&quot;CreatedOn\&quot;: \&quot;2023-01-26T16:51:29.985Z\&quot;,\n\t\&quot;modifiedOn\&quot;: \&quot;2023-01-26T16:51:48.650Z\&quot;\n}&quot;,
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
   <restUrl>https://${GlobalVariable.URL}/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=GlobalVariable.MySql_BulkProcess</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.MySql_BulkProcess</defaultValue>
      <description></description>
      <id>3fab0715-a464-47a4-9fce-b422e2cd0346</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.MySql_BulkID</defaultValue>
      <description></description>
      <id>b99c6315-7e3f-4a26-a765-436757181016</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.MysqlQuery</defaultValue>
      <description></description>
      <id>90335b34-43ec-482c-8e48-29bb8ea33cea</id>
      <masked>false</masked>
      <name>SqlQuery</name>
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
