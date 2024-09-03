create database project;
use project;
create table book_details(bookId int auto_increment primary key, bookName varchar(20) unique, authorName varchar(30), isBorrowed boolean default false, borrowerName varchar(20) default null);