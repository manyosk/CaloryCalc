/**
 * 
 */
package categoryComboBox;

import javax.swing.DefaultComboBoxModel;

/**
 * @author Marian
 *
 */
public class CategoryComboBoxModel extends DefaultComboBoxModel<CategoryObj> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	CategoryComboBoxModel(CategoryObj[] items) 
	{
		super(items);
	}

	public CategoryComboBoxModel() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public CategoryObj getSelectedItem()
	{
		// TODO Auto-generated method stub
		CategoryObj categoryObj = (CategoryObj) super.getSelectedItem();
		return categoryObj;
	}

	
}
