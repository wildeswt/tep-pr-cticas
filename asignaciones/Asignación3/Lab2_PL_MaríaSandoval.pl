%Ejercicio 1
repite(0,_,[]).

repite(N,X,[X|Xs]):-N>0, N1 is N-1, repite(N1,X,Xs).

%Ejercicio 2
creciente(Y,Y,[Y]).

creciente(X,Y,[X|Xs]):- X=<Y, X1 is X+1, creciente(X1,Y,Xs).

%Ejercicio 3
estado(zulia, 4957765, 63100).
estado(miranda, 373945, 7950).
estado(carabobo, 2886093, 4650).
estado(aragua, 2228130, 7014).
estado(anzoategui, 2103856, 43300).
estado(bolivar, 2069064, 240528).
estado(falcon, 1137324, 24800).

vecino(zulia, falcon).
vecino(miranda, aragua).
vecino(miranda, anzoategui).
vecino(carabobo, aragua).
vecino(carabobo, falcon).
vecino(anzoategui, bolivar).

son_vecinos(X, Y) :- vecino(X, Y).
son_vecinos(X, Y) :- vecino(Y, X).

vive_en(luis, zulia).
vive_en(clara, zulia).
vive_en(rosa, zulia).
vive_en(ana, bolivar).
vive_en(jose, bolivar).
vive_en(maria, falcon).
vive_en(jorge, falcon).
vive_en(sonia, miranda).
vive_en(julieta, miranda).
vive_en(eduardo, miranda).

poblacion_estado(Estado, Poblacion) :- estado(Estado, Poblacion, _).

superficie_estado(Estado, Superficie) :- estado(Estado, _, Superficie).

estado_con_poblacion(Poblacion, Estado) :- estado(Estado, Poblacion, _).


estado_con_superficie(Superficie, Estado) :-estado(Estado, _, Superficie).

densidad(Estado, Densidad) :- estado(Estado, Poblacion, Superficie), Superficie > 0,Densidad is Poblacion / Superficie.

mayor_densidad(E1, E2) :- densidad(E1, D1),densidad(E2, D2), D1 > D2.

menor_densidad(E1, E2) :- densidad(E1, D1), densidad(E2, D2),D1 < D2.

igual_densidad(E1, E2) :-densidad(E1, D1),densidad(E2, D2), D1 =:= D2.

persona_vecina(P1, P2) :- vive_en(P1, E1),vive_en(P2, E2),P1 \= P2,son_vecinos(E1, E2).

puede_visitar(P1, P2) :- persona_vecina(P1, P2).

%Ejercicio 4
marca(honda, japonesa).
marca(hitachi, japonesa).
marca(pradesh, hindue).
marca(agra, hindue).
marca(mokuta, camerunesa).
marca(grundig, alemana).
marca(fokker, alemana).
marca(philco, desconocida).
asiatica(japonesa).
asiatica(hindue).

funciona_a_voltaje(Marca, 220) :- marca(Marca, japonesa).
funciona_a_voltaje(Marca, 220) :- marca(Marca, alemana).
funciona_a_voltaje(Marca, 110) :- marca(Marca, hindue).
funciona_a_voltaje(Marca, 110) :- marca(Marca, camerunesa).
funciona_a_voltaje(Marca, 380) :- marca(Marca, camerunesa).
funciona_a_voltaje(Marca, 380) :- marca(Marca, Nacionalidad),asiatica(Nacionalidad).
funciona_a_voltaje(philco, 220).
voltaje_pais(brasil, 220).
voltaje_pais(panama, 110).
voltaje_pais(turquia, 380).
voltaje_pais(iran, 380).

exportable_a(Marca, Pais) :- funciona_a_voltaje(Marca, Voltaje),voltaje_pais(Pais, Voltaje).

