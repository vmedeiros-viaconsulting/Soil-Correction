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
<br />
<hr width=100%>
<h3>(ii) Problemas identificados</h3><br />
Como pode-se observar acima, existem muitas linhas dentro das classes, além de algumas estruturas condicionais desnecessárias.
<br />

<hr width=100%>
<h3>(ii) Problemas identificados</h3><br />
A solução encontrada para sanar esse problema foi retirar alguns elses desnecessários, ajudando a reduzir o número de linhas também. Além da remoção de um comentário desnecessário na classe <b>SoilCorrection.java</b>.
<br />

<hr width=100%>
<h3>(iv) Implementação das soluções</h3><br />
Commit: #743efb47f315c3877189e36502922216cf6ecfb2<br />

<hr width=100%>
<h3>(v) Código após as alterações</h3><br />
<b>Classe SoilCorrection.java após modificações</b><br />
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