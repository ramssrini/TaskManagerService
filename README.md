# TaskManagerService

Step 1:
docker run -d --name mongocontainer --network=fsd_workout_network -v ~/mongo-data:/data/db mongo

Step 2:
./mvnw install dockerfile:build

Step 3:
docker run -p 8080:8080 --name fsdTaskManager --network=fsd_workout_network ramssrini/spring-boot-taskmanager-service:0.0.1-SNAPSHOT
