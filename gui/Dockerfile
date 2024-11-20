# WF 2019-04-03
FROM openjdk:6-jdk
LABEL Description="Java GUI with OpenJDK 6"

COPY src /home/root/java/src
WORKDIR /home/root/java

RUN mkdir bin
RUN javac -d bin src/Gui.java

WORKDIR /home/root/java/
ENTRYPOINT ["java", "-cp","bin","Gui"]
