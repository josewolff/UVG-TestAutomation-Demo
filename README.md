# UVG-TestAutomation-Demo
UVG-TestAutomation-Demo

1. Install Java 13+
2. Install Docker 
3. Go to src/main/resources/docker-System. Run the comman docker-compose up -d and then go to http://localhost:8081 (a web application should be displayed)
4. Go to src/main/resources/docker-Integration. Run the comman docker-compose up -d and then go to http://localhost:5000/users/all, the app should return a JSON structure.
5. Go to src/main/resources/postmanCollections. Import the collections on PostMan
6. Commands: mvn test -DapiHost="http://localhost:5001" -DseleniumHost="http://localhost:8081" -DincludeGroup="seleniumPomSolid"
