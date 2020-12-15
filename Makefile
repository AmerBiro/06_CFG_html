ANTLRJAR = /usr/local/lib/antlr-4.8-complete.jar

###export CLASSPATH := .:$(ANTLRJAR):${CLASSPATH}
antlr4 = java -jar $(ANTLRJAR)
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = htmlListener.java htmlBaseListener.java htmlParser.java htmlBaseVisitor.java htmlVisitor.java htmlLexer.java

all:
	make main.class

main.class:	$(SRCFILES) $(GENERATED) html.g4
	javac  $(SRCFILES) $(GENERATED)

htmlListener.java:	html.g4
	$(antlr4) -visitor html.g4

test:	main.class
	java main input.html

grun:	main.class
	$(grun) html start -gui -tokens input.html
