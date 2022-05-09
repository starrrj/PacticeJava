SELECT
    employee_id,
    last_name,
    salary
FROM
    employees
WHERE
    last_name LIKE 'J%';
    
SELECT
    employee_id,
    last_name,
    salary
FROM
    employees
WHERE
    last_name LIKE '%ai%';
    
SELECT
    employee_id,
    last_name,
    salary
FROM
    employees
WHERE
    last_name LIKE '%in';
    
SELECT
    employee_id,
    last_name,
    salary
FROM
    employees
WHERE
    last_name LIKE '_b%';  
    
SELECT
    employee_id,
    last_name,
    salary
FROM
    employees
WHERE
    last_name LIKE '_____d'; --6문자이며, d로 끝나는
    
SELECT
    employee_id,
    last_name,
    salary
FROM
    employees
WHERE
    last_name LIKE '%d';

SELECT
    employee_id,
    last_name,
    salary
FROM
    employees
WHERE
    last_name LIKE '%';

--     '%_%' '_'  '%%' '%';  -- % : x >= 0, _ : x == 1 (x: 문자개수)

SELECT
    employee_id,
    last_name,
    salary,
    job_id
FROM
    employees
WHERE
    -- 탈출문자(Escape Character):
    -- 특수한 의미를 가지는 기호의 기능을 없애는 문자
    -- 를 "탈출문자"라고 함.
    job_id LIKE '%$_%' ESCAPE '$';      -- % : x >= 0, _ : x == 1 (x: 문자개수)