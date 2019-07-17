create database EvidencijaRadnogVremenaZaposlenika
go

use EvidencijaRadnogVremenaZaposlenika
go

create table Zaposlenik
(
	IDZaposlenik int primary key identity not null,
	Ime nvarchar(30) not null,
	Prezime nvarchar(40 )not null,
	Email nvarchar(80) not null,
	Lozinka nvarchar(600) not null
)

create table Zapis
(
	IDZapis int primary key identity not null,
	Naziv nvarchar (50) not null,
	Datum date not null,
	VrijemeOd time not null,
	VrijemeDo time not null,
	Sati tinyint not null,
	Minute tinyint not null
)

create table Raspored
(
	IDRaspored int primary key identity not null,
	Zapis int foreign key references Zapis (IDZapis),
	Zaposlenik int foreign key references Zaposlenik (IDZaposlenik)
)