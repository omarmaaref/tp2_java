# tp2_java

Question 3.2
Il y a une erreur de compilation car les types des données passées comme paramètres
ou le type de retour n’est pas conforme (type supérieur) aux types à la définition de
ces méthodes
On peut corriger cette erreur par caster.

Question 3.3
Le code se compile sans caster car le type passé comme paramètre est de niveau inferieur au
niveau à la définition ou car le type de retour est inferieur au type du variable qui stocke le
résultat
par exemple :
Long > int > short
double > float 

3.4:
Le résultat est différé car le type passé comme paramètre est
long et la méthode attend le type float donc qui est inferieur au
long donc il y aura une perte de données d’où un résultat
erroné.
de même pour le deuxième exemple la méthode attend le type
int et elle reçoit un nombre qui dépasse la limite du type int
(long) d’où perte de données
