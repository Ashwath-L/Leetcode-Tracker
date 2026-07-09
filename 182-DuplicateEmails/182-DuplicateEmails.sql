-- Last updated: 7/9/2026, 3:09:28 PM
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;