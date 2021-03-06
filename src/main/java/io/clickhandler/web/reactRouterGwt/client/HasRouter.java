package io.clickhandler.web.reactRouterGwt.client;

import io.clickhandler.web.reactGwt.client.react.ReactComponent;
import io.clickhandler.web.reactGwt.client.Reflection;

/**
 *
 */
public interface HasRouter {
    default Router getRouter(ReactComponent $this) {
        return Reflection.get($this.getProperty("context"), "router");
    }
}
