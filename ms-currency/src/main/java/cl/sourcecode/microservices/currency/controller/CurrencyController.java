package cl.sourcecode.microservices.currency.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.sourcecode.microservices.currency.dto.CurrencyDTO;
import cl.sourcecode.microservices.currency.service.CurrencyService;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

	private final CurrencyService currencyService;

	public CurrencyController(CurrencyService currencyService) {
		this.currencyService = currencyService;
	}

	@GetMapping("")
	public ResponseEntity<List<CurrencyDTO>> getAll() {
		return new ResponseEntity<>(currencyService.getAll(), HttpStatus.OK);
	}

	@GetMapping("/{code}")
	public ResponseEntity<CurrencyDTO> getByCode(@PathVariable String code) {
		return new ResponseEntity<>(currencyService.getByCode(code), HttpStatus.OK);
	}
}
