JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	miniJava/Compiler.java \
	tester/Checkpoint3.java \
	mJAM/Interpreter.java \
	mJAM/Disassembler.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) miniJava/*.class
	$(RM) miniJava/AbstractSyntaxTrees/*.class
	$(RM) miniJava/ContextualAnalyzer/*.class
	$(RM) miniJava/SyntacticAnalyzer/*.class
	$(RM) miniJava/CodeGenerator/*.class
	$(RM) tester/*.class
	$(RM) mJAM/*.class