drop database if exists vjezba2;
create database vjezba2;
use vjezba2;

create table brat(
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    ogrlica int not null,
    asocijalno boolean not null,
    neprijatelj int not null
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(18,2),
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11),
    cura int
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(33) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno boolean,
    majica varchar(40) not null,
    decko int
);

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno boolean,
    vesta varchar(34),
    asocijalno boolean not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(15,9),
    lipa decimal(15,8) not null,
    indiferentno boolean not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstroventno boolean not null,
    prviputa datetime,
    svekar int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno boolean not null
);

alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);

alter table neprijatelj add foreign key (cura) references cura(sifra);

alter table cura add foreign key (decko) references decko(sifra);

alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica(sifra);

alter table prijatelj add foreign key (svekar) references svekar(sifra);

insert into decko(sifra,asocijalno) values
(null,1),
(null,0),
(null,0);

insert into cura(sifra,haljina,drugiputa,majica) values
(null,'plava','2021-12-4','zuta'),
(null,'smeđa','2021-12-1','plava'),
(null,'zelena','2021-11-5','crvena');

insert into neprijatelj(sifra,haljina,modelnaocala,kuna) values
(null,'zelena','Diesel',1542.54),
(null,'plava','RayBan',4354.21),
(null,'smeđa','Gucci',3544.25);

insert into zarucnica(sifra,bojakose,lipa,indiferentno) values
(null,'smeđa',54.55,0),
(null,'plava',45.45,1),
(null,'crna',69.48,0);

/* 
update prijatelji set treciputa='2020-04-30';

delete from brat where ogrlica != 14;

select suknja from cura where drugiputa is null;

select e.haljina, a.novcica,f.neprijatelj from zarucnica a
inner join decko_zarucnica b on b.zarucnica=a.sifra
inner join decko c on b.decko=c.sifra
inner join cura d on d.decko=c.sifra
inner join neprijatelj e on e.cura=d.sifra
inner join brat f on f.neprijatelj=e.sifra
where d.drugiputa is not null and (c.vesta like '%ba%')
order by 3 desc;


select a.vesta, a.asocijalno from decko a
inner join decko_zarucnica b on b.decko=a.sifra
where a.sifra not in (select decko from decko_zarucnica);













# select a.vesta,a.asocijalno from decko a 
nner join decko_zarucnica b on b.decko=a.sifra 
where a.sifra not in (select decko from decko_zarucnica where decko is not null);

