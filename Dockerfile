FROM openjdk:8-jdk-alpine
LABEL authors="alejandroarias"
COPY ./build /APP
WORKDIR /APP
SHELL ["/bin/bash", "-c"]
CMD ["apt", "install", "gradle"]
EXPOSE 8080
ENTRYPOINT ["gradle", "bootRun"]

