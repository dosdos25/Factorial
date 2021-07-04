Factorial de clase  pública {

	 Factorial público () {

		int numero =  5 ;

		// Utilizando un Ciclo
		Sistema . fuera . println
			" El factorial de " + numero +
			" es: " + getFactorialConCiclo (número)
		);

		// De forma recursiva
		Sistema . fuera . println
			" El factorial de " + numero +
			" es: " + getFactorialRecursivo (numero));
	}

	// Método que utiliza un ciclo
	public  int  getFactorialConCiclo ( int  n ) {
		int acumulado =  1 ;
		para ( int i = n; i > = 1 ; i - ) {
			acumulado * = i;
		}
		retorno acumulado;
	}

	// Método recursivo
	public  int  getFactorialRecursivo ( int  n ) {
		si (n == 0 ) {
			return  1 ;
		} más {
			return n * getFactorialRecursivo (n - 1 );
		}
	}

	// Main de la clase Factorial
	public  static  void  main ( String  args []) {
		nuevo  Factorial ();
	}
}
