-- Last updated: 7/9/2026, 3:08:19 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(DISTINCT student) >= 5;