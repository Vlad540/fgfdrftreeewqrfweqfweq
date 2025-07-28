package defpackage;

/* renamed from: ol  reason: default package */
public abstract class ol {
    public final long a;
    public ibe b;
    public pl c;

    public ol(long j) {
        this.a = j;
    }

    public abstract ibe i();

    public final pk j() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.a();
    }

    public final zy9 k() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (zy9) plVar.f.getValue();
    }

    public final tt0 l() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.b();
    }

    public final t52 m() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.c();
    }

    public final di3 n() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (di3) plVar.k.getValue();
    }

    public final in7 o() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (in7) plVar.Q.getValue();
    }

    public final to8 p() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.d();
    }

    public final r59 q() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (r59) plVar.m.getValue();
    }

    public final g2b r() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (g2b) plVar.c.getValue();
    }

    public final ibe s() {
        if (this.b == null) {
            this.b = i();
        }
        return this.b;
    }

    public final jee t() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.e();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName + "/requestId: " + this.a;
    }
}
