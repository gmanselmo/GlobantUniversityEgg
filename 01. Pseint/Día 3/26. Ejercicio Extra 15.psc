Algoritmo llegada
	
	Definir hh, mm, ss, t, totalSegs Como Reales
	
	hh = 13
	mm = 60
	ss = 60
	
	t = 3600
	
	Escribir "El ciclista salió a las ", hh,":",mm,":",ss,"."
	Escribir "Si el viaje dura ", t, " segundos."
	
	//Suma los segundos totales con los segundos de la distancia de viaje.
	totalSegs = ((hh * 3600) + (mm * 60) + ss) + t
	
	//Divide los segundos totales por la cantidad de segundos en una hora y quita los decimales.
	hh = trunc(totalSegs / 3600)
	
	//Con modulo obtiene el resto de tiempo que no llega a completar una hora y lo divide por la cantidad de minutos que hay en una hora.
	mm = trunc((totalSegs mod 3600) / 60)
	
	//Con modulo de 60segundos se obtienen los segundos restantes que no llegan a cumplir un minuto.
	ss = totalSegs mod 60
	
	
	Escribir "Llegará a destino a las ", hh,":",mm,":",ss,"."
	
FinAlgoritmo
