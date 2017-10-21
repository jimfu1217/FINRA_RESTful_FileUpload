# FINRA_RESTful_FileUpload
This is a project for FINRA coding exercise.

Developed a RESTful API for file upload with Spring-boot.

API to upload a file with a few meta-data fields: file Id, file Name, file path

Persist meta-data in persistent store in memory database Derby.

After run the project, you can use Chrome postman plugin to test the API, localhost:8080/

URI| HttpMethod | Description  
---|---| ---   
/files | Post | Upload a file to the memory
/files  | Get | Get all files' metadata stored in the database
/files/{id} | Get | Find the file's metadata by file id
