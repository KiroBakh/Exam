FROM openjdk:11

RUN mkdir /app

COPY src/ /app

WORKDIR /app

CMD java QuizApplication.java

