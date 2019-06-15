package br.com.dksweb.apphjsf.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.com.dksweb.apphjsf.entity.NotaFiscal;

@ManagedBean(name = "impXmlBean")
@SessionScoped
public class ImportacaoXmlBean {

	private NotaFiscal notaFiscal = new NotaFiscal();
	private UploadedFile arquivo;

	public void setArquivo(UploadedFile arquivo) {
		this.arquivo = arquivo;
	}

	public UploadedFile getArquivo() {
		return arquivo;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void upload() {

		if (arquivo != null) {
			try {
				FacesMessage message = new FacesMessage("Succesful", arquivo.getFileName() + " is uploaded.");
				FacesContext.getCurrentInstance().addMessage(null, message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void handleFileUpload(FileUploadEvent event) throws IOException, Exception {
		this.arquivo = event.getFile();
		new File("D:\\temp");
		Path path = Paths.get("D:\\temp");
		SimpleDateFormat sm = new SimpleDateFormat("yyMMddHHmmss");
		Date data = new Date(0);
		String fileName = sm.format(data);
		Path pathFile = Files.createTempFile(path, fileName, ".xml");

		InputStream input = event.getFile().getInputstream();
		Files.copy(input, pathFile, StandardCopyOption.REPLACE_EXISTING);

		arquivo = (UploadedFile) pathFile.toFile();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação", "Arquivo importado com sucesso!!"));
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
	}	
	
	

}
