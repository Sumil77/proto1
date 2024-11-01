# Maha-Dev: Women Safety Analytics Platform

**Maha-Dev** is a women’s safety platform developed for the **Smart India Hackathon 2024**. This project aims to enhance safety through real-time monitoring and analytics, allowing users to assess the safety of nearby areas and make informed choices.

## 🌟 Features

- **Email OTP-based Registration and Login**  
  Secure user registration and login using email OTP verification.
- **Heat Map and Danger Zones**  
  Interactive, color-coded maps displaying safety levels based on report frequency, powered by **OpenStreetMap**.
- **JWT Authentication**  
  Secure authentication with JSON Web Token (JWT) for a stateless and secure user session.

## 🛠️ Tech Stack

### Backend
- **Java**
- **Spring Boot**: REST API framework for handling backend processes
- **JWT (JSON Web Token)**: Secure token-based authentication

### Frontend
- **HTML**
- **CSS**
- **JavaScript**

### Map Integration
- **OpenStreetMap**: Real-time map functionalities for heatmaps and danger zones

## 🚀 Getting Started

Follow these instructions to set up and run the project locally.

### Prerequisites
- Java 21 or higher
- Maven
- PostgreSQL(used) or any DB of your choice

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/Maha-Dev.git
   cd Maha-Dev
2. **Backend Setup**
Navigate to the backend directory and build the project:
```bash
    mvn clean install
    mvn spring-boot:run
```
3. **Frontend Setup**
Open index.html in a browser to view the frontend.
🎯 **Usage**
•	Register with your email and log in using the OTP sent for identity verification.
•	View heatmaps and danger zones on the **OpenStreetMap** interface.
🔄 **Future Enhancements**
•	Real-time location sharing with family and authorities
•	Incident reporting and alerts
•	Advanced analytics for threat detection
•	Gesture-based emergency alert system
🤝 **Contribution**
This project is under active development, and contributions are welcome. Feel free to open an issue or submit a pull request.
📜 **License**
This project is licensed under the MIT License. See the **LICENSE** file for details.

