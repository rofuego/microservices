package cl.sourcecode.microservices.currency.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyDTO {

	private Long id;

	private String code;

	private String name;

	private String country;
}
