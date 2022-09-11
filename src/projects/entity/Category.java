/**
 * 
 */
package projects.entity;

/**
 * @author Promineo
 *
 */
public class Category {
  private Integer category_ID;
  private String categoryName;

  public Integer getCategory_ID() {
    return category_ID;
  }

  public void setCategoryId(Integer category_ID) {
    this.category_ID = category_ID;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  @Override
  public String toString() {
    return "ID=" + category_ID + ", categoryName=" + categoryName;
  }
}
