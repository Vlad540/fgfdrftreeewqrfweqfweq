package defpackage;

import java.io.IOException;

/* renamed from: al6  reason: default package */
public final class al6 extends rde {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al6(String str, Object obj, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.h = obj;
        this.f = i;
        this.g = i2;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                gl6 gl6 = (gl6) ((na1) this.h).c;
                int i = this.f;
                int i2 = this.g;
                gl6.getClass();
                try {
                    gl6.N0.n(i, i2, true);
                    return -1;
                } catch (IOException e2) {
                    gl6.a(2, 2, e2);
                    return -1;
                }
            default:
                gl6 gl62 = (gl6) this.h;
                try {
                    gl62.N0.o(this.f, this.g);
                    return -1;
                } catch (IOException e3) {
                    gl62.a(2, 2, e3);
                    return -1;
                }
        }
    }
}
