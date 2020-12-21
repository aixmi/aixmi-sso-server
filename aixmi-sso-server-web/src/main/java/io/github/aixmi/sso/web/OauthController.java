package io.github.aixmi.sso.web;

import io.github.aixmi.common.web.dto.Responses;
import io.github.aixmi.common.web.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author xyk
 * @date 2020-12-21 下午 17:14
 */
@RestController
@RequestMapping("/oauth")
public class OauthController {
	@GetMapping("/token")
	public SingleResponse<String> getToken() {
		return Responses.single(UUID.randomUUID().toString());
	}
}
