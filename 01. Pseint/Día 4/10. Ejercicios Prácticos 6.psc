Algoritmo agenda
	
	Definir cantidadEmails, correoVoz, solicitudEmergencia, solicitudEjecutivos Como Entero;
	
	Escribir "Iniciar sesión con usuario admin."
	
	Escribir "Ver informes de marketing."
	
	Escribir "Completar hoja de cálculo de ingresos mensuales."
	
	Escribir "Revisar Correo."
	
	cantidadEmails = 0
	correoVoz = 0
	solicitudEmergencia = 0
	solicitudEjecutivos = 0
	
	Si (cantidadEmails < 10) Y (correoVoz >= 1) Entonces
		Escribir "Revisar correo de voz."
		Si (solicitudEmergencia >= 1)
			Escribir "Revisar solicitud de emgencia de departamentos."
		FinSi
		Si (solicitudEjecutivos >= 1)
			Escribir "Revisar solicitudes de ejecutivos."	
		FinSi
	FinSi
	
	Escribir "Enviar mail de actualización de estado."
	
	Escribir "Apagar la computadora."
	
	Escribir "Regar planta del escritorio."
	
	Escribir "Reclamar almuerzo a futuro (broma)."
		
FinAlgoritmo
