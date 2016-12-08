-- Exercise 1
-- Create and execute a procedure that displays the first and the last name from table actors.

DELIMITER $
CREATE PROCEDURE firstLast()
BEGIN
SELECT first_name, last_name FROM actor
ORDER BY first_name;
END$

call firstLast();

-- Exercise 2
-- Create a procedure to display everything from table actor with id=58

DELIMITER $
CREATE PROCEDURE actor58()
BEGIN
SELECT * FROM actor
WHERE actor_id=58;
END$

call actor58();

-- Exercise 3
-- Create a procedure that receives as input a payment amount
-- and a date and returns those payments (table=payment)
-- that exceed this amount for the days after the given day.
-- Then execute the procedure for amount=1, and date = '2004-05-25 11:30:37‘.

DELIMITER $
CREATE PROCEDURE amountDate(IN amount DECIMAL(5,2), IN dt DATE)
 BEGIN
 SELECT *
 FROM payment
 WHERE amount<payment.amount AND dt > date(payment_date);
 END $

call amountDate(3.2,'2005-07-06');

-- Exercise 4
-- In the previous procedure also count the number of distinct dates
-- that satisfy the following the restriction (amount=1, and date = '2004- 05-25 11:30:37‘.)

DELIMITER $
CREATE PROCEDURE distinctAmountDate(IN amount DECIMAL(5,2), IN dt DATE)
 BEGIN
 SElect count(distinct payment_date)
 FROM payment
 WHERE amount<payment.amount AND dt > date(payment_date);
 END $

call distinctAmountDate(1, '2005-05-25');
