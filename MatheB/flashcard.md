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
\in I \) schreiben wir als \( m \times n \) Matrizen über K
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

---
Definition Untervektorraum

%

Sei \( (V,+,*)\) ein K-Vektorraum und \( (U \subseteq V) \). Wir nennen \( (U,+,*)\) einen K-Untervektorraum von V ( \( U \leq V\) ), falls

a) \( (U,+,0_v)\) Untergruppe von \( (V,+,0V)\) ist.

b) \( { \lambda * u | \lambda \in K \land u \in U } \subseteq U \) gilt.

c) Die vier Vektorraumrechenregeln in \( U\) gelten.

%

Mathe, Vektorraum

---
Untervektorraumkriterium

%

Sei \( V\) ein K-Vektorraum. Eine teilmenge \( U \subseteq V\) ist genau dann ein Untervektorraum von \( V\), wenn die beiden folgenden Eigenschaften gelten:

1) \[ U \neq \emptyset \]
2) \[ \forall v,w \in U , \lambda \in K: v + w \in U \land \lambda v \in U \]

%

Mathe, Vektorraum

---
Unnärer Schnitt über Menge von Untervektorräumen \( \mathcal{U} \)

%
Seien \( V \) ein K-Vektorraum und \( \mathcal{U} \) eine Menge von Untervektorräumen von \( V \).

So ist auch
\[ \bigcap_{U \in \mathcal{U}} U \]
ein Untervektorraum von \( V\).

%
Mathe, Vektorraum

---
Definition Lineare Hülle

%

Der Durchschnitt aller Untervektorräume von \( V\), die \( M\) enthalten, heißt die lineare Hülle von \( M \)

\[
\begin{aligned}
      \left < M \right > &:= \left < M \right >_K \\
      &:= \bigcap \{ U \mid U \leq V \land M \subseteq U\} \\
      &= \bigcap_{M \subseteq U \leq V} U
\end{aligned}
\]

%
Mathe, Vektorraum

---
Definition Linearkombination

%

Seien \( V \) ein K-Vektorraum und \( M \subseteq V \)

Seien \( n \in \mathbb{N} , x_1,...,x_n \in M , \lambda_1 ,...,\lambda_n \in K \) Dann heißt:
\[ \sum_{i=1}^n \lambda_i x_1 \]
eine Linearkombination von \( x_1,...,x_n \).

%

Mathe, Vektorraum

---
Definition triviale Linearkombination

%

Die Linearkombination \( \sum_{i=1}^n \lambda_i x_i \) heißt trivial, falls
\[ \lambda_1 = ... = \lambda_n = 0 \]
gilt.

%

Mathe, Vektorraum

---
Definition linearer Spann

%

\[
\begin{aligned}
    lin(M) &:= lin_k(M) \\
    &:= \{ v \in V \mid v \text{ist Linearkombination von Elementen aus M} \}
\end{aligned}
\]

%

Mathe, Vektorraum

---
Definition endliche Erzeugendensystem

%

Seien \( V \) ein K-Vektorraum, \( n \in \mathbb{N} \).
Ein Tupel \( (a_1,...,a_n) \) mit \( a_1,...,a_n \in V \) heißt Erzeugendensystem von V falls gilt:
\[ V = \{ \sum_{i=1}^n \lambda_i a_i \mid \lambda_1 ,..., \lambda_n \in K  \} \]

%

Mathe, Vektorraum

---
Definition Erzeugendensystem

%

Sei \( V \) ein K-Vektorraum und \( I \) eine Menge. Eine Familie \( (a_i)_{i\in I} \in V^I \) heißt Erzeugendensystem von \( V \), falls gilt:
\[ V = lin(\{ a_i \mid i \in I \}) \]

%

Mathe, Vektorraum

---
Definition Erzeugendensystem über \( K^(\mathbb{N}) \)

%

\[ d_n := (\delta_{in})_{i \in \mathbb{N} } = (0,...,0,1,0,...) \]

%

Mathe, Vektorraum
---
Definition Kroneckersymbol

%

\[
\delta _{ij} =
\begin{cases}
  1, & \text{ falls $i = j$}
  0, & \text{ falls $i \neq j$}
\end{cases}
\]

%

Mathe, Vektorraum

---
Definition Lineare (Un-)Abhängikeit (Teil 1)

%

Sei V ein k-Vektorraum. Ein Tupel \( (a_1,...,a_n) \) von Vektoren heißt linear unabhängig falls es ein \( i \in \{1,...,n \} \) gibt mit
\[ \left < a_1 ,..., a_n \right > = \left < a_1,..., a_{i-1},a_{i+1},...,a_n \right > \]

%

Mathe, Vektorraum

---
Unabhängigkeitscharakterisierung

%

Sei \( V \) ein K-Vektorraum und \( (a_1,...,a,n) \) ein Tupel von Vektoren aus \( V \). So ist \( (a_1,...,a_n) \) unabhängig, wenn
\[ \forall \lambda_1,...,\lambda_n \in K: \sum_{j=1}^n \lambda_j a_j = 0_V \Rightarrow \lambda_1 = ... = \lamda_n = 0_K \]

%

Mathe, Vektorraum

---
Abhängigkeitscharakterisierung

%

Sei \( V \) ein K-Vektorraum und \( (a_1,...,a,n) \) ein Tupel von Vektoren aus \( V \). So ist \( (a_1,...,a_n) \) abhängig, wenn
\[ \exists \lambda_1,...,\lambda_n \in K: \sum_{j=1}^n \lambda_j a_j = 0_V \land ( \exists i \in \{1,...,n \} : \lambda_j \neq 0_K).
\]

%

Mathe, Vektorraum

---
Definition Basis

%

Sei \( V \) ein K-Vektorraum. Eine Familie von Vektoren \( (a_i)_{i \in I} \) aus \( V \) heißt basisi von \( V \) falls:

1)
\( (a_i)_{i \in I} \) ein Erzeugendensystem von V ist

2)
\( (a_i)_{i \in I} \) linear unabhängig ist.

%

Mathe, Vektorraum

---
Charakterisierung endlicher Basen

%

Die drei folgenden Aussagen sind Äquivalent:

\[ (b_1,...,b_s) \text{ ist Basis von V} \]
\[ (b_1,...,b_s) \text{ ist ein minimales Erzeugendensystem von V} \]
\[ (b_1,...,b_n) \text{ ist ein maximales linear unabhängiges System} \]

%

Mathe, Vektorraum

---
Definition minimales Erzeugendensystem

%

\( (b_1,...,b_s) \) ist ein minimales Erzeugendensystem von V, wenn gilt :

1) \( (b_1,...,b_s) \) ist ein Erzeugendensystem

2) \( (b_j)_{j \in \{ 1,..,s \}\setminus \{ i \} } \) ist kein Erzeugendensystem.

%

Mathe, Vektorraum

---
Definition maximales linear unabhängiges System

%

\( (b_1,...,b_s) \) ist ein maximales unabhängiges System in V, wenn gilt :

1) \( (b_1,...,b_s) \) ist linear unabhängig

2) \( (b_1,...,b_s,b_{s+1}) \) ist linear unabhängig  für jedes \( b_{s+1} \in V \)

%

Mathe, Vektorraum

---
Austauschsatz von Steinitz

%

Seien \( V \) ein endlich erzeugter K-Vektorraum und \( (b_1,...,b_s) \) ein Erzeugendensystem von \( V \). Sei \( r \in \mathbb{N} \) und sei \( (a_1,...,a_r) \) ein linear unabhängiges System in \( V \). Dann gelen:

\[ 1. r \leq s \]
\[ 2. (a_1,...,a_r) \text{ kann durch } s-r \text{ Vektoren aus } \{b_1,...,b_s \} \text{ zu einem Erzeugendensystem von } V \text{ erweiter werden, genauer: Es gibt } i_1,...,i_{s-r} \in \{ 1,...,s\} \text{ derart, dass } \]
\[ (a_1,...,a_r,b_1,...,b_{i}_{s-r})\]
Ein Erzeugendensystem von V ist.

%

Mathe, Vektorraum

---
Definition Dimension

%

Seien \( V \) ein K-Vektorraum und \( (a_1,..,a_n) \) eine Basis von \( V \). Dann besteht jede Basis von \( V \) aus genaun n Vektoren und wir nennen:
\[ dim_K V := n\]
die Dimension von V

%

Mathe, Vektorraum

---
Basisergänzungssatz

%

Seien \( V \) ein endlich erzeugter K-Vektorraum, \(B \subseteq V\) ein (nicht notwendigerweise endliches) Erzeugendensystem von \(V\).
Dann lässt sich jedes linear unabhängige System \( (a_1,...,a_m) \) mit passenden Vektoren aus \(B\) zu einer
Basis von \(V\) ergänzen.

%

Mathe, Vektorraum

---
Definition Morphismen

%

Eine funktion \( f : V \rightarrow W \)heißt k_Vektorraum-Morphismus oder K-lineare Abbildung, falls gilt:
\[ \forall v,w \in V , \lambda \in K : f ( v+w) = f(v) + f(w) \land f(\lambda v) = \lambda f ( v) \]

%

Mathe, Lineare Abbildung

---
Kategorien von Morphismen

%

- Monomorphismus, wenn f injektiv ist
- Epimorphismus, wenn f surjektiv ist
- Isomorphismus, wenn f bijektiv ist
- Endomorphismus, wenn Ziel = Quelle ist
- Automorphismus, wenn Ziel = Quelle und f bijektiv ist

%

Mathe, Lineare Abbildung

---
Satz 3.1.7: Eigenschaften K-linearer Abbildungen I 

Sei \( f : V \rightarrow W \) eine K-lineare Abbildung zwischen den K-Vektorräumen V und W. Dann gelten:

% 

(a) \( f(0_V = 0_W) \) und \( f(-v) = -f(v) \) für alle \( v \in V \).

(b) \( f(V) \) ist ein Untervektorraum von \( W \).

(c) Ist \( f \) ein Isomorphismus, so ist auch \( f^{-1}: W \rightarrow V \) ein Isomorphismus.

%

Mathe, Kapitel 3.1

---

Satz 3.1.9: Eigenschaften K-linearer Abbildungen II 

Sei \( f: V \rightarrow W \) eine K-lineare Abbildung uwischen den K-Vektorräumen \( V \) und \( W \). Dann gelten:

%

(a) \( \forall U \subseteq V: U \leq V \Rightarrow  f(U) \leq f(V) \);

(b) \( \forall H \subseteq W: H \leq W \Rightarrow f^{-1}(H) \leq V \);

(c) \( \forall M \subseteq V: f(\langle M \rangle) = \langle f(M) \rangle \).

%

Mathe, Kapitel 3.1

---

Definiton und Lemma Kern

%

Sei \( f: V \rightarrow W \) eine K-lineare Abbildung zwischen den K-Vektorräumen V und W. Dann heißt das Urbild des Nullvektors in \( W \)

ker \(f  := f^{-1}(\lbrace 0_W \rbrace) = \lbrace v \in V  | f(v) = 0_W \rbrace \)

der Kern von \( f \). Diese Menge ist ein Untervektorraum von \( V \).

% 

Mathe, Kapitel 3.1

----

Satz 3.1.13: Injektivität und Kern

%

Sei \( f: V \rightarrow W \) eine K-lineare Abbildung zwischen dem K-Vektorräumen \( V \) und \( W \). Dann gilt

\( f injektiv \iff ker f = \lbrace 0_V \rbrace \).

%

Mathe, Kapitel 3.1

---

Satz 3.1.14: Erzeugendensysteme und Basen unter linearen Abbildungen

%

Sei \( f: V \rightarrow W \) eine K-lineare Abbildung zwischen dem K-Vektorräumen \( V \) und \( W\). Weiter seien

\(a_1, ... , a_n \in V \). Dann gelten:

(a) Ist \( f \) einm Monomorphismus (also injektiv) und \( (a_1, ... , a_n) \) linear unabhängig in \( V \), so ist \((f(a_1), ..., f(a_n))\) linear unabhängig in \( W \).

(b) Ist \( f \) ein Epimorphismus (also surjektiv) und \( (a_1, ... , a_n) \) ein Erzeugendensystem von \( V \), so ist \((f(a_1), ..., f(a_n))\) ein Erzeugendensystem in \( W \).

(c) Ist \( f \) ein Isomorphismus und \((a_1, ..., a_n)\) eine Basis von \( V \), so ist \((f(a_1), ..., f(a_n))\) eine Basis von \( W \).

% 

Mathe, Kapitel 3.1

---

Folgerung aus Satz 3.1.14

%

Für isomorphe K-Vektorräume \( V \) und \( W \) gilt: \( dim_K V = dim_K W \).

% 

Mathe, Kapitel 3.1

---

Satz 3.1.16: Isomorphie von \( K^n \)

%

Für alle \( n \in \mathbb{N} \) ist jeder \( n \)-dimensionale K-Vektorraum isomorph zu \( K^n \).

%

Mathe, Kapitel 3.1

---

Satz 3.1.18: Lineare Abbildungen und lineare Gleichungen

%

Sei \( f: V \rightarrow W \) eine lineare Abbildung zwischen den K-Vektorräumen \( V \) und \( W \). Dann gelten:

(a) Die sogenannte homogene Gleichung \( f(x) = 0_W \) hat als Lösungsmenge den Untervektorraum ker \( f \) und ist insbesondere nichtleer.

(b) Sei \( y \in W\). Hat \( f(x) = y \) eine (sogenannnte partikulare) Lösung \( x^* \), so ist die Lösungsmenge von \( f(x = y) \) gegeben durch: \( f^{-1}(\lbrace y \rbrace) = x^* + ker f := \lbrace x^* + x | x \in ker f \rbrace \)

%

Mathe, Kapitel 3.1

---
Definition Menge aller Homomorphismen

%

Die Menge aller linearen Abbildungen (also Homomorphismen) zwischen zwei K-Vektorräumen \( W\) und \( V \) bezeichnen wir mit \( Hom_K(W, V) \).

%

Mathe, Kapitel 3.2

---

Satz 3.2.2: Homomorphismen und Vektorräume

%

Für K-Vektorräume \( X, W, V \) gilt:

(a) Die Menge \( V^W = \lbrace f | f ist Abbildung von W nach V \rbrace \) ist ein K-Vektorraum bezüglich der punktweisen Addition und Multiplikation mit Skalaren.

(b) Die Menge \( Hom_K(W, V) \) ist ein Untervektorraum des K-Vektorraumes V^W und damit selbst ein K-Vektorraum bezüglich der punktweisen Addition und Multiplikation mit Skalaren.

(c) Für \( g \in Hom_k(X, W) \) und \( f \in Hom_K(W, V) \) ist die Abbildung \( f \circ g: X \rightarrow V \) ebenfalls K-linear, also \( f \circ g \in Hom_K(X, V) \).

(d) Die Kompositionsabbildung 

\( \circ : Hom_K(X, W)  \times Hom_K(W, V) \rightarrow Hom_K(X, V), (g, f) \mapsto f \circ g \) ist bilinear, das beduetet linear in beiden Argumenten. 

Ausformuliert heißt das: Für alle \( g, g' \in Hom_K(X, W)\), alle \( f, f' \in Hom_K(W, V) \) und alle \( \lambda \in K \) gelten: 

\( (f + f') \circ g = f \circ g + f' \circ g \), 	\( f \circ (g + g') = f \circ g + f \circ g' \),   \( (\lambda f) \circ g = \lambda (f \circ g) \) ,   \( f \circ ( \lambda g) = \lambda (f \circ g) \) 

%

Mathe, Kapitel 3.2

---

Definition und Lemma Endomorphismus

%

Für einen K-Vektorraum V schreiben wir 

\( End_K(V) := Hom_K(V, V) \).

Mit \( =: V \rightarrow V, v \mapsto 0_v \) ist \( (End_K(V), +, \circ, 0, id_V) \) ein Ring, der sogenannte Endomorphismenring von V. Die Einheitengruppe von \( (End_K(V), \circ, id_V) \) wird mit \( GL_K(V)\) bezeichnet. Diese Menge enthält genau die Automorphismen von \( V \) nach \( V \).

%

Mathe, Kapitel 3.2

---

Satz 3.2.7: Darstellung linearer Abbildungen mittels Basen

%

Es seien \( W \) ein K-Vektorraum, \( (b_1, ... , b_n) \) eine endliche Basis von \( W \) und \( V \) ein weiterer K-Vektorraum. Dann gibt es zu jedem (beliebigen) Sytsem \( a_1, ... , a_n \) von Vektoren in \(V \) genau eine lineare Abbildung \( f: W \rightarrow V \) mit

\( \forall i \in \lbrace 1,...,n \rbrace : f(b_i) = a_i \).

Für diese Funktion gilt dann automatisch

\( \forall \lambda_{1},...,\lambda_{n} \in K : f (\sum_{i = 1}^{n} \lambda_{i} b_i) \underset{f linear}_{=} \sum_{i = 1}^{n} \lambda_{i} f(b_i) = \sum_{i = 1}^{n} \lambda_{i} a_i\)

%

Mathe, Kapitel 3.2

---
 
