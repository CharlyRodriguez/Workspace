package com.beeva.app.log;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.model.Banco;
import com.beeva.app.model.Cliente;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Bancolog {
	public void log(Banco banco){
		Calendar fecha = Calendar.getInstance();
		ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
    	MongoClient dbm = (MongoClient) context.getBean("mongo");
        	
			DB db =dbm.getDB("Bancolog");
			DBCollection table = db.getCollection("log");
			BasicDBObject doc = new BasicDBObject();
			doc.put("mensaje", "se agrego un banco");
			doc.put("fecha", fecha.getTime().toString());
			doc.put("idbanco", banco.getId());
			doc.put("nombre", banco.getNombre());
			table.insert(doc);
	}

}
