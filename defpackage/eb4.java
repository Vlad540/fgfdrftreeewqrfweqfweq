package defpackage;

import java.util.List;

/* renamed from: eb4  reason: default package */
public final /* synthetic */ class eb4 implements tb4, tn1, le8, nf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eb4(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public void accept(Object obj) {
        ((qza) obj).m0((k20) this.c, this.b);
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        switch (this.a) {
            case 2:
                e8c n = ws6.n((l68) this.c);
                boolean z = this.b;
                return cd8.q(ic8, n, z ? -1 : cd8.s.p0(), z ? -9223372036854775807L : cd8.s.k());
            default:
                boolean z2 = this.b;
                return cd8.q(ic8, (e8c) ((List) this.c), z2 ? -1 : cd8.s.p0(), z2 ? -9223372036854775807L : cd8.s.k());
        }
    }

    public e8c i(int i, toe toe, int[] iArr) {
        ts6 i2 = ws6.i();
        for (int i3 = 0; i3 < toe.a; i3++) {
            int i4 = i;
            toe toe2 = toe;
            int i5 = i3;
            i2.a(new gb4(i4, toe2, i5, (mb4) this.c, iArr[i3], this.b));
        }
        return i2.j();
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 1:
                bp5 bp5 = (bp5) this.c;
                bp5.getClass();
                bp5.b.execute(new vr2((Object) bp5, this.b, (Object) sn1, 1));
                return "enableExternalFlashAeMode";
            default:
                ene ene = (ene) this.c;
                ene.getClass();
                boolean z = this.b;
                ene.d.execute(new vr2((Object) ene, (Object) sn1, z, 5));
                return "enableTorch: " + z;
        }
    }
}
