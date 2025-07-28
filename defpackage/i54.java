package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: i54  reason: default package */
public final class i54 implements Runnable {
    public final Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Object o;

    public i54(j54 j54, vf vfVar, rm0 rm0, int i, int i2) {
        this.Y = j54;
        this.o = vfVar;
        this.X = rm0;
        this.b = i;
        this.c = i2;
    }

    public boolean a(int i, int i2) {
        e13 e13;
        j54 j54 = (j54) this.Y;
        int i3 = 2;
        vf vfVar = (vf) this.o;
        if (i2 == 1) {
            vfVar.F();
            vfVar.s();
            e13 = ((rm0) this.X).u();
        } else if (i2 != 2) {
            return false;
        } else {
            try {
                e13 = ((mxa) j54.a).c(vfVar.F(), vfVar.s(), (Bitmap.Config) j54.c);
                i3 = -1;
            } catch (RuntimeException e) {
                j54.getClass();
                m75.i(j54.class, "Failed to create frame bitmap", e);
                return false;
            } catch (Throwable th) {
                e13.S((e13) null);
                throw th;
            }
        }
        boolean b2 = b(i, e13, i2);
        e13.S(e13);
        return (b2 || i3 == -1) ? b2 : a(i, i3);
    }

    public boolean b(int i, e13 e13, int i2) {
        if (!e13.n0(e13) || e13 == null || !((te) ((j54) this.Y).b).d((Bitmap) e13.e0(), i)) {
            return false;
        }
        ((j54) this.Y).getClass();
        m75.d(j54.class, Integer.valueOf(i), "Frame %d ready.");
        synchronized (((SparseArray) ((j54) this.Y).X)) {
            ((rm0) this.X).s(i, e13);
        }
        return true;
    }

    public final void run() {
        SparseArray sparseArray;
        l18 l18;
        switch (this.a) {
            case 0:
                try {
                    if (((rm0) this.X).p(this.b)) {
                        ((j54) this.Y).getClass();
                        m75.d(j54.class, Integer.valueOf(this.b), "Frame %d is cached already.");
                        j54 j54 = (j54) this.Y;
                        sparseArray = (SparseArray) j54.X;
                        synchronized (sparseArray) {
                            ((SparseArray) j54.X).remove(this.c);
                        }
                    } else {
                        if (a(this.b, 1)) {
                            ((j54) this.Y).getClass();
                            m75.d(j54.class, Integer.valueOf(this.b), "Prepared frame %d.");
                        } else {
                            ((j54) this.Y).getClass();
                            m75.b(j54.class, "Could not prepare frame %d.", Integer.valueOf(this.b));
                        }
                        j54 j542 = (j54) this.Y;
                        sparseArray = (SparseArray) j542.X;
                        synchronized (sparseArray) {
                            ((SparseArray) j542.X).remove(this.c);
                        }
                    }
                    return;
                } catch (Throwable th) {
                    j54 j543 = (j54) this.Y;
                    synchronized (((SparseArray) j543.X)) {
                        ((SparseArray) j543.X).remove(this.c);
                        throw th;
                    }
                }
            default:
                u18 u18 = (u18) this.o;
                IBinder binder = ((v18) u18).a.getBinder();
                x3a x3a = (x3a) this.Y;
                ((wd8) x3a.b).X.remove(binder);
                wd8 wd8 = (wd8) x3a.b;
                Iterator it = wd8.o.iterator();
                while (true) {
                    l18 = null;
                    if (it.hasNext()) {
                        l18 l182 = (l18) it.next();
                        if (l182.c == this.b) {
                            if (TextUtils.isEmpty((String) this.X) || this.c <= 0) {
                                l18 = new l18((wd8) x3a.b, l182.a, l182.b, l182.c, (v18) u18);
                            }
                            it.remove();
                        }
                    }
                }
                if (l18 == null) {
                    l18 = new l18((wd8) x3a.b, (String) this.X, this.c, this.b, (v18) u18);
                }
                wd8.X.put(binder, l18);
                try {
                    binder.linkToDeath(l18, 0);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
        }
    }

    public i54(int i, int i2, v18 v18, x3a x3a, Bundle bundle, String str) {
        this.Y = x3a;
        this.o = v18;
        this.b = i;
        this.X = str;
        this.c = i2;
    }
}
