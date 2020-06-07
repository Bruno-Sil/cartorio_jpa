
package com.github.brunosil.cartorio;

import com.github.brunosil.cartorio.entidade.Tabeliao;
import com.github.brunosil.cartorio.entidade.TipoTabeliao;
import com.github.brunosil.dao.DaoGenerico;


public class InserirAplicacao {

    public static void main(String[] args) {
       
       Tabeliao tabeliao = new Tabeliao();
       TipoTabeliao tipotabeliao = new TipoTabeliao();
        
       DaoGenerico<Tabeliao> daoTabeliao = new DaoGenerico<Tabeliao>();
       DaoGenerico<TipoTabeliao> daoTipoTabeliao = new DaoGenerico<TipoTabeliao>();
       
       System.out.println("=====Inserir Dados da Entidade Tabeliao======");
       tabeliao.setNome("Lucas Jordan");
       tabeliao.setSexo("Masculino");
       tabeliao.setCpf("00000000000");
       tabeliao.setTipo(tipotabeliao);
      
       
       
       System.out.println("=====Inserir Dados da Entidade TipoTabeliao======");
       tipotabeliao.setNome("Lucas Emanuel");
       tipotabeliao.setTipo(tipotabeliao);
       
       daoTabeliao.saveOrUpdate(tabeliao);
       daoTipoTabeliao.saveOrUpdate(tipotabeliao);
        
       System.out.println("Entidades salvas com sucesso");
    }
    
}
