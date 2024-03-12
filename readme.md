# Fake Store API
## Description
This is a fake store API that allows you to get, post, put and delete products and users. It is a simple API that is used to practice and learn about RESTful APIs and how to create them. It is also used to practice using Postman to test the API.


## API Endpoints

### Carts

#### Get all carts
```
GET /api/carts/all
```
This api endpoint will return all the carts in the database.

#### Get cart by id
```
GET /api/carts/:id
```
This api endpoint will return a cart by its id.


#### Create a new cart
```
POST /api/carts
```

This api endpoint will create a new product in cart.
#### Update a cart
```
PUT /api/carts/:id
```

#### Delete a cart
```
DELETE /api/carts/:id
```

#### Get Limited Cart Items
```
GET /api/carts/limited?limit={enter your count here}
```

#### Get Sorted Cart Items
```
GET /api/carts/sorted?sort={enter your sort type here}
```
Types can be asec or desc

#### Get Cart Items in a Date Range
```
GET /api/carts/dateRange?startDate={start date}&endDate={end date}
```

This will return a list of Cart Items in provided date range 

Date need to be in this format :- 2019-12-10

#### Get User Cart Items
```
GET /api/carts/user/:userId
```
This will return a list of Cart Items of provided user id


