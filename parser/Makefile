ANTLR = /usr/share/java/antlr4-runtime.jar

all: regenerate compile run

compile:
	javac -cp $(ANTLR) calculator4/*.java calculator4/gen/*.java
	# classpath nonsense workaround
	cp calculator4/gen/*.class calculator4

run:
	java -cp .:$(ANTLR) calculator4.Calculator4 test.script

regenerate:
	cd calculator4 && antlr4 -o gen Calculator4.antlr
