package defpackage;

import java.util.List;

/* renamed from: vr4  reason: default package */
public final /* synthetic */ class vr4 implements s16 {
    public final /* synthetic */ List X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ wr4 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ ls8 w0;

    public /* synthetic */ vr4(wr4 wr4, long j, long j2, boolean z, List list, String str, List list2, ls8 ls8) {
        this.a = wr4;
        this.b = j;
        this.c = j2;
        this.o = z;
        this.X = list;
        this.Y = str;
        this.Z = list2;
        this.w0 = ls8;
    }

    public final Object invoke() {
        wr4 wr4 = this.a;
        to8 to8 = wr4.a;
        long j = this.c;
        long j2 = this.b;
        to8.A(j2, j);
        if (this.o) {
            ((hz3) to8.a).c.n(j2, new d52(19, this.X));
        }
        wr4.a.z(j2, this.Y, this.Z, wr4.b, this.w0);
        return null;
    }
}
