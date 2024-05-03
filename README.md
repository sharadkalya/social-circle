# social-circle
A project using spring-boot, mongoDB, Next js and docker-compose

#### Initial BE url working
 - Get - http://localhost:25000/demo/index?message=someMessage
 - Post - http://localhost:25000/user
<br /><br />

Request Body
```
{
    "firstName": "jon",
    "lastName": "doe",
    "email": "jon@example.com",
    "password": "somePassword"
}
```
 - Get - http://localhost:25000/user

#### Initial UI url working
 - http://localhost:3000/


### Issue With Live reload of spring boot
For some reasons the live reload of spring boot isn't working.
The workaround here is to execute `run.sh` from within the backend container.
This script watches over the changes in the code base, and trigger reboot of our spring app.
To run it from within container:
 - `docker-compose exec backend bash`
 - `sh run.sh`
