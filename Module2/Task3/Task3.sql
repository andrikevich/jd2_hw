-- Gives possibilities to safe UPDATE/DELETE from DB without using WHERE PK = ...
SET SQL_SAFE_UPDATES = 0;

DELETE FROM `listexpenses`.`expenses`
WHERE `value` < 3000;