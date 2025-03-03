import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'examen_DVE';
  constructor(private navegador: Router){

  }

  navegar(tipo: string) {
    // Router
    this.navegador.navigate(['vehiculos',tipo.toLowerCase()])
  }
}
