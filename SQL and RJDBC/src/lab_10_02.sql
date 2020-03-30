INSERT INTO DEPT 
VALUES(10,'Accounts'),
(null,'IT');

UPDATE DEPT 
SET Dept_ID=20
WHERE Dept_ID=null and Dept_Name='IT';

INSERT INTO DEPT
VALUES(A1,'Accounts');

UPDATE DEPT
SET Dept_ID=30
WHERE Dept_ID=A1 and Dept_Name='Accounts';