CREATE PROCEDURE calculate_salary (
	p_empno IN emp.empno % TYPE,
	output OUT emp.sal % TYPE
) IS 
	p_comm emp.comm % TYPE;
	p_sal emp.sal % TYPE;

	gross_salary  emp.sal % TYPE;
	net_salary  emp.sal % TYPE;
	it  emp.sal % TYPE;
BEGIN 
	SELECT comm INTO p_comm FROM emp WHERE empno = p_empno;
	SELECT sal INTO p_sal FROM emp WHERE empno = p_empno;

	IF p_comm IS NULL THEN
		p_comm := 0;
	END IF;

	gross_salary := p_sal + p_comm;
	
	IF p_comm IS NULL THEN
		it := gross_salary * 10 / 100;
	ELSE
		IF p_comm < 500 THEN
			it := gross_salary * 15 / 100;
		ELSE
			it := gross_salary * 20 / 100;
		END IF;	
	END IF;

	net_salary := gross_salary - it;
	
	output := net_salary;
END calculate_salary;
/
commit;