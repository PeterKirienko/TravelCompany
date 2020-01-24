package Dao;

public interface PersonMapper {
	public interface PaymentMapper<IdPerson, HasVisa, Name, Age, ParentId, Description> {

		IdPerson getIdPerson(Integer idPerson);
		HasVisa getHasVisa(Integer hasVisa);
		Name getName(String name);
		Age getAge(Integer age);
		ParentId getparentId (Integer parentId);
		Description getDescription(String description);
	}
}
	
	
	
	
