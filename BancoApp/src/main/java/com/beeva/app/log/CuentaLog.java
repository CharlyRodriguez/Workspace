package com.beeva.app.log;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.app.model.Cuenta;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class CuentaLog {
	public void log(Cuenta cuenta){
		Calendar fecha = Calendar.getInstance();
		ApplicationContext context = new ClassPathXmlApplicationContext("core-context.xml");
    	MongoClient dbm = (MongoClient) context.getBean("mongo");
        	
			DB db =dbm.getDB("Bancolog");
			DBCollection table = db.getCollection("log");
			BasicDBObject doc = new BasicDBObject();
			doc.put("mensaje", "se agrego una cuenta");
			doc.put("fecha", fecha.getTime().toString());
			doc.put("idcuenta", cuenta.getId());
			doc.put("balance", cuenta.getBalance());
			doc.put("idcliente", cuenta.getCliente().getId());
			doc.put("tipo de cuenta", cuenta.getTipocuenta());
			table.insert(doc);
	}

}
