package com.bme.pfe.reporting.pdf;

import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;

@Component
public abstract class PdfAbstractProcessor extends AbstractPdfView implements PdfProcessor {

	@Override
	public void process(final Map<String, Object> model, final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		renderMergedOutputModel(model, request, response);
	}

	@Override
	protected void buildPdfDocument(final Map<String, Object> model, final Document document, final PdfWriter writer,
			final HttpServletRequest request, final HttpServletResponse response) throws Exception {
		internalProcess(model, document, writer, response);
	}

	protected abstract Optional<Document> internalProcess(final Map<String, Object> model, final Document document,
			final PdfWriter writer, final HttpServletResponse response) throws Exception;

}