
package com.github.brunosil.cartorio;

import com.github.brunosil.cartorio.entidade.Tabeliao;
import com.github.brunosil.cartorio.entidade.TipoTabeliao;
import com.github.brunosil.dao.DaoGenerico;


public class BuscarAplicacao {
    public static void main(String[] args) {
        
       DaoGenerico<Tabeliao> daoTabeliao = new DaoGenerico<Tabeliao>();
       DaoGenerico<TipoTabeliao> daoTipoTabeliao = new DaoGenerico<TipoTabeliao>();
       
       Tabeliao tabeliao = daoTabeliao.findById(Tabeliao.class, 1L);
       TipoTabeliao tipoTabeliao = daoTipoTabeliao.findById(TipoTabeliao.class, 1L);
       
       System.out.println("====Buscar Entidade Tabeliao====");
       System.out.println("ID: " + tabeliao.getId());
       System.out.println("NOME: " + tabeliao.getNome());
       
       System.out.println("");
       
       System.out.println("====Buscar Entidade Tipo Tabeliao====");
       System.out.println("ID: " + tipoTabeliao.getId());
       
        
    }
    
}
