<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update_oeacel</name>
   <tag></tag>
   <elementGuidId>6a8795da-2749-4cf1-990f-4a15c49bb326</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;${BulkType}\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;OracleDBParameters\&quot;: {\n        \&quot;FetchSize\&quot;: \&quot;100\&quot;,\n        \&quot;NodeId\&quot;: \&quot;5398\&quot;,\n        \&quot;StopLimit\&quot;: \&quot;${StopLimit}\&quot;,\n        \&quot;OracleQuery\&quot;: \&quot;${OracleQuery}\&quot;,\n      \&quot;OffsetEnable\&quot; : ${OffsetEnable}\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;MONGO\&quot;,\n        \&quot;NodeId\&quot;: \&quot;4929\&quot;,\n        \&quot;collectionName\&quot;: \&quot;${collectionName}\&quot;,\n        \&quot;operation\&quot;: \&quot;Update\&quot;,\n        \&quot;PlaceholderType\&quot;: 1,\n        \&quot;condition\&quot;: \&quot;${condition}\&quot;,\n        \&quot;updateFields\&quot;: \&quot;${updateFields}\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;username\&quot;: \&quot;\&quot;\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-04-21T11:44:16.248Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-04-21T11:44:28.049Z\&quot;\n}&quot;,
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
      <webElementGuid>08bb5377-d304-42a3-8c20-996ea94cc9e2</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=112</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.oracel_update_value</defaultValue>
      <description></description>
      <id>224ee179-5bd7-4c47-bb1c-943ae707f0fc</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.oracel_update_value</defaultValue>
      <description></description>
      <id>a8901226-1ffd-4c3f-8818-494640191416</id>
      <masked>false</masked>
      <name>BulkType</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>8560cce9-01c7-4acb-a3e3-77b1b3da98b5</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>1cfd98b6-b3cd-4975-9c27-fdab2dc95487</id>
      <masked>false</masked>
      <name>StopLimit</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>7ba88957-a0d3-4e9a-9255-470d283272f1</id>
      <masked>false</masked>
      <name>OracleQuery</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>576c49a2-f188-416f-b984-fab4c87b1746</id>
      <masked>false</masked>
      <name>Protocol</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>711143bb-b0ee-41fc-b9eb-74a1b662d8ee</id>
      <masked>false</masked>
      <name>collectionName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>c1dcb8a7-ad73-42ac-83f9-5fe0be16be68</id>
      <masked>false</masked>
      <name>condition</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.null</defaultValue>
      <description></description>
      <id>678a763b-8436-483f-88e6-7aeaceb756b5</id>
      <masked>false</masked>
      <name>updateFields</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>2870381f-b9b0-47bf-b059-e885bfbfc974</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>4348bc56-339a-44f1-bce3-a195ec985227</id>
      <masked>false</masked>
      <name>StopLimit</name>
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
