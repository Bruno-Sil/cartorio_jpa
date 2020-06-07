package com.github.brunosil.cartorio.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tabeliao")
public class Tabeliao implements EntidadeBase {

    private Long id;
    private String nome;
    private String sexo;
    private String cpf;
    private TipoTabeliao tipo;
    

    /**
     *
     * @return
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(name = "cpf")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo")
      public TipoTabeliao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTabeliao tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0); // Faz busca e organização dos elementos do objeto.
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Tabeliao)) {
            return false;
        }
        Tabeliao other = (Tabeliao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.brunosil.cartorio.entidade.Tabeliao[ id=" + id + " ]";
    }

}
