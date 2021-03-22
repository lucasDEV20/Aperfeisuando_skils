import { Component, OnInit } from '@angular/core';
@Component({
  // tslint:disable-next-line:component-selector
  selector: 'menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css'],
})
export class MenuComponent implements OnInit {
  constructor() {}
  public texto: string | undefined;
  // tslint:disable-next-line:typedef
  ngOnInit() {
    this.texto = 'Olá tudo bem?';
  }

  // tslint:disable-next-line:typedef
  clicou() {
    this.texto = 'Clicou';
  }
}
