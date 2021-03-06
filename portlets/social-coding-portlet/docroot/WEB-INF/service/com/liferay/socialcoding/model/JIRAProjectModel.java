/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.socialcoding.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the JIRAProject service. Represents a row in the &quot;project&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.socialcoding.model.impl.JIRAProjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.socialcoding.model.impl.JIRAProjectImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JIRAProject
 * @see com.liferay.socialcoding.model.impl.JIRAProjectImpl
 * @see com.liferay.socialcoding.model.impl.JIRAProjectModelImpl
 * @generated
 */
@ProviderType
public interface JIRAProjectModel extends BaseModel<JIRAProject> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a j i r a project model instance should use the {@link JIRAProject} interface instead.
	 */

	/**
	 * Returns the primary key of this j i r a project.
	 *
	 * @return the primary key of this j i r a project
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this j i r a project.
	 *
	 * @param primaryKey the primary key of this j i r a project
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the jira project ID of this j i r a project.
	 *
	 * @return the jira project ID of this j i r a project
	 */
	public long getJiraProjectId();

	/**
	 * Sets the jira project ID of this j i r a project.
	 *
	 * @param jiraProjectId the jira project ID of this j i r a project
	 */
	public void setJiraProjectId(long jiraProjectId);

	/**
	 * Returns the key of this j i r a project.
	 *
	 * @return the key of this j i r a project
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this j i r a project.
	 *
	 * @param key the key of this j i r a project
	 */
	public void setKey(String key);

	/**
	 * Returns the name of this j i r a project.
	 *
	 * @return the name of this j i r a project
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this j i r a project.
	 *
	 * @param name the name of this j i r a project
	 */
	public void setName(String name);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(JIRAProject jiraProject);

	@Override
	public int hashCode();

	@Override
	public CacheModel<JIRAProject> toCacheModel();

	@Override
	public JIRAProject toEscapedModel();

	@Override
	public JIRAProject toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}