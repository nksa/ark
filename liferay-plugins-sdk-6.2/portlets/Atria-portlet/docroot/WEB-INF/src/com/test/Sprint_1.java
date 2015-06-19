package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Sprint_1
 */

public class Sprint_1 extends MVCPortlet {

	@Override
	public void init() throws PortletException {
		_log.debug("init()");

		super.init();
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		_log.debug("serveResource(...)");

		super.serveResource(resourceRequest, resourceResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		_log.debug("processAction(...)");

		super.processAction(actionRequest, actionResponse);
	}

	@Override
	protected void doDispatch(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		_log.debug("doDispatch(...)");

		super.doDispatch(renderRequest, renderResponse);
	}

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		super.doView(renderRequest, renderResponse);
	}

	private static Log _log = LogFactoryUtil.getLog(Sprint_1.class);
}
