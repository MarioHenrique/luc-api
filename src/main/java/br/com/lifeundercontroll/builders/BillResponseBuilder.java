package br.com.lifeundercontroll.builders;

import java.text.SimpleDateFormat;

import br.com.lifeundercontroll.dto.Response.BillResponse;
import br.com.lifeundercontroll.entity.BillEntity;

public class BillResponseBuilder {

	public static BillResponse build(BillEntity billEntity){
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		BillResponse billResponse = new BillResponse();
		billResponse.setDueDate(sdf.format(billEntity.getDueDate()));
		billResponse.setName(billEntity.getName());
		billResponse.setValue(billEntity.getValue());
		return billResponse;
	}
	
}
