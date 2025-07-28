package defpackage;

import java.util.List;

/* renamed from: l61  reason: default package */
public final class l61 extends hhd {
    public final /* synthetic */ int e;
    public final List f;
    public final List g;

    public /* synthetic */ l61(int i, List list, List list2) {
        this.e = i;
        this.f = list;
        this.g = list2;
    }

    public final int B() {
        switch (this.e) {
            case 0:
                return this.g.size();
            case 1:
                return this.g.size();
            case 2:
                return this.g.size();
            default:
                return this.g.size();
        }
    }

    public final int C() {
        switch (this.e) {
            case 0:
                return this.f.size();
            case 1:
                return this.f.size();
            case 2:
                return this.f.size();
            default:
                return this.f.size();
        }
    }

    public final boolean e(int i, int i2) {
        switch (this.e) {
            case 0:
                return hhd.f(this.f.get(i), this.g.get(i2));
            case 1:
                return hhd.f(this.f.get(i), this.g.get(i2));
            case 2:
                return hhd.f(this.f.get(i), this.g.get(i2));
            default:
                return this.f.get(i) == this.g.get(i2);
        }
    }

    public final boolean g(int i, int i2) {
        switch (this.e) {
            case 0:
                return ((h71) this.f.get(i)).c == ((h71) this.g.get(i2)).c;
            case 1:
                return ((bg3) this.f.get(i)).a == ((bg3) this.g.get(i2)).a;
            case 2:
                return hhd.f(((dr5) this.f.get(i)).a, ((dr5) this.g.get(i2)).a);
            default:
                return ((l87) this.f.get(i)).c == ((l87) this.g.get(i2)).c;
        }
    }
}
