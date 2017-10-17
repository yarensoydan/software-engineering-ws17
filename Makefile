# minimal makefile for SE class
all: Main.class test

# main depends on all cpp files
Main.class: Main.java
	javac $^

test:
	java Main DollarToEuro 10000

clean:
	rm *.class

