package defpackage;

import java.io.Closeable;

/* renamed from: ukc  reason: default package */
public final class ukc implements dc7, Closeable {
    public final String a;
    public final tkc b;
    public boolean c;

    public ukc(String str, tkc tkc) {
        this.a = str;
        this.b = tkc;
    }

    public final void a(mm mmVar, pc7 pc7) {
        if (!this.c) {
            this.c = true;
            pc7.a(this);
            mmVar.f(this.a, this.b.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final void close() {
    }

    public final void m(nc7 nc7, nb7 nb7) {
        if (nb7 == nb7.ON_DESTROY) {
            this.c = false;
            nc7.R().f(this);
        }
    }
}
