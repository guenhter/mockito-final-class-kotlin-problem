# Mocking problem

When running:

* `export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/`
* ./gradlew clean build --info

--> Build successful


But:

* `export JAVA_HOME=/usr/lib/jvm/jdk-10.0.1/`
* ./gradlew clean build --info

--> Build fails
