package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;

/* renamed from: jr7  reason: default package */
public final class jr7 implements cn0 {
    public int X;
    public final nu7 a = new nu7(6, false);
    public final int b = 0;
    public final int c;
    public final i0b o;

    public jr7(int i, mk9 mk9) {
        this.c = i;
        this.o = mk9;
    }

    public final synchronized void a() {
        while (true) {
            if (this.X <= 0) {
                break;
            }
            Bitmap bitmap = (Bitmap) this.a.y();
            if (bitmap == null) {
                break;
            }
            this.a.getClass();
            this.X -= mn0.d(bitmap);
            this.o.getClass();
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, lr0] */
    public final void g(Object obj) {
        boolean add;
        Bitmap bitmap = (Bitmap) obj;
        this.a.getClass();
        int d = mn0.d(bitmap);
        if (d <= this.c) {
            this.o.getClass();
            nu7 nu7 = this.a;
            nu7.getClass();
            if (nu7.v(bitmap)) {
                synchronized (nu7) {
                    add = ((HashSet) nu7.a).add(bitmap);
                }
                if (add) {
                    jj7 jj7 = (jj7) nu7.b;
                    int d2 = mn0.d(bitmap);
                    synchronized (jj7) {
                        try {
                            lr0 lr0 = (lr0) ((SparseArray) jj7.a).get(d2);
                            lr0 lr02 = lr0;
                            if (lr0 == null) {
                                LinkedList linkedList = new LinkedList();
                                ? obj2 = new Object();
                                obj2.a = null;
                                obj2.b = d2;
                                obj2.c = linkedList;
                                obj2.d = null;
                                ((SparseArray) jj7.a).put(d2, obj2);
                                lr02 = obj2;
                            }
                            lr02.c.addLast(bitmap);
                            if (((lr0) jj7.b) != lr02) {
                                jj7.E(lr02);
                                lr0 lr03 = (lr0) jj7.b;
                                if (lr03 == null) {
                                    jj7.b = lr02;
                                    jj7.c = lr02;
                                } else {
                                    lr02.d = lr03;
                                    lr03.a = lr02;
                                    jj7.b = lr02;
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
            synchronized (this) {
                this.X += d;
            }
        }
    }

    public final Object get(int i) {
        Bitmap r;
        synchronized (this) {
            try {
                if (this.X > this.b) {
                    a();
                }
                r = this.a.r(i);
                if (r != null) {
                    this.a.getClass();
                    this.X -= mn0.d(r);
                    this.o.getClass();
                } else {
                    this.o.getClass();
                    r = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return r;
    }
}
