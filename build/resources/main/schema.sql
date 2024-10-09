--참고 사이트: https://velog.io/@minjun7410/Spring-%EC%B2%98%EC%9D%8C%EB%B6%80%ED%84%B0-H2-Database-%ED%85%8C%EC%9D%B4%EB%B8%94-%EC%83%9D%EC%84%B1%EA%B9%8C%EC%A7%80

create table board_tb
(
    id bigint not null auto_increment,
    title VARCHAR(255) not null,
    content VARCHAR(500) not null,
    author varchar(50) not null,
    primary key (id)
);