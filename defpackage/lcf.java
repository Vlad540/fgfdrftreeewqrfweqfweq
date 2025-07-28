package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: lcf  reason: default package */
public final class lcf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ s16 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ View c;

    public lcf(s16 s16, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup) {
        this.a = s16;
        this.b = viewTreeObserver;
        this.c = viewGroup;
    }

    public final void onGlobalLayout() {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            mcf.a(this, this.b, (ViewGroup) this.c);
        }
    }
}
