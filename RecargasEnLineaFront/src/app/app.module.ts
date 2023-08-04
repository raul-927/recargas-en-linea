import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OperadorFormComponent } from './Operador/componentes/operador-form/operador-form.component';
import { OperadorTableComponent } from './Operador/componentes/operador-table/operador-table.component';
import { VentaFormComponent } from './Venta/componentes/venta-form/venta-form.component';
import { VentaTableComponent } from './Venta/componentes/venta-table/venta-table.component';

@NgModule({
  declarations: [
    AppComponent,
    OperadorFormComponent,
    OperadorTableComponent,
    VentaFormComponent,
    VentaTableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
