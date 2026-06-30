CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(100),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);


CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1,'Rahul',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Amit',45,8000,'FALSE');
INSERT INTO Customers VALUES (3,'Priya',70,25000,'FALSE');

INSERT INTO Loans VALUES (1,1,5.5, DATE '2026-07-15');
INSERT INTO Loans VALUES (2,2,6.0, DATE '2026-08-10');
INSERT INTO Loans VALUES (3,3,4.5, DATE '2026-07-05');

COMMIT;

SELECT * FROM Customers;
SELECT * FROM Loans;

SET SERVEROUTPUT ON;

DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, Age
        FROM Customers;
BEGIN
    FOR cust IN cust_cursor LOOP
        IF cust.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Customer ID: ' || cust.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

SELECT * FROM Loans;

SET SERVEROUTPUT ON;

DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, Balance
        FROM Customers;
BEGIN
    FOR cust IN cust_cursor LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Customer ' || cust.CustomerID || ' promoted to VIP.');
        END IF;
    END LOOP;

    COMMIT;
END;
/
SELECT * FROM Customers;

SET SERVEROUTPUT ON;

DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, CustomerID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR loan IN loan_cursor LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || loan.LoanID ||
            ' for Customer ' || loan.CustomerID ||
            ' is due on ' ||
            TO_CHAR(loan.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/

