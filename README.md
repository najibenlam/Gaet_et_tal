Gruppe: Anwar, Najib, Kevin & Lucas

Hvad spillet går ud på.  
Spillet går ud på at man vælger et level, derefter bliver der genereret et tilfældigt tal som brugeren skal gætte.
Efter hvert gæt får brugeren at vide om gættet er for lavt eller for højt, og hvor mange forsøg man har tilbage.

Hvordan programmet køres.
Det køres i konsollen når man trykker run.


Hvordan I har opdelt programmet i metoder.  
I main er hele spillet samlet i en løkke, og så har vi delt det op så hver mekanisme har sin egen kode til metoden som er opdelt i parametre og argumenter


Hvorfor I har valgt denne opdeling.  
For at gøre hele koden overskueligt og lettere at forstå


Et eksempel på en metode med parameter.  
static int randomTal(int level)
hvor parameteren er int level som er den værdi metoden modtager
argumentet bliver det level som brugeren vælger



Et eksempel på en metode med returværdi.  
static int maxForsøg(int level)
her returnerer den antal forsøg i forhold til hvilket level man har valgt.
har man fks. valgt level 1, returnerer den -1 til variablen maxForsøg


Hvilken løkke I bruger i spillet, og hvorfor.  
en while-løkke, fordi vi ikke ved hvor mange gange brugeren vil spille spillet.


Mindst tre ting I har testet.  
om den tæller antal forsøg rigtigt
den kode som fungerer inde i main og uden for main
om den kan starte spillet igen når man er færdig og vil spille igen.


En fejl eller udfordring I stødte på, og hvordan I løste den.  
at generere et tilfældigt tal til hvert level, ved at bruge Math formlen. løste den ved at kigge tilbage til de opgaver vi lavede i starten af ugen, og fandt ud af fejlen


Hvad I har lært om metoder og programstruktur gennem opgaven.
opsætning er meget vigtigt i forhold til hvordan spillets struktur er opbygget, koderne skal være på de rette pladser, ellers kører spillet forkert.
