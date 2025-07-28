package defpackage;

import java.util.Collections;

/* renamed from: zd9  reason: default package */
public final /* synthetic */ class zd9 implements ay7 {
    public final /* synthetic */ be9 a;

    public /* synthetic */ zd9(be9 be9) {
        this.a = be9;
    }

    public final void a(wx7 wx7) {
        be9 be9 = this.a;
        av7 av7 = be9.A0;
        if (av7 == null || !av7.h) {
            wx7.a(Collections.emptyList());
            return;
        }
        be9.w0.getClass();
        hx7 hx7 = hx7.a;
        ar8 ar8 = ar8.a;
        ar8 ar82 = (ar8) hx7.d(ar8);
        if (ar82 == ar8) {
            wx7.a(Collections.emptyList());
        } else {
            wx7.a(Collections.singletonList(ar82));
        }
    }
}
