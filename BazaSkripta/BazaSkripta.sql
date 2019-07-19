create database EvidencijaRadnogVremenaZaposlenika
go

use EvidencijaRadnogVremenaZaposlenika
go

create table zaposlenik
(
	id_zaposlenik int primary key identity not null,
	ime nvarchar(30) not null,
	prezime nvarchar(40 )not null,
	email nvarchar(80) not null,
	lozinka nvarchar(600) not null
)

create table zapis
(
	id_zapis int primary key identity not null,
	naziv nvarchar (50) not null,
	datum date not null,
	vrijeme_od time not null,
	vrijeme_do time not null,
	sati tinyint not null,
	minute tinyint not null
)

create table raspored
(
	id_raspored int primary key identity not null,
	zapis_id int foreign key references zapis (id_zapis),
	zaposlenik_id int foreign key references zaposlenik (id_zaposlenik)
)