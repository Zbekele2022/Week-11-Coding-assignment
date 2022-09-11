/**
 * 
 */
package projects.entity;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Promineo
 * @revised by Zbekele
 *
 */
public class Project {
  private Integer project_ID;
  private String projectName;
  private BigDecimal estimatedHours;
  private BigDecimal actualHours;
  private Integer difficulty;
  private String notes;

  private List<Material> materials = new LinkedList<>();
  private List<Step> steps = new LinkedList<>();
  private List<Category> categories = new LinkedList<>();

  public Integer getproject_ID() {
    return project_ID;
  }

  public void setproject_ID(Integer project_ID) {
    this.project_ID = project_ID;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public BigDecimal getEstimatedHours() {
    return estimatedHours;
  }

  public void setEstimatedHours(BigDecimal estimatedHours) {
    this.estimatedHours = estimatedHours;
  }

  public BigDecimal getActualHours() {
    return actualHours;
  }

  public void setActualHours(BigDecimal actualHours) {
    this.actualHours = actualHours;
  }

  public Integer getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void getMaterial() {
    Object material;
	return;
  }

  public List<Step> getStep() {
    return step();
  }

  public void getCategory() {
    return category;
  }

  @Override
  public String toString() {
    String result = "";
    
    result += "\n   ID=" + project_ID;
    result += "\n   name=" + projectName;
    result += "\n   estimatedHours=" + estimatedHours;
    result += "\n   actualHours=" + actualHours;
    result += "\n   difficulty=" + difficulty;
    result += "\n   notes=" + notes;
    
    result += "\n   Materials:";
    
    for(Material material : material) {
      result += "\n      " + material;
    }
    
    result += "\n   Steps:";
    
    for(Step step : step) {
      result += "\n      " + step;
    }
    
    result += "\n   Category:";
    
    for(Category category : category) {
      result += "\n      " + category;
    }
    
    return result;
  }
}
