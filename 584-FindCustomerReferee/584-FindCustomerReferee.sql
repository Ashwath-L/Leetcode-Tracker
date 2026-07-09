-- Last updated: 7/9/2026, 3:08:25 PM
SELECT name
FROM Customer
WHERE referee_id <> 2
   OR referee_id IS NULL;