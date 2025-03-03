import { VehiculosInterfaz } from './../../model/Vehiculos_interfaz';
import { Component } from '@angular/core';
import { VehiculosService } from 'src/app/service/vehiculos.service';

@Component({
  selector: 'app-buscador',
  templateUrl: './buscador.component.html',
  styleUrls: ['./buscador.component.css'],
})
export class BuscadorComponent {
  lista: VehiculosInterfaz[] = [];
  marca:string = "";
  cv:number = 0;
  count: number = 0

  buscarMarcaCV(marca: string, cv: string) {
    this.marca = marca;
    this.cv = Number(cv);
  }

  constructor( private servicio: VehiculosService){
    this.lista = servicio.getMarcaCv(this.marca, this.cv);
  }

}
