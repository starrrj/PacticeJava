--* SQL언어 실습과제(HR스키마 사용) *
--
--1. 모든 사원의 연봉을 표시하는 보고서를 작성하려고 한다. 
--보고서에 사원의 이름과 성(Name으로 별칭), 급여, 수당여부에 따른 연봉을 포함하여 출력하시오. 
--수당여부는 수당이 있으면 “Salary + Commission”, 
--수당이 없으면 “Salary only”라고 표시하고, 별칭은 적절히 붙이시오. 
--또한 출력 시 연봉이 높은 순으로 정렬하시오.

SELECT 
    FIRST_NAME||' '||LAST_NAME AS Name, 
    SALARY, 
    COMMISSION_PCT, 
    (SALARY + SALARY * NVL(COMMISSION_PCT, 0)) * 12 AS 연봉, 
    DECODE(
        COMMISSION_PCT,         -- 조건 column
        NULL, 'Salary only',    -- 비교값, 결과값
        'Salary + Commission'   -- 기본 결과 값
        ) AS 수당
FROM EMPLOYEES
ORDER BY 연봉 DESC;

--2. HR 부서의 어떤 사원은 급여정보를 조회하는 업무를 맡고 있다. 
--Tucker 사원보다 급여를 많이 받고 있는 사원의 이름과 성(Name으로 별칭), 
--업무, 급여를 출력하시오.
--   (조건: join 을 사용할 것!)


--1) 조인
SELECT 
    a.first_name||a.last_name AS Name,
    a.JOB_ID,
    a.SALARY
FROM 
    EMPLOYEES a,
    EMPLOYEES b
WHERE b.LAST_NAME = 'Tucker'
    AND a.SALARY > b.SALARY;

-- 2) 부속질의
SELECT 
    first_name||last_name AS Name,
    JOB_ID,
    SALARY
FROM EMPLOYEES
WHERE SALARY > (
    SELECT SALARY
    FROM EMPLOYEES 
    WHERE last_name = 'Tucker'
);

--3. 모든 사원의 소속부서 평균연봉을 계산하여 사원별로 이름과 성(Name으로 별칭), 
--업무, 급여, 부서번호, 부서평균연봉(Department Avg Salary로 별칭)을 출력하시오.
--    (조건: 부속질의를 사용할 것!)

SELECT 
    e.FIRST_NAME||' '||e.LAST_NAME AS Name, 
    e.JOB_ID,
    e.SALARY,
    e.DEPARTMENT_ID,
    (SELECT AVG(SALARY) AS "Department Avg Salary"
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = e.DEPARTMENT_ID
    ) AS 부서별평균
FROM 
    EMPLOYEES e
ORDER BY Name ASC;

