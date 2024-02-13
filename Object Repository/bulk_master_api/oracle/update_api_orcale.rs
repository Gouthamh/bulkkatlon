<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>update_api_orcale</name>
   <tag></tag>
   <elementGuidId>79d210f2-74f6-4c4c-86d2-edf8299ca725</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;ServiceName\&quot;:\&quot;${ServiceName}\&quot;,\n   \&quot;BulkType\&quot;:\&quot;DB-ORACLE\&quot;,\n   \&quot;BulkID\&quot;:${BulkID},\n   \&quot;OracleDBParameters\&quot;:{\n      \&quot;FetchSize\&quot;:3,\n      \&quot;NodeId\&quot;:\&quot;8789\&quot;,\n      \&quot;StopLimit\&quot;:${StopLimit},\n      \&quot;OracleQuery\&quot;:\&quot;SELECT id, varchar_col, number_col, date_col, boolean_col FROM CBS_TBL_DEV.All_data_type\&quot;,\n      \&quot;OffsetEnable\&quot;:${OffsetEnable}\n   },\n   \&quot;Action\&quot;:{\n      \&quot;Protocol\&quot;:\&quot;REST\&quot;,\n      \&quot;EndPoint\&quot;:\&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n      \&quot;Headers\&quot;:{\n         \n      },\n      \&quot;username\&quot;:\&quot;\&quot;,\n      \&quot;Method\&quot;:\&quot;POST\&quot;,\n      \&quot;PlaceholderType\&quot;:0,\n      \&quot;RequestFormat\&quot;:{\n         \&quot;notificationId\&quot;:\&quot;2094\&quot;,\n         \&quot;msisdn\&quot;:0,\n         \&quot;emailTo\&quot;:\&quot;gouthamraj.kr@tecnotree.com\&quot;,\n         \&quot;inputValue\&quot;:{\n            \&quot;Phone\&quot;:\&quot;9182\&quot;,\n            \&quot;Name\&quot;:1,\n            \&quot;LastName\&quot;:4,\n            \&quot;amount\&quot;:1,\n            \&quot;emailTo\&quot;:\&quot;gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;DataPlan\&quot;:2\n         },\n         \&quot;shortCode\&quot;:\&quot;8001\&quot;,\n         \&quot;systemId\&quot;:\&quot;smppclient12455\&quot;\n      },\n      \&quot;IsAuthenticationRequired\&quot;:false\n   },\n   \&quot;CreatedOn\&quot;:\&quot;2022-11-07T06:29:58.915Z\&quot;,\n   \&quot;modifiedOn\&quot;:\&quot;2022-11-07T06:30:22.981Z\&quot;\n}&quot;,
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
      <webElementGuid>16b0d3fe-4f45-4fe6-b5e2-8c37b3ae1f08</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.Offset_false</defaultValue>
      <description></description>
      <id>0f351bf0-b8b8-45ee-b9b4-e3a95a9780da</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.offsetisnegative</defaultValue>
      <description></description>
      <id>85ded973-fc80-45f0-b65c-7066d0547606</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Oracle_BulkProcess</defaultValue>
      <description></description>
      <id>a0a23502-fcf5-4e2b-826d-410c0d5cf56f</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Oracle_bulkID</defaultValue>
      <description></description>
      <id>5ae3380f-a427-4b27-9ba1-43a329c30e17</id>
      <masked>false</masked>
      <name>BulkID</name>
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
