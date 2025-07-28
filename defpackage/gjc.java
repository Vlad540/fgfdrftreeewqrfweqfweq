package defpackage;

import java.util.Iterator;

/* renamed from: gjc  reason: default package */
public final class gjc extends hjc implements Iterator {
    public fjc a;
    public boolean b = true;
    public final /* synthetic */ ijc c;

    public gjc(ijc ijc) {
        this.c = ijc;
    }

    public final void a(fjc fjc) {
        fjc fjc2 = this.a;
        if (fjc == fjc2) {
            fjc fjc3 = fjc2.o;
            this.a = fjc3;
            this.b = fjc3 == null;
        }
    }

    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        fjc fjc = this.a;
        return (fjc == null || fjc.c == null) ? false : true;
    }

    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            fjc fjc = this.a;
            this.a = fjc != null ? fjc.c : null;
        }
        return this.a;
    }
}
