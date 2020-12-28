INSERT INTO `listexpenses`.`receivers` (`num`, `name`) VALUES
(1, 'Интернет провайдер \"Соло\"'),
(2,'Гипермаркет \"Корона\"'),
(3,'МТС');



-- additional 
ALTER TABLE `listexpenses`.`expenses` 
ADD CONSTRAINT `FK_RECEIVER`
  FOREIGN KEY (`receiver`)
  REFERENCES `listexpenses`.`receivers` (`num`);