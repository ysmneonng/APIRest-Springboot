# APIRest-Springboot - Bootcamp Santander Code FullStack Java 2023
API RESTful na nuvem usando SpringBoot Java para desafio da DIO

## Diagrama de Classes

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: List<Feature>
    - card: Card
    - news: List<News>
  }
  
  class Account {
    - accountNumber: String
    - accountAgency: String
    - accountBalance: Double
    - accountLimit: Double
  }
  
  class Feature {
    - icon: String
    - description: String
  }
  
  class Card {
    - cardNumber: String
    - cardLimit: Double
  }
  
  class News {
    - icon: String
    - description: String
  }

  User "1" *-- "1" Account: has
  User "1" *-- "1..N" Feature: has many
  User "1" *-- "1" Card: has
  User "1" *-- "1..N" News: has many
  ```
