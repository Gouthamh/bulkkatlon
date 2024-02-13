<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>form_data</name>
   <tag></tag>
   <elementGuidId>1ef18202-6b07-4581-b77d-45a41bede616</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;ServiceName\&quot;:\&quot;${ServiceName}\&quot;,\n   \&quot;BulkType\&quot;:\&quot;DB-MYSQL\&quot;,\n   \&quot;BulkID\&quot;:${BulkID},\n   \&quot;MySqlParameters\&quot;:{\n      \&quot;FetchSize\&quot;:1,\n      \&quot;NodeId\&quot;:\&quot;4909\&quot;,\n      \&quot;OffsetEnable\&quot;:${OffsetEnable},\n      \&quot;SqlQuery\&quot;:\&quot;SELECT ID,NAME,EMAIL,MSISDN,DATAPlan,to_base64(FileData),Filename FROM smdb.UploadTest\&quot;,\n      \&quot;StopLimit\&quot;:${StopLimit}\n   },\n   \&quot;Action\&quot;:{\n      \&quot;EndPoint\&quot;:\&quot;http://dap.pe-lab3.bdc-rancher.tecnotree.com/notification/triggerNotificationForEmailAttachment\&quot;,\n      \&quot;Headers\&quot;:{\n         \&quot;Content-Type\&quot;:[\n            \&quot;multipart/form-data\&quot;\n         ]\n      },\n      \&quot;IsAuthenticationRequired\&quot;:false,\n      \&quot;Method\&quot;:\&quot;POST\&quot;,\n      \&quot;PlaceholderType\&quot;:0,\n      \&quot;Protocol\&quot;:\&quot;FORM-DATA\&quot;,\n      \&quot;RequestFormat\&quot;:{\n         \&quot;emailUserInput\&quot;:{\n            \&quot;notificationId\&quot;:\&quot;2094\&quot;,\n            \&quot;msisdn\&quot;:3,\n            \&quot;emailTo\&quot;:2,\n            \&quot;inputValue\&quot;:{\n               \&quot;DataPlan\&quot;:4,\n               \&quot;Name\&quot;:1,\n               \&quot;amount\&quot;:0\n            },\n            \&quot;shortCode\&quot;:\&quot;8001\&quot;,\n            \&quot;systemId\&quot;:\&quot;smppserver\&quot;\n         },\n         \&quot;fileData\&quot;:5,\n         \&quot;filename\&quot;:6\n      },\n      \&quot;username\&quot;:\&quot;\&quot;\n   },\n   \&quot;CreatedOn\&quot;:\&quot;2022-11-08T06:05:03.988Z\&quot;,\n   \&quot;modifiedOn\&quot;:\&quot;2022-11-08T06:07:05.912Z\&quot;\n}&quot;,
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
   <restUrl>https://${URL}/dapBulkProcess/configure/UpdateBulkMasterConfig</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>6b5149e9-c071-4add-a640-29d44261e78b</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.UpdateBulkMasterConfig</defaultValue>
      <description></description>
      <id>0c85c7fe-b2cc-4fc0-a0eb-62e947850197</id>
      <masked>false</masked>
      <name>UpdateBulkMasterConfig</name>
   </variables>
   <variables>
      <defaultValue>467</defaultValue>
      <description></description>
      <id>face3633-fe37-4184-b8d4-5190db91c781</id>
      <masked>false</masked>
      <name>BulkID</name>
   </variables>
   <variables>
      <defaultValue>'formdata'</defaultValue>
      <description></description>
      <id>cb2efbe0-1bd4-4041-bd34-628d52fbc2f2</id>
      <masked>false</masked>
      <name>ServiceName</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>73a13d7c-fd11-4833-b828-69dcabf3ce07</id>
      <masked>false</masked>
      <name>OffsetEnable</name>
   </variables>
   <variables>
      <defaultValue>2</defaultValue>
      <description></description>
      <id>a8f09505-e002-4d97-9b79-6591ec22a7ff</id>
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

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())


assertThat(response.getResponseText()).contains('Katalon Test Project')


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


assertThat(response.getStatusCode()).isIn(Arrays.asList(200, 201, 202))


String graphQLSchema = 
'''
type Author {
  id: ID!
  firstName: String!
  lastName: String!
}

type Query {
  findAllAuthors: [Author]!
  countAuthors: Long!
}

type Mutation {
  newAuthor(firstName: String!, lastName: String!) : Author!
}

type Query {
    findAllAuthors: [Author]!
    countAuthors: Long!
    findAllBooks: [Book]!
    countBooks: Long!
}

type Mutation {
    newAuthor(id: ID!, firstName: String!, lastName: String!) : Author!
    newBook(id: ID!, title: String!, isbn: String, pageCount: Int, author: ID!) : Book!
    deleteBook(id: ID!) : Boolean
    updateBookPageCount(pageCount: Int!, id: ID!) : Book!
}
'''

boolean successful = WS.validateGraphqlRequestAgainstSchema(request, graphQLSchema)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
