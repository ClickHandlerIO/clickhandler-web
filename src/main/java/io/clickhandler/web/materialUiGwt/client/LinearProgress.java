package io.clickhandler.web.materialUiGwt.client;

import io.clickhandler.web.reactGwt.client.dom.CSSProps;
import io.clickhandler.web.reactGwt.client.react.BaseProps;
import io.clickhandler.web.reactGwt.client.react.ExternalComponent;
import io.clickhandler.web.reactGwt.client.react.ReactClass;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 *
 */
@Singleton
public class LinearProgress extends ExternalComponent<LinearProgress.Props> {

    @Inject
    public LinearProgress() {
    }

    @Override
    protected native ReactClass<Props> reactClass() /*-{
        return $wnd.MaterialUi.LinearProgress;
    }-*/;

    @JsType(isNative = true)
    public interface Props extends BaseProps {
//        String color;
//        CSSProps innerStyle;
//        double max = 100; // only works in determinate mode
//        double min = 0; // only works in determinate mode
//        String mode = "indeterminate"; // enum 'determinate' 'indeterminate'(default)
//        CSSProps style;
//        double value = 0; // only works in determinate mode

        @JsProperty
        String getColor();

        @JsProperty
        void setColor(String color);

        @JsProperty
        CSSProps getInnerStyle();

        @JsProperty
        void setInnerStyle(CSSProps innerStyle);

        @JsProperty
        double getMax();

        @JsProperty
        void setMax(double max);

        @JsProperty
        double getMin();

        @JsProperty
        void setMin(double min);

        @JsProperty
        String getMode();

        @JsProperty
        void setMode(String mode);

        @JsProperty
        CSSProps getStyle();

        @JsProperty
        void setStyle(CSSProps style);

        @JsProperty
        double getValue();

        @JsProperty
        void setValue(double value);


        ////////////////////
        // fluent setters
        ////////////////////

        @JsOverlay
        default Props color(final String color) {
            setColor(color);
            return this;
        }

        @JsOverlay
        default Props innerStyle(final CSSProps innerStyle) {
            setInnerStyle(innerStyle);
            return this;
        }

        @JsOverlay
        default Props max(final double max) {
            setMax(max);
            return this;
        }

        @JsOverlay
        default Props min(final double min) {
            setMin(min);
            return this;
        }

        @JsOverlay
        default Props mode(final String mode) {
            setMode(mode);
            return this;
        }

        @JsOverlay
        default Props style(final CSSProps style) {
            setStyle(style);
            return this;
        }

        @JsOverlay
        default Props value(final double value) {
            setValue(value);
            return this;
        }


    }
}
