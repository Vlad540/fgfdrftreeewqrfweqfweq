package defpackage;

/* renamed from: sp9  reason: default package */
public final /* synthetic */ class sp9 implements s16 {
    public final /* synthetic */ String X;
    public final /* synthetic */ Comparable Y;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tp9 o;

    public /* synthetic */ sp9(boolean z, String str, tp9 tp9, i22 i22, String str2) {
        this.b = z;
        this.c = str;
        this.o = tp9;
        this.Y = i22;
        this.X = str2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.c;
                if (z) {
                    return str;
                }
                return this.o.a(((i22) this.Y).p(), this.X, str, true);
            default:
                boolean z2 = this.b;
                String str2 = this.c;
                return z2 ? str2 : this.o.a(this.X, (String) this.Y, str2, true);
        }
    }

    public /* synthetic */ sp9(boolean z, String str, tp9 tp9, String str2, String str3) {
        this.b = z;
        this.c = str;
        this.o = tp9;
        this.X = str2;
        this.Y = str3;
    }
}
