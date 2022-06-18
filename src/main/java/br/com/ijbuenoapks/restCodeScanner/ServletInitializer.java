package br.com.ijbuenoapks.restCodeScanner;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.ijbuenoapks.restCodeScanner.RestCodScannerApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestCodScannerApplication.class);
	}

}
