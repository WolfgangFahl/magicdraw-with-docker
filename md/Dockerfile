# see http://wiki.bitplan.com/index.php?title=MagicDraw_in_Docker
FROM ubuntu:12.04
MAINTAINER Wolfgang Fahl (https://www.bitplan.com)

LABEL Description="Java Magicdraw"

# make unzip available
# make vim available (to be able to edit configuration files with bash)
# make libraries for java available
# https://askubuntu.com/questions/674579/libawt-xawt-so-libxext-so-6-cannot-open-shared-object-file-no-such-file-or-di

RUN apt-get update&&apt-get install -y vim unzip libxrender1 libxtst6 libxi6

# Install Java.
# https://askubuntu.com/a/1026336/129227
ADD jdk-6u20-linux-x64.bin /usr/local/src
ADD installjava /usr/local/src

WORKDIR /usr/local/src
RUN ./installjava

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-6-oracle

# get the magicdraw sources
ADD MD_UML_169_no_install.zip /home/root/java/md/
#ADD MD_UML_168_no_install.zip /home/root/java/md/
#ADD MD_UML_168_unix.sh /home/root/java/md/

WORKDIR /home/root/java/md
#RUN chmod +x MD_UML_168_unix.sh
#RUN ./MD_UML_168_unix.sh
RUN unzip /home/root/java/md/MD_UML_169_no_install.zip
#RUN unzip /home/root/java/md/MD_UML_168_no_install.zip

ADD MagicDraw_16_9_Enterprise_Mobile_key.txt /home/root/java/md
#ADD MagicDraw_16_8_Enterprise_Mobile_key.txt /home/root/java/md
ADD MagicDraw_16_9_Enterprise_key.txt /home/root/java/md

ENTRYPOINT ["bin/mduml"]
#ENTRYPOINT ["tail", "-f", "/dev/null"]
