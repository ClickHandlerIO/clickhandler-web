package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class ChevronRightSvgIcon extends AbstractMaterialIcon {

    @Inject
    public ChevronRightSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.ChevronRight;
    }-*/;
}
