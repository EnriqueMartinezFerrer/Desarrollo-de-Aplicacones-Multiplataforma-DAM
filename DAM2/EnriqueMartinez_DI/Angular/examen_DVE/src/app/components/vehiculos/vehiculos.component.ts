import { VehiculosInterfaz } from './../../model/Vehiculos_interfaz';
import { Component } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { VehiculosService } from 'src/app/service/vehiculos.service';

@Component({
  selector: 'app-vehiculos',
  templateUrl: './vehiculos.component.html',
  styleUrls: ['./vehiculos.component.css']
})
export class VehiculosComponent {
  tipo = '';

  vehiculos: VehiculosInterfaz[] = [];

  constructor(private gestorRutas: ActivatedRoute, private servicio: VehiculosService){
    this.gestorRutas.params.subscribe((parametros: Params)=>{
      this.tipo = parametros['tipo'];
      this.vehiculos = servicio.getTIpo(this.tipo);
    });
  }
}
