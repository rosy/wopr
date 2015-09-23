# WOPR

## Installation Requirements

* Java 1.6
* Maven 3.0.4+
* Git 2.0.4+
* JBOSS 6.2 (or an application/web server that handles war files)
* Eclipse
* Skype/Google Chat for screenshare/call

## Helpful installation instructions:

  1. install Java JDK 6+
  2. install Eclipse IDE for Java EE Developers
    * Change environment to Unix-style (LF instead of CRLF)
    * Preferred Eclipse settings:
      * Preferences -> Java -> Compiler: level: 1.6
      * Preferences -> Workspace:
        * Text file encoding: UTF-8
        * New text file line delimiter: Unix
  3. install Maven
    * https://maven.apache.org/download.cgi
  4. install Git
    * if on windows try the official windows port:
      * http://git-scm.com/download/win
      *(this will give you the most powerful interface, a CLI with access to all git functions)
      * don't worry git-gui and a git bash are included.
    * Windows install help:
      * Use Git from Git Bash only
      * Checkout as-is, commit Unix-style line endings.
  5. install jboss standalone:
    * download jboss-eap-6.2.0.zip http://www.jboss.org/products/eap/download/
    * unzip into any directory you have read/write access to ex: /home/[username]/apps/jboss

## checkout project

  *	create directory for projects (ex: /home/[username]/dev or /Users/[username]/dev on windows)

    git clone https://github.com/rosy/wopr.git

## project mvn/eclipse setup:

  * goto project directory (wopr)

    mvn clean eclipse:eclipse

  * eclipse import:
    * Import -> General : Existing Projects into Workspace
    * (pick previous directory)

## build/run:

  * goto project directory (wopr)

    mvn clean install
    cd target
    java -jar WOPR-???.jar

## run in a webapp:

  * simply run bin/standalone.sh from jboss installation directory
    * (if on windows machine will work from git-bash)
  * in a browser goto: http://localhost:8080/WOPR/hello.htm

