package com.SpringSecCSRFPratice.code.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CSRFcustfilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		
		CsrfToken token=(CsrfToken) request.getAttribute("_falame");
		
		System.out.println(token.getHeaderName());
		System.out.println(token.getParameterName());
		System.out.println(token.getToken());
		
		doFilter(request, response, filterChain);
		
	}
	
	

}
