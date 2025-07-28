package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kjf  reason: default package */
public final class kjf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sjf Z;
    public final /* synthetic */ pjf w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kjf(pjf pjf, sjf sjf, Continuation continuation) {
        super(2, continuation);
        this.Z = sjf;
        this.w0 = pjf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((yif) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kjf kjf = new kjf(this.w0, this.Z, continuation);
        kjf.Y = obj;
        return kjf;
    }

    public final Object o(Object obj) {
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        pjf pjf = this.w0;
        if (i == 0) {
            wx3.H(obj);
            y76 y76 = fjf.a;
            vjf vjf = new vjf(this.Z.a, ((yif) this.Y).a);
            us0 us0 = pjf.f;
            r57 r57 = pjf.a;
            r57.getClass();
            f57 f57 = new f57("WebAppDownloadFile", r57.b(vjf.Companion.serializer(), vjf));
            this.Y = "WebAppDownloadFile";
            this.X = 1;
            if (us0.o(f57, this) == pu3) {
                return pu3;
            }
            str = "WebAppDownloadFile";
        } else if (i == 1) {
            wx3.H(obj);
            str = (String) this.Y;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jff jff = pjf.g;
        if (jff != null) {
            tif.a((tif) pjf.b.getValue(), str, jff.a, jff.b, true, 0, (Integer) null, (Integer) null, 240);
        }
        return jue.a;
    }
}
