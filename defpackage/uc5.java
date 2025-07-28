package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: uc5  reason: default package */
public final class uc5 {
    public final mtf a;
    public final nj4 b;
    public final nj4 c;

    public uc5(mtf mtf, nj4 nj4, nj4 nj42) {
        this.a = mtf;
        this.b = nj4;
        this.c = nj42;
    }

    public final void a(long j) {
        try {
            List<ys8> list = (List) new jx7(new au9(new lx7(new jx7(((ft8) this.c.get()).b(), 2, new f00(j, 24)), new dd9(3), 0), new be8(16), 3).v(), 2, new be8(18)).d(hw4.a);
            for (ys8 ys8 : list) {
                dr8 dr8 = ys8.a;
                this.a.c("UploadFileAttachWorker:" + dr8.b + ":" + dr8.a + ":" + dr8.c);
            }
            udd.p("uc5", "success! cancel attach %d uploads", new Object[]{Integer.valueOf(list.size())});
        } catch (Throwable th) {
            udd.s("uc5", "failure to cancel attach uploads", th);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, le4] */
    public final void b(long j) {
        try {
            phd a2 = ((om4) this.b.get()).a();
            ? obj = new Object();
            obj.a = j;
            List<fm4> list = (List) new jx7(new au9(new lx7(new jx7(a2, 2, obj), dr9.c, 0), smc.c, 3).v(), 2, xhd.b).b();
            if (list != null) {
                for (fm4 fm4 : list) {
                    yl4 yl4 = fm4.a;
                    this.a.c("UploadDraftMediaWorker/" + yl4.a + ":" + yl4.b);
                }
            }
            udd.p("uc5", "success! cancel draft %d uploads", new Object[]{list != null ? Integer.valueOf(list.size()) : null});
        } catch (Exception e) {
            udd.s("uc5", "failure in cancelling draft uploads other workers", e);
        }
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, xs8] */
    public final void c(o2 o2Var, long j, long j2, String str) {
        f3f f3f;
        int i = o2Var.a;
        int i2 = 7;
        if (i != 1) {
            i2 = i != 2 ? i != 3 ? i != 7 ? i != 10 ? i != 11 ? 1 : 9 : 8 : 5 : 2 : 6;
        } else if (!(o2Var instanceof r65)) {
            i2 = 3;
        }
        if (i2 == 1) {
            udd.t("FileAttachUploader", "upload: failed, unknown media type = %s", new Object[]{Integer.valueOf(i)});
            return;
        }
        dr8 dr8 = new dr8(j, str, j2);
        ? obj = new Object();
        obj.a = dr8;
        obj.d = i2;
        obj.b = o2Var.a();
        obj.c = lp.x(o2Var.a());
        if (!(o2Var instanceof g5f)) {
            f3f = null;
        } else {
            f3f f3f2 = ((g5f) o2Var).c;
            qjb qjb = f3f2.a;
            l10 l10 = new l10(1);
            l10.a = qjb;
            l10.b = f3f2.b;
            l10.c = f3f2.c;
            l10.d = f3f2.d;
            f3f = new f3f(l10);
        }
        obj.e = f3f;
        d(new ys8(obj));
    }

    public final void d(ys8 ys8) {
        udd.p("UploadFileAttachWorker", "start %s", new Object[]{ys8});
        StringBuilder sb = new StringBuilder("UploadFileAttachWorker:");
        dr8 dr8 = ys8.a;
        sb.append(dr8.b);
        sb.append(":");
        long j = dr8.a;
        sb.append(j);
        sb.append(":");
        String str = dr8.c;
        sb.append(str);
        String sb2 = sb.toString();
        bfa addTag = new bfa(UploadFileAttachWorker.class).setExpedited(vga.a).setBackoffCriteria(he0.b, 10000, TimeUnit.MILLISECONDS).addTag("UploadFileAttachWorker");
        HashMap hashMap = new HashMap();
        hashMap.put("workName", sb2);
        hashMap.put("key.messageId", Long.valueOf(j));
        hashMap.put("key.chatId", Long.valueOf(dr8.b));
        hashMap.put("key.attachLocalId", str);
        hashMap.put(ClientCookie.PATH_ATTR, ys8.b);
        hashMap.put("lastModified", Long.valueOf(ys8.c));
        hashMap.put("uploadType", sxe.q(ys8.d));
        hashMap.put("attachLocalId", ys8.f);
        f3f f3f = ys8.e;
        if (f3f != null) {
            hashMap.put("messageUpload.videoConvertOptions", true);
            hashMap.put("messageUpload.videoConvertOptions.quality", f3f.a.name());
            hashMap.put("messageUpload.videoConvertOptions.startTrimPosition", Float.valueOf(f3f.b));
            hashMap.put("messageUpload.videoConvertOptions.endTrimPosition", Float.valueOf(f3f.c));
            hashMap.put("messageUpload.videoConvertOptions.mute", Boolean.valueOf(f3f.d));
        }
        zy3 zy3 = new zy3(hashMap);
        zy3.f(zy3);
        a35 a35 = a35.b;
        this.a.b(sb2, a35, addTag.setInputData(zy3).build(), false).O();
    }
}
