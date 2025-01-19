-- 코드를 입력하세요
SELECT animal_type, IFNULL(name, "No name") AS NAME, sex_upon_intake
FROM ANIMAL_INS
ORDER BY animal_id;