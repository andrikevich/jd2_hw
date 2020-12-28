SELECT `ex`.`num` AS `Номер платежа`, `ex`.`paydate` AS `Дата`, `rec`.`name` AS `Имя получателя`, `ex`.`value` AS `Величина`
FROM `listexpenses`.`expenses` `ex`, `listexpenses`.`receivers` `rec`
where `ex`.`receiver` = `rec`.`num` AND `ex`.`value` > 10000;