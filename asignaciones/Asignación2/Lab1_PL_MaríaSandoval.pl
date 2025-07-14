/*1.Eliminar X de lista, incluso si se repite*/
/*-------------------------------------------*/
%Caso 1: cabeza de la lista
eliminar(X,[X|L],T):- eliminar(X,L,T).

%Caso 2: X no está en la cabeza
eliminar(X,[Y|Z],[Y|R]):- X \= Y,eliminar(X,Z,R).

%Caso 3: La lista esta vacia
eliminar(_,[],[]).

/*2.Concatenar dos listas*/
/*-----------------------*/
concatenar([], L, L).
concatenar([H|T], L2, [H|R]) :- concatenar(T, L2, R).

/*3.Contar num pos y num bneg en una lista*/
/*----------------------------------------*/
% Caso base: lista vacía
pos_neg([], 0, 0).

% Caso: número positivo y 0
pos_neg([X|Y], P, N) :- X >= 0, pos_neg(Y, P1, N),P is P1 + 1.

% Caso: número negativo
pos_neg([X|Y], P, N) :- X < 0,pos_neg(Y, P, N1),N is N1 + 1.

/*4.Verificar si Y es correspondiente a X sin corte*/
/*-------------------------------------------------*/
%Caso 1: X es menor que 5
nota(X,'reprobado'):- X<5.

% Caso 2: X es mayor o igual que 5 y menor que 7
nota(X,'aprobado'):- X>=5, X<7.

% Caso 3: X es mayor o igual que 7 pero menor que 9
nota(X,'bueno'):- X>=7, X<9.

% Caso 4: X es mayor o igual que 9
nota(X,'sobresaliente'):- X>=9.

/*4. Verificar si Y es correspondiente a X con corte*/
/*--------------------------------------------------*/
% Caso 1: X es menor que 5
nota_corte(X,'reprobado'):- X<5, !.

%Caso 2: X es mayor o igual que 5 pero menor que 7
nota_corte(X,'aprobado'):- X>=5, X<7, !.

%Caso 3: X es mayor o igual que 7 pero menor que 9
nota_corte(X,'bueno'):- X>=7, X<9, !.

%Caso 4: X es mayoe o igual que 9
nota_corte(X,'sobresaliente'):-X>=9,!.

/*5.Agencia Matrimonial*/
/*---------------------*/

%hombre/mujer(N,A,C,E)
%N:nombre
%A: altura (alta, media,baja)
%C: color de cabello (rubio, castaño, pelirrojo, negro)
%E: edad (joven, adulta, madura)

hombre(leonardo,alta,castaño,madura).
hombre(daniel,baja,negro,adulta).
hombre(mario,alta,rubio,joven).
hombre(sebastian,media,negro,joven).


mujer(abigail,baja,negro,joven).
mujer(robin,media,pelirrojo,adulta).
mujer(roselia,media,castaño,madura).
mujer(alexandra,media,pelirrojo,joven).

%gusta(N,M,L,S)
%N: nombre de persona a la que le gusta...
%M:genero musical (clasica, pop, jazz)
%L: genero literario (aventura, ciencia ficcion, policiaca)
%S: deporte que practica (tenis, natacion, futbol)

gusta(leonardo,jazz,policiaca,natacion).
gusta(alexandra,pop,policiaca,tenis).
gusta(daniel,jazz,ciencia_ficcion,futbol).
gusta(roselia,clasica,aventura,natacion).
gusta(mario,jazz,policiaca,futbol).
gusta(abigail,pop,ciencia_ficcion,tenis).
gusta(sebastian,pop,ciencia_ficcion,tenis).
gusta(robin,jazz,aventura,tenis).

%busca(N,A,C,E)
%N: persona con nombre N....
%A: altura
%C: color de cabello
%E: edad

busca(leonardo,alta,pelirrojo,madura).
busca(alexandra,alta,castaño,adulta).
busca(daniel,media,pelirrojo,joven).
busca(roselia,alta,rubio,madura).
busca(mario,alta,castaño,adulta).
busca(abigail,media,negro,joven).
busca(sebastian,baja,negro,joven).
busca(robin,alta,rubio,madura).

%Condicion 1: se convienen fisicamente
conviene_fisicamente(X,Y):-(hombre(X,A,C,E);mujer(X,A,C,E)),busca(Y,A,C,E).

%Condicion 2: mismos gustos
tiene_igual_gusto(X,Y):- gusta(X,M,L,S),gusta(Y,M,L,S).

%Convienen
conviene(X,Y):- conviene_fisicamente(X,Y),tiene_igual_gusto(X,Y).

%Buscar que parejas son adecuadas
pareja_adecuada(X,Y):-hombre(X,_,_,_),mujer(Y,_,_,_),conviene(X,Y),conviene(Y,X).







