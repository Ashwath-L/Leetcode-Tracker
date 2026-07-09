-- Last updated: 7/9/2026, 3:09:30 PM
select e1.name as Employee
from employee e1 join employee e2
on e1.managerid=e2.id and e1.salary>e2.salary;