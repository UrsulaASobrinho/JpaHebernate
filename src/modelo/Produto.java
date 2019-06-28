package modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the produtos database table.
 * 
 */
@Entity
@Table(name="produtos")
@NamedQuery(name="Produto.findAll", query="SELECT p FROM Produto p")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="pd_codigo")
	private int pdCodigo;

	@Column(name="pd_descricao")
	private int pdDescricao;

	@Column(name="pd_valor")
	private int pdValor;

	public Produto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPdCodigo() {
		return this.pdCodigo;
	}

	public void setPdCodigo(int pdCodigo) {
		this.pdCodigo = pdCodigo;
	}

	public int getPdDescricao() {
		return this.pdDescricao;
	}

	public void setPdDescricao(int pdDescricao) {
		this.pdDescricao = pdDescricao;
	}

	public int getPdValor() {
		return this.pdValor;
	}

	public void setPdValor(int pdValor) {
		this.pdValor = pdValor;
	}

}