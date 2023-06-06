Algoritmo botellera
	
	Definir usr, pwd, inputUsr, inputPwd Como Caracter
	Definir counterLogin, optionMenu, bottles, bottleWeight, i, balance, totalBalance, acceptTransaction Como Entero
	Definir login, exit Como Logico
	
	usr = "Albus_D"
	pwd = "caramelosDeLimon"
	login = Falso
	counterLogin = 3
	exit = Falso
	bottleWeight = 0
	balance = 0
	acceptTransaction = 0
	totalBalance = 0
	
	Mientras (counterLogin > 0) Hacer
		Imprimir "Ingrese su usario: "
		Leer inputUsr
		
		Imprimir "Ingrese su contraseña: "
		Leer inputPwd
		
		Si (usr == inputUsr) Y (pwd == inputPwd) Entonces
			Imprimir "Inicio de sesión correcto."
			Imprimir "..."
			login = Verdadero
			counterLogin = 0
		SiNo
			counterLogin = counterLogin - 1
		FinSi
	FinMientras
	
	Hacer
		
		Imprimir "Máquina Recicladora."
		Imprimir "Ingrese una opción para operar: "
		Imprimir "{1} Ingresar Botellas."
		Imprimir "{2} Consultar Saldo."
		Imprimir "{3} Salir."
		Leer optionMenu
		
		Si (optionMenu == 1) Entonces
			Imprimir "Ingrese la cantidad de botellas a reciclar: "
			Leer bottles
			
			Para i = 1 Hasta bottles Con Paso 1 Hacer
				bottleWeight = Aleatorio(100, 3000)
				
				Si (bottleWeight <= 500) Entonces
					balance = balance + 50
				SiNo
					Si (bottleWeight <= 1500) Y (bottleWeight > 501) Entonces
						balance = balance + 125
					SiNo
						balance = balance + 200
					FinSi
				FinSi
				
				Imprimir "Botella ", i " ingresada. Peso: ", bottleWeight, "grs."
				Imprimir "..."
			FinPara
			
			Imprimir "El monto total es de: $", balance, "."
			Imprimir "Ingrese 1 para aceptar 2 para salir: "
			Imprimir "..."
			Leer acceptTransaction
			
			
			
			Si (acceptTransaction <> 1) Entonces
				balance = 0
				Imprimir "Devolviendo material"
			SiNo
				totalBalance = totalBalance + balance
				balance = 0	
				Imprimir "El saldo yá está disponible en su cartera, dele su usuario a la cajera para obtener su dinero."
				
			FinSi
			
			Imprimir "Regresando al Menú Principal."
			Imprimir "..."
			
		SiNo
			Si (optionMenu == 2) Entonces
				Imprimir "Su saldo a favor es de $", totalBalance, "."
				Imprimir "..."
				Imprimir "Regresando al Menú Principal."
				Imprimir "..."
				
			SiNo
				Si (optionMenu == 3) Entonces
					Imprimir "Gracias por usar la Máquina Recicladora."
					exit = Verdadero
				FinSi
			FinSi
		FinSi
		
	Mientras Que (exit == Falso)
	
FinAlgoritmo
