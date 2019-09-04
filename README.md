# Pokemon Rest API

## Use
* Gradle 5.4.1
* MySQL 8.0.17
* jdk 1.8.0_211
* Spring Boot
* Flyway DB

### Time zone
Set the MySQL time zone with:
```
SET GLOBAL time_zone = '-3:00';
```

### Data example
If tou want to test the API, you can insert the next
```
INSERT INTO trainers VALUES (1, 'Red', 40), (2, 'Ash Ketchum', 10);

INSERT INTO pokemon VALUES
  (1, 'Bulbasaur', 1), (2, 'Ivysaur', 2), (3, 'Venosaur', 3), (4, 'Charmander', 4),
  (5, 'Charmeleon', 5), (6, 'Charizard', 6), (7, 'Squirtle', 7), (8, 'Wartortle', 8),
  (9, 'Blastoise', 9);

INSERT INTO wild_pokemon VALUES
(1, 2000, 1, 1), (2, 2100, 4, 2), (7, 2000, 7, 1), (8, 600, 1, 2);
```