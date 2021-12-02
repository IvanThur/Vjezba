drop database if exists vjezba1;
create database vjezba1;
use vjezba1;

create table sestra(
    sifra int not null primary key auto_increment,
    introvertno boolean,
    haljina varchar(31) not null,
    maraka decimal(16,6),
    hlace varchar(46) not null,
    narukvica int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31) not null,
    jmbag char(11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(44),
    sestra int not null
);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(50) not null,
    hlace varchar(30),
    modelnaocala varchar(43),
    maraka decimal(14,5) not null,
    zena int not null
);


create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50) not null,
    kuna decimal(16,8) not null,
    drugiputa datetime,
    asocijalno boolean,
    ekstroventno boolean not null,
    dukserica varchar(48) not null,
    muskarac int
);

create table sestra_svekar(
    sifra int not null primary key auto_increment,
    sestra int not null,
    svekar int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prstena int,
    dukserica varchar(41),
    lipa decimal(13,8),
    eura decimal(12,7),
    majica varchar(35)
);

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41) not null
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5) not null,
    gustoca decimal(18,6) not null,
    lipa decimal(13,10),
    ogrlica int not null,
    bojakose varchar(38),
    suknja varchar(36),
    punac int
);


alter table sestra_svekar add foreign key (sestra) references sestra(sifra);
alter table sestra_svekar add foreign key (svekar) references svekar(sifra);

alter table zena add foreign key (sestra) references sestra(sifra);

alter table muskarac add foreign key (zena) references zena(sifra);

alter table mladic add foreign key (muskarac) references muskarac(sifra);
 
alter table cura add foreign key (punac) references punac(sifra);

insert into sestra(sifra,haljina,hlace,narukvica) values
(null,'Plava','Crne',1),
(null,'Crvena','Smeđe',2),
(null,'Žuta','Plave',3);


insert into zena(sifra,kratkamajica,jmbag,bojaociju,sestra) values
(null,'Puma','15364789254','Plava',1),
(null,'Nike','64589725974','Smeđa',2),
(null,'Addidas','6485451632','Zelena',3);

insert into muskarac(sifra,bojaociju,maraka,zena) values
(null,'Plava',32.58,1),
(null,'Zelena',65.45,2),
(null,'Smeđa',36.98,3);

insert into svekar(sifra,bojaociju) values
(null,'Plava'),
(null,'Zelena'),
(null,'Smeđa');

insert into sestra_svekar(sestra,svekar) values
(1,1),
(2,2),
(3,3);


/*
update cura set gustoca=15.77;
*/

/*
select kratkamajica from zena where hlace like '%ana%';
*/

/* 
select f.dukserica,a.asocijalno,b.hlace from mladic a 
inner join muskarac b on a.muskarac=b.sifra 
inner join zena c on b.zena=c.sifra 
inner join sestra d on c.sestra=d.sifra 
inner join sestra_svekar e on e.sestra=d.sifra 
inner join svekar f on e.svekar=f.sifra 
where c.hlace like 'a%' and d.haljina like '%ba%' 
order by 3 desc;
*/

/*
select a.haljina,a.maraka from sestra a 
inner join sestra_svekar b on b.sestra=a.sifra 
where a.sifra not in (select sestra from sestra_svekar 
where sestra is not null);
*/