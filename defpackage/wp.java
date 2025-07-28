package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: wp  reason: default package */
public final /* synthetic */ class wp implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ wp(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                if (((tp) obj).a == 2) {
                    str = "https://play.google.com/store/apps/details?id=ru.oneme.app";
                } else {
                    vp.a.getClass();
                    str = up.b;
                }
                ek8.G(this.b, str);
                return jue.a;
            default:
                return Boolean.valueOf(((WeakReference) obj).get() == this.b);
        }
    }
}
