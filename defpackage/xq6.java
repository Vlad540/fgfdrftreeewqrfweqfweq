package defpackage;

import android.text.TextUtils;

/* renamed from: xq6  reason: default package */
public final class xq6 {
    public static final /* synthetic */ int c = 0;
    public final t97 a;
    public final t97 b;

    public xq6(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final void a(String str, wq6 wq6) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty((CharSequence) null)) {
            b(wq6);
        } else {
            ((pae) this.b.getValue()).b().dispatch(bw4.a, new wc3(this, str, wq6));
        }
    }

    public final void b(wq6 wq6) {
        if (wq6 != null) {
            c(new tq6(wq6, 0));
        }
    }

    public final void c(Runnable runnable) {
        ((pae) this.b.getValue()).c().getImmediate().dispatch(bw4.a, runnable);
    }
}
