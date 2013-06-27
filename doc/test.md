Testing Javacosm
================

Mocked Responses
----------------

Javacosm uses [mocky.io](http://mocky.io/) to mock Microcosm's API.

| URL Pattern                               | Method  | mocky.io URL |
|-------------------------------------------|-----------------------------------------------------------|
| /microcosms                               | OPTIONS |
| /microcosms                               | POST    |
| /microcosms                               | GET     | http://www.mocky.io/v2/5186c569cf096b8c025cb3b1
| /microcosm/{id:[0-9]+}                    | OPTIONS |
| /microcosm/{id:[0-9]+}                    | GET     |
| /microcosm/{id:[0-9]+}                    | PUT     |
| /microcosm/{id:[0-9]+}                    | DELETE  |
| /conversations                            | OPTIONS |
| /conversations                            | POST    |
| /conversations                            | GET     |
| /conversations/{id:[0-9]+}                | OPTIONS |
| /conversations/{id:[0-9]+}                | GET     |
| /conversations/{id:[0-9]+}                | PUT     |
| /conversations/{id:[0-9]+}                | PATCH   |
| /conversations/{id:[0-9]+}                | DELETE  |
| /events                                   | OPTIONS |
| /events                                   | POST    |
| /events                                   | GET     |
| /events/{id:[0-9]+}                       | OPTIONS |
| /events/{id:[0-9]+}                       | GET     |
| /events/{id:[0-9]+}                       | PUT     |
| /events/{id:[0-9]+}                       | PATCH   |
| /events/{id:[0-9]+}                       | DELETE  |
| /events/{id:[0-9]+}/attendees             | OPTIONS |
| /events/{id:[0-9]+}/attendees             | GET     |
| /events/{id:[0-9]+}/attendees             | GET     |
| /events/{id:[0-9]+}/attendees/{id:[0-9]+} | OPTIONS |
| /events/{id:[0-9]+}/attendees/{id:[0-9]+} | GET     |
| /events/{id:[0-9]+}/attendees/{id:[0-9]+} | PUT     |
| /events/{id:[0-9]+}/attendees/{id:[0-9]+} | DELETE  |
| /polls                                    | OPTIONS |
| /polls                                    | POST    |
| /polls                                    | GET     |
| /polls/{id:[0-9]+}                        | OPTIONS |
| /polls/{id:[0-9]+}                        | GET     |
| /polls/{id:[0-9]+}                        | PUT     |
| /polls/{id:[0-9]+}                        | DELETE  |
| /comments                                 | OPTIONS |
| /comments                                 | POST    |
| /comments                                 | GET     |
| /comments/{id:[0-9]+}                     | OPTIONS |
| /comments/{id:[0-9]+}                     | GET     |
| /comments/{id:[0-9]+}                     | PUT     |
| /comments/{id:[0-9]+}                     | PATCH   |
| /comments/{id:[0-9]+}                     | DELETE  |
| /profiles                                 |         |
| /whoami                                   | OPTIONS |
| /whoami                                   | GET     |
