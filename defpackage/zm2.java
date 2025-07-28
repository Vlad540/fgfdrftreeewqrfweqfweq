package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: zm2  reason: default package */
public final class zm2 extends l5e implements i26 {
    public final /* synthetic */ jv5 A0;
    public int X;
    public final /* synthetic */ nn2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ CharSequence w0;
    public final /* synthetic */ List x0;
    public final /* synthetic */ boolean y0;
    public final /* synthetic */ Long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm2(nn2 nn2, long j, CharSequence charSequence, List list, boolean z, Long l, jv5 jv5, Continuation continuation) {
        super(2, continuation);
        this.Y = nn2;
        this.Z = j;
        this.w0 = charSequence;
        this.x0 = list;
        this.y0 = z;
        this.z0 = l;
        this.A0 = jv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zm2(this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        pu3 pu3 = pu3.a;
        int i2 = this.X;
        int i3 = 1;
        nn2 nn2 = this.Y;
        if (i2 == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((qxc) nn2.F0.getValue()).a(this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, this) == pu3) {
                return pu3;
            }
        } else if (i2 == 1) {
            wx3.H(obj);
        } else if (i2 == 2) {
            wx3.H(obj);
            taf.o(nn2.c1, (yl2) obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nn2.s();
        boolean z = this.y0;
        List list = this.x0;
        if (z) {
            i = list.size();
        } else {
            vqc vqc = (xzc) nn2.A0.getValue();
            vqc.getClass();
            int o = (int) vqc.o(PmsKey.max-attach-count, (long) 12);
            int size = list.size() / o;
            if (list.size() % o == 0) {
                i3 = 0;
            }
            i = size + i3;
        }
        int i4 = i;
        this.X = 2;
        obj = ns7.b(this.Z, i4, (et0) nn2.G0.getValue(), this.A0, this);
        if (obj == pu3) {
            return pu3;
        }
        taf.o(nn2.c1, (yl2) obj);
        return jue.a;
    }
}
