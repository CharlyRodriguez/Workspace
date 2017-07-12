package com.beeva.app.Batchdemo.job.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.app.Batchdemo.job.fileProcessor.model.Empleado;
@Component
public class FileProcess implements ItemProcessor<Empleado,Empleado>{
	
	public Empleado process(Empleado empleado){
		System.out.println(empleado.toString());
		return empleado;
	}

	
	
}
