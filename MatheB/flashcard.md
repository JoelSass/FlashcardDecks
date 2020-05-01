Definition Verknüpfung

%

Eine Funktion \(* : M \times M \rightarrow M \). 

%

Mathe, Strukturen

---
Definition Assoziativität

%

\[ \forall a , b , c \in M : a * (b*c) = (a*b)*c \]

%

Mathe, Strukturen

---
Definition Kommutativität

%

\[ \forall a,b \in M: a*b = b*a \]

%

Mathe, Strukturen

---
Definition Gruppoid(Magma, Binar)

%

Sei \(M \) eine Menge und \( * : M \times M \) eine Verknüpfung so nennen wir
das Paar \(  (M,*) \) Gruppoid.

%

Mathe, Strukturen

---
Definition Halbgruppe

%

Sei \(M \) eine Menge und \( * : M \times M \) eine Verknüpfung, welche assoziativ ist, 
so nennen wir das Paar \( (M,*) \) Halbgruppe

%

Mathe, Strukturen

---
Definition Monoid

%

Sei \( (M,*) \) eine Halbgruppe und \( e \in M \). 

a) Wir nenne \( e \) neutrales Element(von M bzgl. *), wenn folgende Aussage
gilt: 
\[ \forall a \in M : e * a = a \lor a * e = a \].
b) Ist \( e \) ein neutrales Element, so nennen wir das Tripel \( (M,*,e) \)
Monoid.

% 

Mathe, Strukturen

---
Definition Potenzierung auf Monoiden

%

Sei \( (M,*,e)  \) ein Monoid. Für \( a \in M , n \in \mathbb{N}
\) definieren wir 
\[
      a^n = 
      \begin{cases}
            e, & \text{ falls $n = 0$}, \\
            a^{n-1} * a, & \text{ falls $n > 0$}.
      \end{cases}
\]

%

Mathe, Strukturen

---
Regeln für Potenzierung in Monoiden

%

Sei \( (M,*,e) \) ein Monoid.

a) Für \( a \in M \) und \( m,n \in \mathbb{N} \) gelten \( a^{m+n} = a^m *
a^n \) und \( a^{mn} = (a^m)^n \).

b) Ist das Monoid kommutativ, so gilt \[ \forall a,b \in M, n \in \mathbb{N}: (a*b)^n = a^n * b^n \]

%

Mathe, Strukturen

---
Definition invertierbar (Einheit)

%

Sei \( (M,*,e) \) ein Monoid.
\[ \exists v \in M u*v = e = v*u \]
Das Element \( v \) heißt inverses zu \( u \)

% 

Mathe, Strukturen

---
Definition Untergruppe

%

Sei \( (G,*,e) \) eine Gruppe und \( U \subseteq G \). Wir nennen \( (U,*,e)
\) eine Untergruppe von \( (G,*,e) \), falls die folgenden Eigenschaften
gelten:

1) Die verknüpfung \( * \) ist abgeschlossen auf \(U\), d.h. für alle \(u,v
\in U \) gilt \( u * v \in U \)

2) \( e \in U \)

3) die Mege \(U\) ist abgeschlosen bezüglich Inversenbildung.

%

Mathe, Strukturen

---
Untergruppenkriterium

%

\[ U \neq \emptyset \lor \forall a,b \in U: a * b^{-1} \in U \]

% 

Mathe, Strukturen

---
Definition Distributivität

%

Sei \( M \) eine Menge. Seien \( * \otimes \) Verknüpfungen auf \( M \).
Dann heißt \( * \) distributiv über \( \otimes \), falls:
\[ \forall a,b,c \in M : a*(b\otimes c) = (a*b) \otimes (a*c) \]
\[ \forall a,b,c \in M : (a\otimes b) * c) = (a*c) \otimes (b*c) \]

%

Mathe, Strukturen

---
Definition Gruppe

%

Ein Monoid \( (M,*,e) \) heißt Gruppe, falls alle Elemente aus M
invertierbar sind.

%

Mathe, Strukturen

---
Definition Abelsche Gruppe

%

Ist \( (M,*,e) \) eine Gruppe und ist zusätzlich \( * \) kommutativ, so
bezeichnen wir \( (M,*,e) \) Als abelsche Gruppe.

%

Mathe, Strukturen

---
Definition Ring

%

Seien \( R \) eine Menge, \( +: R \times R \rightarrow R, *:R \times R
\rightarrow R \) Verknüpfungen sowie $0 \in R$.

Das Tupel \( (R,+,*,0) \) heißt Ring, falls die folgenden Eigenschaften
gelten:

1) \( (R,+,0) \) ist eine abelsche Gruppe

2) \( (R,*) \) ist eine Halbgruppe

3) \( * \) ist distributiv über \( + \)

%

Mathe, Strukturen

---
Definition Polynom

%

Seien \( (R,+,*,0_R) \) ein kommutativer Ring und sein \( X \) eine
Unbekannte. Seien weiter \( n \in \mathbb{N}, a_0,...,a_n \in R \) und
definiere den formalen Ausdruck 
\[ p(X) := a_0 + a_1 X + ... + a_n X^n  \sum_{i=0}^{n} a_i X^i \]

a) Der Ausruck \( p \) heißt Polynom. Die Elemente \( a_0,...,a_n \) heißen
koefizienten von \( p(X) \) 

b) Die Menge aller Polynome über \( R \) bezeichnen wir mit \( R[X] \)

%

Mathe, Strukturen

---
Definition Addition auf \( R[X] \)

%

\[ + : R[X] \times R[X] \rightarrow R[X] ,\]
\[ \sum_{i=0}^n a_i X^i + \sum_{i=0}^m b_i X^i := \sum_{i=0}^{max\{m,n\}}
(a_i + b_i) X^i \]

%

Mathe, Strukturen

---
Definition Multiplikation auf \( R[X] \)

%

\[  * : R[X] \times R[X] \rightarrow R[X], \]
\[ (\sum_{i=0}^n a_i X^i) * (\sum_{i=0}^m b_i X^i) := \sum_{i=0}^{n}
\sum_{j=0}^{m} a_i b_j X^{i+j} = \sum_{k=0}^{n+m} ( \sum_{i=0}^{k} a_i
b_{k-i} )X^k \]

%

Mathe, Strukturen

---
Definition Körper

%

Ein kommutativer Ring mit Eins \( (K,+,*,0,1) \) heißt Körper, falls \( (K \setminus {0} , * , 1) \) eine Gruppe ist.

%

Mathe, Strukturen

---
Definition \( \mathbb{C} \)

%

Wir nennen \( (\mathbb{R^2} , \oplus , \otimes , (0,0),(1,0)) := \mathbb{C}
\) mit :
\[ \oplus : \mathbb{R^2} \times \mathbb{R^2} \rightarrow \mathbb{R^2}, (a,b)
\oplus (c,d) := (a+c,b+d) \].
\[ \otimes : \mathbb{R^2} \times \mathbb{R^2} \rightarrow \mathbb{R^2} ,
(a,b) \otimes (c,d) := (ac -bd, ad+bc) \]

%

Mathe, Strukturen

---
Sieben Essentielle Rechenregeln in \( \mathbb{C} \)

%

\[
\begin{aligned}
      & \overline{z+w} = \overline{z} + \overline{w} \\
      & \overline{z*w} = \overline{z} * \overline{w} \\
      & \overline{\overline{z}} = z \\
      & z \neq 0 \Rightarrow \frac{1}{z} = \frac{\overline{z}}{|z|^2} \\
      & z + \overline{z} = 2 Re(z) \leq 2 |z| \\
      & | z * w | = |z| * |w| \\
      & | z+w | \leq |z| + |w|
\end{aligned}
\]

%

Mathe, Strukturen

---
Definition K-Vektorraum

%

Sei \( (K,+,*,0_k,1_k) \) ein Körper. Sei \( (V, \oplus , 0_V) \) eine
Abelsche Gruppe und es gebe eine sogenannte Skalarmultiplikation:
\[ \otimes : K \times V \rightarrow V, (\lambda , v) \mapsto \lambda \otimes v \]
mit 
\[
\begin{aligned}
      \forall \lambda , \mu \in K , v \in V &: (\lambda + \mu ) \otimes v =
      (\lambda \otimes v) \oplus ( \mu \otimes v) \\
      \forall \lambda \in K , v,w \in V &: (\lambda ) \otimes (v+w) =
      (\lambda \otimes v) \oplus ( \lambda \otimes w) \\
      \forall \lambda , \mu  \in K , v \in V &: (\lambda * \mu) \otimes  v =
      \lambda \otimes ( \mu \otimes v) \\
      \forall v \in V &: 1_K \otimes v = v
\end{aligned}
\]
Dann bezeichen wie \( (V, \oplus , \otimes) \) als K-Vektorraum.

%

Mathe, Vektorraum

---
Definition Matrizen (Vektorraum)

%

Seien \( (K,+,*,0_k,1_k) \) ein Körper, \( m,n \in \mathbb{N_{\geq 1}}  \)
und \[ I = {1,...,m} \times {1,...,n} = {(i,j)|1\leq i \leq m , 1 \leq j
\leq n } \]
Einen Vektor \( A \in K^I  \) mit \( A(i,j) = a_{ij} \) für alle \( (i,j)
\in I \) schreiben wir als 
\( m \times n ) Matrizen über K 
\[
(a_{ij})_{1 \leq i \ leq m , 1 \leq j \leq n} = 
\begin{bmatrix}
      a_{11} & a_{12} & ... & a_{1n}\\
      a_{21} & a_{22} & ... & a_{2n}\\
      \vdots & \vdots & \ddots & \vdots \\
      a_{m1} & a_{m2} & ... & a_{mn}\\
\end{bmatrix}	
\]
Wir schreiben auch \( \mathcal{M}_{m,n}(K) := K^I \)

%

Mathe, Vektorraum


