# Spring Boot Personal Library Manager

In this exercise, you will be working with an existing Spring Boot application 
that was created using Spring Initialzr.  This is an application for viewing a
personal library of books, movies and music albums.

When this application is completed, you should be able to load all of these end
points in your browser and see the results:

| Url                               | Description                                       |
| --------------------------------- | ------------------------------------------------- |
| http://localhost:8080/books/html  | Shows a list of three books in HTML format        |
| http://localhost:8080/books/json  | Shows a list of three books in JSON format        |
| http://localhost:8080/albums/html | Shows a list of three music albums in HTML format |
| http://localhost:8080/albums/json | Shows a list of three music albums in JSON format |
| http://localhost:8080/movies/html | Shows a list of three movies in HTML format       |
| http://localhost:8080/movies/json | Shows a list of three movies in JSON format       |

Currently, the book model and controller is completed and working.  Your task is to
complete this application by implementing the album and movie models and controllers.

## Albums

You need to create a model class for representing a music album.  This class should 
derive from the LibraryItem class and should implement the following properties
(accessible through getters/setters):

| Property | Description                                                   |
| -------- | ------------------------------------------------------------- |
| name     | Name of the album (inherited from the LibraryItem base class) |
| artist   | Artist who created the album                                  |
| tracks   | Year that the album was released                              |

You can look to the book class as an example.

You will also need to implement a controller that includes a private list of
three albums and provides methods for getting the albums over http as an HTML
list and as a JSON list.

You can look to the book controller class as an example.

## Movies

You need to create a model class for representing a movie.  This class should 
derive from the LibraryItem class and should implement the following properties
(accessible through getters/setters):

| Property | Description                                                   |
| -------- | ------------------------------------------------------------- |
| name     | Name of the movie (inherited from the LibraryItem base class) |
| director | Director of the movie                                         |
| year     | Year that the movie was released                              |
| runtime  | Runtime (in minutes) of the movie                             |

You can look to the book class as an example.

You will also need to implement a controller that includes a private list of
three movies and provides methods for getting the movies over http as an HTML
list and as a JSON list.

You can look to the book controller class as an example.

## Verifying and Testing Your Solution

You can verify your solution by opening a browser and visiting each endpoint
and viewing the results.

| url                               | description                               |
| --------------------------------- | ----------------------------------------- |
| http://localhost:8080/books/html  | Shows the books as html list              |
| http://localhost:8080/books/json  | Shows the books as a JSON formatted list  |
| http://localhost:8080/albums/html | Shows the albums as an HTML list          |
| http://localhost:8080/albums/json | Shows the albums as a JSON formatted list |
| http://localhost:8080/movies/html | Shows the movies as an HTML list          |
| http://localhost:8080/movies/json | Shows the movies as a JSON formatted list |

