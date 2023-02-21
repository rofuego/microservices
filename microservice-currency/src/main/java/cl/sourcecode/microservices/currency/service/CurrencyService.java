package cl.sourcecode.microservices.currency.service;

import java.util.List;

import cl.sourcecode.microservices.currency.dto.CurrencyDto;

public interface CurrencyService {

	public List<CurrencyDto> getAll();

	public CurrencyDto getByCode(String code);
}
