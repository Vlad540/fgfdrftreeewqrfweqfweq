package defpackage;

import android.net.Uri;

/* renamed from: nj0  reason: default package */
public final class nj0 implements yk {
    public final Uri a;
    public final kl b;
    public final el c;
    public final h67 o;

    public nj0(Uri uri, kl klVar, el elVar, h67 h67) {
        this.a = uri;
        this.b = klVar;
        this.c = elVar;
        this.o = h67;
    }

    public final h67 getOkParser() {
        return this.o;
    }

    public final int getPriority() {
        return 16;
    }

    public final kl getScope() {
        return this.b;
    }

    public final Uri getUri() {
        return this.a;
    }

    public final boolean shouldPost() {
        return this.c.c;
    }

    public final boolean willWriteParams() {
        return this.c.d;
    }

    public final boolean willWriteSupplyParams() {
        return this.c.e;
    }

    public final void writeParams(t67 t67) {
        this.c.c(t67);
    }

    public final void writeSupplyParams(t67 t67) {
        this.c.d(t67);
    }
}
