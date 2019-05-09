package com.bme.pfe.reporting.pdf.exception;

public class PdfProcessorFactoryException extends RuntimeException {

	private static final long serialVersionUID = 3844408731815680805L;

	public PdfProcessorFactoryException() {

	}

	public PdfProcessorFactoryException(final String message) {
		super(message);
	}

	public PdfProcessorFactoryException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public PdfProcessorFactoryException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PdfProcessorFactoryException(final Throwable cause) {
		super(cause);
	}

}
