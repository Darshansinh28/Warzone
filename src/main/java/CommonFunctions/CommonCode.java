package CommonFunctions;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import Constants.AppConstants;

/**
 * Common utility class to check null/empty collections, string, and object.
 * 
 * @author Sumit Sharma
 * @author Muhammad Adnan Asad
 * @author Pranaykumar Chauhan
 * @author Darshansinh Dilipsinh Devda
 * @author Dhruvkumar Parmar
 * @author Dhruv Patel
 * @version 3.0.0
 * 
 */
public class CommonCode implements Serializable {

	/**
	 * This method assesses whether the string is empty or populated.
	 *
	 * @param p_str to check string
	 * @return boolean true if String is empty else false
	 */
	public static boolean isEmpty(String p_str) {
		return (p_str == null || p_str.trim().isEmpty());
	}

	/**
	 * This method assesses whether the string is empty or populated.
	 *
	 * @param p_str to check string
	 * @return boolean true if string is not empty else false
	 */
	public static boolean isNotEmpty(String p_str) {
		return !isEmpty(p_str);
	}

	/**
	 * This method assesses whether the object is empty or populated.
	 *
	 * @param p_object to check object
	 * @return true if object is null else false
	 */
	public static boolean isNull(Object p_object) {
		return (p_object == null);
	}

	/**
	 * This method assesses whether the collection is empty or populated.
	 *
	 * @param p_collection to check collection
	 * @return true if collection is empty else false
	 */
	public static boolean isCollectionEmpty(Collection<?> p_collection) {
		return (p_collection == null || p_collection.isEmpty());
	}

	/**
	 * This method assesses whether the map is empty or populated.
	 *
	 * @param p_map to check Map
	 * @return true if map is empty else false
	 */
	public static boolean isMapEmpty(Map<?, ?> p_map) {
		return (p_map == null || p_map.isEmpty());
	}

	/**
	 * Produces an absolute file path using the given map file.
	 *
	 * @param p_fileName filename to map it with the file path
	 * @return string map file along with its path
	 */
	public static String getMapFilePath(String p_fileName) {
		String l_absolutePath = new File("").getAbsolutePath();
		return l_absolutePath + File.separator + AppConstants.WARZONE_SRC_MAIN_RESOURCES + File.separator + p_fileName
				+ AppConstants.EXTENSION_FOR_MAP_FILES;
	}
}
