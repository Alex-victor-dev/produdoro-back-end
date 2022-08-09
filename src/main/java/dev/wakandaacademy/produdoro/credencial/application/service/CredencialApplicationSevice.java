package dev.wakandaacademy.produdoro.credencial.application.service;

import javax.validation.Valid;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;

public interface CredencialApplicationSevice  {

	void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);

}
