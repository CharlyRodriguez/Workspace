package com.beeva.app.log;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.model.Cliente;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class ClienteLog {
	public void log(Cliente cliente){
		Calendar fecha = Calendar.getInstance();
		ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
    	MongoClient dbm = (MongoClient) context.getBean("mongo");
        	
			DB db =dbm.getDB("Bancolog");
			DBCollection table = db.getCollection("log");
			BasicDBObject doc = new BasicDBObject();
			doc.put("mensaje", "se agrego un cliente");
			doc.put("fecha", fecha.getTime());
			doc.put("idcliente", cliente.getId());
			doc.put("nombre", cliente.getNombre());
			doc.put("apellido", cliente.getApellido());
			table.insert(doc);
	}

}
