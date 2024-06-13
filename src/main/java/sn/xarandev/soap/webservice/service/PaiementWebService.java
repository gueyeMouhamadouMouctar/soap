package sn.xarandev.soap.webservice.service;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import sn.xarandev.soap.webservice.dto.TransactionDto;

@WebService
public interface PaiementWebService {

	@WebMethod(operationName = "getTransaction")
	public TransactionDto get(@WebParam(name = "idTransaction") long id);
	
	@WebMethod(operationName = "saveTransaction")
	public TransactionDto save(@WebParam(name = "transaction") TransactionDto transactionDto);
	
	@WebMethod(operationName = "allTransactions")
	public List<TransactionDto> getAll();
}
