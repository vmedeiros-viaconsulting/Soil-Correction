# Soil-Correction

Autor: Vinícius Medeiros da Silva <br />
Curso: Engenharia da Computação <br />
Universidade Tecnológica Federal do Paraná <br />

<h3>(i) Código Atual</h3><br />
<b>Classe SoilCorrection.java</b><br />
<pre>
➜ .\cloc-1.88.exe SoilCorrection.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.02 s (47.9 files/s, 9197.6 lines/s)</h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             39              1            152
-------------------------------------------------------------------------------

Número de estruturas condicionais: 16 (if e else)
Pontos a serem melhorados: Diminuir número de estruturas condicionais e reduzir quantidade de linhas, além da remoção de um comentário desnecessário.
</pre>

<b>Classe Soma.java</b><br />
<pre>
➜ .\cloc-1.88.exe Soma.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.02 s (55.7 files/s, 6012.3 lines/s)</h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             20              2             86
-------------------------------------------------------------------------------

Número de estruturas condicionais: 18 (if e else)
Pontos a serem melhorados: Diminuir número de estruturas condicionais e reduzir quantidade de linhas
</pre>

Como pode-se observar acima, existem muitas linhas dentro das classes, logo é necessário tentar reduzir um pouco o número delas.

<b>Classe SoilCorrection.java após modificações</b><br />
Para diminuir a quantidade de estruturas condicionais, fora retirado alguns else desnecessários reduzindo também o número de linhas. Além disso, foi removido o comentário.<br />
<pre>
➜ .\cloc-1.88.exe SoilCorrection.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.02 s (49.8 files/s, 9107.7 lines/s)</h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             39              0            144
-------------------------------------------------------------------------------
</pre>

<b>Classe Soma.java após modificações</b><br />
Para diminuir a quantidade de estruturas condicionais, fora retirado alguns else desnecessários reduzindo também o número de linhas.<br />

<pre>
➜ .\cloc-1.88.exe Soma.java
       1 text file.
       1 unique file.
       0 files ignored.

<h4>github.com/AlDanial/cloc v 1.88  T=0.02 s (57.6 files/s, 5471.4 lines/s)</h4>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             1             17              2             76
-------------------------------------------------------------------------------
</pre>