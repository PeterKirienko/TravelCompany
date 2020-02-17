package dao;

import com.solvd.bankomat.db.AtmMapper;
import com.solvd.bankomat.db.CardMapper;
import com.solvd.bankomat.model.Atm;
import com.solvd.bankomat.model.BankNote;
import com.solvd.bankomat.model.Card;
import com.solvd.bankomat.utils.RemoveBankNotesMap;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AtmDao extends BaseDao {
    private AtmMapper atmMapper;
    Atm atm;
    private SqlSession session;
    public AtmDao() {
        session=sqlSessionFactory.openSession();
        atmMapper = session.getMapper(AtmMapper.class);
    }

    public Atm getAtmById(Long id) {
        try {
            atm = atmMapper.getAtmById(id);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
        return atm;
    }

    public void removeBankNotes(List<BankNote> bankNotes, Atm atm){
      /*  try {
            RemoveBankNotesMap map = new RemoveBankNotesMap();
            map.atmId = atmId;
            for (BankNote item : bankNotes) {
                map.bankNoteIds.add(new BigInteger("item.getId()"));
            }
            atmMapper.removeBankNotes(map);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }*/
    }

}
