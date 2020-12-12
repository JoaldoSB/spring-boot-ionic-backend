package com.nelioalves.cursomc.resources.exception;

public class CodTipoInvalido extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public CodTipoInvalido(String mensagem) {
		super(mensagem);
	}
}
