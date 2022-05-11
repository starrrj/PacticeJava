-- * SQL 2번째 과제 (HR스키마) *

-- 1. 이번 분기에 60번 IT 부서에서는 신규 프로그램을 개발하고 보급하여 회사에 공헌하였다. 
-- 이에 해당 부서의 사원 급여를 12.3% 인상하기로 하였다. 
-- 60번 IT 부서 사원의 급여를 12.3% 인상하여 정수만(반올림) 표시하는 보고서를 작성하시오. 
-- 보고서는 사원번호, 성과 이름(Name으로 별칭), 급여, 인상된 급여(Increase Salary로 별칭)순으로 
-- 출력하시오. (촛점: 인상율12.3% 잘 반영하세요)

-- > 60번 부서의 사원들만 급여인상. 
--      정수만(반올림) : round
--      인상 급여 = salary + salary*0.123 
--                = salary*(1+0.123)

-- IT부서만 출력
SELECT 
    employee_id AS 사원번호,
    first_name||' '||last_name AS Name, 
    salary AS 급여,
    round(salary*(1+0.123)) AS "Increase Salary"
FROM
    employees
WHERE
    department_id = 60;


-- 누락된 사원있는 지! 출력결과 5명 맞는지 확인
SELECT
    count(employee_id)
FROM
    employees
WHERE
    department_id = 60;  -- 5명 확인


-- 모든 사원 출력은 어떻게 하지 decode
SELECT
    department_id,
    employee_id AS 사원번호,
    first_name||' '||last_name AS Name, 
    DECODE(
        department_id,                     -- 조건 column
            60, round(salary*(1+0.123)),   -- 비교값, 결과값
            salary                         -- 기본 결과 값
    ) AS 급여
FROM 
    employees
ORDER BY
    department_id;   




-- 2. 각 사원의 급여에 따른 급여 등급을 보고하려고 한다. 
-- 급여 등급은 Job_Grades 테이블에 표시된다. 해당 테이블의 구조를 살펴본 후 
-- 사원의 이름과 성(Name으로 별칭), 업무, 부서이름, 입사일, 급여, 급여등급을 출력하시오. 
-- (조건: Join을 이용)

-- > 3개의 테이블 조인으로 해결
--      employees   : 사원이름, 업무, 입사일, 급여, 부서ID(FK) 
--      department  : 부서명, 부서ID(PK)
--      job_grades  : 급여등급, 급여등급 범위의 최대값, 최소값
SELECT
    first_name||' '||last_name AS Name,
    job_id AS 업무,
    department_name AS 부서이름,
    hire_date AS 입사일,
    salary AS 급여,
    grade_level AS 급여등급
FROM
    employees e,
    departments d,
    job_grades j

WHERE
    e.department_id = d.department_id (+)                      -- 부서아이디와 부서이름 매칭
    AND e.salary BETWEEN j.lowest_sal AND j.highest_sal     -- 급여등급 = 최대값과 최소값사이 
ORDER BY
    grade_level;                                            -- 급여등급별로 확인하기 위해


-- 3. 각 사원과 직속 상사와의 관계를 이용하여 다음과 같은 형식의 보고서를 작성하고자 한다.
-- (예) 홍길동은 허균에게 보고한다 → Eleni Zlotkey report to Steven King
-- 어떤 사원이 누구에게 보고하는지 위 예를 참고하여 출력하시오. 
-- 단, 보고할 상사가 없는 사원이 있다면 그 정보도 포함하여 출력하고, 
-- 상사의 이름과 성은 대문자로 출력하시오
--  (조건: Left outer Join을 사용할 것)

-- Select rows from a Table

SELECT
    e.first_name||' '||e.last_name||' report to ' ||upper(m.first_name||' '||m.last_name)
FROM
    employees e,
    employees m
WHERE 
    e.manager_id = m.employee_id(+);

-- 채림님의 코드. 결측치 !
SELECT e.first_name || ' ' || e.last_name ||
       ' report to ' 
       || nvl2( m.last_name, UPPER(m.first_name || ' ' || m.last_name) , 'NONE')
       AS "Relation"
FROM 
    employees e LEFT JOIN employees m
ON 
    e.manager_id = m.employee_id;