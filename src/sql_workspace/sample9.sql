-- 1. NOT 연산자
SELECT
    last_name,
    job_id,
    salary
FROM
    employees
--WHERE
--    NOT salary < 20000;
-- WHERE
--     (NOT salary < 20000 ); -- 조건식의 경계를 ()로 표현, 경계를 확실히하자!
 WHERE
     NOT ( salary < 20000 );
     
-- 2. NOT IN 연산자
SELECT
    last_name, 
    job_id,
    salary
FROM
    employees
--WHERE
--   salary NOT IN ( 9000, 8000, 6000 );
 WHERE
     NOT ( salary IN ( 9000, 8000, 6000 ) );
     
-- 3. NOT LIKE 연산자
SELECT
    last_name,
    job_id,
    salary
FROM
    employees
--WHERE
--    last_name NOT LIKE 'J%';
-- WHERE
--    NOT last_name LIKE 'J%';
 WHERE
    NOT (last_name LIKE 'J%');
    
-- 4. NOT BETWEEN a AND b 연산자
--   NOT (a <= x <= b) --> (x < a, x > b)
SELECT
    last_name,
    job_id,
    salary
FROM
    employees
--WHERE
--    salary NOT BETWEEN 2400 AND 20000;
 WHERE
    NOT (salary BETWEEN 2400 AND 20000);
    
-- 5. IS NULL 연산자 (*******)
SELECT
    last_name,
    job_id,
    salary,
    commission_pct
FROM
    employees
-- WHERE
--    commission_pct = NULL; -- NULL은 어떠한 연산을 가해도 NULL(무한대), 비교연산자로 값비교XX
 WHERE
     commission_pct IS NULL;
--WHERE
--   nvl(commission_pct, -1) = -1;         -- INDEX 사용불가!!!

-- 6. IS NOT NULL 연산자
SELECT
    last_name,
    job_id,
    salary,
    manager_id
FROM
    employees
WHERE
    manager_id IS NULL;