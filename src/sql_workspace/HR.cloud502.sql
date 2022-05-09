
SELECT
    count(*)
FROM
    regions,
    departments;
    
DESC emplyees;

SELECT
    last_name,
    department_id
FROM
    employees
ORDER BY
    department_id ASC;
    
SELECT
    department_id,
    department_name
FROM
    departments
ORDER BY
    department_id ASC;
    
SELECT
    last_name,
    department_id
FROM
    employees
WHERE
    last_name = 'Whalen';
    
SELECT
    department_name
FROM
    departments
WHERE
    department_id = 10;