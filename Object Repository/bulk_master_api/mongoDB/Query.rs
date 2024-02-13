<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Query</name>
   <tag></tag>
   <elementGuidId>bf3c78d3-0a91-47d0-8cb2-d81b7b4a87d3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;ServiceName\&quot;: \&quot;mongodb-bulk-service\&quot;,\n\t\&quot;BulkType\&quot;: \&quot;DB-MONGO\&quot;,\n\t\&quot;BulkID\&quot;: 11,\n\t\&quot;MONGODBParameters\&quot;: {\n\t\t\&quot;FetchSize\&quot;: 10,\n\t\t\&quot;NodeId\&quot;: \&quot;4929\&quot;,\n\t\t\&quot;collectionName\&quot;: \&quot;MONGO_DB_BULK_TEST\&quot;,\n\t\t\&quot;StopLimit\&quot;: 0,\n\t\t\&quot;returnParams\&quot;: {\n\t\t\t\&quot;_id\&quot;: 0\n\t\t},\n\t\t\&quot;Order\&quot;: [\&quot;{:notificationId}\&quot;, \&quot;{:shortCode}\&quot;, \&quot;{:msisdn}\&quot;, \&quot;{:emailTo}\&quot;, \&quot;{:systemId}\&quot;, \&quot;{:inputValue.amount}\&quot;, \&quot;{:inputValue.Name}\&quot;, \&quot;{:inputValue.balance}\&quot;, \&quot;{:inputValue.DataPlan}\&quot;],\n\t\t\&quot;OffsetEnable\&quot;: false,\n\t\t\&quot;MongoDbQuery\&quot;: {${GlobalVariable.Mongo_Query}}\n\t},\n\t\&quot;Action\&quot;: {\n\t\t\&quot;Protocol\&quot;: \&quot;REST\&quot;,\n\t\t\&quot;EndPoint\&quot;: \&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotification\&quot;,\n\t\t\&quot;Headers\&quot;: {},\n\t\t\&quot;username\&quot;: \&quot;\&quot;,\n\t\t\&quot;RequestFormat\&quot;: {\n\t\t\t\&quot;notificationId\&quot;: 0,\n\t\t\t\&quot;shortCode\&quot;: 1,\n\t\t\t\&quot;msisdn\&quot;: 2,\n\t\t\t\&quot;emailTo\&quot;: 3,\n\t\t\t\&quot;systemId\&quot;: 4,\n\t\t\t\&quot;inputValue\&quot;: {\n\t\t\t\t\&quot;amount\&quot;: 5,\n\t\t\t\t\&quot;Name\&quot;: 6,\n\t\t\t\t\&quot;balance\&quot;: 7,\n\t\t\t\t\&quot;DataPlan\&quot;: 8\n\t\t\t}\n\t\t},\n\t\t\&quot;Method\&quot;: \&quot;POST\&quot;,\n\t\t\&quot;PlaceholderType\&quot;: 0,\n\t\t\&quot;IsAuthenticationRequired\&quot;: false\n\t},\n\t\&quot;CreatedOn\&quot;: \&quot;2023-01-02T11:43:10.415Z\&quot;,\n\t\&quot;modifiedOn\&quot;: \&quot;2023-01-02T11:43:26.618Z\&quot;\n}&quot;,
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
      <webElementGuid>a440eb66-2fda-48fc-81b0-bd41ab127340</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
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
