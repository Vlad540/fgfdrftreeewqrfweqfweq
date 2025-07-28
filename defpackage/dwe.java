package defpackage;

import java.io.File;

/* renamed from: dwe  reason: default package */
public final /* synthetic */ class dwe implements of3, bid, j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwe b;

    public /* synthetic */ dwe(fwe fwe, int i) {
        this.a = i;
        this.b = fwe;
    }

    public void accept(Object obj) {
        udd.s("ewe", "removeUploadFromRepository: failed, data=" + this.b, (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                yxe yxe = (yxe) obj;
                fwe fwe = this.b;
                String str = fwe.a;
                yxe.getClass();
                pec a2 = pec.a(3, "SELECT * FROM uploads WHERE path=? AND upload_type=? AND last_modified=? LIMIT 1");
                if (str == null) {
                    a2.W(1);
                } else {
                    a2.f(1, str);
                }
                a2.j(2, (long) hr1.t(fwe.c));
                a2.j(3, fwe.b);
                return new ox7(new wxe(yxe, a2, 0));
            default:
                yxe yxe2 = (yxe) obj;
                fwe fwe2 = this.b;
                String str2 = fwe2.a;
                yxe2.getClass();
                return new y63(2, new xxe(yxe2, str2, fwe2.c, fwe2.b));
        }
    }

    public void j(ihd ihd) {
        Long l;
        udd.q("ewe", "checkSourceFileChanged: started");
        fwe fwe = this.b;
        try {
            l = Long.valueOf(new File(fwe.a).lastModified());
        } catch (Throwable th) {
            l = new kcc(th);
        }
        if (l instanceof kcc) {
            l = 0L;
        }
        long longValue = l.longValue();
        boolean z = (longValue == 0 || longValue == fwe.b) ? false : true;
        if (ihd.h()) {
            return;
        }
        if (z) {
            ihd.onError(new RuntimeException("failed to upload, file changed"));
            return;
        }
        udd.q("ewe", "checkSourceFileChanged: finished");
        ihd.a(fwe);
    }
}
