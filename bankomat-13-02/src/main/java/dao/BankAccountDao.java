package dao;

import java.awt.List;
import java.math.BigInteger;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import com.solvd.bankomat.db.BankAccountMapper;
import com.solvd.bankomat.model.Bank;
import com.solvd.bankomat.model.BankAccount;

public class BankAccountDao extends BaseDao {
private BankAccountMapper bankAccountMapper;
private SqlSession session;

public BankAccountDao() {
    session = sqlSessionFactory.openSession();
    bankAccountMapper = session.getMapper(BankAccountMapper.class);
}

public BankAccount getByCardId(Long cardId) {
    BankAccount bankAccount = new BankAccount();
    try {
        bankAccount = bankAccountMapper.getByCardId(cardId);
    } catch (PersistenceException e) {
        e.printStackTrace();
    }
    return bankAccount;
}



}

