-- Last updated: 7/9/2026, 3:09:20 PM
DELETE p1
FROM Person p1, Person p2
WHERE p1.Email = p2.Email
AND p1.Id > p2.Id;