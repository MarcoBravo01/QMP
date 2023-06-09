package ar.edu.utn.frba.dds;

import java.util.Objects;

public class Borrador {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;


  void especificarMaterial(Material material){
    this.material = material;
  }
  void especificarColorPrimario(Color color){
    this.colorPrincipal = color;
  }
  void especificarColorSecundario(Color color){
    this.colorSecundario = color;
  }
  void especificarTrama(Trama trama){
    if (trama == null) {
      this.trama = this.trama.LISA;
    }
    else this.trama = trama;
  }
  public Borrador(TipoPrenda tipo){
    this.tipo = Objects.requireNonNull(tipo, "el tipo no puede ser nulo");
  }
  Prenda crearPrenda(){
    return new Prenda(tipo, material, colorPrincipal, colorSecundario, trama);
  }
}
