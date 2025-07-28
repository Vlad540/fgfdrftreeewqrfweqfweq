package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gm4  reason: default package */
public final class gm4 {
    public static final /* synthetic */ k77[] f;
    public static final String g;
    public final qmc a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;
    public final AtomicBoolean e = new AtomicBoolean();

    static {
        Class<gm4> cls = gm4.class;
        k77 khb = new khb(cls, "authStorage", "getAuthStorage()Lru/ok/tamtam/AuthStorage;", 0);
        n7c n7c = m7c.a;
        f = new k77[]{khb, wn6.e(n7c, cls, "fileAttachUploader", "getFileAttachUploader()Lru/ok/tamtam/FileAttachUploader;", 0), wn6.f(cls, "draftUploadsRepository", "getDraftUploadsRepository()Lru/ok/tamtam/upload/drafts/DraftUploadsRepository;", 0, n7c)};
        g = cls.getName();
    }

    public gm4(qmc qmc, nj4 nj4, nj4 nj42, nj4 nj43) {
        this.a = qmc;
        this.b = nj42;
        this.c = nj4;
        this.d = nj43;
    }
}
