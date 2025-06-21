# 🛍️ Full-Stack E-Commerce Web Application

This is a fully functional **eCommerce web application** built with a **React.js frontend** and a **Spring Boot backend**. It allows users to manage and browse products with features such as adding, updating, deleting, and searching for products across different categories, complete with image support.

---

## ⚙️ Tech Stack

### 🌐 Frontend
- **React.js** (Functional Components & Hooks)
- **Vite** (build tool)
- **CSS** (for custom styling)

### ☕ Backend
- **Spring Boot**
- **Spring Data JPA**
- **JPA Query Language** 
- **REST APIs**

---

## ✨ Features

- ➕ **Add Product**  
  Add new products with image upload and category assignment.

- 🔁 **Update Product**  
  Update existing product details and images.

- ❌ **Delete Product**  
  Delete products using their ID.

- 🔍 **Search Product**  
  Search products dynamically by name or keyword.

---

## 🧱 Project Structure

### 📁 Backend – `ecom-project`

```

ecom-project/
├── controller/ # REST APIs for product management
├── model/ # Entity classes
├── repo/ # Spring Data JPA Repositories
├── service/ # Business logic
├── resources/
│ ├── application.properties
│ ├── data1.sql # Sample DB data
└── EcomProjectApplication.java
```


### 📁 Frontend – `ecom-frontend`

```

ecom-frontend/
├── components/ # React components like Navbar, Product, AddProduct
├── assets/ # Static assets
├── context/ # Shared state (if used)
├── App.jsx # Main app component
└── axios.jsx # Axios instance configuration
```

---







## 🚀 Running the Application

### 🛠 Backend Setup (Spring Boot)
1. Open the backend project (`ecom-project`) in IntelliJ or Eclipse.
2. Configure the `application.properties` file with your MySQL database details.
3. Run the main class `EcomProjectApplication.java`.
4. Backend will run on: 
```bash
http://localhost:8080/
```


---

### 🌐 Frontend Setup (React)
1. Navigate to the frontend directory:
```bash
cd ecom-frontend
```

2. Install dependencies:
```bash
npm install
```

3. Start the development server:
```bash
npm run dev
```

4. Frontend will be available at:
```bash
http://localhost:5173/
```

---

## 🖼️ Screenshots

### 🏠 Home Page  
<img src="https://github.com/user-attachments/assets/5a519f15-952f-4eb2-800e-796d649f7239" width="600" alt="Home Page Screenshot" />

---

### ➕ Add Product  
<img src="https://github.com/user-attachments/assets/85997cc9-cfec-46c7-b7b9-b012dd49f9a6" width="600" alt="Add Product Screenshot" />

---

### 🔍 Search Product & Toggle Theme (Day/Night Mode)  
<img src="https://github.com/user-attachments/assets/9ce95e92-ce24-4125-a862-a29867bd69d8" width="600" alt="Search and Theme Toggle Screenshot" />

---

### 🔁 Update & ❌ Delete Product  
<img src="https://github.com/user-attachments/assets/7893385c-41e9-4080-b515-c04ef50c20e5" width="600" alt="Update and Delete Product Screenshot" />

---

### 🔁 Update Product (Edit View)  
<img src="https://github.com/user-attachments/assets/9d1ed080-7353-472a-b4b0-49c14797bbd2" width="600" alt="Update Product Screenshot" />











