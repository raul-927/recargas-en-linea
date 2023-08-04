import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VentaFormComponent } from './Venta/componentes/venta-form/venta-form.component';
import { OperadorFormComponent } from './Operador/componentes/operador-form/operador-form.component';
const routes: Routes = [
  // { path: '', component: LoginComponent,canActivate:[AuthGuardService] },
   {path: 'venta', component: VentaFormComponent},
   {path: 'operador', component: OperadorFormComponent},
   {path: '', redirectTo: '/venta', pathMatch: 'full'},
   // otherwise redirect to home
   { path: '**', redirectTo: '/venta' }
 ];

 @NgModule({
   imports: [RouterModule.forRoot(routes)],
   exports: [RouterModule]
 })
 export class AppRoutingModule { }
