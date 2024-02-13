<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>deletefile</name>
   <tag></tag>
   <elementGuidId>7ebcb1f3-8a48-4593-931c-ebd1413ffcc7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;db-mongo-delete-file\&quot;,\n    \&quot;BulkType\&quot;: \&quot;File\&quot;,\n    \&quot;BulkID\&quot;: 17,\n    \&quot;FileFormat\&quot;: {\n        \&quot;NoOfFields\&quot;: 6,\n        \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n        \&quot;FileUploadPath\&quot;: \&quot;/data/\&quot;,\n        \&quot;IsHeaderPresent\&quot;: false,\n        \&quot;CompressFiles\&quot;: true,\n        \&quot;HouseKeepingEnable\&quot;: true,\n        \&quot;DeleteDays\&quot;: 1\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;MONGO\&quot;,\n        \&quot;NodeId\&quot;: \&quot;4929\&quot;,\n        \&quot;collectionName\&quot;: \&quot;DAP_BULK_MONGO_PROTOCOL_OPERATIONS_FILE\&quot;,\n        \&quot;operation\&quot;: \&quot;Delete\&quot;,\n        \&quot;PlaceholderType\&quot;: 1,\n        \&quot;condition\&quot;: \&quot;{\\\&quot;$and\\\&quot;:[{\\\&quot;id\\\&quot;:\\\&quot;{:0}\\\&quot;},{\\\&quot;information.id\\\&quot;:\\\&quot;{:0}\\\&quot;}]}\&quot;,\n        \&quot;Headers\&quot;: {},\n        \&quot;username\&quot;: \&quot;\&quot;\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-04-19T09:50:32.767Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-04-19T09:56:20.232Z\&quot;\n}&quot;,
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
      <webElementGuid>7ebb10a0-e74f-44cd-9ae1-c8bb14b6602e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=808</restUrl>
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
