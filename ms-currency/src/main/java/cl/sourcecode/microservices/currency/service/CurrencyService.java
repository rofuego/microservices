package cl.sourcecode.microservices.currency.service;

import java.util.List;

import cl.sourcecode.microservices.currency.dto.CurrencyDTO;

public interface CurrencyService {

	public List<CurrencyDTO> getAll();

	public CurrencyDTO getByCode(String code);
}
