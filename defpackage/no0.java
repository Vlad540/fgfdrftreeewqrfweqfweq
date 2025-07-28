package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;

/* renamed from: no0  reason: default package */
public final class no0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public no0(oo0 oo0, Context context, boolean z) {
        this.c = oo0;
        this.o = context;
        this.b = z;
    }

    private final void a(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                oo0 oo0 = (oo0) this.c;
                if (oo0.c == null) {
                    oo0.c = (this.b || Build.VERSION.SDK_INT < 31) ? new gce((Context) this.o) : new n7a();
                }
                oo0.b(oo0.b);
                return;
            default:
                if (!this.b) {
                    l9f l9f = (l9f) this.o;
                    if (l9f.Y != null) {
                        this.b = true;
                        l9f l9f2 = (l9f) ((bae) this.c).b;
                        l9f2.b = true;
                        l9f2.b();
                        view.removeOnAttachStateChangeListener(this);
                        l9f.Y = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                oo0 oo0 = (oo0) this.c;
                oo0.b(false);
                oo0.f = false;
                Bitmap bitmap = oo0.g;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                oo0.g = null;
                oo0.h = null;
                ko0 ko0 = oo0.c;
                if (ko0 != null) {
                    ko0.b();
                }
                oo0.c = null;
                return;
            default:
                return;
        }
    }

    public no0(l9f l9f, bae bae) {
        this.o = l9f;
        this.c = bae;
        this.b = false;
    }
}
