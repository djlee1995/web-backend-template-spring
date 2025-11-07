spring:
  application:
    name: __APP_NAME__

  datasource:
    driver-class-name: org.mariadb.jdbc.Driver
    url: jdbc:mariadb://__DB_HOST__:__DB_PORT__/__DB_NAME__?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
    username: __DB_USER__
    password: __DB_PASSWORD__

  jackson:
    time-zone: Asia/Seoul
    date-format: yyyy-MM-dd HH:mm:ss

server:
  port: __SERVER_PORT__
  servlet:
    context-path: /
  error:
    include-message: always

app:
  front-origins: http://__FRONT_URL__