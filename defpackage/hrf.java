package defpackage;

import one.me.sdk.arch.Widget;

/* renamed from: hrf  reason: default package */
public final class hrf implements t97 {
    public taf a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ Class c;

    public hrf(Widget widget, Class cls) {
        this.b = widget;
        this.c = cls;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final Object getValue() {
        taf taf = this.a;
        if (taf != null) {
            return taf;
        }
        taf a2 = this.b.getViewModelStore$arch_release().a(this.c);
        this.a = a2;
        return a2;
    }
}
