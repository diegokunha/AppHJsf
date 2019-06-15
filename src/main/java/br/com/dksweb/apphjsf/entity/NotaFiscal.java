package br.com.dksweb.apphjsf.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "notaFiscal")
public class NotaFiscal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Size(max = 44)
	private Integer chave;
	
	@Size(max = 9)
	private Integer nota;
	
	@Size(max = 3)
	private Integer serie;
	
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	
	private Double valorTotal;
	
	@Size(max = 14)
	private String cnpjEmitente;
	private String inscricaoEstatualEmitente;
	private String incricaoMunicipalEmitente;
	private String emitente;
	private String enderecoEmitente;
	private String bairroEmitente;
	private String municipioEmitente;
	private String ufEmitente;
	private String cepEmitente;
	private String contatoEmitente;
	
	private String cnpjDestinatario;
	private String inscricaoEstadualDestinatario;
	private String cpfDestinatario;
	private String destinatario;
	private String enderecoDestinatario;
	private String bairroDestinatario;
	private String municipioDestinatario;
	private String ufDestinatario;
	private String cepDestinatario;
	private String contatoDestinatario;
	
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	public Integer getSerie() {
		return serie;
	}
	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	public Integer getChave() {
		return chave;
	}
	public void setChave(Integer chave) {
		this.chave = chave;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getCnpjEmitente() {
		return cnpjEmitente;
	}
	public void setCnpjEmitente(String cnpjEmitente) {
		this.cnpjEmitente = cnpjEmitente;
	}
	public String getInscricaoEstatualEmitente() {
		return inscricaoEstatualEmitente;
	}
	public void setInscricaoEstatualEmitente(String inscricaoEstatualEmitente) {
		this.inscricaoEstatualEmitente = inscricaoEstatualEmitente;
	}
	public String getIncricaoMunicipalEmitente() {
		return incricaoMunicipalEmitente;
	}
	public void setIncricaoMunicipalEmitente(String incricaoMunicipalEmitente) {
		this.incricaoMunicipalEmitente = incricaoMunicipalEmitente;
	}
	public String getEmitente() {
		return emitente;
	}
	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}
	public String getEnderecoEmitente() {
		return enderecoEmitente;
	}
	public void setEnderecoEmitente(String enderecoEmitente) {
		this.enderecoEmitente = enderecoEmitente;
	}
	public String getBairroEmitente() {
		return bairroEmitente;
	}
	public void setBairroEmitente(String bairroEmitente) {
		this.bairroEmitente = bairroEmitente;
	}
	public String getMunicipioEmitente() {
		return municipioEmitente;
	}
	public void setMunicipioEmitente(String municipioEmitente) {
		this.municipioEmitente = municipioEmitente;
	}
	public String getUfEmitente() {
		return ufEmitente;
	}
	public void setUfEmitente(String ufEmitente) {
		this.ufEmitente = ufEmitente;
	}
	public String getCepEmitente() {
		return cepEmitente;
	}
	public void setCepEmitente(String cepEmitente) {
		this.cepEmitente = cepEmitente;
	}
	public String getContatoEmitente() {
		return contatoEmitente;
	}
	public void setContatoEmitente(String contatoEmitente) {
		this.contatoEmitente = contatoEmitente;
	}
	public String getCnpjDestinatario() {
		return cnpjDestinatario;
	}
	public void setCnpjDestinatario(String cnpjDestinatario) {
		this.cnpjDestinatario = cnpjDestinatario;
	}
	public String getInscricaoEstadualDestinatario() {
		return inscricaoEstadualDestinatario;
	}
	public void setInscricaoEstadualDestinatario(String inscricaoEstadualDestinatario) {
		this.inscricaoEstadualDestinatario = inscricaoEstadualDestinatario;
	}
	public String getCpfDestinatario() {
		return cpfDestinatario;
	}
	public void setCpfDestinatario(String cpfDestinatario) {
		this.cpfDestinatario = cpfDestinatario;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getEnderecoDestinatario() {
		return enderecoDestinatario;
	}
	public void setEnderecoDestinatario(String enderecoDestinatario) {
		this.enderecoDestinatario = enderecoDestinatario;
	}
	public String getBairroDestinatario() {
		return bairroDestinatario;
	}
	public void setBairroDestinatario(String bairroDestinatario) {
		this.bairroDestinatario = bairroDestinatario;
	}
	public String getMunicipioDestinatario() {
		return municipioDestinatario;
	}
	public void setMunicipioDestinatario(String municipioDestinatario) {
		this.municipioDestinatario = municipioDestinatario;
	}
	public String getUfDestinatario() {
		return ufDestinatario;
	}
	public void setUfDestinatario(String ufDestinatario) {
		this.ufDestinatario = ufDestinatario;
	}
	public String getCepDestinatario() {
		return cepDestinatario;
	}
	public void setCepDestinatario(String cepDestinatario) {
		this.cepDestinatario = cepDestinatario;
	}
	public String getContatoDestinatario() {
		return contatoDestinatario;
	}
	public void setContatoDestinatario(String contatoDestinatario) {
		this.contatoDestinatario = contatoDestinatario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		return true;
	}

	
	
}
