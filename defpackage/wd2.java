package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: wd2  reason: default package */
public final class wd2 extends l5e implements m26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd2(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.w0 = obj;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        rj5 rj5 = (rj5) obj;
        Throwable th = (Throwable) obj2;
        Number number = (Number) obj3;
        switch (this.X) {
            case 0:
                long longValue = number.longValue();
                wd2 wd2 = new wd2((zd2) this.w0, (Continuation) obj4, 0);
                wd2.Y = th;
                wd2.Z = longValue;
                return wd2.o(jue.a);
            default:
                long longValue2 = number.longValue();
                wd2 wd22 = new wd2((c4f) this.w0, (Continuation) obj4, 1);
                wd22.Y = th;
                wd22.Z = longValue2;
                return wd22.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        boolean z;
        boolean z2;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                TamErrorException tamErrorException = this.Y;
                long j = this.Z;
                boolean z3 = tamErrorException instanceof TamErrorException;
                zd2 zd2 = (zd2) this.w0;
                if (!z3 || !iu7.F(tamErrorException.a.b) || j > 2) {
                    udd.s((String) zd2.e, "request failed with " + tamErrorException + ". Couldn't recover", (Throwable) null);
                    z = false;
                } else {
                    udd.s((String) zd2.e, "request failed with " + tamErrorException + ". Retrying", (Throwable) null);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                wx3.H(obj);
                TamErrorException tamErrorException2 = this.Y;
                long j2 = this.Z;
                boolean z4 = tamErrorException2 instanceof TamErrorException;
                c4f c4f = (c4f) this.w0;
                if (!z4 || !iu7.F(tamErrorException2.a.b) || j2 > 2) {
                    String str = c4f.g;
                    udd.s(str, "Fetch video. Request failed with " + tamErrorException2 + ". Couldn't recover", (Throwable) null);
                    z2 = false;
                } else {
                    String str2 = c4f.g;
                    udd.s(str2, "Fetch video. Request failed with " + tamErrorException2 + ". Retrying", (Throwable) null);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
