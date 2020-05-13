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

