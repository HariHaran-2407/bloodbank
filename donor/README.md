
# Blood Bank Management System

A simple blood bank management system built with **Spring Boot** and **MySQL** to handle CRUD operations on donors and blood inventory.

## Features

- **Donor Management**: Create, view, update, and delete donor information.
- **Blood Inventory Management**: Manage blood types, quantities, and expiry dates.
- **REST API**: Exposes endpoints for interacting with donors and blood inventory.

## Technologies Used

- **Backend**: Spring Boot (Java)
- **Database**: MySQL (Aiven Cloud or local instance)
- **Build Tool**: Maven
- **Containerization**: Docker (optional)

## Setup Instructions

### Prerequisites

- Java 17+
- Maven
- MySQL database (Aiven or Local)

### Database Setup

Create two tables: `donor` and `blood_inventory`.

#### Donor Table
```sql
CREATE TABLE donor (
  donor_id BIGINT AUTO_INCREMENT PRIMARY KEY,
  donor_name VARCHAR(255),
  donor_contact VARCHAR(15),
  blood_type VARCHAR(5),
  donor_age INT
);
```

#### Blood Inventory Table
```sql
CREATE TABLE blood_inventory (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  blood_type VARCHAR(5),
  quantity INT,
  date_received DATE,
  expiry_date DATE
);
```

### Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/blood-bank-management.git
   cd blood-bank-management
   ```

2. Update the `application.properties` file with your database details:
   ```properties
   spring.datasource.url=jdbc:mysql://<HOST>:<PORT>/<DB_NAME>?ssl-mode=REQUIRED
   spring.datasource.username=<YOUR_DB_USERNAME>
   spring.datasource.password=<YOUR_DB_PASSWORD>
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Build and run the project:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints

### Donor API

- `POST /api/donors` – Create a new donor.
- `GET /api/donors` – Get all donors.
- `GET /api/donors/{id}` – Get a specific donor by ID.
- `PUT /api/donors/{id}` – Update a donor.
- `DELETE /api/donors/{id}` – Delete a donor.

### Blood Inventory API

- `POST /api/bloodinventory` – Add blood to inventory.
- `GET /api/bloodinventory` – Get all blood inventory records.
- `GET /api/bloodinventory/{id}` – Get a specific blood inventory record by ID.
- `PUT /api/bloodinventory/{id}` – Update a blood inventory record.
- `DELETE /api/bloodinventory/{id}` – Delete a blood inventory record.
