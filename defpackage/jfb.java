package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: jfb  reason: default package */
public final /* synthetic */ class jfb implements u16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ taf o;

    public /* synthetic */ jfb(long j, lyd lyd, boolean z) {
        this.b = j;
        this.o = lyd;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int ordinal = ((jba) obj).ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    fgb fgb = (fgb) this.o;
                    xs7.E(fgb.a, (hu3) null, (ru3) null, new agb(fgb, this.b, this.c, (Continuation) null), 3);
                } else if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return jue.a;
            default:
                osd osd = (osd) obj;
                String str = osd.w0;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = osd.o;
                }
                String str2 = str;
                String str3 = ((kb5) ((jb5) ((lyd) this.o).w0.getValue())).v() ? osd.D0 : null;
                long j = this.b;
                boolean z = this.c;
                long j2 = osd.a;
                return new ktd(osd.a, j, osd.z0, str2, osd.A0, str3, 0, 0, false, false, z ? Math.abs(j) - j2 : j2, 4032);
        }
    }

    public /* synthetic */ jfb(fgb fgb, long j, boolean z) {
        this.o = fgb;
        this.b = j;
        this.c = z;
    }
}
