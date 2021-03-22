import { Injectable } from '@angular/core';
import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor() { }

  public getUsurious(): Usuario {
    let usuario  = new Usuario()
    usuario.nome = "Lucas"
    usuario.email = "lucasgoais11@gmail.com"


    return usuario;
  }
}
