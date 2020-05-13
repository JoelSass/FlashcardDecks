
Definition Menge

%

Unter einer Menge verstehen wir jede Zusammenfassung \( M \) von bestimmtwn
wohlunterschiedenen Objekten \( m \) userer Anschauung oder unseres Denkens
zu einem Ganzen.

%

Mathe, Mengentheorie

---
Definition explizite Darstellung

%

Die expliziete darstellung einer Menge ist dadurch gegeben, dass man ihre
Elemente durch kommata getrennt in Form einer Liste aufschreibt und diese in
geschwiften Mengenklammern einklammert.

%

Mathe, Mengentheorie

---
Definition Aussage

%

Eine Aussage ist ein sprachliches Gebilde, von dem es sinnvoll ist, zu sagen, es sei wahr oder falsch.

%

Mathe, Mengentheorie

---
Definition deskriptive Mengenbeschreibung

%

Es sei \( A(x) \) eine Aussage, in der die Variable \(x\) vorkommen kann und für jedes Objekt \(a\) sei \( A(a) \) die Aussage, die aus \(A(x) \) entsteht, indem \(x\) durch \( a\) ersetzt wird. Dann bezeichnet \( \{ \mid A(x) \} \) die Menge, welche genau die Objekte \( a \) enthält für die die Aussage \( A(a) \) Wahr ist.

%

Mathe, deskriptive Mengenbeschreibung

---
Definition Enthaltenseisrelation

%

Es seien \( M \) eine Menge und a ein Objekt. Wir schreiben
\( a \in M \), falls \( a \) zu \( M \) gehört also ein Element ist
\(  \)
%

Mathe, Kapitel 1

---
Definition Zahlenmengen \( \mathbb{N}\mathbb{Z}\mathbb{Q}\mathbb{R} \)

%

\mathbb{N} bezeichnet die Menge der natürlichen Zahlen, also \( \{ 0,1,2,... \} \). 

\mathbb{Z} bezeichnet die Menge der ganzen Zahlen, also die Menge \(
\{0,1,-1,2,-2,... \} \) bestehend aus den natürlichen Zahlen und ihren
negationen.

\mathbb{Q} bezeichnet die Menge der rationalen Zahlen, also, in deskriptiver
Darstellung, die Menge \( \{ x \mid \text{Es gibt $y,z$ mit $y,z \in \mathbb{Z} , z \neq 0 \land x = \frac{y}{z}$ }  \} \)

\mathbb{R} bezeichnet die Menge der reelen Zahlen.

%

Mathe, Kapitel 1.

---
1.1.10 Definition: Inklusion, echte Inklusion, Gleichheit

%

Es seien \( M,N \)  zwei Mengen. Dann gilt:

- \( M \subseteq N \) wenn für alle Objekte \( a \) aus \( a \in M \) folgt
    \( a \in N \) 
- \( M = N \) genau dann, wenn \( M  \subseteq \land N \subseteq M \)
    gelten.
- \( M \neq N \) genau dann, wenn \( M=N \) nicht gilt 

- \( M \subset N \) genau dann, wenn \(M \subseteq N \land M \neq N \)
    gelten.

%

Mathe, Kapitel 1.

---
1.1.11 Satz: Reflexivität, Antisymmetrie, Transitivität

%

Für alle Mengen \( M,N,P \) gelten die folgenden Aussagen:
- \( M \subseteq M \)

- \( M \subseteq N \land N \subseteq M \Rightarrow M = N \)

- \( M \subseteq N \land N \subseteq P \Rightarrow M \subseteq P \)

%

Mathe, Kapitel 1

---
1.1.12 Definition leere Menge

%

Mit \( \emptyset \) wird die leere Menge bezeichnet. Sie enthält keine
Elemente also gilt per definition die Aussage \( a \notin \emptyset \) für
alle \( a \).

%

Mathe, Kapitel 1.

---
1.2.1 Definition: binäre Vereinigung, binärer Durchschnitt, Differenz

%

Es seien \( M,N \) Mengen, Dann definieren wir die folgenden Mengen:

- \( M \cup N := \{ x \mid x \in M \lor x \in N \} \)
- \( M \cap N := \{ x \mid x \in M \land x \in N \} \)
- \( M \setminus N := \{ x \mid x \in M \land x \notin N \} \)

%

Mathe, Kapitel 1

---
1.2.3 Satz Inklusion, Vereinigung, Durchschnitt

%

Für alle Mengen \( M, N \) sind die drei Aussagen äquivalent:
- \( M \subseteq N \)
- \( M \cap N = M \)
- \( M \cup N = N \)

%

Mathe, Kapitel 1

---
1.2.4 Satz: Kommutativität, Assoziativität, Distributivität

%

Für alle Mengen \( M,N,P \) gelten die folgenden Aussagen
- \( M \cup N = N \cup M \)
- \( M \cup (N \cup P) = ( M \cup N ) \cup P \)
- \( M \cup (N  \cap P) = (M \cup N) \cap ( M \cup P) \)
- \(  M \cap N \subseteq M \subseteq M \cup N \)
- \( M \subseteq N \) impliziert \( M \cup P \subseteq N \cup P \)

%

Mathe, Kapitel 1

---
1.2.5 Definition: beliebige Vereinigun und beliebiger Schnitt:

%

Es sei \( \mathfrac{M} \) eine Menge von Mengen. Wir definieren:
- \( \bigcup \mathfrac{M} := \{ x \mid \exists X \in \mathfrac{M}: x \in X \} \)
- \( \bigcap \mathfrac{M} := \{ x \mid \forall X \in \mathfrac{M}: x \in X \} \)

%

Mathe, Kapitel 1

---
1.2.6 Satz: Einschließungseigenschaften

%

Es sei \( \mathfrac{M} \neq \emptyset \) eine Menge von Mengen.Dann gilt für
alle \( M \in \mathfrac{M} \) die einschließungseigenschaft \( \bigcap
\mathfrac{M} \subseteq M \subseteq \bigcup \mathfrac{M} \).

%

Mathe, Kapitel 1

---
1.2.7 Satz: rekursives Vereinigen und Schneiden

%

Es sei \( \mathfrac{M} \neq \emptyset \) eine Menge von Mengen. Dann gelten
für alle \( M \in \mathfrac{M} \) die folgenden Gleichngen:
- \( \bigcup \mathfrac{M} = M \cup \bigcup (\mathfrac{M} \setminus \{M\} ) \)
- \( \bigcap \mathfrac{M} = M \cap \bigcap (\mathfrac{M} \setminus \{M\} ) \)

%

Mathe, Kapitel 1

---
1.2.8 Definition: indizierte Vereinigung und indizierter Durchschnitt

%

- \( \bigcup_{i=1}^n M_i := \bigcup \{ M_1,..,M_n \} \)
- \( \bigcap_{i=1}^n M_i := \bigcap \{ M_1,..,M_n \} \)

%

Mathe, Kapitel 1

---
1.2.9 Satz: Eigenschaften der Mengendifferenz:

%

Für alle Mengen \( M,N,P \) gelten die folgenden Aussagen

- \( M \setminus (N \cup P) = (M \setminus N ) \cap (M \setminus P) \)
- \( M \setminus (N \cap P) = (M \setminus N ) \cup (M \setminus P) \)
- \( M \setminus (M \setminus N) = M \cap N \)

%

Mathe, Kapitel 1

---
1.2.10 Satz: Eigenschaften des Komplements

%

Es sei \( M \) eine fest gewählt Menge

- \( \overline{N \cup P} = \overline{N} \cap \overline{P} \)
- \( \overline{N \cap P} = \overline{N} \cup \overline{P} \)
- \( \overline{\overline{N}} = N \)

%

Mathe, Kapitel 1

---

1.3.1 Definition: Potenzmenge

%

Zu einer Menge \( M \) definieren wir:
\[ \mathcal{P}(M) := \{ X \mid X \subseteq M \} \]
als Potenzmenge von \( M \)

%

Mathe, Kapitel 1

---
1.3.3 Satz: Konstruktion der Potenzmenge

%

Es seien \( M \) eine Menge und \( a \) ein Objekt mit \( a \notin M \) Dann
sind die folgenden Aussagen äquivalent:

- \( X \in \mathcal{P}(M \cup \{ a \}) \)
- \( X \in \mathcal{P}(M) \lor \exists Y: Y \in \mathcal{P}(M): X = Y \cup
    \{a \} \)

%

Mathe, Kapitel 1

---
1.3.5 Definition: Endlichkeit einer Menge

%

Eine Menge \( M \) heißt endlich, falls \( M = \emptyset \) gilt, oder es
ein \( n \in \mathbb{N}_{\geq 1} \) git und Objekte \( a_1,...,a_n \) so
existieren, dass \( M = \{ a_1,...,a_n \} \) zutrifft.

%

Mathe, kapitel 1

---
1.3.6 Definition: Kardinalität

%

Für eine endliche Menge \( M \) bezeichnet \( |M| \) ihre kardinalität.
Es gilt:

- \( |M| = 0, \text{ falls } M = \emptyset \)
- \( |M| = n, \text{ falls $M$ die explizite Darstellung } M = \{ a_1,...a_n \} \text{ mit $ n \geq 1$ Objekten $a_1$ bis $a_n$ besitzt.} \)

%

Mathe, Kapitel 1

---
Satz: Kardinalitätsformel

%

Für alle endlichen Mengen \( M,N \) gilt die folgende kardinalitätsformel:
\[ |M \cup N | = |M| + |N| - |M \cap N| \]

%

Mathe, Kapitel 1

---
1.3.9 Satz: Kardinalität der Potenzmenge

%

Für alle endlichen Mengen \( M \) gilt die Gleichung \( | \mathcal{P}(M)  =
2^{|M|} \)

%

Mathe, Kapitel 1

---
1.4.1 Definition: Paar, binäres direktes Produkt

%

Es seien \( M,N \) beliebige Mengen

- Zu Objekten \(a,b \) heißt die Konstruktion \( (a,b) \) ein Paar mit
    erster komponente \(a \) und zweiter Komponente \( b \)
- Die Menge aller Paare \( (a,b) \) mit \( a \in M, b\in N \) heißt das
    direkte Produkt oder kartesisches Podukt der Mengen es ist definiert als
    \( M \times N := \{ (a,b) \mid a \in M \land b \in N \} \)

%

Mathe, Kapitel 1

---
1.4.3 Satz: Kardinalität von direkten Produkten

%

Für alle endlichen Mengen \( M,N \) gil die gleichung \( |M \times N| = |M|* |N| \)

%

Mathe, Kapitel 1

---
1.4.4 Definition: Relation

%

Sind \(M,N \) Mengen, so heißt eine Teilmenge \( R \) von \( M \times N\)
eine Relation von \( M \) nach \( N \). Es ist \( M \) die Quelle von \( R \) und \( N \) das Ziel.

%

Mathe, Kapitel 1

---
1.4.7 Definition: eindeutige und totale Relation

%

Es sei \( R \subseteq M \times N \) eine Relation.

- \( R \) heißt eindeutig falls \( \forall x \in M \land y,z \in N: x R y
    \land y R z \Rightarrow y = z \)
- \( R \) heißt total, falls \( \forall x \in M \exists y \in N : x R y \)

%

Mathe, Kapitel 1

---
1.4.8 Definition: Funktion

%

Eine eindeutige und totale Relation \( R \subseteq M \times N \) heißt
eine Funktion vom \( M \) und \( N \). Das zu \( x \in M \) eindeutig
existierende Objekt \( y \in N \) mit \( x R y \) wird als \( R(x) \)
bezeichnet und heißt das Bild von \( x \) unter \( R \).

%

Mathe, Kapitel 1

---
1.4.10 Definition: Gleichheit von Paaren

%

Für alle Paare \( (a,b),(c,d) \) definieren wir die Gleichheit \((a,b)=(c,d) \) genau dann als gültig, wenn \( a=c \land b = d \) gelten.

%

Mathe, Kapitel 1

---
1.4.11 Satz: Gleichheit von Funktionen

%

Für alle Funktionen \( f,g ; M \rightarrow N  \) gilt \( f=g  \) genau dann,
wenn \( f(x) = g(x)  \) für alle \( x \in M \) gilt.

%

Mathe, Kapitel 1

---
