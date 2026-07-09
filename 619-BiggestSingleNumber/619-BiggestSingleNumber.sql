-- Last updated: 7/9/2026, 3:08:10 PM
SELECT
    MAX(num) AS num
FROM MyNumbers
WHERE num IN (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
);