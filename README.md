# Simple project on Spring Native

## Quick start

You need to install the GraalVM `native-image` compiler, check [Documentation](https://www.graalvm.org/docs/getting-started/) for more details.

### Build executable jar
1. ./gradlew build 
2. cd ./build/libs
3. Start executable jar: java -jar spring-native-demo-0.0.1-SNAPSHOT.jar




### Build native image
1. ./gradlew nativeBuild 
2. cd ./build/native/nativeBuild
3. Start native application: ./spring-native-demo


Default port is: 8081 but you can override it using -Dserver.port=8989


#### Helpful links

Spting native [Documentation](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle)
