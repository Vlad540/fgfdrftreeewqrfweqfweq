package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: jc5  reason: default package */
public final class jc5 {
    public final mtf a;

    public jc5(mtf mtf) {
        this.a = mtf;
    }

    public final void a(ude ude) {
        ude ude2 = ude;
        udd.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "start %s", new Object[]{ude});
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        long j = ude2.a;
        sb.append(j);
        sb.append(", attachId='");
        String str = ude2.b;
        sb.append(str);
        sb.append("', videoId=");
        long j2 = ude2.c;
        sb.append(j2);
        sb.append(", audioId=");
        long j3 = ude2.d;
        sb.append(j3);
        sb.append(", mp4GifId=");
        long j4 = ude2.e;
        sb.append(j4);
        sb.append(", stickerId=");
        long j5 = ude2.f;
        sb.append(j5);
        sb.append(", fileId=");
        long j6 = ude2.j;
        sb.append(j6);
        long j7 = j6;
        sb.append(", fileName='");
        String str2 = ude2.k;
        String h = rf0.h("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker/", wn6.l(sb, str2, "'}"));
        String str3 = str2;
        wia wia = new wia("taskName", h);
        wia wia2 = new wia("messageId", Long.valueOf(j));
        wia wia3 = new wia("attachId", str);
        wia wia4 = new wia("videoId", Long.valueOf(j2));
        wia wia5 = new wia("audioId", Long.valueOf(j3));
        wia wia6 = new wia("mp4GifId", Long.valueOf(j4));
        wia wia7 = new wia("stickerId", Long.valueOf(j5));
        ude ude3 = ude;
        wia wia8 = new wia("url", ude3.g);
        wia wia9 = new wia("notifyProgress", Boolean.valueOf(ude3.h));
        wia wia10 = new wia("checkAutoLoadConnection", Boolean.valueOf(ude3.i));
        wia wia11 = new wia("fileId", Long.valueOf(j7));
        String str4 = h;
        wia wia12 = new wia("fileName", str3);
        bfa addTag = new bfa(DownloadFileAttachWorker.class).setExpedited(vga.a).setBackoffCriteria(he0.b, 10000, TimeUnit.MILLISECONDS).addTag("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker");
        wia[] wiaArr = {wia, wia2, wia3, wia4, wia5, wia6, wia7, wia8, wia9, wia10, wia11, wia12, new wia("invalidateCount", Integer.valueOf(ude3.l)), new wia("useOriginalExtension", Boolean.valueOf(ude3.m)), new wia("notCopyVideoToGallery", Boolean.valueOf(ude3.n))};
        x3a x3a = new x3a(9);
        for (int i = 0; i < 15; i++) {
            wia wia13 = wiaArr[i];
            x3a.H(wia13.b, (String) wia13.a);
        }
        zy3 k = x3a.k();
        vc7 b = this.a.b(str4, a35.b, addTag.setInputData(k).build(), false);
        b.O();
        ez3.f(ez3.h(new ym5(b.t.r(), (Continuation) null)), -1, 2);
    }
}
