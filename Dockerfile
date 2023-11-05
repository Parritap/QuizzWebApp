FROM paketobuildpacks/spring-boot
LABEL authors="alejandroarias"
COPY . /APP
WORKDIR /APP

RUN gradle build --no-daemon
CMD java -jar build/libs/*.jar
