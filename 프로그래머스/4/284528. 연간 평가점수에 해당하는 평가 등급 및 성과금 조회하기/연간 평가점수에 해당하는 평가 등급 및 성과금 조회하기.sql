SELECT
    e.EMP_NO,
    e.EMP_NAME,
    CASE
        WHEN AVG(SCORE) >= 96 THEN 'S'
        WHEN AVG(SCORE) >= 90 THEN 'A'
        WHEN AVG(SCORE) >= 80 THEN 'B'
        ELSE 'C'
        END AS 'GRADE',
    CASE
        WHEN AVG(score) >= 96 THEN e.sal * 0.2
        WHEN AVG(score) >= 90 THEN e.sal * 0.15
        WHEN AVG(score) >= 80 THEN e.sal * 0.1
        ELSE e.sal * 0
        END AS 'BONUS'
FROM HR_EMPLOYEES e
    JOIN HR_GRADE g
    ON e.EMP_NO = g.EMP_NO
    GROUP BY e.EMP_NO
    ORDER BY e.EMP_NO;