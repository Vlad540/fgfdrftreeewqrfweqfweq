package defpackage;

/* renamed from: rp9  reason: default package */
public final /* synthetic */ class rp9 implements s16 {
    public final /* synthetic */ tp9 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ Comparable Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;

    public /* synthetic */ rp9(boolean z, String str, String str2, tp9 tp9, i22 i22, String str3) {
        this.b = z;
        this.c = str;
        this.o = str2;
        this.X = tp9;
        this.Z = i22;
        this.Y = str3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.o;
                if (z) {
                    return this.c + ": " + str;
                }
                return this.X.a(((i22) this.Z).p(), this.Y, str, false);
            default:
                boolean z2 = this.b;
                String str2 = this.o;
                if (!z2) {
                    return this.X.a(this.Y, (String) this.Z, str2, false);
                }
                return this.c + ": " + str2;
        }
    }

    public /* synthetic */ rp9(boolean z, String str, String str2, tp9 tp9, String str3, String str4) {
        this.b = z;
        this.c = str;
        this.o = str2;
        this.X = tp9;
        this.Y = str3;
        this.Z = str4;
    }
}
