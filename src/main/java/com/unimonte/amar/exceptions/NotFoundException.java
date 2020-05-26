package com.unimonte.amar.exceptions;

//vai tratar um erro espec�fico de id n�o encontrado e vai retornar para o usuario um erro

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotFoundException() {

	}

	public NotFoundException(String message) {
		super(message);

	}

	public NotFoundException(Throwable cause) {
		super(cause);

	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public NotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
