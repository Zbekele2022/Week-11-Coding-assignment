/**
 * 
 */
package projects.entity;

/**
 * @author Promineo
 * @revised by Zbekele
 *
 */
public class Step {
  private Integer step_ID;
  private Integer project_ID;
  private String stepText;
  private Integer stepOrder;

  public Integer getstep_ID() {
    return step_ID;
  }

  public void setstep_ID(Integer step_ID) {
    this.step_ID = step_ID;
  }

  public Integer getproject_ID() {
    return project_ID;
  }

  public void setproject_ID(Integer project_ID) {
    this.project_ID = project_ID;
  }

  public String getStepText() {
    return stepText;
  }

  public void setStepText(String stepText) {
    this.stepText = stepText;
  }

  public Integer getStepOrder() {
    return stepOrder;
  }

  public void setStepOrder(Integer stepOrder) {
    this.stepOrder = stepOrder;
  }

  @Override
  public String toString() {
    return "ID=" + step_ID + ", stepText=" + stepText;
  }
}
