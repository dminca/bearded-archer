bearded-archer
==============
Clasa Produs defineste un produs cu atributele:
- serie (sir de caractere unic pt fiecare produs)
- pret (nr. real)

Exista 2 tipuri de produse:
Ciocolata
Bere

Ciocolata = ESTE UN produs cu nr. de calorii (nr intreg).
Bere = ESTE UN produs cu un procent de alcool (nr real).


Un Magazin poate contine maximum 100 de Produse si are comportamente pentru urm. operatii:
- adaugarea unui produs nou
- va adauga un produs Ciocolata sau Bere in magazin daca mai este loc in magazin sau va arunca o Exceptie in cazul in care nu mai este loc in magazin.

- stergerea unui produs cu seria data (eliminarea unui produs din magazin DACA acesta exista).
- afisarea tuturor produselor in consola
- afisarea doar a Ciocolatelor in consola
- salvarea in fisier a tuturor informatiilor din Magazin.

Aplicatia lucreaza cu o sg. instanta de Magazin si poate citi din consola urmatoarele comenzi pe care le executa asupra acestei instante:
1. ap - adauga produs
- b = bere
- c = ciocolata
- seria
- pret
- pa = procent alcool
- cal = calorii

Ex: 
ap b 12345 10 5.5
ap c 54321 5 100

2. afisare
3. afisarec
4. sp serie = sterge produs cu seria data
5. salvare fis
6. exit
