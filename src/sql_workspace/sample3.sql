SELECT
    last_name || salary AS "�̸� ����"
FROM
    employees;
    
SELECT
    last_name || hire_date AS "�̸� ��¥"
FROM
    employees;

SELECT
    last_name || '���'
FROM
    employees;
    
SELECT
    last_name || '�� ������' || job_id||' �Դϴ�.' AS "����� ����"
FROM
    employees;
    
SELECT
    last_name || ' �� ��å��' || job_id AS"����� ��å"
FROM
    employees
WHERE           -- 1�� ���͸�: FROM���� ������ �� ��ü�� ���͸�(�������:2)
    last_name = 'Smith';    -- = : ����񱳿����� <�ڹٿ� ���� �뵿����
    
