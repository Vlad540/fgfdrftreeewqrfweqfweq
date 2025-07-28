package defpackage;

import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* renamed from: xe8  reason: default package */
public final /* synthetic */ class xe8 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ xe8(WorkDatabase workDatabase, ztf ztf, ztf ztf2, List list, String str, Set set, boolean z) {
        this.a = 3;
        this.o = workDatabase;
        this.X = ztf;
        this.Y = ztf2;
        this.Z = str;
        this.b = set;
        this.c = z;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        switch (this.a) {
            case 0:
                af8 af8 = (af8) this.o;
                ((bf8) this.X).u(af8.b, (re8) af8.c, (xi7) this.Y, (i78) this.Z, (IOException) this.b, this.c);
                return;
            case 1:
                jn jnVar = (jn) this.o;
                ((cf8) this.X).g(jnVar.b, (se8) jnVar.c, (yi7) this.Y, (i78) this.Z, (IOException) this.b, this.c);
                return;
            case 2:
                Pair pair = (Pair) this.X;
                ((g44) ((pf8) ((otf) this.o).b).j).g(((Integer) pair.first).intValue(), (se8) pair.second, (yi7) this.Y, (i78) this.Z, (IOException) this.b, this.c);
                return;
            default:
                WorkDatabase workDatabase = (WorkDatabase) this.o;
                buf y = workDatabase.y();
                duf z = workDatabase.z();
                ztf ztf = (ztf) this.Y;
                ztf b2 = ztf.b((ztf) this.X, (String) null, ztf.b, (String) null, (zy3) null, ztf.k, ztf.n, ztf.t + 1, 515069);
                aec aec = (aec) y.a;
                aec.b();
                aec.c();
                try {
                    ((f74) y.c).B(b2);
                    aec.r();
                    aec.l();
                    aec aec2 = (aec) z.a;
                    aec2.b();
                    rtf rtf = (rtf) z.c;
                    yz5 f = rtf.f();
                    String str = (String) this.Z;
                    f.f(1, str);
                    aec2.c();
                    try {
                        f.n();
                        aec2.r();
                        aec2.l();
                        rtf.u(f);
                        z.s(str, (Set) this.b);
                        if (!this.c) {
                            y.n(-1, str);
                            workDatabase.x().l(str);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        aec2.l();
                        rtf.u(f);
                        throw th;
                    }
                } catch (Throwable th2) {
                    aec.l();
                    throw th2;
                }
        }
    }

    public /* synthetic */ xe8(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z, int i) {
        this.a = i;
        this.o = obj;
        this.X = obj2;
        this.Y = obj3;
        this.Z = obj4;
        this.b = iOException;
        this.c = z;
    }
}
