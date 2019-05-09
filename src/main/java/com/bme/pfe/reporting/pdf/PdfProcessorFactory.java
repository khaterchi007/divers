package com.bme.pfe.reporting.pdf;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.bme.pfe.reporting.pdf.exception.PdfProcessorFactoryException;

@Component
public class PdfProcessorFactory {

	@Autowired
	private ApplicationContext applicationContext;

	public PdfProcessor getProcessor(final String processorName) {
		try {
			return applicationContext.getBean(processorName, PdfProcessor.class);
		} catch (final BeansException e) {
			throw new PdfProcessorFactoryException(String.format("processor %s can not be found", processorName));
		}
	}

}