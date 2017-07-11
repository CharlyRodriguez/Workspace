package com.beeva.app.Mongo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
    	MongoClient dbm = (MongoClient) context.getBean("mongo");
        	
			DB db =dbm.getDB("testdb");
			DBCollection table = db.getCollection("user");
			BasicDBObject doc = new BasicDBObject();
			doc.put("nombre", "yo");
			doc.put("edad", "23");
			table.insert(doc);
			
			
		
    }
}
