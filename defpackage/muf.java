package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: muf  reason: default package */
public final class muf extends b97 implements s16 {
    public final /* synthetic */ WorkRequest a;
    public final /* synthetic */ itf b;
    public final /* synthetic */ String c;
    public final /* synthetic */ otf o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public muf(WorkRequest workRequest, itf itf, String str, otf otf) {
        super(0);
        this.a = workRequest;
        this.b = itf;
        this.c = str;
        this.o = otf;
    }

    public final Object invoke() {
        List singletonList = Collections.singletonList(this.a);
        new bz4(new wsf(this.b, this.c, a35.b, singletonList), this.o).run();
        return jue.a;
    }
}
