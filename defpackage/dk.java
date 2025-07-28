package defpackage;

import android.view.View;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: dk  reason: default package */
public final class dk implements c28, d28 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a = 3;
    public boolean b;
    public boolean c;
    public Object o;

    public /* synthetic */ dk() {
    }

    public boolean I() {
        if (this.b) {
            ((zb8) this.o).getClass();
            return false;
        }
        d28 d28 = (d28) this.Z;
        d28.getClass();
        return d28.I();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, wna] */
    public wna a() {
        ? obj = new Object();
        obj.a = (CharSequence) this.o;
        obj.b = (IconCompat) this.X;
        obj.c = (String) this.Y;
        obj.d = (String) this.Z;
        obj.e = this.b;
        obj.f = this.c;
        return obj;
    }

    public vxa d() {
        c28 c28 = (c28) this.Z;
        if (c28 != null) {
            return c28.d();
        }
        return (vxa) ((zb8) this.o).Y;
    }

    public long e() {
        switch (this.a) {
            case 1:
                if (this.b) {
                    return ((zb8) this.o).e();
                }
                c28 c28 = (c28) this.Z;
                c28.getClass();
                return c28.e();
            default:
                if (this.b) {
                    return ((zb8) this.o).e();
                }
                d28 d28 = (d28) this.Z;
                d28.getClass();
                return d28.e();
        }
    }

    public void f(wxa wxa) {
        d28 d28 = (d28) this.Z;
        if (d28 != null) {
            d28.f(wxa);
            wxa = ((d28) this.Z).d();
        }
        ((zb8) this.o).f(wxa);
    }

    public void g(vxa vxa) {
        c28 c28 = (c28) this.Z;
        if (c28 != null) {
            c28.g(vxa);
            vxa = ((c28) this.Z).d();
        }
        ((zb8) this.o).g(vxa);
    }

    public dk(View view, bk bkVar, l lVar) {
        this.o = view;
        this.X = bkVar;
        this.Y = lVar;
        view.addOnAttachStateChangeListener(new ck(0, this));
    }

    /* renamed from: d  reason: collision with other method in class */
    public wxa m1d() {
        d28 d28 = (d28) this.Z;
        if (d28 != null) {
            return d28.d();
        }
        return (wxa) ((zb8) this.o).Y;
    }

    public dk(y45 y45, y7e y7e) {
        this.X = y45;
        this.o = new zb8(y7e);
        this.b = true;
    }

    public dk(e94 e94, z7e z7e) {
        this.X = e94;
        this.o = new zb8(z7e);
        this.b = true;
    }
}
