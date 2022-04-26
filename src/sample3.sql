SELECT
    last_name || salary AS "이름 월급"
FROM
    employees;
    
SELECT
    last_name || hire_date AS "이름 날짜"
FROM
    employees;

SELECT
    last_name || '사원'
FROM
    employees;
    
SELECT
    last_name || '의 직업은' || job_id||' 입니다.' AS "사원별 직급"
FROM
    employees;
    
SELECT
    last_name || ' 의 직책은' || job_id AS"사원별 직책"
FROM
    employees
WHERE           -- 1차 필터링: FROM절이 제공한 각 객체를 필터링(실행순서:2)
    last_name = 'Smith';    -- = : 동등비교연산자 <자바와 거의 대동소이
    
