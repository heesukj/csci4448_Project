

#Create the database, (TODO: need to script this)
in MySqlWorkbench:
    create db stockscore
    create user stockscore with password stockscore123
    give the user stockscore all permissions on db stockscore


# Create a user using the rest service
curl -v -d '{"firstName":"Bob", "lastName":"Smith", "email":"bobsmith@gmail.com", "password":"qwerty"}' \
    -H "Content-Type: application/json" -X POST http://localhost:8080/stockscore/user

# Get all users
curl http://localhost:8080/stockscore/users

# Get a user by ID (example is to get user "1")
curl http://localhost:8080/stockscore/user/1

# Login a user
curl -v -d '{"email":"bobsmith@gmail.com", "password":"qwerty"}' -H "Content-Type: application/json" -X POST http://localhost:8080/stockscore/login