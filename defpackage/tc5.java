package defpackage;

import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: tc5  reason: default package */
public final class tc5 extends l5e implements i26 {
    public final /* synthetic */ String A0;
    public int X;
    public final /* synthetic */ uc5 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tc5(uc5 uc5, long j, String str, String str2, long j2, long j3, String str3, Continuation continuation) {
        super(2, continuation);
        this.Y = uc5;
        this.Z = j;
        this.w0 = str;
        this.x0 = str2;
        this.y0 = j2;
        this.z0 = j3;
        this.A0 = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tc5(this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            mtf mtf = this.Y.a;
            long j = this.Z;
            String str = this.w0;
            String str2 = this.x0;
            long j2 = this.y0;
            long j3 = this.z0;
            String str3 = this.A0;
            long j4 = j3;
            String str4 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker/" + new owe(j, str, str2, j2, j4, str3);
            bfa backoffCriteria = new bfa(UploadExternalGifWorker.class).setConstraints(new if3(2, false, false, false, false, -1, -1, o23.w0(new LinkedHashSet()))).setExpedited(vga.a).setBackoffCriteria(he0.a, 10000, TimeUnit.MILLISECONDS);
            wia[] wiaArr = {new wia("taskName", str4), new wia("requestId", Long.valueOf(j)), new wia("externalUrl", str), new wia("attachLocalId", str2), new wia("messageId", Long.valueOf(j2)), new wia(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j4)), new wia("stickerId", str3)};
            x3a x3a = new x3a(9);
            for (int i2 = 0; i2 < 7; i2++) {
                wia wia = wiaArr[i2];
                x3a.H(wia.b, (String) wia.a);
            }
            vc7 b = mtf.b(str4, a35.b, backoffCriteria.setInputData(x3a.k()).build(), false);
            b.O();
            zi1 zi1 = new zi1(new u09(ez3.f(ez3.h(new ym5(b.t.r(), (Continuation) null)), -1, 2), 28), 27);
            this.X = 1;
            Object D = ez3.D(zi1, this);
            return D == pu3 ? pu3 : D;
        } else if (i == 1) {
            wx3.H(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
