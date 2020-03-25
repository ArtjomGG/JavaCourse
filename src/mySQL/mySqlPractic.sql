    --Create table Country: id, name, code, descriprion
    --Create table City: id, name, code, description, country_id   ->  country_id INTEGER REFERENCES country(id)!!!
    drop table COUNTRY;

    create table COUNTRY(
       id serial primary key,
       name VARCHAR (100) NOT NULL,
       code varchar (5) unique not null,
       description varchar (5000));

    create table CITY(
       id integer primary key,
       name VARCHAR (100) NOT NULL,
       code varchar (5) unique not null,
       description varchar (5000),
        country_id integer references country(id)
    );

    create table PERSON(
        id integer primary key,
        firstName varchar (100) not null,
        lastName varchar (100) not null,
        birthday date not null,
        city_id integer references city(id)
    );


    insert into countryY(id, name, code, description) values
       (1, 'Estonia', 'EE', 'Väga ilus maa'),
       (2, 'Finland', 'FI', 'Cold'),
       (3, 'Russia', 'RUS', 'Big'),
       (4, 'Poland', 'PL', 'Worker')
       ON conflict do nothing;

    insert into city(id, name, code, description, country_id) values
       (1, 'Tallinn', 'TLL', 'OldTown', 1),
       (2, 'Pärnu', 'PRN', 'Summer Catal', 1),
       (3, 'Helsinki', 'HLS', 'Suomi', 2),
       (4, 'Moscow', 'MSV', 'Kreml', 3),
       (5, 'Krakow', 'KRK', 'Kolbasa', 4)
       ON conflict do nothing;

    insert into PERSON(id, firstName, lastName, birthday, city_id) values
       (1, 'Ivar', 'Peet', '1980-01-15', 1),
       (2, 'Peetr', 'Kamm', '1980-02-20', 2),
       (3, 'Heiki', 'Pekkanen', '1960-02-29', 3),
       (4, 'Semen', 'Semenov', '1983-10-05', 4),
       (5, 'Kaspar', 'Krovs', '1955-12-31', 5)
       ON conflict do nothing;

    delete from city where city.country_id=1;

    commit;
    select * from country;
    select * from city;
    select * from person;

    --======JOIN======--
    select * from city
    inner join country on city.country_id = country.id
    where country.code='EE';

    select * from city
    inner join country on city.country_id = country.id;

    select * from city
    left join country on city.country_id = country.id;

    select * from city
    right join country on city.country_id = country.id;

    select * from city
    full join country on city.country_id = country.id;

    select person.*, city.name, country.name from person
    left join city on city.id = person.city_id
    left join country on country.id = city.country_id
    where country.name = 'Russia'
    order by person.lastName asc;

    --Many To Many:

    create table BOOK(
       id serial primary key,
       name VARCHAR (100) NOT NULL,
       releas_year integer not null,
       description varchar (5000));

    create table AUTHOR(
       id serial primary key,
       name VARCHAR (100) NOT NULL,
      last_Name varchar (100) not null);

    insert into book(id, name, releas_year, description) values
       (1, 'XXXXX', 2019, 'Description ..'),
       (2, 'YYYYY', 2020, 'Description ..'),
       (3, 'ZZZZZ', 2005, 'Description ..'),
       (4, 'JJJJJ', 2008, 'Description ..'),
       (5, 'PPPPP', 2010, 'Description ..')
       ON conflict do nothing;

       insert into author(id, name, last_name) values
       (1, 'Author1', 'Author1 LN'),
       (2, 'Author2', 'Author2 LN'),
       (3, 'Author3', 'Author3 LN'),
       (4, 'Author4', 'Author4 LN')
       ON conflict do nothing;
       select * from book;
       select * from author;

    create table book_x_author(
       book_id integer references book(id) not null,
       author_id integer references author(id) not null,
        constraint book_x_author_PK primary key (book_id, author_id)
    );
    select * from book_x_author;

    --x-> author 2, author 3
    --y-> author 1, author 3, author 4
    --z-> author 4
    --j-> author 1, author 4
    --p-> author 2

    insert into book_x_author(book_id, author_id) values
       (1, 2),
       (1, 3),
       (2, 1),
       (2, 3),
       (2, 4),
       (3, 4),
       (4, 1),
       (4, 4),
       (5, 2)
    ON conflict do nothing;

    select * from book
    inner join book_x_author on book_x_author.book_id = book.id
    inner join author on book_x_author.author_id = author.id
    where author.name = 'Author4';

    select * from author
    inner join book_x_author on book_x_author.author_id = author.id
    inner join book on book.id = book_x_author.book_id
    where book.name = 'YYYYY';

    --Cars--

    create table CARS (
    id serial primary key ,
    brand varchar (100) not null,
    model varchar (100) not null,
    price integer not null,
    weight integer not null,
    color varchar (100) not null);

    insert into CARS (id, brand, model, color , weight, price) values
        (1, 'MB', 'E-Class', 'Silver', 2000, 65000),
        (2, 'MB', 'A-Class', 'Red', 1500, 35000),
        (3, 'MB', 'C-Class', 'White', 1800, 45000),
        (4, 'BMW', 'Seeria-330', 'Black', 1700, 30000 ),
        (5, 'BMW', 'Seeria-540', 'Silver', 2000, 50000),
        (6, 'BMW', 'Seeria-750', 'Black', 2500, 70000),
        (7, 'VW', 'Golf', 'Green', 1300, 25000),
        (8, 'VW', 'Passat', 'Orange', 1800, 35000),
        (9, 'VW', 'Tiguan', 'White', 1800, 45000),
        (10, 'VW', 'Tuareg', 'Black', 1800, 45000)
        on conflict do nothing;

        --nextval('idsequance') dobovljaet sledushij porjadkov6j nomer v ID,
        --(nextval('cars_id_seq') dolshno b6t' ispolzpvano iznochalno pri sozdanii tablic6

    select * from CARS
    --where cars.brand = 'BMW'
    --and cars.price >= 40000;


