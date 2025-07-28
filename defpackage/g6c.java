package defpackage;

import android.database.Observable;

/* renamed from: g6c  reason: default package */
public final class g6c extends Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((h6c) this.mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((h6c) this.mObservers.get(size)).e(i, i2);
        }
    }

    public final void d(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((h6c) this.mObservers.get(size)).c(i, i2, obj);
        }
    }

    public final void e(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((h6c) this.mObservers.get(size)).d(i, i2);
        }
    }

    public final void f(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((h6c) this.mObservers.get(size)).f(i, i2);
        }
    }

    public final void g() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((h6c) this.mObservers.get(size)).g();
        }
    }
}
