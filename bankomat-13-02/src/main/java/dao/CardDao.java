package dao;

import java.math.BigInteger;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import com.solvd.bankomat.db.CardMapper;
import com.solvd.bankomat.model.Card;

public class CardDao extends BaseDao {
	private CardMapper cardMapper;
	Card card;
	private SqlSession session;
	public CardDao() {
		session=sqlSessionFactory.openSession();
		cardMapper = session.getMapper(CardMapper.class);
	}

	public Card getBySecurityInfo(Long cardNumber, String cardholderName, Integer cvv) {

	    try {
	    	card = cardMapper.getBySecurityInfo(cardNumber,cardholderName,cvv);
	    } catch (PersistenceException e) {
	        e.printStackTrace();
	    }
	    return card;
	}

	public void updateCard(Card card) {
		try {
			cardMapper.updateCard(card);
		session.update("com.solvd.bankomat.db.CardMapper.updateCard", card);


			session.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

}
