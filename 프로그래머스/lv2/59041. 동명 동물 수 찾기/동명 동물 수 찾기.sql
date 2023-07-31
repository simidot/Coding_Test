-- 코드를 입력하세요
SELECT name "NAME", count(name) "COUNT"
from animal_ins
WHERE name is not null
having count(name) >1
group by name
order by name;