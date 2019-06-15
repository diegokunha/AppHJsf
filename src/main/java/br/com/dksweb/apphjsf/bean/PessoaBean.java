package br.com.dksweb.apphjsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.dksweb.apphjsf.dao.DaoGenericImplement;
import br.com.dksweb.apphjsf.entity.Pessoa;

//Bean da view Pessoa

@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();
	private DaoGenericImplement<Pessoa> daoPessoa = new DaoGenericImplement<Pessoa>();
	private List<Pessoa> pessoas =new ArrayList<Pessoa>();

	public PessoaBean() {
		carregarPessoas();
	}
	
	/*
	@PostConstruct
	public void init() {
		this.pessoa = new Pessoa();
		this.daoPessoa = new DaoGenericImplement<Pessoa>();
		this.pessoas = new ArrayList<Pessoa>();
	}
	*/

	public String salvar() {
		if (pessoa.getId() == null) {
			daoPessoa.salvar(pessoa);
		} else {
			daoPessoa.merge(pessoa);
		}
		carregarPessoas();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação", "Cadastro realizado com sucesso!!"));
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);

		return "formPessoa.jsf?faces-redirect=true";
	}

	public String excluir(Pessoa pessoa) {
		daoPessoa.excluiPorId(pessoa);
		
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Informação", "Cadastro removido com sucesso!!"));
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		
		return "formPessoa.jsf?faces-redirect=true";
	}

	public void carregarPessoas() {
		pessoas = daoPessoa.getListEntity(Pessoa.class);
	}

	public void buscaPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public DaoGenericImplement<Pessoa> getDaoPessoa() {
		return daoPessoa;
	}

	public void setDaoPessoa(DaoGenericImplement<Pessoa> daoPessoa) {
		this.daoPessoa = daoPessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
