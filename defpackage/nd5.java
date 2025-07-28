package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: nd5  reason: default package */
public final class nd5 extends ol implements qce, tna {
    public final String X;
    public final long Y;
    public final String Z;
    public final long o;
    public final String w0 = nd5.class.getName();

    public nd5(String str, String str2, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = str;
        this.Y = j3;
        this.Z = str2;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [tde, java.lang.Object] */
    public final void c(lbe lbe) {
        pd5 pd5 = (pd5) lbe;
        String str = this.w0;
        udd.p(str, "onSuccess %s", new Object[]{pd5});
        l().c(new rd5(this.a, pd5.c));
        to8 p = p();
        long j = this.Y;
        vo8 q = p.q(j);
        if (q != null && q.z0 != ls8.DELETED) {
            ? obj = new Object();
            obj.a = j;
            obj.b = this.Z;
            obj.j = this.o;
            obj.k = this.X;
            obj.g = pd5.c;
            obj.h = true;
            ude ude = new ude(obj);
            udd.p(str, "fileAttachDownloader.downloadAttach(%s)", new Object[]{ude});
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            ((jc5) plVar.G.getValue()).a(ude);
        }
    }

    public final void d(uae uae) {
        String str;
        udd.u(this.w0, uae.X, "fail %s", new Object[]{uae});
        vo8 q = p().q(this.Y);
        long j = this.a;
        if (q == null || q.z0 == ls8.DELETED || (str = this.Z) == null) {
            f();
            l().c(new jh0(j, uae));
            return;
        }
        boolean equals = "file.not.found".equals(uae.b);
        p().v(q.b, str, new cz0(equals, 5));
        l().c(new ove(q.x0, this.Y, 0));
        if (equals) {
            f();
            l().c(new jh0(j, uae));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = defpackage.ls8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r4 = this;
            long r0 = r4.Y
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            to8 r4 = r4.p()
            vo8 r4 = r4.q(r0)
            if (r4 == 0) goto L_0x0018
            ls8 r0 = defpackage.ls8.DELETED
            ls8 r4 = r4.z0
            if (r4 != r0) goto L_0x001a
        L_0x0018:
            r4 = 3
            return r4
        L_0x001a:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd5.e():int");
    }

    public final void f() {
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.FileDownloadCmd fileDownloadCmd = new Tasks.FileDownloadCmd();
        fileDownloadCmd.requestId = this.a;
        fileDownloadCmd.fileId = this.o;
        fileDownloadCmd.fileName = this.X;
        fileDownloadCmd.messageId = this.Y;
        String str = this.Z;
        if (!(str == null || str.length() == 0)) {
            fileDownloadCmd.attachLocalId = str;
        }
        return gr8.toByteArray(fileDownloadCmd);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_FILE_DOWNLOAD_CMD;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        return new pn2(this.o, 14, (byte) 0);
    }
}
