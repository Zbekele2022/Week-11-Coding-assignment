/**
 * 
 */
package projects.entity;

import java.math.BigDecimal;

/**
 * @author Promineo
 *@revised by Zbekele
 */
public class Material {
  private Integer material_ID;
  private Integer project_ID;
  private String materialName;
  private Integer numRequired;
  private BigDecimal cost;

  public Integer getmaterial_ID() {
    return material_ID;
  }

  public void setmaterial_ID(Integer material_ID) {
    this.material_ID = material_ID;
  }

  public Integer getproject_ID() {
    return project_ID;
  }

  public void setproject_ID(Integer project_ID) {
    this.project_ID = project_ID;
  }

  public String getMaterialName() {
    return materialName;
  }

  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }

  public Integer getNumRequired() {
    return numRequired;
  }

  public void setNumRequired(Integer numRequired) {
    this.numRequired = numRequired;
  }

  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "ID=" + material_ID + ", materialName=" + materialName + ", numRequired=" + numRequired
        + ", cost=" + cost;
  }
}
