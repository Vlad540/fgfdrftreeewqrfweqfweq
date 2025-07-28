package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: w4a  reason: default package */
public final class w4a {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final /* synthetic */ x4a d;

    public w4a(x4a x4a, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = x4a;
                zb8 zb8 = x4a.a;
                this.b = zb8.o;
                this.c = zb8.c;
                return;
            default:
                this.d = x4a;
                zb8 zb82 = x4a.a;
                this.b = zb82.o;
                this.c = zb82.c;
                return;
        }
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final long b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 0:
                ((u16) this.d.a.X).invoke(arrayList);
                return;
            default:
                ((u16) this.d.a.X).invoke(arrayList);
                return;
        }
    }

    public final void d(Collection collection) {
        switch (this.a) {
            case 0:
                ((u16) this.d.a.Y).invoke(collection);
                return;
            default:
                ((u16) this.d.a.Y).invoke(collection);
                return;
        }
    }
}
