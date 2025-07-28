package defpackage;

import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: kkc  reason: default package */
public final class kkc extends l5e implements i26 {
    public final /* synthetic */ File X;
    public final /* synthetic */ lkc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kkc(File file, lkc lkc, Continuation continuation) {
        super(2, continuation);
        this.X = file;
        this.Y = lkc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kkc(this.X, this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [lnc, di9, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        File file = this.X;
        ? obj2 = new Object();
        obj2.b = file;
        obj2.c = Environment.DIRECTORY_MOVIES;
        obj2.a = 8;
        obj2.d = MediaStore.Video.Media.getContentUri("external_primary");
        lkc lkc = this.Y;
        return ((zd) lkc.a).c(obj2, lkc.a.a());
    }
}
