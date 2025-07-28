package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: su6  reason: default package */
public final /* synthetic */ class su6 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ su6(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        jue jue = jue.a;
        int i = this.b;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    String str = bv6.I0;
                    udd.s(str, "prefetch " + i + " fetchVirtualAlbums() completed by error", th);
                }
                return jue;
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    String str2 = bv6.I0;
                    udd.s(str2, "prefetch " + i + " fetchRealAlbums() completed by error", th2);
                }
                return jue;
            case 2:
                k77[] k77Arr = OneMeButton.F0;
                if (((View) obj).getId() != i) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                hx6 hx6 = (hx6) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat.setDuration(200);
                ofFloat.addUpdateListener(new pkd(hx6, 0));
                ofFloat.addListener(new qg(i, 2, hx6));
                ofFloat.start();
                return jue;
        }
    }

    public /* synthetic */ su6(vkd vkd, int i) {
        this.a = 3;
        this.b = i;
    }
}
