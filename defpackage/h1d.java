package defpackage;

import java.util.List;

/* renamed from: h1d  reason: default package */
public final class h1d extends e1d {
    public final /* synthetic */ int l = 0;
    public final String m;
    public boolean n;
    public final Object o;

    public h1d(long j, String str, boolean z, List list) {
        super(j);
        this.m = str;
        this.n = z;
        this.o = list;
    }

    public final f1d a() {
        switch (this.l) {
            case 0:
                return new i1d(this);
            default:
                return new j1d(this);
        }
    }

    public h1d(long j, String str, o10 o10) {
        super(j);
        this.m = str;
        this.o = o10;
    }
}
