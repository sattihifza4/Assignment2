# 🔐 Android Login App (Java)

A simple and clean **Android Studio project** built in **Java** featuring user authentication and navigation between multiple activities using **Intents**.  
This project demonstrates basic Android development concepts like Activity lifecycle, Intent navigation, and form validation.

---

## 📱 Features

- 🧍‍♂️ **Login Activity** – Allows users to sign in using their credentials.  
- 📝 **Signup Activity** – Lets new users create an account.  
- 🔑 **Forgot Password Activity** – Helps users recover their password.  
- ♻️ **Reset Password Activity** – Enables users to reset their password.  
- 🎉 **Welcome Activity** – Displays a welcome message after successful login.  
- 🚀 **Intent Navigation** – Seamless transitions between activities using `Intent`.

---

## 🧰 Tech Stack

- **Language:** Java ☕  
- **IDE:** Android Studio  
- **Minimum SDK:** 21 (Android 5.0 Lollipop)  
- **UI:** XML Layouts  
- **Navigation:** Explicit & Implicit Intents  

---

## 📂 Project Structure

app/
├── java/
│ └── com.example.loginapp/
│ ├── LoginActivity.java
│ ├── SignupActivity.java
│ ├── ForgotPasswordActivity.java
│ ├── ResetPasswordActivity.java
│ └── WelcomeActivity.java
│
└── res/
├── layout/
│ ├── activity_login.xml
│ ├── activity_signup.xml
│ ├── activity_forgot_password.xml
│ ├── activity_reset_password.xml
│ └── activity_welcome.xml
└── values/
├── colors.xml
├── strings.xml
└── styles.xml


---

## ⚙️ How It Works

1. **LoginActivity**  
   - Users enter email and password.  
   - Valid credentials redirect to **WelcomeActivity** using an Intent.  
   - Invalid input shows error messages via `Toast`.

2. **SignupActivity**  
   - New users can register by entering required details.  
   - Data can be saved locally (e.g., SharedPreferences or SQLite).

3. **ForgotPasswordActivity**  
   - User enters registered email to receive reset link or move to ResetActivity.

4. **ResetPasswordActivity**  
   - Allows the user to set a new password.

5. **WelcomeActivity**  
   - Displays a personalized greeting message after login.


