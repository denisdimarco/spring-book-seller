# Spring Boot Book Seller

Full-Stack Book Sales Web Application with Spring, API Rest, Angular 12, Spring-Security, Bootstrap,  PostgreSQL, Hibernate, Heroku Cloud.


You can visit and test the live website here: https://ddm-book-seller-ui.herokuapp.com/register

Usage: 
1. Register a new user
 
 <img src="https://user-images.githubusercontent.com/87948501/149993270-3b5f4261-d44e-4976-937a-1379761d9ae1.png" width="50%">
 
2. Log-in with your username and password
![image](https://user-images.githubusercontent.com/87948501/149993367-ddb0e9ee-2769-4615-b433-27ffe94d7923.png)
 


3. You also can login with `username: admin` and `password: admin` to acces the administrator page. Here you can create, edit and delete books:
 ![image](https://user-images.githubusercontent.com/87948501/149994215-2fe9b4a2-5cac-469e-9e3f-b82569d03dc9.png)

![image](https://user-images.githubusercontent.com/87948501/149994607-0d2caa99-5cd5-4d73-ba6a-f540143d6b58.png)


![image](https://user-images.githubusercontent.com/87948501/149994658-bfa68da8-c11b-488c-965f-d130f6dab389.png)

![image](https://user-images.githubusercontent.com/87948501/149994747-caf2554a-10ef-4e1c-af53-5d4ec3bb7b14.png)

![image](https://user-images.githubusercontent.com/87948501/149994801-6012f0bf-9446-418a-8ccf-eecd17b65899.png)

### Endpoints

#### Sign-Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "name": "user",
    "username": "user",
    "password": "user"
}
```

#### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "user",
    "password": "user"
}
```

#### Make-admin

```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```

#### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
Content-Type: application/json
Content-Length: 119

{
    "title": "Test Book 2",
    "price": 10,
    "description": "Test description 2",
    "author": "Test author 2"
}
```

#### Delete Book

```
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
```

#### Get All Books

```
GET /api/book HTTP/1.1
Host: localhost:8080
```

#### Save Purchase

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
Content-Type: application/json
Content-Length: 53

{
    "userId": 3,
    "bookId": 1,
    "price": 10
}
```

#### Get User Purchases

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
```
