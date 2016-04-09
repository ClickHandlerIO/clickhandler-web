package io.clickhandler.web.materialUiGwt.client.icons;

import io.clickhandler.web.reactGwt.client.react.ReactClass;

import javax.inject.Inject;


public class FileUploadSvgIcon extends AbstractMaterialIcon {

    @Inject
    public FileUploadSvgIcon() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.Icons.FileUpload;
    }-*/;
}