package com.nelioalves.cursomc.resources.exception;

public class CodTipoClienteInvalido extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public CodTipoClienteInvalido(String mensagem) {
		super(mensagem);
	}
}
