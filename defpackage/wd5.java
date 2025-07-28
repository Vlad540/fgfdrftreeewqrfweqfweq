package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: wd5  reason: default package */
public final class wd5 {
    public static final /* synthetic */ k77[] f;
    public static final String g;
    public final Context a;
    public final nj4 b;
    public final nj4 c;
    public final nj4 d;
    public final r7e e = new r7e(new xd3(26));

    static {
        Class<wd5> cls = wd5.class;
        k77 khb = new khb(cls, "fileSystem", "getFileSystem()Lru/ok/tamtam/FileSystem;", 0);
        n7c n7c = m7c.a;
        f = new k77[]{khb, wn6.e(n7c, cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), wn6.f(cls, "dispatcher", "getDispatcher()Lru/ok/tamtam/coroutines/IoDispatcher;", 0, n7c), wn6.f(cls, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0, n7c)};
        g = cls.getName();
    }

    public wd5(Context context, nj4 nj4, nj4 nj42, nj4 nj43) {
        this.a = context;
        this.b = nj4;
        this.c = nj42;
        this.d = nj43;
    }

    public final void a(File file, boolean z) {
        if (file == null) {
            udd.U(g, "file is null!");
            return;
        }
        k77 k77 = f[2];
        xs7.E((ou3) this.e.getValue(), ((b27) this.c.get()).a.plus(sk9.a), (ru3) null, new vd5(file, this, z, (Continuation) null), 2);
    }

    public final void b(File file) {
        try {
            k77 k77 = f[3];
            vqc vqc = (vqc) ((xzc) this.d.get());
            vqc.getClass();
            long j = (long) 1024;
            a(file, ((long) ((int) vqc.o(PmsKey.f61maxdownloadedsizefornotifykb, j))) < gwf.h(file.length(), 0) / j);
        } catch (Throwable th) {
            udd.s(g, "notifyWithForegroundCheckAndSize fail!", th);
        }
    }
}
