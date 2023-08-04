import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Persona } from '../domain/Persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor(private http: HttpClient) { }

  public listPersonasByTipoPersonaEqualsVendedor(): Observable<Persona[]>{
    return this.http.get<Persona[]>('localhost:8188/personas/typeVendedor', {headers: this.headers()});

  }

  private headers(){
    let header: HttpHeaders = new HttpHeaders();
    header = header.append('Content-Type', 'application/json');

    return header;
  }
}
