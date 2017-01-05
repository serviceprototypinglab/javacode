all: compile run

compile: Test.jar RandomDistortion.jar LowerCase.jar
	javac ImageProcessingApplication.java

%.jar: %.java
	javac $<
	zip -r $@ $(subst .java,.class,$<)
	#rm -f $(subst .java,.class,$<)
	# FIXME: classloading would not work...

run:
	java ImageProcessingApplication

clean:
	-rm -f `cat .gitignore`
