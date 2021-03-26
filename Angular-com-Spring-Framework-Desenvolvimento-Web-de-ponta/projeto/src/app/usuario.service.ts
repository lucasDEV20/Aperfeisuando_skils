import { Injectable } from "@angular/core";
import { Usuario } from "./usuario";

@Injectable({
  providedIn: "root",
})
export class UsuarioService {
  constructor() {}

  public getUsuario(): Usuario {
    let usuario = new Usuario();
    usuario.nome = "Lucas ";
    usuario.email = "lucasa@gmail.com";

    return usuario;
  }

  public listaUsuarios(): Usuario[] {
    return [
      {
        nome: "lucas araujo",
        email: "Lucasgoais11@gmail.com",
      },
      {
        nome: "Maria araujo",
        email: "Mariagoais11@gmail.com",
      },
      {
        nome: "Paulo araujo",
        email: "Paulogoais11@gmail.com",
      },
      {
        nome: "Carlos araujo",
        email: "Carlosgoais11@gmail.com",
      },
    ];
  }
}
