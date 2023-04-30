package com.SpringSecCSRFPratice.code.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

import com.SpringSecCSRFPratice.code.filter.CSRFcustfilter;
import com.SpringSecCSRFPratice.code.token.CustomCsrfToken;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	
	@Autowired
	CSRFcustfilter csrfcustfilter;
	
	
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		super.configure(http);
		http.csrf(csrf->csrf.csrfTokenRepository(new CustomCsrfToken()));
		
		http.addFilterAfter(csrfcustfilter,CsrfFilter.class);
	}
	
	
	
}
