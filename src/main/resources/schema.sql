CREATE TABLE Books (
  book_UUID INT PRIMARY KEY,
  book_title VARCHAR(250) NOT NULL,
  book_author VARCHAR(250) NOT NULL,
  book_category VARCHAR(250) NOT NULL,
  book_status VARCHAR(250) NOT NULL,
  return_date DATE NOT NULL
);