SELECT
    CASE salary
        WHEN 1000 THEN salary *0.1
        WHEN 2000 THEN salary *0.2
        WHEN 3000 THEN salary *0.3
        ELSE salary*0.4
    END AS ���ʽ�
    
FROM
    employees;

SELECT
    salary,
    CASE 
        WHEN salary > 1000 THEN salary * 0.1
        WHEN salary > 2000 THEN salary * 0.2
        WHEN salary > 3000 THEN salary * 0.3
        ELSE salary * 0.4   -- ������ null, ����ġ�� �߻���Ŵ
    END AS ���ʽ�
FROM
    employees;

SELECT
    department_id   AS �μ���ȣ,        -- �׷���� �ܼ��÷�
    max(salary)     AS �ִ����,        -- �� �׷츶�� ����� �׷��Լ�1
    min(salary)     AS �ּҿ���         -- �� �׷츶�� ����� �׷��Լ�2
FROM
    employees
GROUP BY
    department_id            -- OK
    -- 1                     -- X
    -- �μ���ȣ              -- X
ORDER BY
    -- -- 1 ASC;                     -- OK : ��������
    department_id ASC;            -- OK : ����
    -- �μ���ȣ ASC;                 -- OK : ���� (�÷����� ǥ����ó�� �ʹ� �涧)
    -- salary asc;                    -- X : ������ ������ �߰���, 
    -- max(salary) ACS;                -- OK : SELECT���� �߰����� �����Ѵ�.
    
SELECT
    *
FROM
    regions,            -- 4���� ����
    departments;        -- 27���� ����