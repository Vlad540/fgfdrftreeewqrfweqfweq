package defpackage;

import java.util.Iterator;

/* renamed from: ejc  reason: default package */
public final class ejc extends hjc implements Iterator {
    public fjc a;
    public fjc b;
    public final /* synthetic */ int c;

    public ejc(fjc fjc, fjc fjc2, int i) {
        this.c = i;
        this.a = fjc2;
        this.b = fjc;
    }

    public final void a(fjc fjc) {
        fjc fjc2 = null;
        if (this.a == fjc && fjc == this.b) {
            this.b = null;
            this.a = null;
        }
        fjc fjc3 = this.a;
        if (fjc3 == fjc) {
            this.a = b(fjc3);
        }
        fjc fjc4 = this.b;
        if (fjc4 == fjc) {
            fjc fjc5 = this.a;
            if (!(fjc4 == fjc5 || fjc5 == null)) {
                fjc2 = c(fjc4);
            }
            this.b = fjc2;
        }
    }

    public final fjc b(fjc fjc) {
        switch (this.c) {
            case 0:
                return fjc.o;
            default:
                return fjc.c;
        }
    }

    public final fjc c(fjc fjc) {
        switch (this.c) {
            case 0:
                return fjc.c;
            default:
                return fjc.o;
        }
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final Object next() {
        fjc fjc = this.b;
        fjc fjc2 = this.a;
        this.b = (fjc == fjc2 || fjc2 == null) ? null : c(fjc);
        return fjc;
    }
}
