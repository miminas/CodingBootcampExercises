-- EXERCISE 3

CREATE VIEW perMonth AS
SELECT  customer_id,count(rental_id) cnt, MONTH(rental_date) mn
FROM rental
GROUP BY customer_id, MONTH(rental_date);

CREATE VIEW perYear AS
SELECT customer_id, count(rental_id)cnt
FROM rental
GROUP BY customer_id, YEAR(rental_date);

-- You can make calculations here!
Select perMonth.customer_id, mnth, (rentals/rentalsTOTAL) as percentage from perMonth
INNER JOIN perYear
ON perMonth.customer_id = perYear.customer_id;

-- EXERCISE 4

CREATE OR REPLACE VIEW payMonth AS
SELECT  customer_id, MONTH(payment_date) mnth, sum(amount) amount
FROM payment
GROUP BY customer_id, MONTH(payment_date);

CREATE OR REPLACE VIEW payYear AS
SELECT customer_id, sum(amount)amountTOTAL
FROM payment
GROUP BY customer_id;

Select payMonth.customer_id, mnth, (amount/amountTOTAL) as percentage from payMonth
INNER JOIN payYear
ON payMonth.customer_id = payYear.customer_id;

-- EXERCISE 5

Select payMonth.customer_id, name, mnth, (amount/amountTOTAL) as percentage from payMonth
INNER JOIN payYear
ON payMonth.customer_id = payYear.customer_id
INNER JOIN customer_list
ON payYear.customer_id = customer_list.ID;
