Then run ANTLR the tool on it:
$ cd /tmp
$ antlr4 Hello.g4
$ javac Hello*.java
Now test it:
$ grun Hello r -tree
hello parrt
^D
(r hello parrt)

(That ^D means EOF on unix; it's ^Z in Windows.) The -tree option prints the parse tree in LISP notation.


It's nicer to look at parse trees visually.
$ grun Hello r -gui
hello parrt
^D
That pops up a dialog box showing that rule r matched keyword hello followed by identifier parrt.
