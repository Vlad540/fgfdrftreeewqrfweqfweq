package defpackage;

import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;

/* renamed from: s5  reason: default package */
public abstract class s5 extends r5 implements ojd {
    public static final /* synthetic */ int Y0 = 0;

    public mif i0(int i) {
        setContentView(i);
        ci9 ci9 = new ci9(new mn(this), findViewById(yqb.toolbar));
        ci9.c = t();
        mif mif = new mif(ci9);
        Toolbar toolbar = (Toolbar) mif.b;
        if (toolbar != null) {
            xle xle = new xle(0, (Object) mif);
            WeakHashMap weakHashMap = eaf.a;
            t9f.u(toolbar, xle);
        }
        return mif;
    }
}
