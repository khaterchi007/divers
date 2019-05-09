package com.bme.pfe.reporting.pdf.exception;

public class PdfProcessorException extends RuntimeException {

	private static final long serialVersionUID = 3844408731815680805L;

	public PdfProcessorException() {

	}

	public PdfProcessorException(final String message) {
		super(message);
	}

	public PdfProcessorException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public PdfProcessorException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PdfProcessorException(final Throwable cause) {
		super(cause);
	}
}
