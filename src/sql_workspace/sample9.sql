-- 1. NOT ������
SELECT
    last_name,
    job_id,
    salary
FROM
    employees
--WHERE
--    NOT salary < 20000;
-- WHERE
--     (NOT salary < 20000 ); -- ���ǽ��� ��踦 ()�� ǥ��, ��踦 Ȯ��������!
 WHERE
     NOT ( salary < 20000 );
     
-- 2. NOT IN ������
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
     
-- 3. NOT LIKE ������
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
    
-- 4. NOT BETWEEN a AND b ������
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
    
-- 5. IS NULL ������ (*******)
SELECT
    last_name,
    job_id,
    salary,
    commission_pct
FROM
    employees
-- WHERE
--    commission_pct = NULL; -- NULL�� ��� ������ ���ص� NULL(���Ѵ�), �񱳿����ڷ� ����XX
 WHERE
     commission_pct IS NULL;
--WHERE
--   nvl(commission_pct, -1) = -1;         -- INDEX ���Ұ�!!!

-- 6. IS NOT NULL ������
SELECT
    last_name,
    job_id,
    salary,
    manager_id
FROM
    employees
WHERE
    manager_id IS NULL;