-- 코드를 입력하세요
SELECT b.book_id as BOOK_ID, a.author_name AUTHOR_NAME, DATE_FORMAT(b.published_date, '%Y-%m-%d') as PUBLISHED_DATE
FROM BOOK b
JOIN AUTHOR a on a.author_id = b.author_id
WHERE category = '경제'
ORDER BY b.published_date;