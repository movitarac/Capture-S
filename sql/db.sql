DROP TABLE IF EXISTS museums;
DROP TABLE IF EXISTS photos ;
DROP TABLE IF EXISTS users ;

CREATE TABLE users (
iduser SMALLINT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(200) NOT NULL,
last_name VARCHAR(200) NOT NULL,
email VARCHAR(300) NOT NULL,
pass VARCHAR(150) NOT NULL,
address VARCHAR(400) NOT NULL,
username VARCHAR(100) NOT NULL

)
ENGINE=INNODB;

CREATE TABLE museums (
       
idmuseum SMALLINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(200) ,
city VARCHAR(200) ,
type VARCHAR(150),
addressm VARCHAR(400) ,
open_hours VARCHAR(200),
tarif INT UNSIGNED,
lat FLOAT,
longi FLOAT
)
ENGINE=INNODB;

CREATE TABLE photos (
idphoto SMALLINT AUTO_INCREMENT PRIMARY KEY,
namep VARCHAR(200) ,
photo_title VARCHAR(200) ,
camera_brand VARCHAR(300) ,
focal VARCHAR(150),
apeture VARCHAR(400),
shutter_speed VARCHAR(100),
flash VARCHAR(50),
iso_cam SMALLINT,
star VARCHAR(50),
review_pos VARCHAR(600),
review_neg VARCHAR(600),
userid SMALLINT NOT NULL,
FOREIGN KEY(userid) REFERENCES users(iduser),
museumid SMALLINT NOT NULL,
FOREIGN KEY(museumid) REFERENCES museums(idmuseum)
)
ENGINE=INNODB;

INSERT INTO users (first_name,last_name,email,pass,address,username) VALUES ('Azura', 'Mamoto', 'azura.mamoto@yahoo.co.id', 'az12345', 'rue de tomjerry', 'mariazura'),('Capucine', 'Grazie', 'azura.mamoto@yahoo.co.id', 'az12345', 'rue de powerpuff',
'beesy_black'),('Totoro', 'Tororo', 'azura.mamoto@yahoo.co.id', 'abcdefgh', 'rue de donut', 'moonlightfalls'),('Weasley', 'Georgie', 'azura.mamoto@yahoo.co.id', 'ab123', 'rue de star', 'vitazura'),('Momo', 'Taro', 'azura.mamoto@yahoo.co.id', 'c123', 'rue de trek', 'marukochan'), ('Huruhara', 'Holi', 'azura.mamoto@yahoo.co.id', 'qwerty345', 'rue de dauphin',
'moonlightyellow'), ('Carola', 'Coila', 'azura.mamoto@yahoo.co.id', 'azerty1', 'rue de hamster', 'busybee'), ('Holis', 'Molis', 'azura.mamoto@yahoo.co.id', 'abcdef55', 'rue de figaro', 'marukochan');

INSERT INTO museums (name,city,type,address_,open_hours,tarif, lat,longi) VALUES ('Musée du Louvre ', 'Paris', 'Rue de Rivoli', 'art', '9am-6pm', 15, 48.8606, 2.3376),
('Musée d\'Art Moderne de la Ville de Paris', 'Paris', 'Avenue du Président Wilson', 'art','10am-6pm', 7, 48.8643, 2.2978),
('Muséum National d\'Histoire Naturelle', 'Paris', 'Rue Voltaire', 'natural history','9am-5pm', 10, 48.8443, 2.3562),
('Musée d\'Orsay', 'Paris', 'Rue de la Légion d\'Honneur', 'art', '9:30am-6pm', 12, 48.8600, 2.3266),
('Musée de l\'Orangerie', 'Paris', ' Jardin Tuileries', 'art', '9am-6pm', 9	,48.8638, 2.3227),
('Fondation Louis Vuitton', 'Paris', ' Avenue du Mahatma Gandhi', 'art', '10am-8pm', 5, 48.8766, 2.2634);

 INSERT INTO photos (namep, photo_title,camera_brand,focal,apeture,shutter_speed,flash,iso_cam,star,review_pos,review_neg,userid,museumid)
 VALUES ('flv3.jpg', ' Foundation LV ', 'Olympus M II ', '60mm', 'f/3.0', '1/40', 'no', 800, '9','lots of collection and museum is so big',
' long queue and need time to discover all the collection',8,6);
select * from photos;
