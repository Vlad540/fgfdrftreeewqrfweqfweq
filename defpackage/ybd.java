package defpackage;

import android.graphics.Rect;

/* renamed from: ybd  reason: default package */
public final class ybd extends fja {
    public final /* synthetic */ int e;
    public final /* synthetic */ Rect f;

    public /* synthetic */ ybd(int i, Rect rect) {
        this.e = i;
        this.f = rect;
    }

    public final Rect l() {
        switch (this.e) {
            case 0:
                Rect rect = this.f;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
            default:
                return this.f;
        }
    }
}
