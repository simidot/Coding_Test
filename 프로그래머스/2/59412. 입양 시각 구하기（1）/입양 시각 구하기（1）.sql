-- 코드를 입력하세요
SELECT HOUR(datetime) as HOUR, count(*) as COUNT
from animal_outs
where HOUR(datetime) between 9 and 19
group by HOUR
order by HOUR;