package com.bme.pfe.reporting.pdf;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface PdfProcessor {

	public void process(final Map<String, Object> model, final HttpServletRequest request, final HttpServletResponse response)
			throws Exception;

}