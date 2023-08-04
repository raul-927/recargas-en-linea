import { TipoPersonaEnum } from "../enumerador/TipoPersonaEnum";

export class Persona{
  personaId?: number;
  nombre?: string;
  documento?: string;
  tipoPersona?: TipoPersonaEnum;
}
