package tr.mhu.core.service;

import java.util.List;

/**
 * @author muludag on 6.04.2020
 */
public class UtilService implements IUtilService{
	@Override
	public List<String> languages(boolean isAll) {
		var returnList=List.of("C","Python", "C#","Kotlin");
		if(isAll) returnList.addAll(List.of("AngularJS","NPM","ExtJS"));
		return returnList;
	}
}
