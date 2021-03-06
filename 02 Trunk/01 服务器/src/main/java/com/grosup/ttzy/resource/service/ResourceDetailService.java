package com.grosup.ttzy.resource.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.grosup.ttzy.resource.dto.ResourceDetailDto;

public interface ResourceDetailService {
	public Collection<ResourceDetailDto> create(String json);

	public Collection<ResourceDetailDto> add(String json, String approvalUser);

	public void approvalAdd(String resourceKey, String approvalMess, String approvalUser);

	public void approvalDel(String resourceKey, String approvalMess, String approvalUser);
	
	public void approvalUpdate(String resourceKey, String approvalMess, String approvalUser);

	public void reject(String resourceKey, String approvalMess, String approvalUser);

	public void del(String resourceKey, String approvalUser);

	public void update(String resourceKey, String json, String approvalUser);
	
	public void updateAttrName(String newAttrKey, String newAttrName);
	
	public List<ResourceDetailDto> get(String resourceKey);

	public List<ResourceDetailDto> getByUser(String resourceKey);
	
	public List<ResourceDetailDto> getByAdmin(String resourceKey);

	public List<ResourceDetailDto> getByUser(Collection<String> resourceList);

	public Collection<ResourceDetailDto> getAll(String typeKey, int start, int len);
	
	public int getAllTotal(String typeKey);
	
	public Collection<ResourceDetailDto> getAllByUser(String typeKey, int start, int len);
	
	public int getAllTotalByUser(String typeKey);
	
	public Collection<ResourceDetailDto> getAllByAdmin(String typeKey, int start, int len);
	
	public int getAllTotalByAdmin(String typeKey);
	
	public Collection<ResourceDetailDto> getAllPending(String typeKey, int start, int len);
	
	public int getAllPendingTotal(String typeKey);

	public Collection<ResourceDetailDto> search(String typeKey, Map<String, String> searchKeyMap, int start, int len);
	
	public int getSearchTotal(String typeKey, Map<String, String> searchKeyMap);
	
	public Collection<ResourceDetailDto> searchByUser(String typeKey, Map<String, String> searchKeyMap, int start, int len);
	
	public int getSearchTotalByUser(String typeKey, Map<String, String> searchKeyMap);
	
	public Collection<ResourceDetailDto> searchByAdmin(String typeKey, Map<String, String> searchKeyMap, int start, int len);
	
	public int getSearchTotalByAdmin(String typeKey, Map<String, String> searchKeyMap);
	

}
