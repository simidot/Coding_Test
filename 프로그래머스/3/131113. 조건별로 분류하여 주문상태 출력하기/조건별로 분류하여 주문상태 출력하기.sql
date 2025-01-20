-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d'), 
    (case 
    when out_date <= '2022-05-01' then '출고완료'
     when out_Date > '2022-05-01' then '출고대기'
     else '출고미정'
    end) AS '출고여부'
from FOOD_ORDER
ORDER BY order_id;