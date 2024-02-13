<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Action_type_file1</name>
   <tag></tag>
   <elementGuidId>5f3f01f4-870f-466c-a683-892bf3341c65</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;ServiceName\&quot;: \&quot;${ServiceName}\&quot;,\n    \&quot;BulkType\&quot;: \&quot;File\&quot;,\n    \&quot;BulkID\&quot;: ${BulkID},\n    \&quot;FileFormat\&quot;: {\n        \&quot;NoOfFields\&quot;: 7,\n        \&quot;MandatoryFields\&quot;: \&quot;\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;|\&quot;,\n        \&quot;FileUploadPath\&quot;: \&quot;/data/\&quot;,\n        \&quot;groupId\&quot;: \&quot;\&quot;,\n        \&quot;IsHeaderPresent\&quot;: false,\n        \&quot;HouseKeepingEnable\&quot;: false,\n        \&quot;CompressFiles\&quot;: true\n    },\n    \&quot;Action\&quot;: {\n        \&quot;RetryEnable\&quot;: ${RetryEnable},\n        \&quot;FileHeaders\&quot;: \&quot;\&quot;,\n        \&quot;IsHeaderEnable\&quot;: ${IsHeaderEnable},\n        \&quot;SftpEnable\&quot;: ${SftpEnable},\n        \&quot;CompressEnable\&quot;: ${CompressEnable},\n        \&quot;Limit\&quot;: \&quot;${Limit}\&quot;,\n        \&quot;FileExtension\&quot;: \&quot;${FileExtension}\&quot;,\n        \&quot;FieldSeparator\&quot;: \&quot;${FieldSeparator}\&quot;,\n        \&quot;Path\&quot;: \&quot;/data/file_\&quot;,\n        \&quot;FileTimeFormat\&quot;: \&quot;_YYYY:MM:dd:mm:ss:ns\&quot;,\n        \&quot;Protocol\&quot;: \&quot;WRITE-FILE\&quot;,\n        \&quot;SftpNode\&quot;: \&quot;7441\&quot;,\n        \&quot;SftpPath\&quot;: \&quot;/bulk-store/\&quot;\n    },\n    \&quot;processCompletionIntimation\&quot;: {\n        \&quot;sendNotification\&quot;: ${sendNotification},\n        \&quot;triggerNotificationDetails\&quot;: {\n            \&quot;storageType\&quot;: {\n                \&quot;pvc\&quot;: ${pvc},\n                \&quot;sftp\&quot;: ${sftp}\n            },\n            \&quot;endPoint\&quot;: \&quot;\&quot;,\n            \&quot;templateCode\&quot;: \&quot;\&quot;,\n            \&quot;emailTo\&quot;: \&quot;\&quot;,\n            \&quot;msisdn\&quot;: \&quot;\&quot;\n        },\n        \&quot;Notify\&quot;: ${Notify},\n        \&quot;intimateProcessCompletion\&quot;: {\n            \&quot;RestEndoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/fetchAllMasterConfiguratoins\&quot;,\n            \&quot;Method\&quot;: \&quot;GET\&quot;,\n            \&quot;Payload\&quot;: {}\n        }\n    },\n    \&quot;enrichData\&quot;: {\n        \&quot;enrichEnable\&quot;: false\n    },\n    \&quot;CreatedOn\&quot;: \&quot;2023-11-23T05:37:56.962Z\&quot;,\n    \&quot;modifiedOn\&quot;: \&quot;2023-11-23T05:42:01.478Z\&quot;\n}&quot;,
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
      <webElementGuid>cc7ff11b-b602-478d-a320-4f0999e323a6</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://dap.pe-lab3.bdc-rancher.tecnotree.com/dapBulkProcess/configure/UpdateBulkMasterConfig?Id=909</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ae99acf0-b504-4a9c-9f2e-2d1b1246cb5c</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>d803cc02-10bc-4c40-ad5b-ad111c13015d</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>30b1ec78-2bd4-4b2f-9a1d-6434c39f47e2</id>
      <masked>false</masked>
      <name>RetryEnable</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>8da63bde-dabf-4b54-be27-97428deb983b</id>
      <masked>false</masked>
      <name>IsHeaderEnable</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>982f2415-132a-4761-ae74-84ded8111362</id>
      <masked>false</masked>
      <name>SftpEnable</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>fdeefe4f-e830-45b4-b11c-7a90b3d4e8ef</id>
      <masked>false</masked>
      <name>CompressEnable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>43793fe1-6ebd-4767-a5cd-17de2c266238</id>
      <masked>false</masked>
      <name>FileExtension</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>24224782-7357-4eb3-9080-5edc790b8099</id>
      <masked>false</masked>
      <name>FieldSeparator</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>54724881-37e4-4de9-8b70-c8bb77885df0</id>
      <masked>false</masked>
      <name>pvc</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>59d8ef53-7257-43c4-8fb6-8e07926d0c64</id>
      <masked>false</masked>
      <name>sftp</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e6204bbb-22d7-4d1a-baf7-d27fba4b55b9</id>
      <masked>false</masked>
      <name>Notify</name>
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
