select *
from cinema
where id&1 and description <> 'boring'
order by rating desc