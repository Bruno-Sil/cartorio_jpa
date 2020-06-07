
package com.github.brunosil.cartorio;

import com.github.brunosil.cartorio.entidade.Tabeliao;
import com.github.brunosil.dao.DaoGenerico;


public class AtualizarAplicacao {
   public static void main(String[] args) {
      DaoGenerico<Tabeliao> daoTabeliao = new DaoGenerico<Tabeliao>();
      Tabeliao tabeliao = daoTabeliao.findById(Tabeliao.class, 1L);
      
      System.out.println("====Atualizar Entidade Tabeliao====");
      tabeliao.setNome("Bruno");
      daoTabeliao.saveOrUpdate(tabeliao);
      System.out.println("====Entidade atualizada com sucesso====");
      
   } 
}
