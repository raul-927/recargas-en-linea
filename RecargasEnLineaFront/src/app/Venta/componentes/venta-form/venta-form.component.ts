import { Component, OnChanges, OnInit } from '@angular/core';
import {FormsModule, FormBuilder, FormGroup, FormControl} from '@angular/forms';
import { Operador } from 'src/app/Operador/domain/Operador';
import { Persona } from 'src/app/Persona/domain/Persona';
import { TipoPersonaEnum } from 'src/app/Persona/enumerador/TipoPersonaEnum';
import { PersonaService } from 'src/app/Persona/services/persona.service';
import { Recarga } from 'src/app/Recarga/domain/Recarga';
import { TipoRecargaEnum } from 'src/app/Recarga/enumerador/TipoRecargaEnum';


@Component({
  selector: 'app-venta-form',
  templateUrl: './venta-form.component.html',
  styleUrls: ['./venta-form.component.css']
})
export class VentaFormComponent implements OnInit , OnChanges{

  defaultValue: string ='Seleccione una opción';
  defaultValue2: string ='Seleccione una opción';
  defaultValue3: string ='Seleccione una opción';
  opcion?:string;

  personas?: Persona[];
  operadores?: Operador[];
  optionsEnumTipoRegarga?: TipoRecargaEnum[];
  ventaFormGroup: FormGroup;
  persona?:  FormControl;
  operador?: FormControl;
  tipoRecarga?: FormControl;
  recarga?: FormControl;
  valor?: FormControl;
  nroCelular?: FormControl;
  recargas?: Recarga[];

  constructor(private personaService: PersonaService, private formBuilder: FormBuilder){
    this.ventaFormGroup = formBuilder.group({
      persona: new FormControl(),
      operador: new FormControl(),
      tipoRecarga: new FormControl(),
      recarga: new FormControl(),
      valor: new FormControl(),
      nroCelular: new FormControl()
    });
  }


  ngOnInit(): void {
    //this.listPersonasByTipoPersonaEqualsVendedor();

  }
  ngOnChanges():void{

  }

  public insertVenta(param: any){

  }

  public modelChangeFn(abc: string) {
    this.opcion = abc;
  }

  public listPersonasByTipoPersonaEqualsVendedor(){
    this.personaService.listPersonasByTipoPersonaEqualsVendedor().subscribe(per =>{
      this.personas = per;
      console.log('PERSONAS: '+JSON.stringify(this.personas));
    });
  }

}
