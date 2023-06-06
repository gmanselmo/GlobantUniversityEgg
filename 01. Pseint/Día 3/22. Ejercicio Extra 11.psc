Algoritmo calificacion_final
	
	Definir p1, p2, p3, promedioParciales, final, tpf, calificacion Como Real;
	
	p1 = 7;
	p2 = 9;
	p3 = 8;
	final = 5;
	tpf = 7;
	
	promedioParciales = (p1 + p2 + p3) / 3;
	
	calificacion = (promedioParciales * 0.55) + (final * 0.3) + (tpf * 0.15);
	
	Escribir calificacion;
	
FinAlgoritmo
