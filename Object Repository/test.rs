<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>test</name>
   <tag></tag>
   <elementGuidId>daa5d440-15c1-4cdd-9fdf-9e1bf0738968</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;cache-post-bulk-service\&quot;,\n    \&quot;BulkType\&quot;: \&quot;DB-CASSANDRA\&quot;,\n    \&quot;BulkID\&quot;: 847,\n    \&quot;CassandraDBParameters\&quot;: {\n        \&quot;CqlQuery\&quot;: \&quot;SELECT usage_units,usage_discount,id,testdataone,holiday_date from test.testdb where id \u003e\u003d {:input.valeid} and id \u003c\u003d {:input.valeid1} ALLOW FILTERING\&quot;,\n        \&quot;NodeId\&quot;: \&quot;6725\&quot;\n    },\n    \&quot;Action\&quot;: {\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;.csv\&quot;,\n        \&quot;Limit\&quot;: \&quot;0\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;YYYY:MM:dd:mm:ss:ns\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/CassandraDB_\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n        \&quot;IsHeaderEnable\&quot;: false,\n        \&quot;SftpEnable\&quot;: false,\n        \&quot;FileHeaders\&quot;: \&quot;\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;Notify\&quot;: false,\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dap-is/Timestameforbulkserviceinintegration\&quot;,\n            \&quot;Method\&quot;: \&quot;POST\&quot;,\n            \&quot;Payload\&quot;: {}\n        },\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: true,\n                \&quot;sftp\&quot;: false\n            },\n            \&quot;endPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n            \&quot;templateCode\&quot;: \&quot;vi_bill_generate\&quot;,\n            \&quot;emailTo\&quot;: \&quot; gouthamraj.kr@tecnotree.com\&quot;,\n            \&quot;msisdn\&quot;: \&quot; 900000001\&quot;\n        },\n        \&quot;sendNotification\&quot;: false\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-05-19T05:04:15.211Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-05-19T05:04:34.459Z\&quot;\n}&quot;,
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
      <webElementGuid>fb480be5-e12b-4f4e-b8f2-18f862a222d3</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
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
