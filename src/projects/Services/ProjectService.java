/**
 * 
 */
package projects.Services;

import java.util.List;
import java.util.NoSuchElementException;
import projects.entity.Project;
import projects.dao.ProjectDao;
import projects.exception.DbException;


/**
 * This class implements the service layer in the 3-tier application. The CRUD operations that the
 * application performs are so simple that this class acts mostly as a pass-through from the input
 * layer to the data layer.
 * 
 * @author PromineoTech
 * @rrevised by Zbekele
 *
 */
public class ProjectService {
 
  private static final String SCHEMA_FILE ="projects_schema.sql";
  private static final String DATA_FILE ="projects_data.sql";
  
  private static ProjectDao projectDao = new ProjectDao();
  
  
  /**
   * This method simply calls the DAO class to insert a project row.
   * 
   * @param project The {@link Project} object.
   * @return The Project object with the newly generated primary key value.
   */
  public Project addProject(Project project) {
    return projectDao.insertProject(project);
  }

  /**
   * This method calls the project DAO to retrieve all project rows without accompanying details
   * (materials, steps and categories).
 * @param <projectDao>
   * 
   * @return A list of project records.
   */
  public static List<Project> fetchAllProjects() {
    return projectDao.fetchAllProjects();
  }
  /**
   * This method calls the project DAO to get all project details, including materials, steps, and
   * categories. If the project ID is invalid, it throws an exception.
   * 
   * @param projectId The project ID.
   * @return A Project object if successful.
   * @throws NoSuchElementException Thrown if the project with the given ID does not exist.
   */
 // public Project fetchProjectById(Integer project_ID) {

public static Project fetchProjectById(Integer project_ID) {
	// TODO Auto-generated method stub
	return null;
}

public static void deleteProject(Integer project_ID) {
	// TODO Auto-generated method stub
	
}
	  
	  /*
	   *  The DAO returns an Optional. If the Optional is not empty, return the
     * project. If the Optional is empty, throw a NoSuchElementException with a
     * custom message. The .orElseThrow method takes a Lambda expression with no
     * parameters (the "() ->" expression). The body of the Lambda just returns
     * a new NoSuchElementException. Note that in the abbreviated form of the
     * Lambda (a single-line Lambda) the return keyword is implied.
	   * 
	   */
//	  return 
//	projectDao.fetchProjectById(project_ID) {
//	.orElseThrow(() -> new NoSuchElementException(
//	"Project with project ID =" + project_ID + " does not exist."));
//	  }
// public void modifyProjectDetails(Project project) {
//	if(!projectDao.modifyProjectDetails(project)) {
//	throw new DbException(" Project with ID = " + project.getproject_ID() + " does not exist.");
//			
//	}
	 
// /**
//  * 
//  * @param project_ID
//  */
	  
// public static void deleteProject(Integer project_ID) {
//	 if(!projectDao.deleteProject(project_ID)) {
//		 throw new DbException((" Project with ID = " + project.getProject_ID() + " does not exist."); 

	
}


  
