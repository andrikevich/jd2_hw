--    -= 6.1=- 
-- список получателей платежей и сумма по каждому из них
SELECT `rec`.`name` AS `Получатель платежа`, sum(`ex`.`value`) AS `Сумма платежей`
FROM `listexpenses`.`expenses` `ex`, `listexpenses`.`receivers` `rec`
WHERE `ex`.`receiver` = `rec`.`num`
GROUP BY `rec`.`name`;

--     -=6.2=-
-- сумма платежей за тот день, когда был наибольший платеж
SELECT  sum(`ex`.`value`) AS `Сумма платежей`
FROM `listexpenses`.`expenses` `ex`
WHERE `ex`.`paydate` = ( SELECt  `ex`.`paydate` FROM `listexpenses`.`expenses` `ex`  WHERE `ex`.`value` = (SELECT max(`ex`.`value`) FROM `listexpenses`.`expenses` `ex`) );

--     -=6.3=-
-- наибольший платеж за тот день, когда сумма платежей была наибольшей
SELECT  max(`ex`.`value`) AS `Наибольший платеж за день`
FROM `listexpenses`.`expenses` `ex`
WHERE `ex`.`paydate` = ( SELECT  `ex`.`paydate` 
						 FROM `listexpenses`.`expenses` `ex`
						GROUP BY  `ex`.`paydate` 
						HAVING sum(`ex`.`value`) =  (SELECT max(`tmp`.`SumPerDay`) 
													 FROM (SELECT sum(`ex`.`value`) AS `SumPerDay`  
														   FROM `listexpenses`.`expenses` `ex`  
														   GROUP BY `ex`.`paydate`) `tmp`))