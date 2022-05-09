SELECT
    CASE salary
        WHEN 1000 THEN salary *0.1
        WHEN 2000 THEN salary *0.2
        WHEN 3000 THEN salary *0.3
        ELSE salary*0.4
    END AS 보너스
    
FROM
    employees;

SELECT
    salary,
    CASE 
        WHEN salary > 1000 THEN salary * 0.1
        WHEN salary > 2000 THEN salary * 0.2
        WHEN salary > 3000 THEN salary * 0.3
        ELSE salary * 0.4   -- 생략시 null, 결측치를 발생시킴
    END AS 보너스
FROM
    employees;

SELECT
    department_id   AS 부서번호,        -- 그룹생성 단순컬럼
    max(salary)     AS 최대월급,        -- 각 그룹마다 적용될 그룹함수1
    min(salary)     AS 최소월급         -- 각 그룹마다 적용될 그룹함수2
FROM
    employees
GROUP BY
    department_id            -- OK
    -- 1                     -- X
    -- 부서번호              -- X
ORDER BY
    -- -- 1 ASC;                     -- OK : 쓰지말라
    department_id ASC;            -- OK : 정석
    -- 부서번호 ASC;                 -- OK : 정석 (컬럼명이 표현식처럼 너무 길때)
    -- salary asc;                    -- X : 정렬의 기준은 중간셋, 
    -- max(salary) ACS;                -- OK : SELECT절의 중간셋을 정렬한다.
    
SELECT
    *
FROM
    regions,            -- 4개의 원소
    departments;        -- 27개의 원소