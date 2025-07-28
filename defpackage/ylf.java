package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: ylf  reason: default package */
public final class ylf extends l5e implements i26 {
    public final /* synthetic */ kmf X;
    public final /* synthetic */ zif Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ylf(kmf kmf, zif zif, long j, Continuation continuation) {
        super(2, continuation);
        this.X = kmf;
        this.Y = zif;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ylf(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kmf kmf = this.X;
        jc5 jc5 = (jc5) kmf.C0.getValue();
        zif zif = this.Y;
        String str = zif.d;
        long j = this.Z;
        long j2 = kmf.b;
        String str2 = zif.c;
        dee dee = new dee(str2, str, j, j2);
        jc5.getClass();
        udd.p("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "start %s", new Object[]{dee});
        String str3 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker/" + dee;
        bfa addTag = new bfa(DownloadFileFromWebAppWorker.class).setExpedited(vga.a).setBackoffCriteria(he0.b, 10000, TimeUnit.MILLISECONDS).addTag("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker");
        wia[] wiaArr = {new wia("taskName", str3), new wia("requestId", Long.valueOf(j)), new wia("botId", Long.valueOf(j2)), new wia("fileName", str), new wia("fileUrl", str2)};
        x3a x3a = new x3a(9);
        for (int i = 0; i < 5; i++) {
            wia wia = wiaArr[i];
            x3a.H(wia.b, (String) wia.a);
        }
        vc7 b = jc5.a.b(str3, a35.b, addTag.setInputData(x3a.k()).build(), false);
        b.O();
        ez3.f(ez3.h(new ym5(b.t.r(), (Continuation) null)), -1, 2);
        yif yif = yif.DOWNLOADING;
        us0 us0 = zif.a;
        if (!us0.p()) {
            us0.n(yif);
        }
        kmf.T0.put(new Long(this.Z), zif);
        return jue.a;
    }
}
