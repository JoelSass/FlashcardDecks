Definition lineare Abbildung

%

Eine Funktion \( f: V \rightarrow W \) heißt K-Vektorraum-Morphismus oder auch Klineare Abbildung, falls gilt: \( \forall v, w \in V, \lambda \in K: f(v + w) = f(v) + f(w) \land f(\lambda v) = \lambda f(v)\).

%

Mathe, Kapitel 3.1

---

Definition Morphismen 

%

Eine K-lineare Abbbildung \( f \) heißt 

- Monomorphismus, falls \( f \) injektiv ist;
- Epimorphismus, falls \( f \) surjektiv ist;
- Isomorphismus, falls \( f \) bijektiv ist;
- Endomorphismus, falls \( V = W \) gilt;
- Automorphismus, falls \( V = W \) gilt und \( f \) bijektiv ist.

%

Mathe, Kapitel 3.1

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

 

