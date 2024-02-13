package mongoDatabaseOperations

import org.bson.Document
import com.mongodb.client.MongoCursor;

import com.kms.katalon.core.annotation.Keyword
import com.mongodb.*;
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters
import java.util.*;
import com.mongodb.util.JSON;
import net.sf.json.JSONObject;
import com.kms.katalon.core.testobject.ResponseObject;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;



import java.io.Serializable;
import java.util.ArrayList;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.jayway.jsonpath.JsonPath;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;


public class MongoConnect {
	//Added by Divya
	@Keyword
	def connectDB(String MongoURI, String Database, String Collection) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);

		//Get all documents from collection
		MongoCollection<Document> collection = database.getCollection(Collection);
		FindIterable<Document> iterDoc = collection.find();
		long value = collection.count();

		int i = 1;
		// Getting the iterator
		Iterator it = iterDoc.iterator();
		//print all document
		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
		System.out.println("********************number of files:"+value);
		mongoClient.close();
	}

	//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	@Keyword
	def countDBEntries(String MongoURI, String Database, String Collection) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);


		MongoCollection<Document> collection = database.getCollection(Collection);
		FindIterable<Document> iterDoc = collection.find();
		//Get all documents from collection and count
		long value = collection.count();
		mongoClient.close();
		return value;
	}

	//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	@Keyword
	def sortDBEntries(String MongoURI, String Database, String Collection) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);

		//Get all documents from collection and sort
		MongoCollection<Document> collection = database.getCollection(Collection);
		FindIterable<Document> iterDoc = collection.find().sort({});
		long value = collection.count();
		mongoClient.close();
		return value;
	}

	@Keyword
	def DeleteDBDocs(String MongoURI, String Database, String Collection, String fileToDelete) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);

		//Get all documents from collection and delete one with the filter
		MongoCollection collection = database.getCollection(Collection);
		//FindIterable<Document> iterDoc = collection.find().sort({});
		collection.deleteOne(Filters.eq("fileName", fileToDelete));
		mongoClient.close();
	}

	//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	@Keyword
	def fetchEntry(String MongoURI, String Database, String Collection, String key, String Value) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);
		//Added to check master configuration entry, filters and count the number of entries
		MongoCollection<Document> collection = database.getCollection(Collection);
		List ls = new ArrayList();
		FindIterable<Document> iterDoc = collection.find(Filters.eq(key, Value));
		long value = collection.count(Filters.eq(key, Value));
		mongoClient.close();
		return value;
	}

	//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


	@Keyword
	def fetchEntry(String MongoURI, String Database, String Collection, String key, int Value) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);
		//Added to check master configuration entry, filters and count the number of entries
		MongoCollection<Document> collection = database.getCollection(Collection);
		List ls = new ArrayList();
		FindIterable<Document> iterDoc = collection.find(Filters.eq(key, Value));
		long value = collection.count(Filters.eq(key, Value));
		mongoClient.close();
		return value;

	}

	@Keyword
	def fetchFile(String MongoURI, String Database, String Collection, String key, String Value) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);
		//Added to check master configuration entry, filters and count the number of entries
		MongoCollection<Document> collection = database.getCollection(Collection);
		FindIterable iterDoc = collection.find(Filters.eq("ServiceName", "cache-post-bulk-service"));
		FindIterable cursor = database.getCollection(Collection).find(Filters.eq("ServiceName", "cache-post-bulk-service"));
		MongoCursor<Document> it = iterDoc.iterator();
		String  js2;
		JSONObject fromObject = new JSONObject();

		//	Object obj = new Object();
		for (Document doc: collection.find(Filters.eq("ServiceName", "cache-post-bulk-service"))) {
			js2 = doc.toJson();
			fromObject = JSONObject.fromObject(js2);
		}

		return js2
	}


	//added by Gouthamraj KR
	@Keyword
	def DeleteDBOneRecords(String MongoURI, String Database, String Collection, String key, Object value) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);

		//Get all documents from collection and delete one with the filter
		MongoCollection collection = database.getCollection(Collection);
		//FindIterable<Document> iterDoc = collection.find().sort({});
		collection.deleteOne(Filters.eq(key, value));
		mongoClient.close();
	}

	@Keyword
	def DeleteDBManyRecords(String MongoURI, String Database, String Collection, String key, Object value) {
		String mongoURI = MongoURI;
		MongoClientURI connectionString = new MongoClientURI(mongoURI);
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase(Database);

		//Get all documents from collection and delete one with the filter
		MongoCollection collection = database.getCollection(Collection);
		//FindIterable<Document> iterDoc = collection.find().sort({});
		collection.deleteMany(Filters.eq(key, value));
		mongoClient.close();
	}

	@Keyword
	def fetchFile1234(String MongoURI, String Database, String Collection,String key,Object value) {

		String mongoURI=MongoURI;
		MongoClientURI uri = new MongoClientURI(mongoURI);
		MongoClient mongodb = new MongoClient(uri);
		MongoDatabase database = mongodb.getDatabase(Database)
		MongoCollection<Document> coll = database.getCollection(Collection)
		long count1= coll.count();
		//System.out.println("count1__"+count1);

		FindIterable<Document> condition = coll.find();
		for (Document document1 : condition) {
			String jsosnvalue =document1.toJson();
			//System.out.println("jsosnvalue__" + jsosnvalue);
			JSONObject json123 = (JSONObject) JSONSerializer.toJSON(jsosnvalue);
			//System.out.println("json123__" + json123);
			Object object = JsonPath.read(json123, key);
			String arrayvalue = object.toString();
			ArrayList<String> arraylist = new ArrayList<String>();
			arraylist.add(arrayvalue);
			//System.out.println("arraylist__"+arraylist.toString());
			for(String i : arraylist) {
				//System.out.println("i__" + i);
				if(i.equals(value)) {
					System.out.println("i__"+i);
					return i
					//break;
				}

			}

		}
		mongodb.close();

	}

	@Keyword
	def ArrayList<String> mongojsonpathlist(String mongoURI,String databasename,String collection,String key,Object value,String jsonpath) {

		ArrayList<String> jsonArray = new ArrayList<>();

		MongoClientURI uri = new MongoClientURI(mongoURI);
		MongoClient mongodb = new MongoClient(uri);
		MongoDatabase database = mongodb.getDatabase(databasename);
		MongoCollection<Document> coll = database.getCollection(collection);
		long count1= coll.count();
		FindIterable<Document> condition = coll.find(Filters.eq(key, value));

		for (Document document1 : condition) {
			String jsosnvalue =document1.toJson();
			//System.out.println("jsosnvalue__" + jsosnvalue);
			JSONObject json123 = (JSONObject) JSONSerializer.toJSON(jsosnvalue);
			//System.out.println("json123__" + json123);
			Object object = JsonPath.read(json123, jsonpath);
			String arrayvalue = object.toString();
			//System.out.println("arrayvalue_____"+arrayvalue);
			jsonArray.add(arrayvalue);
			Collections.sort(jsonArray);



		}

		System.out.println(jsonArray);
		mongodb.close();
		return jsonArray;


	}


}


/*		MongoCollection<Document> collection = database.getCollection(Collection);
 List ls = new ArrayList();
 FindIterable<Document> iterDoc = collection.find(Filters.eq("ServiceName", "cache-post-bulk-service")).lean().then(res ={ vars -> line_selection
 });
 MongoCursor<Document> it = iterDoc.iterator();
 //	long value = collection.count(Filters.eq(key, Value));
 mongoClient.close();
 return it; */

//db.mycol.remove({'title':'MongoDB Overview'})
/*	@Keyword
 def connectDatabase(){
 MongoDatabase database = mongoClient.getDatabase("DAP_R2IAT");
 } */

/*	@Keyword
 def connectDatabase(){
 MongoDatabase database = mongoClient.getDatabase("DAP_R2IAT");
 } */
