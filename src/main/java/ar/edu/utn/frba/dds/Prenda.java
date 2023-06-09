package ar.edu.utn.frba.dds;
import java.util.Objects;

public class Prenda {
  TipoPrenda tipoPrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama;
  Categoria getCategoria(){return tipoPrenda.categoria;}
  public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama){
    this.tipoPrenda = Objects.requireNonNull(tipo, "el tipo no puede ser nulo");
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

}


