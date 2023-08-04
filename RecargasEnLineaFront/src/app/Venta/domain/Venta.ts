import { Operador } from "src/app/Operador/domain/Operador";
import { Persona } from "src/app/Persona/domain/Persona";

export class Venta{
  ventaId?    :number;
  persona?    :Persona;
  operador?   :Operador;
  nroCelular? :number;
  cantidad?   :number;
}
