package cl.sourcecode.microservices.currency.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.sourcecode.microservices.currency.dto.CurrencyDto;
import cl.sourcecode.microservices.currency.entity.CurrencyEntity;
import cl.sourcecode.microservices.currency.repository.CurrencyRepository;
import cl.sourcecode.microservices.currency.service.CurrencyService;

@Service
public class CurrencyServiceImpl implements CurrencyService {

	private final CurrencyRepository currencyRepository;

	public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
		this.currencyRepository = currencyRepository;
	}

	@Override
	public List<CurrencyDto> getAll() {
		List<CurrencyDto> list = new ArrayList<>();
		Iterable<CurrencyEntity> iterable = currencyRepository.findAll();
		for (CurrencyEntity entity : iterable) {
			list.add(new CurrencyDto(entity.getId(), entity.getCode(), entity.getName(), entity.getCountry()));
		}
		return list;
	}

	@Override
	public CurrencyDto getByCode(String code) {
		Optional<CurrencyEntity> optional = currencyRepository.findByCode(code);
		if (optional.isPresent()) {
			return new CurrencyDto(optional.get().getId(), optional.get().getCode(), optional.get().getName(),
					optional.get().getCountry());
		}
		return null;
	}

}
