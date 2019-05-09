package com.bme.pfe.reporting.pdf.ordinateur;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.bme.pfe.reporting.model.Ordinateur;
import com.bme.pfe.reporting.pdf.PdfAbstractProcessor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

@Component
public class OrdinateurTemplate2 extends PdfAbstractProcessor {

	@Override
	protected Optional<Document> internalProcess(final Map<String, Object> model, final Document document, final PdfWriter writer,
			final HttpServletResponse response) throws Exception {
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
		final Table t1 = new Table(1);
		hcell = new Cell("Header");
		hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
		t1.addCell(hcell);
		hcell = new Cell(table);
		t1.addCell(hcell);
		document.add(t1);
		return Optional.ofNullable(document);
	}

}
