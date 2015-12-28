package com.ge.hackathon.hackathon1;

import com.ge.hackathon.hackathon1.api.dto.SomeResponse;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JGREEN on 12/17/2015.
 */

@RestController
@RequestMapping("/v1//hackathon1")
public class Controller {
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Resource<SomeResponse> Get() {
		return new Resource<>(new SomeResponse(), ControllerLinkBuilder.linkTo(Controller.class).withSelfRel());
	}
}
