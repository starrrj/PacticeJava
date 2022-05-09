SELECT
    last_name,
    job_id,
    salary
FROM
    employees
WHERE
    job_id = 'IT_PROG'
    AND salary >= 5000;
    
SELECT
    last_name,
    job_id,
    salary
FROM
    employees
WHERE
    job_id = 'IT_PROG'
    OR salary >= 5000;