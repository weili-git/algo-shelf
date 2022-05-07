select Name as Customers
from
Customers left join Orders
on
Customers.id = Orders.customerId
where
Orders.id is NULL