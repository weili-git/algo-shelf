# 自链接

select e1.name as Employee
from
Employee e1, Employee e2
where
e1.managerId=e2.Id
and e1.salary > e2.salary

# 子链接

select e.Name as Employee
from employee e
where salary > (select salary from employee where Id = e.ManagerId)