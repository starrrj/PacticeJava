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
    last_name LIKE '_____d'; --6�����̸�, d�� ������
    
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

--     '%_%' '_'  '%%' '%';  -- % : x >= 0, _ : x == 1 (x: ���ڰ���)

SELECT
    employee_id,
    last_name,
    salary,
    job_id
FROM
    employees
WHERE
    -- Ż�⹮��(Escape Character):
    -- Ư���� �ǹ̸� ������ ��ȣ�� ����� ���ִ� ����
    -- �� "Ż�⹮��"��� ��.
    job_id LIKE '%$_%' ESCAPE '$';      -- % : x >= 0, _ : x == 1 (x: ���ڰ���)