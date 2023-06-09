package ar.edu.utn.frba.dds;

public class TipoPrenda {
  Categoria categoria;
  public TipoPrenda(Categoria categoria){
    this.categoria = categoria;
  }
  Categoria getCategoria(){return this.categoria;}
}
