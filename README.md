# OnlineBookStore

We will implement CRUD operations in our project. We will implement these CRUD operations for users and books. We will use user CRUD operations for login, registration and authorization. We will also use book CRUD operations for creating, editing and deleting books.


### Endpoints

#### Sign-Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
{
    "name": "testUser",
    "username": "testUser",
    "password": "testUser"
}
```

#### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
{
    "username": "testUser",
    "password": "testUser"
}
```

#### Make-admin

```
PUT /api/internal/make-admin/testAdmin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```

#### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
Content-Type: application/json
Content-Length: 105
{
    "title": "Test GO",
    "price": 120,
    "description": "Go Lang",
    "author": "Test author 3"
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
Content-Length: 54
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
