/**
 * 
 */
package categoryComboBox;

/**
 * @author Marian
 *
 */
public class CategoryObj {
	public CategoryObj(Integer categoriID, String category) {
		super();
		this.categoriID = categoriID;
		this.category = category;
	}

	Integer categoriID;
	String category;
	
	@Override
	public String toString() {
		return  category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String Category) {
		category = Category;
	}

	public Integer getCategoriID() {
		return categoriID;
	}

	public void setCategoriID(Integer CategoriID) {
		categoriID = CategoriID;
	}
}
