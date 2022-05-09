SELECT
    'ORACLE SAL',
    initcap('ORARCLE SQL')
FROM
    dual;
    
SELECT
   email,
   initcap(email)
FROM
   employees;
   
SELECT
    last_name,
    lower(last_name)
FROM
    employees;
   
SELECT
   'Oracle Sql',
   upper('Oracle Sql')
FROM
   dual;
   
SELECT
   last_name,
   upper(last_name)
FROM
   employees;
   
SELECT
    'Oracle Sql',
    lower('Oracle Sql')
FROM
    dual;
    
SELECT
    'Oracle'||'Sql'||'trird',
    concat(concat('Oracle','Sql'),'third')
FROM
    dual;
    
SELECT
    last_name||salary,
    concat(last_name, salary)
FROM
    employees;

SELECT
    last_name||hire_date,
    concat(last_name,hire_date)
FROM
    employees;
    
SELECT
    'Oracle',
    length('Oracle')
FROM
    employees;
    
SELECT
    '�ѱ�',
    length('�ѱ�')   AS length,
    lengthb('�ѱ�')  AS lengthb
FROM
   dual;

SELECT
--    substr('123456-1234567', 1, 6)
--    substr('123456-1234567', 8)
    substr('123456-1234567', 1, 7) || '*******' as "�ֹε�Ϲ�ȣ"
FROM
   dual;

 SELECT
    hire_date AS �Ի���,
    substr(hire_date, 1, 2) AS �Ի�⵵
    
FROM
   employees;