---
#e285047d705d4251a421cc044bc9b2bb
#alternatives --install /usr/bin/java java /opt/jdk1.8.0_192/bin/java
#alternatives --install /usr/bin/jar jar /opt/jdk1.8.0_192/bin/jar 2
#alternatives --install /usr/bin/javac javac /opt/jdk1.8.0_192/bin/javac


 - name: java
   shell: "wget --no-cookies --no-check-certificate --header 'Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie' 'https://download.oracle.com/otn-pub/java/jdk/8u192-b12/750e1c8617c5452694857ad95c3ee230/jdk-8u192-linux-x64.tar.gz'"
   args:
    chdir: /opt/

 - name: untar
   shell: tar xzf jdk-8u192-linux-x64.tar.gz
   args:
    chdir: /opt/

 
