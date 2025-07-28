package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: v2  reason: default package */
public abstract class v2 implements ge9, m96 {
    public final Object a;
    public final Object b;
    public Object c;

    public v2(Context context) {
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = context;
    }

    public yz5 f() {
        aec aec = (aec) this.a;
        aec.a();
        return ((AtomicBoolean) this.b).compareAndSet(false, true) ? (yz5) ((r7e) this.c).getValue() : aec.d(g());
    }

    public abstract String g();

    public void h() {
        synchronized (this.b) {
            try {
                i4f i4f = (i4f) this.c;
                if (i4f != null) {
                    ((ew0) this.a).w(i4f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface j() {
        throw new UnsupportedOperationException();
    }

    public abstract int l();

    public void m(ViewGroup viewGroup, int i) {
        this.c = LayoutInflater.from((Context) this.b).inflate(i, viewGroup, false);
        n();
    }

    public abstract void n();

    public void o(rf3 rf3) {
        for (Object accept : (Set) this.a) {
            rf3.accept(accept);
        }
    }

    public void p() {
        ((ew0) this.a).v(new mc4(5, this));
    }

    public void q(Bitmap bitmap, bz5 bz5, dke dke) {
        throw new UnsupportedOperationException();
    }

    public void r(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public abstract void release();

    public void s(bz5 bz5) {
        throw new UnsupportedOperationException();
    }

    public void t(Object obj) {
        ((Set) this.a).add(obj);
    }

    public void u(yz5 yz5) {
        if (yz5 == ((yz5) ((r7e) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public void v() {
    }

    public void w(bz5 bz5) {
    }

    public void x(la9 la9) {
        throw new UnsupportedOperationException();
    }

    public abstract void y(na4 na4);

    public abstract void z();

    public v2(aec aec) {
        this.a = aec;
        this.b = new AtomicBoolean(false);
        this.c = new r7e(new ke(8, this));
    }

    public v2(ew0 ew0) {
        this.a = ew0;
        this.b = new Object();
    }
}
