CP = /usr/share/java/javacsv.jar
CPT = /usr/share/java/junit4.jar

all: compile run test

compile:
	javac -cp $(CP) Transport.java TransportStatistics.java TransportAnalysis.java
	javac -cp .:$(CPT) TransportTest.java

run:
	java -cp .:$(CP) Transport

test:
	java -cp .:$(CPT):$(CP) TransportTest
	#junit TransportTest
