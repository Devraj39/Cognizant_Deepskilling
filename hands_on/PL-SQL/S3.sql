DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN fromAccount INT,
    IN toAccount INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE currentBalance DECIMAL(10,2);

    SELECT Balance
    INTO currentBalance
    FROM Accounts
    WHERE AccountID = fromAccount;

    IF currentBalance >= amount THEN

        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = fromAccount;

        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = toAccount;

        SELECT 'Transfer Successful' AS Message;

    ELSE

        SELECT 'Insufficient Balance' AS Message;

    END IF;
END //

DELIMITER ;