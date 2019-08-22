/* Formatted on 6/28/2016 1:59:52 PM (QP5 v5.240.12305.39476) */
SELECT A.BATCH_DATE,
       A.BATCH_NUMBER,
       A.CURRENT_DOCUMENT_NUMBER,
       COUNT(A.TRANSACTION_AMOUNT),
       SUM(A.TRANSACTION_AMOUNT) 
FROM ( SELECT TO_DATE (BATCH_DATE, 'YYYY/MM/DD') BATCH_DATE,
         BATCH_NUMBER,
         CURRENT_DOCUMENT_NUMBER,
        -- COUNT (TRANSACTION_AMOUNT),
        
        
         CASE BT.REVERSE_TRANSACTION
                    WHEN 'R' THEN (TRANSACTION_AMOUNT / 100) * (-1)
                    ELSE (TRANSACTION_AMOUNT / 100)
                 END
                    TRANSACTION_AMOUNT
      --   FUNC_GET_BATCH_PRGRM_UNIT (acctg_entry_id)
    FROM batch_transaction bt
   WHERE     (   SUBSTR (current_document_number, 1, 2) = 'DS'
              OR SUBSTR (current_document_number, 1, 2) = 'LX'
              OR SUBSTR (current_document_number, 1, 2) = 'BX')
         ---and ( substr(current_document_number, 9,2) ='02' OR substr(current_document_number, 9,2) ='01' )
         AND TO_DATE (batch_date, 'YYYY/MM/DD') BETWEEN :p_start_date
                                                    AND :p_end_date
         AND FUNC_GET_BATCH_PRGRM_UNIT (acctg_entry_id) =
                UPPER (:P_PROGRAM_UNIT)
         AND FUNC_GET_BATCH_DATA_SOURCE (acctg_entry_id) =
                UPPER (:P_DATA_SOURCE_CODE)) A
GROUP BY A.BATCH_DATE,
       A.BATCH_NUMBER,
       A.CURRENT_DOCUMENT_NUMBER
ORDER BY A.BATCH_DATE,
       A.BATCH_NUMBER,
       A.CURRENT_DOCUMENT_NUMBER