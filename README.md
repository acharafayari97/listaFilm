# 🎬 Lista Film

Questo progetto è una semplice applicazione Spring Boot creata per fare pratica con lo sviluppo backend in Java.  
L’obiettivo è gestire una lista di film, con operazioni di base come visualizzazione, aggiunta e gestione dei dati.

---

🚀 Tecnologie utilizzate

- Java 17
- Spring Boot (Web, Data JPA)
- Thymeleaf per le pagine HTML
- Flyway per la gestione delle migrazioni SQL
- H2 / Oracle DB come database
- Maven come strumento di build

---

📂 Struttura del progetto

- `entity/` → contiene la classe `Film`, che rappresenta l’entità principale del progetto  
- `repository/` → gestisce le operazioni CRUD con il database  
- `service/` → contiene la logica di business  
- `controller/` → gestisce le rotte web e le richieste HTTP  
- `resources/templates/` → contiene i file HTML  
- `resources/static/` → contiene i file CSS e altre risorse statiche  
- `db/migration/` → contiene gli script SQL di Flyway  
- `application.properties` → contiene la configurazione del database

---

⚙️ Come eseguire il progetto

1. Clona la repository:
   ```bash
   git clone https://github.com/<tuo-username>/ListaFilm.git
