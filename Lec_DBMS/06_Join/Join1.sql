--JOIN

--FROM 절에도 별칭을 줄 수 있다.
SELECT  s.STUDNO , s.NAME , s.DEPTNO1 
FROM T_STUDENT s; -- 20레코드

SELECT d.DNAME , d.DEPTNO 
FROM T_DEPARTMENT d; -- 12레코드

-- 카티션곱 (Cartesian Product)
-- 두개의 테이블을 JOIN 하게 되면, 
-- 각 테이블의 레코드들의 모든 조합이 출력된다.
-- WHERE 나 ON 등으로 JOIN 조건이 주어지지 않으면 
-- 모든 카티션곱이 출력된다.
-- * : 240레코드
SELECT s.STUDNO , s.NAME , s.DEPTNO1 ,
	d.DNAME , d.DEPTNO 
FROM T_STUDENT s, T_DEPARTMENT d; -- ORACLE 방식

SELECT s.STUDNO, s.NAME, s.DEPTNO1,
	d.DNAME, d.DEPTNO 
FROM T_STUDENT s 
	CROSS JOIN T_DEPARTMENT d; -- ANSI 방식


--Equi Join (등가 Join)
--#6101

--ORACLE방식
SELECT S.NAME ,S.DEPTNO1 , D.DNAME 
FROM T_STUDENT S, T_DEPARTMENT D
WHERE S.DEPTNO1 = D.DEPTNO 
;

--ANSI 방식
SELECT S.NAME ,S.DEPTNO1 , D.DNAME 
FROM T_STUDENT S JOIN T_DEPARTMENT D
	ON S.DEPTNO1 = D.DEPTNO 
;


SELECT * FROM T_STUDENT;

--제2전공의은? DEPTNO2
SELECT S.NAME "학생이름", S.DEPTNO2 "제2학과", D.DNAME"제2학과이름"
FROM T_STUDENT S, T_DEPARTMENT D
WHERE S.DEPTNO2 = D.DEPTNO 
;

--#6102
SELECT S.NAME , S.PROFNO , P.NAME --ORACLE
FROM T_STUDENT S, T_PROFESSOR P
WHERE S.PROFNO = P.PROFNO 
;

SELECT S.NAME, S.PROFNO, P.NAME -- ANSI
FROM T_STUDENT S JOIN T_PROFESSOR P
	ON S.PROFNO = P.PROFNO
;

--#6103
SELECT S.NAME , D.DNAME , P.NAME  --ORACLE
FROM T_STUDENT S, T_DEPARTMENT D, T_PROFESSOR P
WHERE S.DEPTNO1 = D.DEPTNO AND S.DEPTNO1 = P.DEPTNO ;

SELECT S.NAME , D.DNAME , P.NAME  --ANSI
FROM T_STUDENT S 
	JOIN T_DEPARTMENT D ON S.DEPTNO1 = D.DEPTNO
	JOIN T_PROFESSOR P ON S.DEPTNO1 = P.PROFNO ;


--#6104
SELECT * FROM T_EMP2; 
SELECT * FROM T_POST;

SELECT E.NAME , E.POST , E.PAY , P.S_PAY, P.E_PAY 
FROM T_EMP2 E, T_POST P
WHERE E.POST = P.POST 
;

SELECT E.NAME , E.POST , E.PAY , P.S_PAY, P.E_PAY
FROM T_EMP2 E JOIN T_POST P
ON E.POST = P.POST
;

--#6105
SELECT S.NAME , P.NAME --ORACLE
FROM T_STUDENT S, T_PROFESSOR P
WHERE DEPTNO1 = 101 AND S.PROFNO = P.PROFNO
;

SELECT S.NAME , P.NAME --ANSI
FROM T_STUDENT S JOIN T_PROFESSOR P
ON DEPTNO1 = 101 AND S.PROFNO = P.PROFNO
;















