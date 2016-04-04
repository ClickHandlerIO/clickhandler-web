package showcase.client.modules._gatekeepers;

import io.clickhandler.web.reactGwt.client.router.*;
import showcase.client.App;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RouteListener implements RouteGatekeeper {

    @Inject
    public RouteListener() {
    }

    @Override
    public void onEnter(RouteProxy routeProxy, RouteProps routeProps, ReplaceStateFunction replaceStateFunction) {
        if (routeProps.getLocation().getPathname().equals("/")) {
            replace(replaceStateFunction, App.getRoutes().getHome().getHomePage().buildLocation());
        }
    }

    @Override
    public Object onLeave(RouteProxy routeProxy) {
        return null;
    }

    public static native void replace(Object replaceFunction, LocationDescriptor descriptor) /*-{
        replaceFunction(descriptor);
    }-*/;
}