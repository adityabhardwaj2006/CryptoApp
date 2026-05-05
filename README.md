# 🚀 CryptoApp

A modern Android Cryptocurrency application built using **Kotlin** and **Jetpack Compose** that displays real-time cryptocurrency information using the **CoinPaprika API**.

This project demonstrates modern Android development practices including **Clean Architecture**, **MVVM**, **Hilt**, **Retrofit**, **Coroutines**, and **Jetpack Compose**.

---

# 🚀 About This Project

This project is built to demonstrate my understanding of:

- Modern Android Development
- Clean Architecture + MVVM
- API Integration using Retrofit
- State Management with Coroutines & Flow
- Dependency Injection using Hilt
- Building responsive UIs using Jetpack Compose
- Scalable and maintainable Android app structure

---

# ✨ Features

- 📈 Live cryptocurrency listing
- 📄 Detailed coin information
- 🟢 Active / Inactive status
- 🏷️ Coin tags support
- 👨‍💻 Team member information
- ⚡ Fast & responsive UI
- 🌑 Modern dark theme
- 🔄 Real-time API integration
- 📱 Fully native Android app

---

# 🏗️ Architecture

- Clean Architecture + MVVM
- Separation of Data, Domain, and Presentation layers
- Repository Pattern
- Dependency Injection using Hilt
- Scalable and maintainable code structure

---

# 🛠️ Tech Stack

### Language
- Kotlin

### UI
- Jetpack Compose
- Material 3

### Architecture
- MVVM + Clean Architecture

### Dependency Injection
- Hilt

### Networking
- Retrofit
- Gson Converter

### Async Programming
- Kotlin Coroutines
- Kotlin Flow

### Navigation
- Navigation Compose

### API
- CoinPaprika API

---

# 📱 Data Flow

### Coin Data
API → Retrofit → Repository → UseCases → ViewModel → UI

### Coin Details
Coin ID → API Request → DTO Mapping → Domain Model → UI

### UI State
Loading / Success / Error states handled using sealed Resource class

---

# 📂 Project Structure

```text
presentation/
│
├── Coin_List/
├── Coin_Details/
├── Components/
│
domain/
│
├── models/
├── repository/
├── use_cases/
│
data/
│
├── remote/
├── dto/
├── repository/
│
common/
│
├── constants/
├── resource/
```

---

# 🌐 API Endpoints

### Get All Coins
```http
GET /v1/coins
```

### Get Coin Details
```http
GET /v1/coins/{coinId}
```

Base URL:

```text
https://api.coinpaprika.com/
```

---

# ⚙️ Installation

## Clone Repository

```bash
git clone https://github.com/adityabhardwaj2006/CryptoApp.git
```

## Open in Android Studio

- Open Android Studio
- Open the cloned project
- Sync Gradle

## Run App

Connect emulator/device and press ▶ Run

---

# 📸 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/962709b7-d1e6-4a63-becd-83b7bb6bbb56" width="250"/>
  <img src="https://github.com/user-attachments/assets/82326d7b-ecb1-4f07-92e0-7a164e3be26c" width="250"/>
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/4fa837b5-d564-4472-b443-5559c9a8b281" width="850"/>
</p>

---

# 🔥 Concepts Used

- Clean Architecture
- MVVM
- Coroutines & Flow
- State Management
- API Handling
- Navigation
- Reusable Components
- Error Handling
- Loading States

---

# 🎯 Future Improvements

- 🔍 Search functionality
- ⭐ Favorite coins
- 📊 Crypto charts
- 🔔 Price alerts
- 💼 Portfolio tracker
- 🌍 Multi-language support

---

# 👨‍💻 Developer

### Aditya Bhardwaj

- GitHub: [@adityabhardwaj2006](https://github.com/adityabhardwaj2006)

---

# ⭐ Support

If you like this project, give it a ⭐ on GitHub.
