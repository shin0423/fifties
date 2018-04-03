set names utf8;
set foreign_key_checks = 0;
drop database if exists fifties;

create database if not exists fifties;
use fifties;

/*
 * 会員情報テーブル（木村）
 */

drop table if exists user_info;

create table user_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null unique,
	password varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	sex tinyint default 0,
	email varchar (50) not null,
	status tinyint default 0,
	logined tinyint default 0,
	m_flg tinyint default 0,
	regist_date datetime not null,
	update_date datetime
);

/*
 * 商品情報テーブル（戊亥）
 */

drop table if exists product_info;

create table product_info(
	id int not null primary key auto_increment,
	product_id int not null unique,
	product_name varchar (100) not null unique,
	product_name_kana varchar (100) not null unique,
	product_description varchar (255) not null,
	category_id int not null,
	price int,
	image_file_path varchar (100),
	image_file_name varchar (50),
	release_date date not null,
	release_company varchar (50),
	status tinyint default 0 not null,
	regist_date datetime not null,
	update_date datetime
);

/*
*カート情報テーブル（山本）
*/

drop table if exists cart_info;

create table cart_info(
	id int not null primary key auto_increment,
	user_id varchar  (16) not null,
	product_id int not null,
	product_count int not null,
	regist_date datetime not null,
	update_date datetime
);

/*
*購入履歴情報テーブル（山本）
*/

drop table if exists purchase_history_info;

create table purchase_history_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	product_id int not null,
	product_count int not null,
	price int not null,
	regist_date datetime not null,
	update_date datetime
);

/*
*宛先情報テーブル（林）
*/

drop table if exists destination_info;

create table destination_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	email varchar (32) not null,
	tel_number varchar (13) not null,
	user_address varchar (50) not null,
	regist_date datetime not null,
	update_date datetime
);

/*
*カテゴリーマスターテーブル（戊亥）
*/

drop table if exists m_category;

create table m_category(
	id int primary key not null auto_increment,
	category_id int not null unique,
	categry_name varchar (20) not null unique,
	category_description varchar (100),
	insert_date datetime not null,
	update_date datetime
);

/*
*問い合わせ情報テーブル(森）
*/

drop table if exists inquiry;

create table inquiry(
	id int primary key not null auto_increment,
	name varchar (100) not null,
	email varchar (255),
	inquiry_type varchar (30),
	inquiry_body varchar (255) ,
	insert_date datetime not null
);

/*
*レビューテーブル（山本）
*/

drop table if exists review;

create table review (
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	product_id int not null,
	review_title varchar (100),
	review_body varchar (255),
	review_score int not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*お気に入りテーブル（中嶋）
*/

drop table if exists favorite;

create table favorite (
	id int not null primary key auto_increment
);


/*
*管理者アカウント
*/

INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana,
	first_name_kana, sex, email, m_flg, regist_date)
	VALUES("master", "123", "田中", "太郎", "たなか", "たろう", "0", "aaaa@com", 1, now());
