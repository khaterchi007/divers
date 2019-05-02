package com.bme.pfe.reprting.utils.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.bme.pfe.reporting.model.Ordinateur;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PDFGenerator extends AbstractPdfView {

	public void performTask(final Map<String, Object> model, final HttpServletRequest request, final HttpServletResponse response)
			throws Exception {
		// processRequest(model, request, response);
	}

	@Override
	protected void buildPdfDocument(final Map<String, Object> model, final Document document, final PdfWriter writer,
			final HttpServletRequest request, final HttpServletResponse response) throws Exception {
		// // List of Ordinateurs that will be displayed in the PDF
		final String pdfFileName = "Ordinateurs.pdf";
		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "attachment; filename=" + pdfFileName);
		System.out.println("Map size " + model.size());
		final List<Ordinateur> Ordinateurs = (List<Ordinateur>) model.get("Ordinateurs");

		final Table table = new Table(3);
		table.setWidths(new int[] { 1, 3, 3 });

		final Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

		Cell hcell;
		hcell = new Cell("Adr_ip");
		hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(hcell);

		hcell = new Cell("Adr_mac");
		hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(hcell);

		hcell = new Cell("Etat");
		hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(hcell);

		for (final Ordinateur city : Ordinateurs) {

			Cell cell;

			cell = new Cell(city.getAdr_ip().toString());
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(cell);

			cell = new Cell(city.getAdr_mac());
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);

			cell = new Cell(city.getEtat());
			cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			table.addCell(cell);
		}

		document.add(table);

	}

	// @Override
	// void buildPdfDocument(final Map<String, Object> model, final Document
	// document, final HttpServletRequest request,
	// final HttpServletResponse response) throws Exception {
	// // List of Ordinateurs that will be displayed in the PDF
	// System.out.println("Map size " + model.size());
	// final List<Ordinateur> Ordinateurs = (List<Ordinateur>)
	// model.get("Ordinateurs");
	//
	// final PdfPTable table = new PdfPTable(3);
	// table.setWidthPercentage(60);
	// table.setWidths(new int[] { 1, 3, 3 });
	//
	// final Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
	//
	// PdfPCell hcell;
	// hcell = new PdfPCell(new Phrase("Adr_ip", headFont));
	// hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
	// table.addCell(hcell);
	//
	// hcell = new PdfPCell(new Phrase("Adr_mac", headFont));
	// hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
	// table.addCell(hcell);
	//
	// hcell = new PdfPCell(new Phrase("Etat", headFont));
	// hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
	// table.addCell(hcell);
	//
	// for (final Ordinateur city : Ordinateurs) {
	//
	// PdfPCell cell;
	//
	// cell = new PdfPCell(new Phrase(city.getAdr_ip().toString()));
	// cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	// cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	// table.addCell(cell);
	//
	// cell = new PdfPCell(new Phrase(city.getAdr_mac()));
	// cell.setPaddingLeft(5);
	// cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	// cell.setHorizontalAlignment(Element.ALIGN_LEFT);
	// table.addCell(cell);
	//
	// cell = new PdfPCell(new Phrase(city.getEtat()));
	// cell.setPaddingLeft(5);
	// cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
	// cell.setHorizontalAlignment(Element.ALIGN_LEFT);
	// table.addCell(cell);
	// }
	//
	// document.add(table);
	//
	// }

}
