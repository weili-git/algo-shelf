delete from Person
where Id not in(
    select * from(
        select min(Id)
        from Person
        group by Email) t
);

--如果id不是其中最小的，则需要删除
--t表示别名，是MySQL的要求
--select的表不能立刻进行update和delete操作