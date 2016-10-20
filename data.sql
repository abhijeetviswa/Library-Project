/*
SQLyog Community v12.2.6 (32 bit)
MySQL - 5.1.33-community : Database - library
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `books` */

CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `bookCount` int(10) unsigned NOT NULL DEFAULT '1',
  `inStock` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `books` */

insert  into `books`(`id`,`name`,`author`,`publisher`,`location`,`bookCount`,`inStock`) values 

(1,'A Game of Thrones','George R. R. Martin','Bantam Books','A1',1,1),

(2,'A Clash of Kings','George R. R. Martin','Bantam Books','A2',1,1),

(3,'A Storm of Swords','George R. R. Martin','Bantam Books','A3',1,1),

(4,'A Feast for Crows','George R. R. Martin','Bantam Books','A3',1,1),

(5,'A Dance with Dragons','George R. R. Martin','Bantam Books','A4',1,1),

(6,'Harry Potter and the Philosopher\'s Stone','J. K. Rowling','Bloomsburry Publishing','A5',1,1),

(7,'Harry Potter and the Chamber of Secrets','J. K. Rowling','Bloomsburry Publishing','B1',1,1),

(8,'Harry Potter and the Prisoner of Azkaban','J. K. Rowling','Bloomsburry Publishing','B2',1,1),

(9,'Harry Potter and the Goblet of Fire','J. K. Rowling','Bloomsburry Publishing','B3',1,1),

(10,'Harry Potter and the Order of the Phoenix','J. K. Rowling','Bloomsburry Publishing','B4',1,1),

(11,'Harry Potter and the Half-Blood Prince','J. K. Rowling','Bloomsburry Publishing','B5',1,1),

(12,'Harry Potter and the Deathly Hallows','J. K. Rowling','Bloomsbury Publishing','C1',1,1);

/*Table structure for table `borrowedbooks` */

CREATE TABLE `borrowedbooks` (
  `bookId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `dateOfIssue` date DEFAULT NULL,
  `dateOfReturn` date DEFAULT NULL,
  `issued` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`bookId`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `borrowedbooks` */


/*Table structure for table `members` */

CREATE TABLE `members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `sex` int(11) NOT NULL,
  `address` varchar(500) NOT NULL,
  `phone` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `members` */

insert  into `members`(`id`,`name`,`sex`,`address`,`phone`) values 

(1,'Abhijeet',0,'Some random addr',123456789);

/*Table structure for table `users` */

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`) values 

(1,'asd','asd');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
