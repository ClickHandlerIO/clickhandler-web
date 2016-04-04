package showcase.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ShowcaseResourceBundle extends ClientBundle {
    ShowcaseResourceBundle INSTANCE = GWT.create(ShowcaseResourceBundle.class);

    @Source("react-router.min.js")
    TextResource react_router();
}
