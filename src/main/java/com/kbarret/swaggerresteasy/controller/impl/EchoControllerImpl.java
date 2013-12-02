package com.kbarret.swaggerresteasy.controller.impl;

import com.kbarret.swaggerresteasy.controller.BaseWebService;
import com.kbarret.swaggerresteasy.controller.EchoController;
import com.kbarret.swaggerresteasy.representation.Echo;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Controller
@Path("/myApp")
@Api(value = "/myApp", description = "My app Services")
public class EchoControllerImpl extends BaseWebService implements EchoController {

    final Logger LOGGER = LoggerFactory.getLogger(EchoControllerImpl.class);

    public EchoControllerImpl(){
    	super();
    }

	@POST
	@Path("/test")
    @ApiOperation(
    		value = "Response the Request",
            notes = "gets logistics simulations", 
            responseClass = "com.kbarret.swaggerresteasy.representation.Echo")
	@Override
	public Echo test(@ApiParam(defaultValue = "{\"value\" : \"HI\"}", value = "Say something", required = true, name = "Echo") Echo echo) {
        System.out.println(echo);
        return echo;
	}
}