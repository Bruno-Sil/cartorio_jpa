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
@Table(name = "tb_tipotabeliao")
public class TipoTabeliao implements EntidadeBase{

    private Long id;
    private String nome;
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

    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoTabeliao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTabeliao tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTabeliao)) {
            return false;
        }
        TipoTabeliao other = (TipoTabeliao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.brunosil.cartorio.entidade.TipoTabeliao[ id=" + id + " ]";
    }

}
