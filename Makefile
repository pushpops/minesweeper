JCC = javac
OBJS = GameClear.java Opener.java GameOver.java Masu.java Ban.java MyTimer.java Menu.java GameFrame.java MS.java 
JAVA = java

compile:
	$(JCC) -Xlint:deprecation $(OBJS)

excute: 
	$(JAVA) MS
