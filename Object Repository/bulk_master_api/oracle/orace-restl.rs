<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>orace-restl</name>
   <tag></tag>
   <elementGuidId>6f38c12b-7a87-41be-b37c-fc2bebf78b8d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\n{\&quot;ServiceName\&quot;:\&quot;oracledb-test\&quot;,\&quot;BulkType\&quot;:\&quot;DB-ORACLE\&quot;,\&quot;BulkID\&quot;:101,\&quot;OracleDBParameters\&quot;:{\&quot;FetchSize\&quot;:3,\&quot;NodeId\&quot;:\&quot;5398\&quot;,\&quot;StopLimit\&quot;:\&quot;0\&quot;,\&quot;OracleQuery\&quot;:\&quot;SELECT id,name,ip_adress,ip_port,(ID+1) AS addation,(ID-1) AS sub ,(ID*2) AS multiplaction,(ID/10) AS div FROM CBS_TBL_DEV.test12 ORDER by ID ASC\&quot;,\&quot;OffsetEnable\&quot;:false},\&quot;Action\&quot;:{\&quot;Protocol\&quot;:\&quot;REST\&quot;,\&quot;EndPoint\&quot;:\&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\&quot;Headers\&quot;:{},\&quot;username\&quot;:\&quot;\&quot;,\&quot;RequestFormat\&quot;:{\&quot;notificationId\&quot;:\&quot;2094\&quot;,\&quot;msisdn\&quot;:0,\&quot;emailTo\&quot;:\&quot;gouthamraj.kr@tecnotree.com\&quot;,\&quot;inputValue\&quot;:{\&quot;Phone\&quot;:3,\&quot;FirstName\&quot;:1,\&quot;LastName\&quot;:4,\&quot;Altno\&quot;:2,\&quot;emailTo\&quot;:\&quot;gouthamraj.kr@tecnotree.com\&quot;,\&quot;DataPlan\&quot;:\&quot;120GB\&quot;},\&quot;shortCode\&quot;:\&quot;8001\&quot;,\&quot;systemId\&quot;:\&quot;smppclient1\&quot;},\&quot;Method\&quot;:\&quot;POST\&quot;,\&quot;PlaceholderType\&quot;:0,\&quot;IsAuthenticationRequired\&quot;:false},\&quot;CreatedOn\&quot;:\&quot;2023-02-24T06:55:45.740Z\&quot;,\&quot;modifiedOn\&quot;:\&quot;2023-02-24T06:55:58.295Z\&quot;}&quot;,
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
      <webElementGuid>25465005-01e0-46d0-91b6-b9ddc77815cb</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=101</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
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
