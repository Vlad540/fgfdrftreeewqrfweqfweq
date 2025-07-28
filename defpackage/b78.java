package defpackage;

import android.view.View;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: b78  reason: default package */
public final /* synthetic */ class b78 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View[] b;

    public /* synthetic */ b78(View[] viewArr, int i) {
        this.a = i;
        this.b = viewArr;
    }

    public final Object invoke() {
        jue jue = jue.a;
        View[] viewArr = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaKeyboardWidget.G0;
                for (View visibility : viewArr) {
                    visibility.setVisibility(0);
                }
                return jue;
            default:
                k77[] k77Arr2 = MediaKeyboardWidget.G0;
                for (View visibility2 : viewArr) {
                    visibility2.setVisibility(8);
                }
                return jue;
        }
    }
}
