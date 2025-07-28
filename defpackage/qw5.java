package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: qw5  reason: default package */
public abstract class qw5 implements lr6 {
    public final Object a = new Object();
    public final lr6 b;
    public final HashSet c = new HashSet();

    public qw5(lr6 lr6) {
        this.b = lr6;
    }

    public final Image Z() {
        return this.b.Z();
    }

    public final void a(pw5 pw5) {
        synchronized (this.a) {
            this.c.add(pw5);
        }
    }

    public void close() {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((pw5) it.next()).a(this);
        }
    }

    public int getHeight() {
        return this.b.getHeight();
    }

    public pq6 getImageInfo() {
        return this.b.getImageInfo();
    }

    public int getWidth() {
        return this.b.getWidth();
    }

    public final int k0() {
        return this.b.k0();
    }

    public final mv4[] v() {
        return this.b.v();
    }
}
