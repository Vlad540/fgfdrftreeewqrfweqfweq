package defpackage;

import one.me.sdk.arch.Widget;

/* renamed from: xaf  reason: default package */
public final class xaf implements t97 {
    public final Object X;
    public Object Y;
    public final /* synthetic */ int a = 1;
    public final s16 b;
    public Object c;
    public final Object o;

    public xaf(xy2 xy2, imc imc, s16 s16, imc imc2) {
        this.c = xy2;
        this.b = imc;
        this.o = s16;
        this.X = imc2;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                return ((uaf) this.Y) != null;
            default:
                return ((taf) this.c) != null;
        }
    }

    public final Object getValue() {
        switch (this.a) {
            case 0:
                uaf uaf = (uaf) this.Y;
                if (uaf != null) {
                    return uaf;
                }
                uaf a2 = new fzd((bbf) this.b.invoke(), (zaf) ((s16) this.o).invoke(), (hw3) ((s16) this.X).invoke()).a((xy2) ((w67) this.c));
                this.Y = a2;
                return a2;
            default:
                taf taf = (taf) this.c;
                if (taf == null) {
                    Widget r0 = Widget.access$findWidgetByScopeId-iP7A0G4((Widget) this.o, (String) this.X);
                    if (r0 != null) {
                        String access$getTag$p = Widget.access$getTag$p((Widget) this.o);
                        Class cls = (Class) this.Y;
                        fn6 fn6 = udd.e;
                        if (fn6 != null && fn6.c()) {
                            fn6.e(fn6, tn7.X, access$getTag$p, wn6.i("Found vm=", cls.getCanonicalName(), " in parent scope, trying to access it"));
                        }
                        taf = r0.getViewModelStore$arch_release().a((Class) this.Y);
                    } else {
                        String access$getTag$p2 = Widget.access$getTag$p((Widget) this.o);
                        Class cls2 = (Class) this.Y;
                        s16 s16 = this.b;
                        fn6 fn62 = udd.e;
                        if (fn62 != null && fn62.c()) {
                            tn7 tn7 = tn7.X;
                            String canonicalName = cls2.getCanonicalName();
                            fn6.e(fn62, tn7, access$getTag$p2, "Not found vm=" + canonicalName + " in parent scope, trying to create it via fabric=" + s16);
                        }
                        s16 s162 = this.b;
                        taf = s162 != null ? (taf) s162.invoke() : null;
                    }
                    String str = (String) this.X;
                    if (taf != null) {
                        this.c = taf;
                    } else {
                        String i = wn6.i("ScopeId(value=", str, ")");
                        throw new IllegalArgumentException(i0e.D("\n                    Cant find widget by given scopeId=" + i + "!\n                    \n                    Please, either register such widget in hierarchy before lookup, or provide default factory for such VM\n                    ").toString());
                    }
                }
                return taf;
        }
    }

    public xaf(Widget widget, String str, Class cls, s16 s16) {
        this.o = widget;
        this.X = str;
        this.Y = cls;
        this.b = s16;
    }
}
